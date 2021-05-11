package net.joras.shares;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.consorsbank.module.tapi.TestClient;
import com.consorsbank.module.tapi.grpc.security.SecurityCode;
import com.consorsbank.module.tapi.grpc.security.SecurityCodeType;

import net.joras.shares.persistence.DatabaseHandler;

public class InsertListings {

	 private static final Logger logger = LogManager.getLogger(InsertListings.class);
	 
	  public static void main(String[] args) throws Exception {
		  
		  String filename = "sp500";
		  String type = "isin";
		  
		  
		  File inputFile = new File("/Users/michaeljoras/git/sharevalue/ShareValue/listings/" + filename + ".txt");
		  
		    File caFile = new File(ClientProperties.getInstance().CAFILE); // <1>
	        
		    if (!caFile.isFile()) { // <2>
		      logger.error("File: "+caFile+" does not exist");
		      System.exit(-1);
		    }
		    
		    String server = "localhost"; // <3>
		    int port = 40443;

		    DatabaseHandler dbh = new DatabaseHandler();
		    
		    logger.info("Connecting... "+server+":"+port);
		    //try (TestClient client = new TestClient(server, port, caFile, args[1])) { // <4>
		    
		    try (TestClient client = new TestClient(server, port, caFile, ClientProperties.getInstance().CCPWD)) {
		    	
		   
		    	BufferedReader filereader = new BufferedReader(new FileReader(inputFile));
		    	String line = filereader.readLine();
		    	int count = 0;
		    	while (line != null) {
		    		logger.info(line); 		
		    		String swkn = "", sisin = ""; // wird für symbol benötigt
		    		
		    		if ("isin".equals(type.toLowerCase().trim())) {
		    			logger.info(client.requestSecurityInfo(line.toUpperCase(), SecurityCodeType.ISIN).getName());
		    			List<SecurityCode> scL = client.requestSecurityInfo(line.toUpperCase(), SecurityCodeType.ISIN).getSecurityCodesList();
		    			for(int gi = 0; gi < scL.size(); gi++) {
		    				SecurityCode sce = scL.get(gi);;
		    				if (sce.getCodeType() == SecurityCodeType.WKN) {
		    					logger.info(sce.getCode());	
		    					dbh.insert(sce.getCode(), line.toUpperCase(), filename);
		    				}
		    			}		    			
		    		} else if ("wkn".equals(type.toLowerCase().trim())) {
		    			logger.info(client.requestSecurityInfo(line.toUpperCase(), SecurityCodeType.WKN).getName());
		    			List<SecurityCode> scL = client.requestSecurityInfo(line.toUpperCase(), SecurityCodeType.WKN).getSecurityCodesList();
		    			for(int gi = 0; gi < scL.size(); gi++) {
		    				SecurityCode sce = scL.get(gi);;
		    				if (sce.getCodeType() == SecurityCodeType.ISIN) {
		    					logger.info(sce.getCode());	
		    					dbh.insert(line.toUpperCase(), sce.getCode(), filename);
		    				}
		    			}		    			
		    		} else if ("symbol".equals(type.toLowerCase().trim())) {
	    			logger.info(client.requestSecurityInfo(line.toUpperCase().trim(), SecurityCodeType.MNEMONIC).getName());
	    			List<SecurityCode> scL = client.requestSecurityInfo(line.toUpperCase().trim(), SecurityCodeType.MNEMONIC).getSecurityCodesList();
	    			logger.info(scL.toString());
	    			for(int gi = 0; gi < scL.size(); gi++) {
	    				SecurityCode sce = scL.get(gi);;
	    				if (sce.getCodeType() == SecurityCodeType.ISIN) {
	    					logger.info(sce.getCode());	
	    					sisin =  sce.getCode();
	    				} else if (sce.getCodeType() == SecurityCodeType.WKN) {
	    					logger.info(sce.getCode());	
	    					swkn =  sce.getCode();
	    				}
	    			}		    			
	    			dbh.insert(swkn, sisin, filename);
	    		}
		    		
		    	line = filereader.readLine();
		    	count++;
		   	}
		    logger.info("Anzahl Wertpapiere: " + count);	
	  }
		        // end::initClass[]
		  		  
	  }
	 
	
}
