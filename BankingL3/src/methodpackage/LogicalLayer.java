package methodpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.util.HashMap;
import java.util.Map;

public class LogicalLayer
{
    public boolean setUserLogin(int userID,String userPassword) throws SQLException
    {
    	        String password="PASSWORD";
    	    	boolean check = false;
    	         if(userID==100&&userPassword.equals(password))
    	        		{
    	        	       check=true;
    	        		}
    	        		
    	       return check;
    	    	
    }
    public Map<Integer,UserDetails> getAllUserDetails() throws SQLException
    {
    	Map<Integer,UserDetails> map=new HashMap<>();
        String query1="select * from USER";
    	try(Connection connect1=Database.connection();
    	      PreparedStatement	statement1 =connect1.prepareStatement(query1);ResultSet result=statement1.executeQuery();)
    	       	   {
    	       	    while(result.next())
    	    	    {
    	     	    	UserDetails user=new UserDetails();
    	       	    	user.setUserId(result.getInt(1));
    	       	    	user.setName(result.getString(2));
    	       	    	user.setEmail(result.getString(3));
    	       	    	user.setPhoneNo(result.getLong(4));
    	       	    	user.setPassWord(result.getString(5));
    	       	    	map.put(result.getInt("CUSTOMER_ID"), user);
    	    	   
    	    	    }
    	       	   }
    	return map;
    }
    public Map<Long,CustomerAccountDetails> getAllAccountDetails() throws SQLException 
    {
       	Map<Long,CustomerAccountDetails> map1=new HashMap<>();
      	 String query="select * from CUSTOMER_ACCOUNT_DETAILS" ;
    	 try(Connection connect=Database.connection();
       		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
         	{
         		while(result.next())
         		{
         	        CustomerAccountDetails acc=new CustomerAccountDetails();
         			acc.setCustomerID(result.getInt(1));
         		    acc.setAccountNo(result.getLong(3));
         		    acc.setIFSCcode(result.getString(4));
         		    acc.setBranch(result.getString(5));
         		    acc.setBalance(result.getLong(6));
         			acc.setAccountType(result.getString(7));
         			map1.put(result.getLong("ACCOUNT_NO"),acc);
          	    	
         	    		  
         		}
         		return map1;
         	}
     }
    public Map<Integer,CustomerDetails> getAllPersonalDetails() throws SQLException
    {

     	Map<Integer,CustomerDetails> map=new HashMap<>();
    	String query="select * from CUSTOMER_DETAILS ";
    	try(Connection connect=Database.connection();
   		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
     	{
     		while(result.next())
     		{
     	   		CustomerDetails details=new CustomerDetails();
     			details.setCustomerID(result.getInt(1));
     	    	details.setAdharNo(result.getLong(3));
     	    	details.setPanNo(result.getString(4));
     	    	details.setDob(result.getString(5));
     	    	details.setAddress(result.getString(6));
     	    	map.put(result.getInt("CUSTOMER_ID"),details);
     		}
     		return map;
     	}
   
    }
 public Map<Integer,UserDetails> setUserLoginCustomer(int userID,String userPassword) throws SQLException
  {
    		    Map<Integer,UserDetails> map=new HashMap<>();	    
    	   {
    	    		String password="PASSWORD";
        	    	if(userID==100&&userPassword.equals(password))
        	    	{
        	             System.out.println("you are not a customer");
        	    	}
        	    	else
        	    	{
    	    		String  query="select * from USER where CUSTOMER_ID= ? and PASSWORD= ?";
    	       	     try(Connection connect=Database.connection();
    	       		  	 PreparedStatement	statement =connect.prepareStatement(query);)
    	       	     {
    	       		statement.setInt(1, userID);
    	       		statement.setString(2, userPassword);
    	       		try(ResultSet result=statement.executeQuery())
    	       	    {
    	       	    while(result.next())
    	    	        {
    	    		   	UserDetails user=new UserDetails();
    	       	    	user.setUserId(result.getInt(1));
    	       	    	user.setName(result.getString(2));
    	       	    	user.setEmail(result.getString(3));
    	       	    	user.setPhoneNo(result.getLong(4));
    	       	    	user.setPassWord(result.getString(5));
    	       	    	map.put(userID, user);
    	    	        }
    	    	      }
    	       	   }
    	     
    	      }
    	    	}
				return map;
  }
    	 
    
    public Map<Integer,Map<Long,CustomerAccountDetails>>/*List<Object>*/ getAccountDetails(int id) throws SQLException
    {
    		Map<Integer,Map<Long,CustomerAccountDetails>> map=new HashMap<>();
    	Map<Long,CustomerAccountDetails> map1=new HashMap<>();
       	 String query="select*from CUSTOMER_ACCOUNT_DETAILS INNER JOIN USER ON USER.CUSTOMER_ID=CUSTOMER_ACCOUNT_DETAILS.CUSTOMER_ID where USER.CUSTOMER_ID= "+id+"";
     	 try(Connection connect=Database.connection();
        		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
          	{
          		while(result.next())
          		{
          	    	CustomerAccountDetails acc=new CustomerAccountDetails();
         			acc.setCustomerID(result.getInt(1));
         		    acc.setAccountNo(result.getLong(3));
         		    acc.setIFSCcode(result.getString(4));
         		    acc.setBranch(result.getString(5));
         		    acc.setBalance(result.getLong(6));
         			acc.setAccountType(result.getString(7));
         			map1.put(result.getLong("ACCOUNT_NO"),acc);
          	    	map.put(id, map1);	  
          		}
          		return map;
          	}
          
    }
 
    public Map<Long,CustomerAccountDetails> getParticularAccountDetails(long acc_no) throws SQLException
    {
    		Map<Long,CustomerAccountDetails> map=new HashMap<>();
    	String query="select * from CUSTOMER_ACCOUNT_DETAILS where ACCOUNT_NO= "+acc_no+"";
    	try(Connection connect=Database.connection();
   		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
     	{
     		while(result.next())
     		{
     			CustomerAccountDetails acc=new CustomerAccountDetails();
     			acc.setCustomerID(result.getInt(1));
     		    acc.setAccountNo(result.getLong(3));
     		    acc.setIFSCcode(result.getString(4));
     		    acc.setBranch(result.getString(5));
     		    acc.setBalance(result.getLong(6));
     			acc.setAccountType(result.getString(7));
     			map.put(result.getLong("ACCOUNT_NO"),acc);
     				  
     		}
     		return map;
     	}
    }
   public Map<Integer,CustomerDetails> getPersonalDetails(int id) throws SQLException
    {
    	Map<Integer,CustomerDetails> map=new HashMap<>();
    	String query="select * from CUSTOMER_DETAILS where CUSTOMER_ID= "+id+"";
    	try(Connection connect=Database.connection();
   		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
     	{
     		while(result.next())
     		{
     			CustomerDetails details=new CustomerDetails();
     			details.setCustomerID(result.getInt(1));
     	    	details.setAdharNo(result.getLong(3));
     	    	details.setPanNo(result.getString(4));
     	    	details.setDob(result.getString(5));
     	    	details.setAddress(result.getString(6));
     	    	map.put(result.getInt("CUSTOMER_ID"),details);
     		}
     		return map;
     	}
    
    }
    public String deleteRow(int id) throws SQLException                           
    {
   	 String query="delete from USER "+"where CUSTOMER_ID = "+id+"";
   	try(Connection connect=Database.connection();
   	  	 PreparedStatement	statement =connect.prepareStatement(query);)
   		{
   	         statement.execute(query);
   		}
   	 return query;
    }
    public long milliseconds()
    {
 	  
    	Clock clock=Clock.systemDefaultZone();
    	long milliSecond=clock.millis();
 	    return milliSecond;
    }
	public long credit(long amount,long accNo) throws SQLException
	{
	    long balance =getBalance(accNo);
	    balance=balance+amount;
	    return balance;
	}
    public long debit(long amount,long accNo) throws SQLException
    {
       long balance =getBalance(accNo);
 	   if(balance>=3000)
 	   {
 	            balance=balance-amount;
 	            if(balance>=3000)
 	            {
 	            	return balance;
 	            }
 	   }
 	   return balance;
    } 
    public long getBalance(long accNo) throws SQLException
    {
    	String query="select BALANCE from CUSTOMER_ACCOUNT_DETAILS  where ACCOUNT_NO="+accNo+"";
    	long balance = 0;
    	try(Connection connect=Database.connection();
      		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
        	{
        		while(result.next())
        		{
        			balance=result.getLong("BALANCE");
        		}
            }
    	return balance;
    }
    public void update(long oldValue,long newValue) throws SQLException         //4
    {
   	 String query="update CUSTOMER_ACCOUNT_DETAILS set BALANCE = "+newValue+" where BALANCE = "+oldValue+"";
   	
   	 try(Connection connect=Database.connection();
   		  	 PreparedStatement	statement =connect.prepareStatement(query);)
   	    {
   		     statement.executeUpdate();
   	    }
     }
    public long present(long accNo) throws SQLException
    {
    	String query="SELECT ACCOUNT_NO FROM CUSTOMER_ACCOUNT_DETAILS  WHERE ACCOUNT_NO="+accNo+"";
    	long acc_no=0;
    	try(Connection connect=Database.connection();
     		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
       	{
       		while(result.next())
       		{
       			acc_no=result.getLong("ACCOUNT_NO");
       		}
        }
   	return acc_no;
    }
  
  
    }
    

