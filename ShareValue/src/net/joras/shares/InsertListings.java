package net.joras.shares;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
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
		  
		  File inputFile = new File("/Users/michaeljoras/git/sharevalue/ShareValue/listings/" + filename + ".txt");
		  
		    File caFile = new File("/Users/michaeljoras/git/sharevalue/AT_Client/AT_Client/Key.pem"); // <1>
	        
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
		    	while (line != null) {
		    		logger.info(line); 		
		    		logger.info(client.requestSecurityInfo(line, SecurityCodeType.ISIN).getName());
		    		List<SecurityCode> scL = client.requestSecurityInfo(line, SecurityCodeType.ISIN).getSecurityCodesList();
		    		for(int gi = 0; gi < scL.size(); gi++) {
						SecurityCode sce = scL.get(gi);;
						if (sce.getCodeType() == SecurityCodeType.WKN) {
							logger.info(sce.getCode());	
							dbh.insert(sce.getCode(), line, filename);
						}
					}
		    		line = filereader.readLine();
		    	}
		    }
		        // end::initClass[]
		  		  
	  }
	 
	
}
