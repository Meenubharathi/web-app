package runnerpackage;

import java.sql.SQLException;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import methodpackage.CustomerAccountDetails;
import methodpackage.CustomerDetails;
import methodpackage.DataBaseMethod;
import methodpackage.LogicalLayer;
import methodpackage.TransactionDetails;
import methodpackage.UserDetails;

public class DataBaseRunner
{
	static Scanner input= new Scanner(System.in);
   public static void main(String[] args) 
    {
         DataBaseMethod data=new DataBaseMethod();
         CustomerDetails details=new CustomerDetails();
         CustomerAccountDetails account=new CustomerAccountDetails();
         UserDetails user=new UserDetails();
         LogicalLayer logic=new LogicalLayer();
         TransactionDetails transaction=new TransactionDetails();
         try
       	{
         	System.out.println("Enter the program number 1 to 12");
    		int enter=input.nextInt();
    		input.nextLine();
			switch(enter)
    		{
    		case 1:
    			String query=data.createUserTable();
    			data.table(query);
    	  		System.out.println("Table created successfully");
    	  		break;
    		case 2:
    			query=data.createCustomerDetailTable();
    			data.table(query);
    			break;
    		case 3:
    			query=data.createCustomerAccountDetailTable();
    			data.table(query);
    			break;
    	    case 4:
    	    	System.out.println("Enter 1 if you are a customer \n"
    	    			           + "Enter 2 if you are a Admin");
    	    	int login=input.nextInt();
    	    	input.nextLine();
    	    	switch(login)
    	    	{
    	    	case 1:	
    	    	System.out.println("Enter userID");
    			int id=input.nextInt();
    			System.out.println("enter password");
    			String password=input.next();
    			 Map<Integer,UserDetails> map=logic.setUserLoginCustomer(id,password);
    			System.out.println(map);
    			if(!map.isEmpty())
    			{
    				int wish;
					do
    				{
       			     System.out.println("Enter number 1 to view all the ACCOUNT DETAILS \n"
       			   		+ "Enter number 2 to view particular ACCOUNT DETAILS \n"
       			   		+ "Enter number 3 to view personal details \n"
       			   		+ "Enter 4 for transaction ");
       			   int entry=input.nextInt();
       			   input.nextLine();
       			   switch(entry)
       			   {
       			        case 1:
       			        	Map<Integer,Map<Long,CustomerAccountDetails>>  allmap=logic.getAccountDetails(id);
       			        	System.out.println(allmap);
       			        
       	    				break;
       			       case 2:
       			    	   System.out.println("enter account number");
       			    	   long acc_no=input.nextLong();
       			    	   Map<Long,CustomerAccountDetails> accmap=logic.getParticularAccountDetails(acc_no); 
       			    	  System.out.println(accmap);
       			    	  break;
       			       case 3:
                           Map<Integer,CustomerDetails> maps=logic.getPersonalDetails(id);
       			    	   System.out.println(maps);
       			    	   break;
       			       case 4:
       			    	 System.out.println("enter customer id");
   				         int cusId=input.nextInt();
   				         transaction.setCustomerId(cusId);
   				         System.out.println("Enter account no");
   			             long no=input.nextLong();
   			             transaction.setAccount_Number(no);
   			             long accno=logic.present(no);
   			             if(accno==no)
   			             {
   			            	 String status=logic.getStatus(accno);
   			            	 System.out.println(status);
   			            	 if(status.equals("ACTIVE"))
   			            	 {
   			        	    long balance=logic.getBalance(no);
       			            System.out.println("the current balance is "+balance);
   			                System.out.println("Enter 1 to credit \n"
   				                             	+ "Enter 2 to debit \n"
   				                             	+ "Enter 3 for transaction details");
   			                int enter1=input.nextInt();
   			                input.nextLine();
 			                	switch(enter1)
 			                 	{
 			                        case 1:
 			                        	 long time=logic.milliseconds();
 			          			         System.out.println("the time is "+time);
 			          			         transaction.setTime(time);
 			          			         System.out.println("Enter the transaction account");
 			          			         long transAccount=input.nextLong();
 			          			          transaction.setTransaction_Account(transAccount);
 			          			          String mode="credit";
 			  		                      transaction.setModeOfTransaction(mode);
 			  		                      System.out.println(" the amount to be credited");
 			  		                      long amount=input.nextLong();
 			  		                      transaction.setAmount(amount);
 			  		                      long credit=logic.credit(amount,no);
 			  		                      System.out.println(credit);
 			  		                      logic.update(balance,credit);
 			  		                      System.out.println("update successfull");
 			  		                      transaction.setCurrent_Balance(credit);
 			  		                      List<TransactionDetails> trans=new ArrayList<TransactionDetails>();
 		  			  	                  trans.add(transaction);
 		  			             	      data.insertTransactionDetails(trans);

 			  		                      break;
 			  	                        case 2:
 			  	                         time=logic.milliseconds();
 			  	   			             System.out.println("the time is "+time);
 			  	   			             transaction.setTime(time);
 			  	   			             System.out.println("Enter the transaction account");
 			  	   			             transAccount=input.nextLong();
 			  	   			             transaction.setTransaction_Account(transAccount);
 			  	   			              if(balance>3000)
 			  	                        {
 			  	                       	  mode="debit";
 			  		                      transaction.setModeOfTransaction(mode);
 			  	                          System.out.println(" the amount to be debited");
			  		                      amount=input.nextLong();
			  		                      transaction.setAmount(amount);
	  			                          long debit=logic.debit(amount,no);
	  			                          if(amount<balance)
	  			                          {
			  		                      System.out.println(debit);
			  		                      logic.update(balance,debit);
			  		                      transaction.setCurrent_Balance(debit);
			  		                      trans=new ArrayList<TransactionDetails>();
			  			  	              trans.add(transaction);
			  			             	  data.insertTransactionDetails(trans);
	  			                          }
	  			                          else
	  			                          {
	  			                        	  System.out.println("transaction not successfull");
	  			                          }
	  			                       }
 			  	                       else
 			  	                       {
 			  	                        	System.out.println("minimum balance");
 			  	                       }
			  		                   break;
 			  	                        case 3:
 			  	                         Map<Long,List<TransactionDetails>> trans1=logic.lastTransaction(accno);
 			  	       			    	System.out.println(trans1);
 			  	       			        break;
			                    } 
 			                }
   			            	
   			             }
   			           
   			           else
		                	{
   				            System.out.println("incorrect account number");
   			                }
   			          break;
       			      	   

       			   }
       			   System.out.println("Enter 1 to repeate ,2 to out");
       			    wish=input.nextInt();
    				}while(wish==1);
       		
    			}
    			else
    			{
    				System.out.println("inavalid customer_id or password");
    			}
    			break;
    		 case 2:
    			System.out.println("Enter CUSTOMER_ID");
    			id=input.nextInt();
    			System.out.println("enter password");
    			password=input.next();
    			boolean check=logic.setUserLogin(id, password);
    			if(check==true)
    			{
    				int select;
    				do
    				{
    				System.out.println("welcome,you are a admin");
    			    System.out.println("Enter 1 to view All user details \n"
    					+ "Enter 2 to view all Account details \n"
    					+ "Enter 3 to view all personal details \n"
    					+ "Enter 4 for insert process \n"
    					+ "Enter 5 for update");
    			   int entry=input.nextInt();
    			   input.nextLine();
    			   switch(entry)
    			   {
    			       case 1:
    			    	   Map<Integer,UserDetails> userDetails=logic.getAllUserDetails();
    			    	   System.out.println(userDetails);
    			    	   for(Map.Entry<Integer,UserDetails> entry1: userDetails.entrySet())
    			    	   {
    			    		   System.out.println("Customer_id "+entry1.getKey()+entry1.getValue());
    	    					 
    			    	   }
    			    	    break;
    			       case 2:
    			    	   Map<Long,CustomerAccountDetails> userAcc=logic.getAllAccountDetails();
    			    	   System.out.println(userAcc);
    			    	   for (Map.Entry<Long,CustomerAccountDetails> entry1 : userAcc.entrySet())
    						 {
    						 System.out.println("account number "+entry1.getKey()+entry1.getValue());
    						 }
    					   break;
    			       case 3:
    			    	   Map<Integer,CustomerDetails> cus =logic.getAllPersonalDetails();
    			    	   System.out.println(cus);
    			    	   for (Map.Entry<Integer,CustomerDetails> entry1 : cus.entrySet())
  						   {
  						     System.out.println("customer id "+entry1.getKey()+entry1.getValue());
  						   }
  					
    			       case 4:
    			    	   System.out.println("Enter 1 for inseting into a user table \n"
    			    	   		+ "Enter 2 for inserting personal details \n"
    			    	   		+ "Enter 3 for inserting account details");
    			    	   int insert=input.nextInt();
    			    	   input.nextLine();
    			    	   switch(insert)
    			    	   {
    			    	   case 1:
    			    		   System.out.println("enter number of users");
    			    			int number=input.nextInt();
    			    			List<UserDetails> list2=new ArrayList<UserDetails>();
    			    			for(int i=0;i<number;i++)
    			       			{
    			       				System.out.println("Enter user detail"+i);
    			       				System.out.println("CUSTOMER_ID");
    			       			    id=input.nextInt();
    			       				user.setUserId(id);
    			       				System.out.println("NAME");
    			       				String name=input.next();
    			       				user.setName(name);
    			       				System.out.println("PHONE_NO");
    			       				long phoneNo=input.nextLong();
    			       				user.setPhoneNo(phoneNo);
    			       				System.out.println("EMAIL");
    			       				String email=input.next();
    			       				user.setEmail(email);
    			       				System.out.println("PASSWORD");
    			       				password=input.next();
    			       				user.setPassWord(password);
    			       				System.out.println("STATUS");
    			       				String status=input.next();
    			       				user.setStatus(status);
    			       				list2.add(user);
    			       				data.insertUserDetails(list2);
    			       			}
    			       		    break;
    			    	   case 2:
    			    		    System.out.println("Enter number of customer");
    			       			number=input.nextInt();
    			       			List<CustomerDetails> list=new ArrayList<CustomerDetails>();
    			       			for(int i=0;i<number;i++)
    			       			{
    			       				System.out.println("Enter customer detail"+i);
    			       				System.out.println("CUSTOMER_ID");
    			       				id=input.nextInt();
    			       				details.setCustomerID(id);
    			       				System.out.println("ADHAR");
    			       				long adhar=input.nextLong();
    			       				details.setAdharNo(adhar);
    			       				System.out.println("PAN_NO");
    			       				String pan=input.next();
    			       				details.setPanNo(pan);
    			       				System.out.println("DOB");
    			       				String dob=input.next();
    			       				details.setDob(dob);
    			       				System.out.println("ADDRESS");
    			       			    input.nextLine();
    			       				String address=input.nextLine();
    			       			   	details.setAddress(address);
    			       				list.add(details);
    			       				data.insertCustomerDetails(list);
    			       	     	}
    			       			break;
    			    	   case 3:
    			    		   System.out.println("Enter number of account details");
    			    			number=input.nextInt();
    			    			List<CustomerAccountDetails> list1=new ArrayList<CustomerAccountDetails>();
    			    			for(int i=0;i<number;i++)
    			    			{
    			    				System.out.println("Enter account details"+i);
    			    				System.out.println("CUSTOMER_ID");
    			    				id=input.nextInt();
    			    				account.setCustomerID(id);
    			    				System.out.println("ACCOUNT_NO");
    			    				long accountNo=input.nextLong();
    			    				account.setAccountNo(accountNo);
    			    				System.out.println("IFSC_CODE");
    			    				String ifsc=input.next();
    			    				account.setIFSCcode(ifsc);
    			    				System.out.println("BRANCH");
    			    				String branch=input.next();
    			    				account.setBranch(branch);
    			    				System.out.println("BALANCE");
    			    				long balance=input.nextLong();
    			    				account.setBalance(balance);
    			    				System.out.println("ACCOUNT_TYPE");
    			    				String accType=input.next();
    			    				account.setAccountType(accType);
    			    				System.out.println("STATUS");
    			       				String status=input.next();
    			       				account.setStatus(status);
    			       				list1.add(account);
    			    				data.insertCustomerAccountDetails(list1);
    			    			}
    			    			break;
    			    	   }
    			    	   break;
    			    	   case 5:
    			    		   System.out.println("Enter 1 for update user \n"
    			    		   		+ "Enter 2 for update Account details \n"
    			    		   		+ "Enter 3 for update personal details");
    			    		   int update=input.nextInt();
    			    		   input.nextLine();
    			    		   switch(update)
    			    		   {
    			    		   case 1:
    			    		    System.out.println("Enter the field");
    			      			String field=input.next();
    			      			System.out.println("Enter the value");
    			      			String  value= input.next();
    			      			System.out.println("enter the customer id");
    			      			id=input.nextInt();
    			      			logic.updateUserDetails(field, value, id);
    			      			break;
    			    		   case 2:
    			    			System.out.println("Enter the field");
       			      			field=input.next();
       			      			System.out.println("Enter the value");
       			      			value= input.next();
       			      			System.out.println("enter the account number");
       			      			long accNo=input.nextLong();
       			      			logic.updateAccountDetails(field, value, accNo);
       			      	         break;
    			    		   case 3:
    			    			  System.out.println("Enter the field");
          			      		  field=input.next();
          			      		  System.out.println("Enter the value");
          			      		  value= input.next();
          			      		  System.out.println("enter the customer id");
    			      			  id=input.nextInt();
    			      			  logic.updatePersonalDetails(field, value, id);
    			      			  break;
    			    		
    			    		   }
    			      		
    			    	   }
    			   	   
    			   
    			System.out.println("Enter 1 to repeate ,2 to out");
   			    select=input.nextInt();
				}while(select==1);
   		
    	    	}
    	    	
    			else
    			{
    				System.out.println("SORRY,YOU ARE NOT A ADMIN");
    			}
    	    	}
    			break;
    		case 5:
    			query=data.createTransactionTable();
    			data.table(query);
    		    System.out.println("table created successfully");
    		    break;
    	    			}
       	}catch(SQLException ex)
   	    {
   		    ex.printStackTrace();
   	     }catch(InputMismatchException ex)
		{
 			System.out.println("invalid input datatype");
 	    }
    }
}
