package runnerpackage;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

//import exception.CheckException;

//import java.util.HashMap;
import exception.CheckException;
import methodpackage.TaskHashMap;

public class RunnerHashMap 
{
    static Scanner input=new Scanner(System.in);
    public int count()
	 {
	     System.out.println("Enter the number of elements:");
		 int num=input.nextInt();
		 return num;
	 }
    public Map<Object,Object> getHashMap(Map<Object,Object> map,int number)
    {
    	System.out.println("enter keys and values");
		 for(int i=0;i<number;i++)
		 {
			 Object key=input.next();
			 Object value=input.next();
			 map.put(key,value);
		 }
		 return map;
    }
   public static<K,V> void main(String[] args)
    {
    	TaskHashMap hashMap=new TaskHashMap();
    	RunnerHashMap run=new RunnerHashMap();
    	 try
    	 {
    	 System.out.println("Enter program number 1 to 20:");
 		 int enter=input.nextInt();
 		 input.nextLine();
 		 switch(enter)
 		 {
 	     case 1:
 			 Map<K,V> map=hashMap.createHashMap();
 			 int size=hashMap.hashMapSize(map);
 			 System.out.println("the size is"+size);
 			 break;
 	     case 2:
 			 int number=run.count();
 			 Map<String,String> map1=hashMap.createHashMap();
 			 System.out.println("enter key and value");
	 	     for(int i=0;i<number;i++)
			 {
	 		     String key=input.next();
 			     String value=input.next();
 			     map1.put(key, value);
			 }
			 System.out.println("the hash map is "+map1);
 			 size=hashMap.hashMapSize(map1);
 			 System.out.println("the size is"+size);
 			 break;
 		 case 3:
 			 number =run.count();
 			 Map<Integer,Integer> map2=hashMap.createHashMap();
 			 System.out.println("enter keys and values");
 			 for(int i=0;i<number;i++)
 			 {
 				 int key=input.nextInt();
 				 int value=input.nextInt();
 				 map2.put(key,value);
 			 }
 			 System.out.println("the hash map is "+map2);
			 size=hashMap.hashMapSize(map2);
			 System.out.println("the size is"+size);
			 break;
 		 case 4:
 			 number =run.count();
 			 Map<String,Integer> map3=hashMap.createHashMap();
 			 System.out.println("enter keys and values");
 			 for(int i=0;i<number;i++)
 			 {
 				 String key=input.next();
 				 int value=input.nextInt();
 				 map3.put(key,value);
 			 }
 			 System.out.println("the hash map is "+map3);
			 size=hashMap.hashMapSize(map3);
			 System.out.println("the size is"+size);
			 break;
 		 case 5:
 			 number =run.count();
 			 Map<String,Object> map4=hashMap.createHashMap();
 			 System.out.println("enter keys and values");
 			 for(int i=0;i<number;i++)
 			 {
 				 String key=input.next();
 				 Object value=hashMap;
 				 map4.put(key,value);
 			 }
 			 System.out.println("the hash map is "+map4);
			 size=hashMap.hashMapSize(map4);
			 System.out.println("the size is"+size);
			 break;
 	    case 6:
 			 number =run.count();
			 Map<String,Object> map5=hashMap.createHashMap();
			 System.out.println("enter keys and values");
			 for(int i=0;i<number;i++)
			 {
				 String key=input.next();
				 Object value=input.next();
				 map5.put(key,value);
			 }
			 System.out.println("enter key");
			 String key1=input.next();
			 Object value1=null;
			 map5.put(key1, value1);
			 System.out.println("the hash map is "+map5);
			 size=hashMap.hashMapSize(map5);
			 System.out.println("the size is"+size);
			 break;
 		case 7:
			 number =run.count();
			 Map<String,Object> map6=hashMap.createHashMap();
			 System.out.println("enter keys and values");
			 for(int i=0;i<number;i++)
			 {
				 String key=input.next();
				 Object value=input.next();
				 map6.put(key,value);
			 }
			 key1=null;
			 System.out.println("enter value");
			 value1=input.next();
			 map6.put(key1, value1);
			 System.out.println("the hash map is "+map6);
			 size=hashMap.hashMapSize(map6);
			 System.out.println("the size is"+size);
			 break;
 		case 8:
 			 number =run.count();
			 Map<Object,Object> map7=hashMap.createHashMap();
			 map7=run.getHashMap(map7, number);
			 System.out.println("the hash map is "+map7);
 			 size=hashMap.hashMapSize(map7);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the key");
			 Object key=input.next();
			 boolean check=hashMap.returnKey(key,map7);
			 System.out.println("the result is "+check);
			 break;
 		case 9:
			 number =run.count();
			 Map<Object,Object> map8=hashMap.createHashMap();
			 map8=run.getHashMap(map8, number);
			 System.out.println("the hash map is "+map8);
			 size=hashMap.hashMapSize(map8);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the value");
			 key=input.next();
			 check=hashMap.returnValue(key,map8);
			 System.out.println("the result is "+check);
			 break;
 		case 10:
 			 number =run.count();
			 Map<String,String> map9=hashMap.createHashMap();
			 System.out.println("enter key and value");
	 	     for(int i=0;i<number;i++)
			 {
	 		     String key5=input.next();
 			     String oldvalue=input.next();
 			     map9.put(key5, oldvalue);
			 }
		
			 System.out.println("the hash map is "+map9);
			 size=hashMap.hashMapSize(map9);
			 System.out.println("the size is"+size);
			 for(int i=0;i<number;i++)
			 {   System.out.println("enter key");
				 String key5=input.next();
				 System.out.println("enter new value");
			     String newvalue=input.next();
			     map9=hashMap.replacevalueAll(map9,key5,newvalue);
			 }
			 System.out.println("the final hash map is "+map9);
			 break;
 		case 11:
 			 number =run.count();
			 Map<Object,Object> hash1=hashMap.createHashMap();
			 hash1=run.getHashMap(hash1, number);
	    	 System.out.println("the hash map is "+hash1);
			 size=hashMap.hashMapSize(hash1);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the key");
			 key=input.next();
			 Object value=hashMap.getValue(hash1,key);
			 System.out.println("the value is "+value);
		     break;
 		case 12:
 			 number =run.count();
			 Map<Object,Object> hash2=hashMap.createHashMap();
			 hash2=run.getHashMap(hash2, number);
			 System.out.println("the hash map is "+hash2);
			 size=hashMap.hashMapSize(hash2);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the non existing key");
			 key=input.next();
			 value=hashMap.getValue(hash2,key);
			 System.out.println("the value is "+value);
		     break;
 		case 13:
 			 number =run.count();
			 Map<Object,Object> hash3=hashMap.createHashMap();
			 hash3=run.getHashMap(hash3, number);
			 System.out.println("the hash map is "+hash3);
			 size=hashMap.hashMapSize(hash3);
			 System.out.println("the size is"+size);
			 System.out.println("Enter the default value");
			 Object defaultValue=input.next();
			 System.out.println("Enter the key");
			 key=input.next();
			 Object output=hashMap.getDefault(hash3,key,defaultValue);
			 System.out.println("the value is "+output);
			 size=hashMap.hashMapSize(hash3);
			 System.out.println("the size is"+size);
			 break;
 		case 14:
 			 number =run.count();
			 Map<Object,Object> hash4=hashMap.createHashMap();
			 hash4=run.getHashMap(hash4, number);
			 System.out.println("the hash map is "+hash4);
			 size=hashMap.hashMapSize(hash4);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key to be removed");
			 key=input.next();
			 Map<Object,Object> remove=hashMap.removeKey(hash4,key);
  			 System.out.println("the final hash map is"+remove);
  			 size=hashMap.hashMapSize(remove);
			 System.out.println("the size is"+size);
			 break;
 		case 15:
 			 number =run.count();
			 Map<Object,Object> hash5=hashMap.createHashMap();
			 hash5=run.getHashMap(hash5, number);
			 System.out.println("the hash map is "+hash5);
			 size=hashMap.hashMapSize(hash5);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key to be removed");
			 key=input.next();
			 System.out.println("Enter the value");
		     value=input.next();
             remove=hashMap.removeIf(hash5,key,value);
		     System.out.println("the final hash map is"+remove);
		     size=hashMap.hashMapSize(remove);
			 System.out.println("the size is"+size);
			 break;
 		case 16:
 			 number =run.count();
			 Map<Object,Object> hash6=hashMap.createHashMap();
			 hash6=run.getHashMap(hash6, number);
			 System.out.println("the hash map is "+hash6);
			 size=hashMap.hashMapSize(hash6);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key to be replaced");
			 key=input.next();
			 System.out.println("Enter the replacement value");
		     value=input.next();
		     Map<Object,Object> replace=hashMap.replaceValue(hash6,key,value);
             System.out.println("the final hash map is "+replace);
             size=hashMap.hashMapSize(replace);
			 System.out.println("the size is"+size);
			 break;
 		case 17:
 			 number =run.count();
			 Map<Object,Object> hash7=hashMap.createHashMap();
			 hash7=run.getHashMap(hash7, number);
			 System.out.println("the hash map is "+hash7);
			 size=hashMap.hashMapSize(hash7);
			 System.out.println("the size is"+size);
			 System.out.println("enter the key to be replaced");
			 key=input.next();
			 System.out.println("Enter the old value");
		     value=input.next();
		     System.out.println("Enter the new value");
		     Object newvalue=input.next();
		     replace=hashMap.replaceIf(hash7,key,value,newvalue);
		     System.out.println("the final string is "+replace);
		     size=hashMap.hashMapSize(replace);
			 System.out.println("the size is"+size);
		     break;
 		case 18:
 			 number =run.count();
			 Map<Object,Object> hash8=hashMap.createHashMap();
			 hash8=run.getHashMap(hash8, number);
			 System.out.println("the hash map is "+hash8);
			 size=hashMap.hashMapSize(hash8);
			 System.out.println("the size is"+size);
			 number =run.count();
			 Map<Object,Object> hash=hashMap.createHashMap();
			 hash=run.getHashMap(hash, number);
			 System.out.println("the hash map is "+hash);
			 size=hashMap.hashMapSize(hash);
			 System.out.println("the size is"+size);
			 Map<Object,Object> join=hashMap.join(hash8,hash);
			 System.out.println("the final hash map is "+join);
			 size=hashMap.hashMapSize(join);
			 System.out.println("the size is"+size);
			 break;
 		case 19:
 			 number =run.count();
			 Map<Object,Object> hash9=hashMap.createHashMap();
			 hash9=run.getHashMap(hash9, number);
			 System.out.println("the hash map is "+hash9);
			 size=hashMap.hashMapSize(hash9);
			 System.out.println("the size is"+size);
			 for (Map.Entry<Object,Object> entry : hash9.entrySet())
			 {
			 System.out.println("the key is "+entry.getKey()+" value is "+entry.getValue());
			 }
			 break;
 		case 20:
 			 number =run.count();
			 Map<Object,Object> hashmap=hashMap.createHashMap();
			 hashmap=run.getHashMap(hashmap, number);
			 System.out.println("the hash map is "+hashmap);
			 size=hashMap.hashMapSize(hashmap);
			 System.out.println("the size is"+size);
			 Map<Object,Object> clear=hashMap.deleteAll(hashmap);
		     System.out.println("the final hash map is "+clear);
		     break;
			 default:
		    System.out.println("Enter the number less than 20");
		}   
		}catch(InputMismatchException ex)
		{
			System.out.println("the input you have given is invalid");
	    }catch(CheckException e)
		{
		    System.out.println(e.getMessage()); 
		}
    }
}
