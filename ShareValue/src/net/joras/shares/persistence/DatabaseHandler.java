package net.joras.shares.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.joras.shares.ClientProperties;


public class DatabaseHandler {
	
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
	
	public void updateYielCalculation(String wkn, String name, int geopakterm, double geopak, double payield, 
			double gk, double vr) throws SQLException {
		
		 // create our java preparedstatement using a sql update query
	    PreparedStatement ps = connection.prepareStatement(
	      "UPDATE sharevalues SET name = ?, geopakterm = ?, geopak = ?, payield = ?, gk = ?, vr = ? WHERE wkn = ? ");

	    // set the preparedstatement parameters
	    ps.setString(1,name);
	    ps.setInt(2,geopakterm);
	    ps.setDouble(3,geopak);
	    ps.setDouble(4,payield);
	    ps.setDouble(5,gk);
	    ps.setDouble(6,vr);
	    ps.setString(7,wkn);
	    

	    // call executeUpdate to execute our sql update statement
	    ps.executeUpdate();
	    ps.close();
		
	}

	public void updatecomment(String wkn, String comment) throws SQLException {
		
		 // create our java preparedstatement using a sql update query
	    PreparedStatement ps = connection.prepareStatement(
	      "UPDATE sharevalues SET comment = ? WHERE wkn = ? ");

	    // set the preparedstatement parameters
	    ps.setString(1,comment);
	    ps.setString(7,wkn);
	    

	    // call executeUpdate to execute our sql update statement
	    ps.executeUpdate();
	    ps.close();
		
	}

	
	
	public List<String> loadWKNList() throws SQLException {
		
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select wkn from sharevalues");
		
		List<String> wkn = new ArrayList<>();
		
		while (resultset.next()) {
			wkn.add(resultset.getString(1));  
			System.out.println(resultset.getString(1));
	    }
		 
		resultset.close();
		statement.close();
		
		return wkn;
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
        System.out.println("Alle Einträge zu den Personen ");
        System.out.println();
        // Ich zeige die Tabellenspaltennamen an.
        for (int i = 1; i <= columns; i++)
            System.out.print(resultset.getMetaData().getColumnLabel(i) + "\t\t");
        System.out.println();
        System.out.println();
        // Ich zeige den Inhalt der Tabelle an. Normaler Weise würde man die
        // Ergebnisse in eine Liste schreiben und diese zurück liefern.
        while (resultset.next()) {
            for (int i = 1; i <= columns; i++) {
                System.out.print(resultset.getString(i) + "\t\t");
            }
            System.out.println();
        }
        // Ich schließe die Streams wieder und gebe die Tabelle wieder frei.
        resultset.close();
        statement.close();
		
		
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		DatabaseHandler dbh =  new DatabaseHandler();
		System.out.println(dbh.connectToDatabase());
		dbh.readShareValue();
		
	}
	
	
	
	
}
