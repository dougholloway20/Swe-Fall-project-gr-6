import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

 
public class dbconnectservlet { 
	protected static Connection initializeDatabase() 
		throws SQLException, ClassNotFoundException 
	{ 
		// Initialize all the information regarding 
		// Database Connection 
		String dbDriver = "com.mysql.jdbc.Driver"; 
		String dbURL = "jdbc:mysql://104.196.56.178:3306/"; 
		// Database name to access 
		String dbName = "group6emp-eval"; 
		String dbUsername = "root"; 
		String dbPassword = "password"; 

		Class.forName(dbDriver); 
		Connection con = DriverManager.getConnection(dbURL + dbName, 
							dbUsername, 
							dbPassword); 
		return con; 
	} 
} 
    
    

