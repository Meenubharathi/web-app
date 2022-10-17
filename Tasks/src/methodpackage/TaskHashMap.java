package methodpackage;

import java.util.HashMap;
import exception.CheckException;
import utility.Util;

import java.util.Map;

public class TaskHashMap 
{
     public <K,V> Map<K,V> createHashMap()       //all 20
     {
    	Map<K,V> map=new HashMap<>();
    	return map;
     }
     public <K,V> int hashMapSize(Map<K,V> map)  throws CheckException      //all 20
     {  Util.check(map);
    	int size=map.size();
    	return size;
     }
  
     public boolean returnKey(Object key,Map<Object,Object> map) throws CheckException //8    key-null check not necessary because it return false
     {     
         Util.check(map);
    	 boolean check=map.containsKey(key);
    	 return check;
     }
     public boolean returnValue(Object value,Map<Object,Object> map) throws CheckException       //9   value-null check not necessary because it return false
     {   
    	 Util.check(map);
    	 boolean check=map.containsValue(value);
    	 return check;
     }
    public Map<String,String> replacevalueAll(Map<String,String> map,String key,String newValue)  throws CheckException   //10
     { 
       Util.check(map); 
       map.replace(key,newValue);
       return map;
     }
     public Object getValue(Map<Object,Object> map,Object key) throws CheckException    //11 ,12 key-null check is not necessary because it return null
     {   
    	 Util.check(map);           
    	 Object obj1=map.get(key);
    	 return obj1;
     }
     public Object getDefault(Map<Object,Object> map,Object key,Object defaultValue)  throws CheckException    //13
     {   
    	 Util.check(map);                                                      //default value, key-null check is not necessary because it return null        
    	 Object obj2=map.putIfAbsent(key,defaultValue);
    	 return obj2;
     }
     public Map<Object,Object> removeKey(Map<Object,Object> map,Object key)    throws CheckException     //14
     {   
    	 Util.check(map); 
    	 map.remove(key);
    	 return map;
     }
     public Map<Object,Object> removeIf(Map<Object,Object> map,Object key,Object value)    throws CheckException      //15
     {  
    	Util.check(map); 
    	map.remove(key,value);
    	return map;
     }
     public Map<Object,Object> replaceValue(Map<Object,Object> map,Object key,Object value)    throws CheckException      //16
     {  
    	Util.check(map); 
    	map.replace(key,value);
    	return map;
     }
     public Map<Object,Object> replaceIf(Map<Object,Object> map,Object key,Object oldValue,Object newValue)    throws CheckException      //17
     {  
    	Util.check(map); 
    	map.replace(key,oldValue,newValue);
    	return map;
     }
     public Map<Object,Object> join(Map<Object,Object> map,Map<Object,Object> hash9)    throws CheckException        //18
     {   
    	 Util.check(map); 
    	 map.putAll(hash9);
    	 return map;
     }
     
     public Map<Object,Object> deleteAll(Map<Object,Object> map)     throws CheckException //20
     {   
    	 Util.check(map); 
    	 map.clear();
    	 return map;
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
