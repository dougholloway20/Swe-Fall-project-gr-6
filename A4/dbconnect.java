/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Doug
 */

import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;

 public class dbconnect {
     public static void main(String[] args) {
         String connectionUrl =
                 "jdbc:sqlserver://104.196.56.178;databaseName=group6emp-eval;integratedSecurity=true";

         try (Connection con = DriverManager.getConnection(connectionUrl);
                 Statement stmt = con.createStatement();) {
             String SQL = "SELECT TOP 10 * FROM Person;";
             ResultSet rs = stmt.executeQuery(SQL);
             while (rs.next()) {
                 System.out.println(rs.getString("Name"));
             }
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 }