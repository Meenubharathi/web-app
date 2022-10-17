package runnerpackage;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import exception.CheckException;
import methodpackage.BackRegEx;



public class RunRegEx
{
	static Scanner input=new Scanner(System.in);
	public int count()
	 {
	     System.out.println("Enter the number of elements:");
		 int num=input.nextInt();
		 return num;
	 }
	 public String[] getString(int num)  
	 {  
		 String[] string=new String[num];
		 System.out.println("enter string");
	     for(int i=0;i<num;i++)
		 {
			string[i]=input.next();
		 }
		 return string;
	 }	 
		
    public static void main(String[] args) 
    {
   
    	BackRegEx back =new BackRegEx();
    	RunRegEx run=new RunRegEx();
    	try
    	{
    		System.out.println("enter number 1 to 8");
 	   int enter=input.nextInt();
 	   switch(enter)
 	   {
 	   case 1:
 	        System.out.println("enter the phone number:");
    	    String n=input.next();
    	    System.out.println("the output is:"+back.phoneNo(n));
    	    break;
    	    
 	   case 2:
 		    System.out.println("enter the string:");
 		    String string=input.next();
 		    System.out.println("the output is:"+back.alphaNumericMatch(string));
 		    break;
 		    
 	   case 3:
 		    System.out.println("Enter the match String:");
 		    String string1=input.next();
 		    System.out.println("enter the start:");
 		    String start=input.next();
 		    boolean checkstart=back.checkStart(start,string1);
 		    System.out.println(checkstart);
 		    System.out.println("enter the end :");
		    String end=input.next();
		    boolean checkend=back.checkEnd(end,string1);
		    System.out.println(checkend);
		    System.out.println("Enter the string:");
		    String exact=input.next();
		    boolean checkexact=back.exactMatch(string1, exact);
		    System.out.println(checkexact);
 		    System.out.println("Enter the input string:");
 		    String string2=input.next();
 		    Matcher match=back.checkMatch(string1, string2);
 		    if(match.find())
 		    {
 		    	System.out.println("Match found");
 		    }
 		    else
 		    {
 		    	System.out.println("Match not found");
 		    }
 		    break;
 		    
 	      case 4:
		    System.out.println("Enter the match String:");
		    string1=input.next();
		    System.out.println("enter the number");
	         int num=input.nextInt();
	 		   System.out.println("enter the string");
	 		   String[] word=new String[num];
	 		   for(int i=0;i<num;i++)
	 		   {
	 			  word[i]=input.next(); 
	 		   }
	 		   List<String> list=back.addList(word, num);
	 		   for(int i=0;i<num;i++)
	 		   {
	 			   String input=list.get(i);
	 			   match=back.caseMatch(string1,input);
		           if(match.find())
		           {
		             	System.out.println("Match found");
		            }
		            else
		            {
		             	System.out.println("Match not found");
		            }
	 		   }
		    break;
		    
 	   case 5:
 		   System.out.println("enter the email id:");
 		   String id=input.next();
 		   boolean matchid=back.emailCheck(id);
 		   if(matchid)
 		   {
 			   System.out.println("valid");
 		   }
 		   else
 		   {
 			   System.out.println("invalid");
 		   }
 		   break;
 		   
 	   case 6:
 		   System.out.println("enter the range:");
 		   int startrange=input.nextInt();
 		   int endrange=input.nextInt();
 		   num=run.count();
		   word=run.getString(num);
		   list=back.addList(word, num);
 		   for(int i=0;i<num;i++)
 		   {
 			   String input=list.get(i);
 			   boolean check=back.checkRange(input,startrange,endrange);
 			   System.out.println(check+" "+input);
 		   }
 		   break;
 		   
 	   case 7:
 		   System.out.println("List 1");
 		   int num1=run.count();
 		   String[] word1=run.getString(num1);
 		   List<String> list1=back.addList(word1, num1);
 		   System.out.println("List 2");
 		   int num2=run.count();
		   String[] word2=run.getString(num2);
		   List<String> list2=back.addList(word2, num2);
		   Map<String,Integer> map1=new HashMap<String,Integer>();
		   for(int i=0;i<num1;i++)
		   {
			   String input1=list1.get(i);
			   for(int j=0;j<num2;j++)
			   {
				   String input2=list2.get(j);
				  boolean same=back.exactMatch(input1, input2);
				  if(same)
				  {
					   map1=back.getHashMap(map1, input1,i);
				  }
			   }
		   }
		   System.out.println("the output is "+map1);
			break;
			
 	   case 8:
 		  input.nextLine();
 	 		  System.out.println("Enter the line:");
 		     String line=input.nextLine();
 		   // input.nextLine();
 		   Matcher m=back.returnTag(line);
 		   while(m.find())
 		   {
 			   System.out.println(m.group());
 		   }
 		  // System.out.println(m);
 		   
 	  }   
		}catch(InputMismatchException ex)
		{
			System.out.println("invalid");
	    }catch(CheckException e)
		{
		    System.out.println(e.getMessage()); 
		}	 
		 
 	   }
       
    }

