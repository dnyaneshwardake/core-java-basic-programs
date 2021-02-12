package com.dnyanesh.fang.codes;

import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;
 
/**
 * A Java ORACLE PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * ORACLE database, called from a Java program, using a
 * Java PreparedStatement.
 * 
 * Created by Alvin Alexander, <a href="http://devdaily.com" title="http://devdaily.com">http://devdaily.com</a>
 */
public class JDBCExample
{
  public static void main(String[] args)
  {
    try
    {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DNYANESH", "system");
     
      // create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
 
      // the mysql insert statement
      String query = " insert into student (first_name, last_name, date_created, is_admin, num_points)" + " values (?,?,?,?,?)";
      //String query = " insert into student (first_name, last_name, date_created, is_admin, num_points)" + " values ('Ramesh', 'Nemte','startDate', 'false', '5002')";
 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the First Name, Last Name, And ID");
      String fn = sc.nextLine();
      String ln = sc.nextLine();
      int id = sc.nextInt();
      
      
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, fn);
      preparedStmt.setString (2, ln);
      preparedStmt.setDate   (3, startDate);
      preparedStmt.setBoolean(4, true);
      preparedStmt.setInt    (5, id);
 
      //execute the preparedstatement
      preparedStmt.execute();
      conn.close();
      System.out.println("Data Inserted Successfully...");
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
  }
}