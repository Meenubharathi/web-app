package runnerpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

//import exception.CheckException;

import java.util.HashMap;
//import exception.CheckException;
import methodpackage.MethodHashMap;

public class RunnerHashMap 
{
    static Scanner input=new Scanner(System.in);
    public int count()
	 {
	     System.out.println("Enter the number of elements:");
		 int num=input.nextInt();
		 return num;
	 }
    public String[] getString(int num)  //throws CheckException
	 {  
		 String[] string=new String[num];
		 System.out.println("enter string");
	     for(int i=0;i<num;i++)
		 {
			string[i]=input.next();
		 }
		 return string;
	 }	 
    public int[] getInt(int num)  //throws CheckException
	 {  
		 int[] integer=new int[num];
		 System.out.println("enter integer");
	     for(int i=0;i<num;i++)
		 {
			integer[i]=input.nextInt();
		 }
		 return integer;
	 }	
    public Object[] getObject(int num)
    {
    	Object[] obj=new Object[num];
		 System.out.println("enter the key");
		 for(int i=0;i<num;i++)
		 {
			 obj[i]=input.next();
		 }
		return obj;
    }
    public Object[] getObject1(int num)
    {
    	Object[] obj=new Object[num];
		 System.out.println("enter the value");
		 for(int i=0;i<num;i++)
		 {
			 obj[i]=input.next();
		 }
		return obj;
    }
    public static<K,V> void main(String[] args)
    {
    	MethodHashMap hashMap=new MethodHashMap();
    	RunnerHashMap run=new RunnerHashMap();
    	 try
    	 {
    	 System.out.println("Enter program number 1 to 20:");
 		 int enter=input.nextInt();
 		 input.nextLine();
 		 switch(enter)
 		 {
 		 case 1:
 			 HashMap<K,V> hash=hashMap.create();
 			 int size=hashMap.hashMapSize(hash);
 			 System.out.println("the size is"+size);
 			 break;
 			 
 		 case 2:
 			 int number=run.count();
 			 String[] string=run.getString(number);
 			 String[] string1=run.getString(number);
  			 HashMap<String,String> hash1=hashMap.create1(string, string1, number);
  			 System.out.println("the hash map is "+hash1);
  			 size=hashMap.hashMapSize(hash1);
  			 System.out.println("the size is "+size);
  			 break;
  			 
 		 case 3:
 			 number=run.count();
 			 int[] integer=run.getInt(number);
 			 int[] integer1=run.getInt(number);
 			 HashMap<Integer,Integer> hash2=hashMap.create2(integer,integer1,number);
 			 System.out.println("the hash map is "+hash2);
 			 size=hashMap.hashMapSize(hash2);
 			 System.out.println("the size is"+size);
 			 break;
 			 
 		 case 4:
 			 number=run.count();
 			 string=run.getString(number);
 			 integer=run.getInt(number);
 			 HashMap<String,Integer> hash3=hashMap.create3(string,integer,number);
 			 System.out.println("the hash map is "+hash3);
 			 size=hashMap.hashMapSize(hash3);
			 System.out.println("the size is"+size);
			 break;
			 
 		 case 5:
 			 number=run.count();
			 string=run.getString(number);
			 Object[] obj=run.getObject(number);
			 HashMap<String,Object> hash4=hashMap.create4(string,obj, number);
			 System.out.println("the hash map is "+hash4);
 			 size=hashMap.hashMapSize(hash4);
			 System.out.println("the size is"+size);
			 break;
			 
 		/* case 6:
 			 number=run.count();
			 string=run.getString(number);
			 obj=run.getObject(number);
			 hash4=hashMap.create4(string,obj, number);
				
			 hash4=hashMap.create5(hash4, string, obj, number);
			 System.out.println("the hash map is "+hash4);
			 size=hashMap.hashMapSize(hash4);
			 System.out.println("the size is"+size);
			 break;*/
			  
		
 		 case 8:
 			 number=run.count();
 			 obj=run.getObject(number);
 			 Object[] obj1=run.getObject1(number);
 			 HashMap<Object,Object> hash7=hashMap.create7(obj, obj1, number);
 			 System.out.println("the hash map is "+hash7);
 			 size=hashMap.hashMapSize(hash7);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the key");
			 Object obj2=input.next();
			 boolean check=hashMap.returnKey(obj2,hash7);
			 System.out.println("the result is "+check);
			 break;
			 
 		 case 9:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 HashMap<Object,Object> hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the value");
			 obj2=input.next();
			 check=hashMap.returnValue(obj2,hash8);
			 System.out.println("the result is "+check);
			 break;
		
 		/* case 10:
 			 number=run.count();
 			 string=run.getString(number);
 			 string1=run.getString(number);
  			 hash1=hashMap.create1(string, string1, number);
  			 System.out.println("the hash map is "+hash1);
  			 size=hashMap.hashMapSize(hash1);
  			 System.out.println("the size is "+size);
  			 String[] string2 =run.getString(number);
  			 hash1=hashMap.replace(hash1,string2);
  			 System.out.println("the final hash map is"+hash1);
  			 break;*/
			 
 		 case 11:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key");
			 Object object1=input.next();
			 Object object=hashMap.getValue(hash8, object1);
			 System.out.println("the value is "+object);
		     break;
		     
 		 case 13:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the default value");
			 Object object2=input.next();
			 System.out.println("enter the key");
			 object1=input.next();
			 object=hashMap.getDefault(hash8, object1,object2);
			 System.out.println("the value is "+object);
		     break;
		   
 		 case 14:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key to be removed");
			 object2=input.next();
			 HashMap<Object,Object> remove=hashMap.removeKey(hash8, object2);
  			 System.out.println("the final hash map is"+remove);
  			 break;
  			 
 		 case 15:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key to be removed");
			 object2=input.next();
		     System.out.println("Enter the value");
		     object =input.next();
             hash8=hashMap.removeIf(hash8,object2,object);
		     System.out.println("the final hash map is"+hash8);
  			 break;
			 
 		 case 16:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
		     System.out.println("enter the key to be replaced");
		     object2=input.next();
		     System.out.println("Enter the value");
		     object =input.next();
             hash8=hashMap.replaceValue(hash8,object2,object);
             System.out.println("the final hash map is "+hash8);
             break;
             
 		 case 17:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
		     System.out.println("enter the key to be replaced");
		     object2=input.next();
		     System.out.println("Enter the oldvalue");
		     object =input.next();
		     System.out.println("Enter the newvalue");
		     Object object5 =input.next();
		     hash8=hashMap.replaceIf(hash8,object2,object,object5);
		     System.out.println("the final string is "+hash8);
		     size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
		     break;
		     
 		 case 18:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 Object[] object6=run.getObject(number);
			 Object[] object7=run.getObject(number);
			 HashMap<Object,Object> hashObject=hashMap.create7(object6, object7, number);
			 System.out.println("the hash map is "+hashObject);
			 size=hashMap.hashMapSize(hashObject);
			 System.out.println("the size is"+size);
			 hash8=hashMap.join(hash8, hashObject);
			 System.out.println("the final hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 break;
		     
 		 case 20:
 			 number=run.count();
			 obj=run.getObject(number);
			 obj1=run.getObject1(number);
			 hash8=hashMap.create7(obj, obj1, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
		     hash8=hashMap.deleteAll(hash8);
		     System.out.println("the final hash map is "+hash8);
		     break;
 		default:
		    System.out.println("Enter the number less than 20");
		}   
		}catch(InputMismatchException ex)
		{
			System.out.println("invalid");
	    }/*catch(CheckException e)
		{
		    System.out.println(e.getMessage()); 
		}*/
    }
}
