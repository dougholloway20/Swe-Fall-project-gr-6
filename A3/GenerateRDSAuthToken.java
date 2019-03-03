package Emppackage;
import java.sql.*;  
import java.util.*;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.rds.auth.GetIamAuthTokenRequest;
import com.amazonaws.services.rds.auth.RdsIamAuthTokenGenerator;

	

	public class GenerateRDSAuthToken {

	    public static void main(String[] args) {

		    String region = "us-west-2";
		    String hostname = "rdsmysql.cdgmuqiadpid.us-west-2.rds.amazonaws.com";
		    String port = "3306";
		    String username = "jane_doe";
		
		    System.out.println(generateAuthToken(region, hostname, port, username));
	    }

	    static String generateAuthToken(String region, String hostName, String port, String username) {

		    RdsIamAuthTokenGenerator generator = RdsIamAuthTokenGenerator.builder()
			    .credentials(new DefaultAWSCredentialsProviderChain())
			    .region(region)
			    .build();

		    String authToken = generator.getAuthToken(
			    GetIamAuthTokenRequest.builder()
			    .hostname(hostName)
			    .port(Integer.parseInt(port))
			    .userName(username)
			    .build());
		    
		    return authToken;
	    }

	}
	
	
	//public static void main(String args[]){  
		//try{  
		//Class.forName("com.mysql.jdbc.Driver");  
		//Connection con =DriverManager.getConnection(  
		//"jdbc:mysql://group6-spring-19.c6okdgwbqddl.us-east-1.rds.amazonaws.com:3306/group6-spring-19","dholloway","NrGbuff1");   
		//System.out.println("connected");
		//}catch(Exception e){ System.out.println(e);}  
		//}  	
	

