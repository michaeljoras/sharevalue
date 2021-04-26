package net.joras.shares;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.consorsbank.module.tapi.TestClient;
import com.consorsbank.module.tapi.grpc.account.TradingAccount;
import com.consorsbank.module.tapi.grpc.common.Timestamp;
import com.consorsbank.module.tapi.grpc.security.PriceEntry;
import com.consorsbank.module.tapi.grpc.security.SecurityCode;
import com.consorsbank.module.tapi.grpc.security.SecurityCodeType;
import com.consorsbank.module.tapi.grpc.security.SecurityPriceHistoryReply;
import com.consorsbank.module.tapi.grpc.security.TimeResolution;

import net.joras.shares.calc.YieldRiskCalculator;
import net.joras.shares.persistence.DatabaseHandler;

public class Client {

	 private static final Logger logger = LogManager.getLogger(Client.class);
	 
	
	 /**
	   * Test client.
	   */
	  public static void main(String[] args) throws Exception {
	    /*if (args.length<2) {
	      System.err.println("Please generate key in AT and "
	          + "put location of the trust certificate and secret as arguments");
	      System.exit(-1);
	    }
	    File caFile = new File(args[0]); // <1>
	    */
	    File caFile = new File("/Users/michaeljoras/git/sharevalue/AT_Client/AT_Client/Key.pem"); // <1>
	        
	    if (!caFile.isFile()) { // <2>
	      logger.error("File: "+caFile+" does not exist");
	      System.exit(-1);
	    }
	    
	    String server = "localhost"; // <3>
	    int port = 40443;

	    logger.info("Connecting... "+server+":"+port);
	    //try (TestClient client = new TestClient(server, port, caFile, args[1])) { // <4>
	    
	    try (TestClient client = new TestClient(server, port, caFile, ClientProperties.getInstance().CCPWD)) { // <4>
	        // end::initClass[]

	      // Get trading accounts
	    	TradingAccount ta = client.getTradingAccounts().getAccounts(0); 
	     logger.info(ta.toString());

	    //	DepotEntries depotEntries = new DepotEntries(t);
	    	
	    	
	      //client.streamDepotData();
	      
	      
	      
	      

	      // Get stock exchanges
	 //   System.err.println(client.getStockExchanges());

	      // Get security info
	    //   System.out.println(client.requestSecurityInfo("710000", SecurityCodeType.WKN));
	     
	    	
	  
	    	
	    DatabaseHandler dbh = new DatabaseHandler();
	    dbh.truncate();
	    List<String> wknList = dbh.loadWKNList();
	    
	    
	    /* *******/
	    
	 for(int wknl = 0; wknl < wknList.size(); wknl++) {
	 //  	for(int wknl = 0; wknl < -16; wknl++) {

	    String wkn = wknList.get(wknl);
	    
	   // wkn = "A14U5Z"; 
	    	
	      	
	     String exchange = "OTC";
	     int days = 4000;
	     
	    	SecurityPriceHistoryReply sphr = client.getSecurityPriceHistory(wkn, SecurityCodeType.WKN,exchange, days, TimeResolution.DAY);
	    	
	    	System.out.println(client.requestSecurityInfo(wkn, SecurityCodeType.WKN).getName());
	    	System.out.println(exchange);
	    	
	    	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	    	
	    	List<PriceEntry> pel = sphr.getPriceEntriesList();
	    	HashMap<String, Double> pricesAll = new HashMap<>();
	    	for (int i = 0 ; i < sphr.getPriceEntriesCount(); i++) {
	    		PriceEntry pe = pel.get(i);
	    		
	    		// Datum
	    		
	    		Timestamp ts = pe.getOpenTime();
	    		Date dat = new Date(ts.getSeconds()*1000);
	    		//System.out.println(dat);
	    		// Open
	    	//	System.out.println("O " + pe.getOpenPrice());
	    		// Close
	    		//System.out.println("C " + pe.getClosePrice());	
	    		// High
	    	//	System.out.println("H " + pe.getHighPrice());
	    		
	    		// Low
	    	//	System.out.println("L " + pe.getLowPrice());
	    		
	    		pricesAll.put(dateFormat.format(dat), pe.getClosePrice());
	    		
	    	}
	    	System.out.println("Anzahl Kurse: " + sphr.getPriceEntriesCount());

	        
	    	YieldRiskCalculator yrc = new YieldRiskCalculator();
	    	// kurs heute
	    	final Calendar cal = Calendar.getInstance();
	    	cal.add(Calendar.DATE, -1);
	    	Date yesterday = cal.getTime();
	    	System.out.println("Kurs gestern: " + pricesAll.get( dateFormat.format(yesterday)));
	    	
	    	/*    geopak  */
	    	cal.add(Calendar.YEAR, -10);
	    	
	    	logger.debug("Kurs vor 10 Jahren: " + pricesAll.get(dateFormat.format(cal.getTime())));
	    	
	    	/* Parameter bestimmen */
	    	int years = 10;  // entspriche geopak in Jahren je nach Parametrisierung
	    	int months = years * 12;
	    	
	    	if (sphr.getPriceEntriesCount() <= 399) {
	    		dbh.updatecomment(wkn, "Zu wenige Monate für die Berechnung: " + sphr.getPriceEntriesCount());    		
	    	}
	    	
	    	for (int i = 10; i > 1; i--) {
	    		if (pricesAll.get(dateFormat.format(cal.getTime())) == null) {
	    			cal.add(Calendar.YEAR, 1);
	    			years--; // Anzahl Jahre reduzieren
	    			months = months - 12; // Anzahl Monate um ein Jahr kürzen
	    		}
	    	}
	    	
	    	
	    	// Renditeberechnungen starten
	    	
	    	
	       	
	    	List<Double> einstand = new ArrayList<Double>(); // TODO: Einstand muss über 1 JAhr gerechnet werden
			einstand.add(pricesAll.get(dateFormat.format(cal.getTime())));
			
			Double geopak = yrc.geoPAK(pricesAll.get(dateFormat.format(yesterday)), einstand, years);
			logger.debug("geoPAK"+years+": " + geopak);
			
			/* Vorbereitung 120 Monatskurse  */
			List<Double> prices = new ArrayList<>();
			
	    	for (int i = 0 ; i < months ; i++) {
	    		String datum = dateFormat.format(cal.getTime());
	    		
	    		Double price = pricesAll.get(datum);
	    		
	    		// wenn kurse fehlen, so lange weitergehen, bis nächster Kurs kommt
	    		Calendar fallbackCalendar = (Calendar) cal.clone();
	    		while(price==null) {	    		
	    			fallbackCalendar.add(Calendar.DATE, 1);
	    			String edatum = dateFormat.format(fallbackCalendar.getTime());
	    			logger.debug(edatum);
	    			price = pricesAll.get(edatum);   			
	    		} 
	    		
	    		prices.add(price);
	    	
	    		logger.debug("Kurs am " + datum + ": " + pricesAll.get(datum));
	    		
	    		cal.add(Calendar.MONTH, 1);
	  		
	    	}
	    	
	    	Double gk = yrc.gk(prices);
	    	Double vw =	yrc.vw(prices);
	    	Double gDV = yrc.gDV(prices);
	    	
	    	logger.info("Zusammenfassung: ");
	    	logger.info("geoPAK"+years+": " + geopak);
	    	logger.info("Gewinnkonstanz: " + gk);
	    	
	    	Double payield = yrc.payield(geopak, gk);
	    	logger.info("PA-Gewinn: " + payield);
					
	    	logger.info("Verlustwahrscheinlichkeit: " + vw);	
	    	logger.info("gewichteter Durchschittsverlust: " + gDV);
			Double vr = vw * gDV / 100d;
			logger.info("Verlust-Ratio: " + vr);
	    	
			// ISIN heraussuchen
			String isin = "";
			List<SecurityCode> scL = client.requestSecurityInfo(wkn, SecurityCodeType.WKN).getSecurityCodesList();
			
			for(int gi = 0; gi < scL.size(); gi++) {
				SecurityCode sce = scL.get(gi);
				if (sce.getCodeType() == SecurityCodeType.ISIN) {
					isin = sce.getCode();					
				}
			}
			
	    	dbh.updateYielCalculation(wkn, isin,
	    			client.requestSecurityInfo(wkn, SecurityCodeType.WKN).getName(), 
	    			years, geopak, payield, gk, vr);
	    	
	    	logger.debug("Anzahl Kurse: " + sphr.getPriceEntriesCount());
	    	
	   	}
	    	// System.out.println(client.getSecurityPriceHistory("710000", SecurityCodeType.WKN,"OTC", 5, TimeResolution.DAY));
	      // Stream orders
	      //client.streamOrders();
	      

	      // Stream depots
	      //client.streamDepotData();

	      // Stream firstLevel
	     // MarketDataDataObserver streamMarketDataDefault =
	     //     client.streamMarketData("710000", SecurityCodeType.WKN, "FRA", "EUR");
	      //MarketDataDataObserver streamMarketDataUSD =
	       //   client.streamMarketData("710000", SecurityCodeType.WKN, "ETR", "USD");
	      
	      // Wait 10 sec.
	      //Thread.sleep(10000);
	      // Close first market stream
	      //streamMarketDataDefault.close();
	      
	      // Wait 60 sec.
	    //  Thread.sleep(60000);
	      
	      // Close second market stream
	     // streamMarketDataUSD.close();
	      // tag::initClass[]

	      // ...

	 //  	SecurityInfoReply sir = client.requestSecurityInfo("US0378331005", SecurityCodeType.ISIN);

//	   	SecurityInfoReply sir = client.requestSecurityInfo("AXP", SecurityCodeType.MNEMONIC_US);	   	
	//   	System.out.println(	   	sir.getName());
	  // 	System.out.println(	   	sir.getSecurityCodesList().toString());
	   	
	      dbh.close();
		   	
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	
}
