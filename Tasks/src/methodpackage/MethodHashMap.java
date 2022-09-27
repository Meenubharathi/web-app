package methodpackage;

import java.util.HashMap;

public class MethodHashMap 
{
     public <K,V> HashMap<K,V> create()       //1
     {
    	HashMap<K,V> map=new HashMap<>();
    	return map;
     }
     public <K,V> int hashMapSize(HashMap<K,V> map)        //all 20
     {
    	int size=map.size();
    	return size;
     }
     public HashMap<String,String> create1(String[] keyString,String[] valueString,int n)      //2
     {
    	 HashMap<String,String> map=new HashMap<String,String>();
    	 for(int i=0;i<n;i++)
    	 {
    		 map.put(keyString[i],valueString[i]);
    	 }
    	 return map;
     }
     public HashMap<Integer,Integer> create2(int[] keyInt,int[] valueInt,int n)      //3
     {
    	 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	 for(int i=0;i<n;i++)
    	 {
    		 map.put(keyInt[i],valueInt[i]);
    	 }
    	 return map;
     }
     public HashMap<String,Integer> create3(String[] keyString,int[] valueInt,int n)      //4
     {
    	 HashMap<String,Integer> map=new HashMap<String,Integer>();
    	 for(int i=0;i<n;i++)
    	 {
    		 map.put(keyString[i],valueInt[i]);
    	 }
    	 return map;
     }
     public HashMap<String,Object> create4(String[] keyString,Object[] valueObj,int n)      //5
     {
    	 HashMap<String,Object> map=new HashMap<String,Object>();
    	 for(int i=0;i<n;i++)
    	 {
    		 map.put(keyString[i],valueObj[i]);
    	 }
    	 return map;
     }
   /*  public HashMap<String,Object> create5(HashMap<String,Object> hash4,String[] keyString,Object[] valueObj,int n)
     {
    	  if(valueObj==null)
    	 {
    		 hash4.remove(keyString);
    	 }
    	 return hash4;
     }*/
     public HashMap<Object,Object> create7(Object[] keyObj,Object[] valueObj,int n)      //8,9,11
     {
    	 HashMap<Object,Object> map=new HashMap<Object,Object>();
    	 for(int i=0;i<n;i++)
    	 {
    		 map.put(keyObj[i],valueObj[i]);
    	 }
    	 return map;
     }
     public boolean returnKey(Object key,HashMap<Object,Object> hash7/*Object[] keyObj,Object[] valueObj,int n*/)  //8
     {     
         
    	//HashMap<Object,Object> map=create7(keyObj,valueObj,n);//new HashMap<K,V>();
    	 boolean check=hash7.containsKey(key);
    	 return check;
     }
     public boolean returnValue(Object value,HashMap<Object,Object> hash8)        //9
     {
    	 boolean check=hash8.containsValue(value);
    	 return check;
     }
    /* public HashMap<String,String> replace(HashMap<String,String> hash1,String[] string)
     {
    	hash1.replaceAll(
    	return hash1;
     }*/
     public Object getValue(HashMap<Object,Object> hash8,Object obj)     //11
     {
    	 Object obj1=hash8.get(obj);
    	 return obj1;
     }
     public Object getDefault(HashMap<Object,Object> hash8,Object obj,Object obj1)
     {
    	 Object obj2=hash8.getOrDefault(obj, obj1);
    	 return obj2;
     }
     public HashMap<Object,Object> removeKey(HashMap<Object,Object> hash8,Object key)
     {
    	 hash8.remove(key);
    	 return hash8;
     }
     public HashMap<Object,Object> removeIf(HashMap<Object,Object> hash8,Object key,Object value)
     {
    	hash8.remove(key,value);
    	return hash8;
     }
     public HashMap<Object,Object> replaceValue(HashMap<Object,Object> hash8,Object key,Object value)
     {
    	hash8.replace(key,value);
    	return hash8;
     }
     public HashMap<Object,Object> replaceIf(HashMap<Object,Object> hash8,Object key,Object oldValue,Object newValue)
     {
    	hash8.replace(key,oldValue,newValue);
    	return hash8;
     }
     public HashMap<Object,Object> join(HashMap<Object,Object> hash8,HashMap<Object,Object> hash9)
     {
    	 hash8.putAll(hash9);
    	 return hash8;
     }
     public HashMap<Object,Object> deleteAll(HashMap<Object,Object> hash8)      //20
     {
    	 hash8.clear();
    	 return hash8;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
