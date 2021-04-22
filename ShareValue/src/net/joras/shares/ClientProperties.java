package net.joras.shares;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClientProperties {

	private static ClientProperties instance = new ClientProperties();
	private Properties credProp = new Properties();
	
	public volatile String CCPWD = null;
	public volatile String DBUSR = null;
	public volatile String DBPWD = null;
	
	
	private ClientProperties() {
			
		try {
			//load a properties file from class path, inside static method
			InputStream is = getClass().getClassLoader().getResourceAsStream("cred.properties");
			credProp.load(is);
						
			doPreferences(credProp);
			
			is.close();
			
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static ClientProperties getInstance() {
		return instance;
	}
	
	public void doPreferences(Properties prop) {
		CCPWD = credProp.getProperty("CCpwd");
		DBUSR = credProp.getProperty("DBusr");
		DBPWD = credProp.getProperty("DBpwd");
	}
	
}
