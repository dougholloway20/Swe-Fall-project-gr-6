package javaapplication2;

import java.sql.*;
public class dbconnect {

    
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://104.196.56.178:3306/group6emp-eval","root","password");
                Statement stmt=con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from users");
                while(rs.next()){
                    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)
                    +" "+rs.getString(5)+" "+rs.getString(6));
                }
                con.close();
                
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
