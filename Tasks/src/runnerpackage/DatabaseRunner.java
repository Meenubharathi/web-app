package runnerpackage;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import methodpackage.PojoDataBase;
import methodpackage.TaskDatabase;


public class DatabaseRunner 
{
	  static Scanner input= new Scanner(System.in);
      public static void main(String[] args)
      {
    	   TaskDatabase task=new TaskDatabase();
    	   PojoDataBase pojoDB=new PojoDataBase();
    	try
      	{
      	System.out.println("Enter the program number 1 to 12");
   		int enter=input.nextInt();
   		input.nextLine();
   		switch(enter)
   		{
   		case 1:
   			String table=task.createTable();
   			task.table(table);
   	  		System.out.println("Table created successfully");
   	  		break;
   	  		
   		case 2:
   			System.out.println("Enter number of employees");
   			int number=input.nextInt();
   			for(int i=0;i<number;i++)
   			{
   				System.out.println("Enter employee detail"+i);
   				int id=input.nextInt();
   				String name=input.next();
   				long  mobile=input.nextLong();
   				String mail=input.next();
   				String dept=input.next();
   				task.insertTable(id, name, mobile, mail, dept);
     	  		System.out.println("insertion sccessful");
   			}
   			break;
   			
   		case 3:
   			System.out.println("Enter EMPLOYEE_ID");
   			int id=input.nextInt();
   			List<Object> list=task.getDetails(id);
   			int len=list.size();
   			for(int i=0;i<len;i++)
   			{
   				System.out.println(list.get(i));
   			}
   			break;
   			
   		case 4:
   			System.out.println("Enter the field");
   			String field=input.next();
   			System.out.println("Enter the value");
   			String  value= input.next();
   			System.out.println("enter the new value");
   			String value1=input.next();
   			task.update(field,value,value1);
   			break;
   		
   		case 5:
   			List<Object> fullList=task.getFullDetails();
   			int length=fullList.size();
   			for(int i=0;i<length;i++)
   			{
   				System.out.println(fullList.get(i));
   			}
   			break;
   				
   		case 6:
   			String order=task.orderList();
   			task.table(order);
   			fullList=task.getFullDetails();
   			length=fullList.size();
   			for(int i=0;i<length;i++)
   			{
   				System.out.println(fullList.get(i));
   			}
   			System.out.println("changed");
            break;
   			
   			
   		case 7:
   			System.out.println("Enter EMPLOYEE_ID");
   			id=input.nextInt();
   		    table=task.deleteRow(id);
   		    task.table(table);
   		    fullList=task.getFullDetails();
			length=fullList.size();
			for(int i=0;i<length;i++)
			{
				System.out.println(fullList.get(i));
			}
		
   			System.out.println("deletion sccessful");
   			break;
   			
   		case 8:
   			 System.out.println("enter number of insertion");
   			 int insert=input.nextInt();
   			 List<PojoDataBase> pojo= new ArrayList<PojoDataBase>();
   			 for(int i=0;i<insert;i++) 
   			 {
   				System.out.println("enter the details");
   				id=input.nextInt();
   				pojoDB.setEmployee_id(id);
   				String name=input.next();
   				pojoDB.setName(name);
   				long  mobile=input.nextLong();
   				pojoDB.setMobile(mobile);
   				String mail=input.next();
   				pojoDB.setGmail(mail);
   				String dept=input.next();
   				pojoDB.setDepartment(dept);
   				pojo.add(pojoDB);
   			    task.insertPOJO(pojo);
   			 }
   			 break;
   			
   		case 9:
   			String table1=task.createDeptTable();
   			task.table(table1);
   			System.out.println("Dependent table created successfully");
   		    break;
   		    
   		case 10:
   			System.out.println("Enter number of details");
   			number=input.nextInt();
   			for(int i=0;i<number;i++)
   			{
   				System.out.println("Enter employee's personal detail"+i);
   				id=input.nextInt();
   				int index=input.nextInt();
   				String name=input.next();
   				int age=input.nextInt();
   				String relation=input.next();
   				
   				task.insertDeptTable(id, index, name, age, relation);
   				System.out.println("insertion successfull");
   			}
   			break;
   			
   		case 11:
   		    System.out.println("Enter EMPLOYEE_ID");
			id=input.nextInt();
			List<Object> list1=task.deptDetail(id);
			System.out.println(list1);
			break;
		   
   		case 12:
   		    List<Object> list2=task.deptOrderList();
   		    System.out.println(list2);
   		    length=list2.size();
   		    for(int i=0;i<length;i++)
   		    {
   		    	System.out.println(list2.get(i));
   		    }
   		
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
