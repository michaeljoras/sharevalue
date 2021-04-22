package net.joras.shares;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.consorsbank.module.tapi.TestClient;
import com.consorsbank.module.tapi.grpc.common.Timestamp;
import com.consorsbank.module.tapi.grpc.security.PriceEntry;
import com.consorsbank.module.tapi.grpc.security.SecurityCodeType;
import com.consorsbank.module.tapi.grpc.security.SecurityPriceHistoryReply;
import com.consorsbank.module.tapi.grpc.security.TimeResolution;

import net.joras.shares.calc.YieldRiskCalculator;
import net.joras.shares.persistence.DatabaseHandler;

public class Client {

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
	      System.err.println("File: "+caFile+" does not exist");
	      System.exit(-1);
	    }
	    
	    String server = "localhost"; // <3>
	    int port = 40443;

	    System.err.println("Connecting... "+server+":"+port);
	    //try (TestClient client = new TestClient(server, port, caFile, args[1])) { // <4>
	    
	    try (TestClient client = new TestClient(server, port, caFile, ClientProperties.getInstance().CCPWD)) { // <4>
	        // end::initClass[]

	      // Get trading accounts
	     // System.out.println(client.getTradingAccounts());

	      // Get stock exchanges
	 //   System.err.println(client.getStockExchanges());

	      // Get security info
	    //   System.out.println(client.requestSecurityInfo("710000", SecurityCodeType.WKN));
	     
	    	
	    	
	   //  String wkn = "577220"; // Fielmann
	     //String wkn = "716460"; // SAP
	    	// String wkn = "866197"; // Danaher
	    	// String wkn = "A0YJQ2"; // Berkshire Hathaway B
	    	// String wkn = "857209"; // Thermo Fisher
	    //	 String wkn = "A0H1FP"; // FIS
	    	 //String wkn = "A1J4U4"; // ASML    xxxxxxx
	    //	String wkn = "CBK100"; // Commerzbank
	    //  	String wkn = "906866"; // Amazon  	 
	     // 	String wkn = "A0JM27"; // Constellation Software  	 
	     // 	String wkn = "894648"; // Lockheed Martin 
	    //	String wkn = "851745"; // 3M
	    //	String wkn = "BAY001"; // Bayer
	    	//String wkn = "723610"; // Siemens 
	 //   	String wkn = "899744"; // Realty Income
	   // 	String wkn = "A1JRLA"; // American Tower
	    //	String wkn = "843002"; // MunichRe
	    //	String wkn = "A1T7LU"; // T-Mobile US    xxxxx
	    //	String wkn = "A14U5Z"; // Monster   xxxxxx
	    //	String wkn = "659990"; // Merck
	    //	String wkn = "A1ML7J"; // Vonovia
	    //	String wkn = "850501"; // Bristol
	    //	String wkn = "868402"; // Verizon
	    //	String wkn = "A2PM3H"; // L3 Harris
	    //	String wkn = "ZAL111"; // Zalando
	   	//String wkn = "A0JMVJ"; // Pool
	    //	String wkn = "A1KBYX"; // Zoetis
	    	//String wkn = "766403"; // Volkswagen
	    //	String wkn = "604700"; // Heidelberg Cement
	    	//String wkn = "604840"; // Henkel
	    //	String wkn = "925905"; // Cemex
	  //  	String wkn = "855167"; // Roche
	   // 	String wkn = "A1JTC1"; // Easyjet
	  
	   	//String wkn = "A0HGYF"; // Magforce
	    //	String wkn = "A14KEB"; // Home24
	     //  	String wkn = "A2YN90"; // Teamviewer
	       	//String wkn = "A0EQ57"; // Helma
	    	
	    DatabaseHandler dbh = new DatabaseHandler();
	    List<String> wknList = dbh.loadWKNList();
	   	
	   	for(int wknl = 0; wknl < wknList.size(); wknl++) {
	    String wkn = wknList.get(wknl);
	    
	    	
	      	
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
	    	
	    	System.out.println("Kurs vor 10 Jahren: " + pricesAll.get(dateFormat.format(cal.getTime())));
	    	
	    	/* Parameter bestimmen */
	    	int years = 10;  // entspriche geopak in Jahren je nach Parametrisierung
	    	int months = years * 12;
	    	
	    	if (sphr.getPriceEntriesCount() <= 399) {
	    		throw new Exception("Zu wenige Monate für die Berechnung: " + sphr.getPriceEntriesCount());
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
			System.out.println("geoPAK"+years+": " + geopak);
			
			/* Vorbereitung 120 Monatskurse  */
			List<Double> prices = new ArrayList<>();
			
	    	for (int i = 0 ; i < months ; i++) {
	    		String datum = dateFormat.format(cal.getTime());
	    		
	    		Double price = pricesAll.get(datum);
	    		
	    		while(price==null) {
	    			cal.add(Calendar.DATE, 1);
	    			datum = dateFormat.format(cal.getTime());
	    			price = pricesAll.get(datum);   			
	    		} 
	    		
	    		prices.add(price);
	    	
	    		System.out.println("Kurs am " + datum + ": " + pricesAll.get(datum));
	    		
	    		cal.add(Calendar.MONTH, 1);
	  		
	    	}
	    	
	    	Double gk = yrc.gk(prices);
	    	Double vw =	yrc.vw(prices);
	    	Double gDV = yrc.gDV(prices);
	    	
	    	System.out.println("Zusammenfassung: ");
	    	System.out.println("geoPAK"+years+": " + geopak);
	    	System.out.println("Gewinnkonstanz: " + gk);
	    	Double payield = geopak * gk / 100d;
	    	System.out.println("PA-Gewinn: " + payield);
			
			
			System.out.println("Verlustwahrscheinlichkeit: " + vw);	
			System.out.println("gewichteter Durchschittsverlust: " + gDV);
			Double vr = vw * gDV / 100d;
			System.out.println("Verlust-Ratio: " + vr);
	    	
	    	dbh.updateYielCalculation(wkn, client.requestSecurityInfo(wkn, SecurityCodeType.WKN).getName(), 
	    			years, geopak, payield, gk, vr);
	    	
	    	System.out.println("Anzahl Kurse: " + sphr.getPriceEntriesCount());
	    	
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

	      
	      dbh.close();
		   	
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	
}
