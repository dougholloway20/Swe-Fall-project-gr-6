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
		String dbURL = "jdbc:mysql://local-host:3306/"; 
		// Database name to access 
		String dbName = "SWEproject"; 
		String dbUsername = "root"; 
		String dbPassword = "cowboys13"; 

		Class.forName(dbDriver); 
		Connection con = DriverManager.getConnection(dbURL + dbName, 
							dbUsername, 
							dbPassword); 
		return con; 
	} 
} 
    
    

