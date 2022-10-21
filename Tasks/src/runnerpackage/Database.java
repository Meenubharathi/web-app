package runnerpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    		
    		}catch(SQLException ex)
    	 {
    		 ex.printStackTrace();
    	 }
    	 return connect;
     }
}
