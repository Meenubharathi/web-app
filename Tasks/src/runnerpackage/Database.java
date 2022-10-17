package runnerpackage;

import java.sql.Connection;

//import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Scanner;
//import methodpackage.TaskDatabase;

public class Database
{
     public static Connection getConnection()
     {
    	 String DB_URL="jdbc:mysql://localhost/incubationDB";
         String DB_USERNAME="root";
         String DB_PASSWORD="Root@123";	 
       
    	 Connection connect=null;
    	 try
    	 {
    		connect=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    		if(connect!=null)
    		{
    			System.out.println("DB connected");
    		}
    		else
    		{
    			System.out.println("DB Not connect");
    		}
    		
    		/*System.out.println("Enter the program number 1 to 12");
    		int enter=input.nextInt();
    		input.nextLine();
    		switch(enter)
    		{
    		case 1:
    			String table=task.createTable();
    			connect=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    	  		statement =connect.createStatement();
    	  		statement.execute(table);
    	  		statement.close();
    	  		connect.close();
    	  		System.out.println("Table created successfully");
    		}*/
    	 }catch(SQLException ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 return connect;
     }
}
