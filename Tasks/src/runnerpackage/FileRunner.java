package runnerpackage;

import java.io.File;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import exception.CheckException;
import methodpackage.FileMethod;
import methodpackage.TaskFile;


public class FileRunner
{
		 static Scanner input=new Scanner(System.in);
		 public Properties KeyValue(Properties p,int n)
		 {   
			 System.out.println("enter keys and values");
			 for(int i=0;i<n;i++)
			 {
				 String key=input.next();
				 String value=input.next();
		         p.setProperty(key,value);
		         p.getProperty(key, value);
			 }
			 return p;
	     }
		 public static void main(String[] args) throws IOException
	      {
			  FileMethod method=new FileMethod();
			  FileRunner sampleFile=new FileRunner();
			  try
	    	  {   
	          System.out.println("Enter program number 1 to 12:");
	    	  int enter=input.nextInt();
	    	  input.nextLine();
	    	  switch(enter)
	    	    {
	    	 		 
	    		  case 1:
	    			  System.out.println("Enter file name");
	    			  String filename=input.next();
	    		      File myFile=method.fileName(filename);//new File("sample.txt");
	    		      System.out.println("enter the number:");
	    		      int n=input.nextInt();
	    		      input.nextLine();
	    		      System.out.println("enter the lines:");
	 		    	  String[] line= new String[n];
	    		      for(int i=0;i<n;i++)
	    		      {
	    		    	  line[i] = input.next();
	    		      }	 
	 		    	  method.writeLine(line,filename);
	    		      break;
	    		      
	    		  case 2:
	    			  System.out.println("Enter file name");
	    			  filename=input.next();
	    		      File myFile1=method.fileName(filename);//new File("myprops.txt");
	    			  Properties p=method.getProperty();
	    			  System.out.println("enter number");
	    			  int number=input.nextInt();
	    			  p=sampleFile.KeyValue(p,number);
	    			  method.store(filename,p);
	    			  break;
	    			  
	    		  case 3:
	    			   System.out.println("Enter file name");
	    			   filename=input.next();
	    		       myFile1=method.fileName(filename);
	      			   Properties p1=method.getProperty();
	    		       p1=method.read(filename, p1);
	    		       System.out.println(p1);
	   		           break;
	   		           
	    		 case 4:
	    			  System.out.println("Enter file name");
	   			      String name=input.next();
	   		          File myFile2=method.fileName(name);
	   		          System.out.println("Enter Directory name");
				      String directoryname=input.next();
			          File myFile3=method.dirName(directoryname);
			          String file=myFile3+"/"+myFile2;
	 		          System.out.println("enter the number:");
	    		      n=input.nextInt();
	    		      input.nextLine();
	    		      System.out.println("enter the lines:");
	    		      String[] lines= new String[n];
	    		      for(int i=0;i<n;i++)
	    		      {
	    		    	   lines[i]=input.next();
	    		      } 
	    		      method.writeLine(lines,file);
	    		      System.out.println("Enter file name");
	   			      name=input.next();
	   		          File myFile4=method.fileName(name);
	   		          String file1=myFile3+"/"+myFile4;
	    			  Properties p2=method.getProperty();
	    			  System.out.println("enter number");
	    			  number=input.nextInt();
	    			  p2=sampleFile.KeyValue(p2,number);
	    			  method.store(file1, p2);
	    	     	  break;
	    	     	  
	    		  case 5:
	    			    TaskFile task=new TaskFile("word");
	    		    	System.out.println("the output is "+task);
	    		    	break;
	    		    	
	    		  case 11:
	    			  LocalDateTime dateTime=method.dateTime();
	    			  System.out.println("the local date and time is :"+dateTime);
	    			  long milliseconds=method.milliseconds();
	    			  System.out.println("The current time in milliseconds :"+milliseconds);
	    			  DayOfWeek day=method.currentDay();
	    			  System.out.println("the current day is :"+day);
	    			  Month month=method.month();
	    			  System.out.println("the month is :"+month);
	    			  int year=method.currentYear();
	    			  System.out.println("the current year is:"+year);
	    			  System.out.println("enter the zone:");
	    			  String place=input.next();
	    			  ZonedDateTime zone=method.anyZone(place);
	    			  System.out.println("The curent date and time is:"+zone);
	    			  DayOfWeek zoneday=method.zoneCurrentDay(place);
	    			  System.out.println(zoneday);
	    			  Month zoneMonth = method.zoneMonth(place);
	    			  System.out.println(zoneMonth);
	    			  int zoneYear=method.zoneYear(place);
	    			  System.out.println(zoneYear);
	    			  break;
	    			  
	    		  case 12:
	    			  Logger logger=Logger.getLogger(" ");
	    			  LocalDateTime dateTime1=method.dateTime();
	    			  logger.log(Level.INFO,"The Date and Time is "+dateTime1);
	    			  long milliseconds1=method.milliseconds();
	      			  logger.log(Level.INFO,"The current Time in milliseconds :"+milliseconds1);
	                  break;
	    			  
	    	    }
	    	    
		       }catch(IOException ex)
	    	  {
	    		 ex.printStackTrace();
		      }catch(CheckException e)
				{
	  		        System.out.println(e.getMessage()); 
	    		}catch(InputMismatchException ex)
				{
	  				//System.out.println("invalid");
	  		    	    Logger logger=Logger.getLogger(" ");
		    			logger.log(Level.WARNING, "invalid", ex);
	  		    
	  		    }	
	      }
		
		}
	


