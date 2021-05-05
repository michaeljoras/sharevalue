package net.joras.shares.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.joras.shares.Client;
import net.joras.shares.ClientProperties;


public class DatabaseHandler {
	
	private static final Logger logger = LogManager.getLogger(DatabaseHandler.class);
	
	private static Connection connection;
	
	public DatabaseHandler() {
		connectToDatabase();
	}
	
	public boolean connectToDatabase()  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			String connectionCommand = "jdbc:mysql://localhost:3306/ShareValue?user="+ClientProperties.getInstance().DBUSR+"&password="+ClientProperties.getInstance().DBPWD;
			connection = DriverManager.getConnection(connectionCommand);
			
		;
			return true;
		} catch (Exception ex) {
			System.out.println("false");
			return false;
		}
	}
	
	public void updateYielCalculation(String wkn, String isin, String name, int geopakterm, double geopak, double payield, 
			double gk, double vr) throws SQLException {
		
		 // create our java preparedstatement using a sql update query
	    PreparedStatement ps = connection.prepareStatement(
	      "UPDATE sharevalues SET name = ?, geopakterm = ?, geopak = ?, payield = ?, gk = ?, vr = ?, isin = ? WHERE wkn = ? ");

	    // set the preparedstatement parameters
	    ps.setString(1,name);
	    ps.setInt(2,geopakterm);
	    ps.setDouble(3,geopak);
	    ps.setDouble(4,payield);
	    ps.setDouble(5,gk);
	    ps.setDouble(6,vr);
	    ps.setString(7,isin);
	    ps.setString(8,wkn);
	    

	    // call executeUpdate to execute our sql update statement
	    ps.executeUpdate();
	    ps.close();
		
	}

	public void truncate() throws SQLException {
		
		PreparedStatement ps = connection.prepareStatement(
			      "UPDATE sharevalues SET geopakterm = null, geopak = null, payield = null, gk = null, vr = null, comment = null");
		ps.executeUpdate();
	    ps.close();
		
	}
	
	public void updatecomment(String wkn, String comment) throws SQLException {
		
		 // create our java preparedstatement using a sql update query
	    PreparedStatement ps = connection.prepareStatement(
	      "UPDATE sharevalues SET comment = ? WHERE wkn = ? ");

	    // set the preparedstatement parameters
	    ps.setString(1,comment);
	    ps.setString(2,wkn);
	    

	    // call executeUpdate to execute our sql update statement
	    ps.executeUpdate();
	    ps.close();
		
	}

	public void updateName(String wkn, String isin, String name) throws SQLException {
		
		 // create our java preparedstatement using a sql update query
	    PreparedStatement ps = connection.prepareStatement(
	      "UPDATE sharevalues SET isin = ?, name = ? WHERE wkn = ? ");

	    // set the preparedstatement parameters
	    ps.setString(1,isin);
	    ps.setString(2,name);
	    ps.setString(3,wkn);
	    

	    // call executeUpdate to execute our sql update statement
	    ps.executeUpdate();
	    ps.close();
		
	}
	
	public List<String> loadWKNList(boolean all) throws SQLException {
		
		Statement statement = connection.createStatement();
		
		ResultSet resultset = null;
		
		if(all) {
			resultset = statement.executeQuery("select wkn from sharevalues");			
		} else {
			resultset = statement.executeQuery("select wkn from sharevalues where geopak is null");			
		}
		
		List<String> wkn = new ArrayList<>();
		
		while (resultset.next()) {
			wkn.add(resultset.getString(1));  
			System.out.println(resultset.getString(1));
	    }
		 
		resultset.close();
		statement.close();
		
		return wkn;
	}
	
	public String loadName(String wkn) throws SQLException {
		
		String name = "";
		
		PreparedStatement ps = connection.prepareStatement(
			      "select name from sharevalues where wkn = ? ");

			    // set the preparedstatement parameters
			    ps.setString(1,wkn);
		 
			    ResultSet rs = ps.executeQuery();
			    while ( rs.next() ) {
	                name = rs.getString("name");
	                
	            }
			    
			    
			    ps.close();
			    
		return name;
	}
	
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readShareValue() throws SQLException {
		
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from sharevalues");
		
		
		
		int columns = resultset.getMetaData().getColumnCount();
        logger.info("Alle Einträge zu den Personen ");
        
        // Ich zeige die Tabellenspaltennamen an.
        for (int i = 1; i <= columns; i++)
            logger.debug(resultset.getMetaData().getColumnLabel(i) + "\t\t");
 
        // Ich zeige den Inhalt der Tabelle an. Normaler Weise würde man die
        // Ergebnisse in eine Liste schreiben und diese zurück liefern.
        while (resultset.next()) {
            for (int i = 1; i <= columns; i++) {
                logger.debug(resultset.getString(i) + "\t\t");
            }
           
        }
        // Ich schließe die Streams wieder und gebe die Tabelle wieder frei.
        resultset.close();
        statement.close();
		
		
	}
	
	public void insert(String wkn, String isin, String listing) throws SQLException {
		
		 // create our java preparedstatement using a sql update query
	    PreparedStatement ps = connection.prepareStatement(
	    		"INSERT IGNORE INTO sharevalues (wkn, isin) VALUES (?,?)");
	    // set the preparedstatement parameters
	    ps.setString(1,wkn);
	    ps.setString(2,isin);
	        
	    // call executeUpdate to execute our sql update statement
	    ps.executeUpdate();
	    
	    // create our java preparedstatement using a sql update query
	    PreparedStatement pslisting = connection.prepareStatement(
	    		"INSERT IGNORE INTO sharelisting (wkn, listing) VALUES (?,?)");
	    // set the preparedstatement parameters
	    pslisting.setString(1,wkn);
	    pslisting.setString(2,listing);
	        

	    // call executeUpdate to execute our sql update statement
	    pslisting.executeUpdate();
	    
	    
	    ps.close();
		pslisting.close();
	    
	}
	
	
	public static void main(String[] args) throws Exception {
		DatabaseHandler dbh =  new DatabaseHandler();
		System.out.println(dbh.connectToDatabase());
		dbh.readShareValue();
		
	}
	
	
	
	
}
