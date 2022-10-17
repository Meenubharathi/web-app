package methodpackage;

import java.util.ArrayList;
import exception.CheckException;
import utility.Util;

import java.util.Iterator;
import java.util.List;

public class TaskArrayList
{ 
   public List<String> createArrayList()        //1 //Swami
   {
	   List<String> list=new ArrayList<>();
	   return list;
   }
   
   public List<String> createArrayListString(String[] stringList,int number)  throws CheckException  //2 //Swami
   {      Util.check(stringList);
	      List<String> list=createArrayList();
	      for(int i=0;i<number;i++)
	      {
	  	     list.add(stringList[i]);
	      }
		  return list;
   }
   
   public List<Integer> createArrayListInteger(int[] intList,int number) throws CheckException  //3 //Swami
   {       
	      Util.check(intList);
          List<Integer> list=new ArrayList<Integer>();
	      for(int i=0;i<number;i++)
	      {
	  	     list.add(intList[i]);
	      }
		  return list;
   }
    public List<Object> createArrayListObject(Object[] object,int number)  throws CheckException      //4,5 //Swami
   {   
       Util.check(object);	
	   List<Object> list=new ArrayList<Object>();
	   for(int i=0;i<number;i++)
	   {
		   list.add(object[i]);
	   }
	   return list;
   }
  
   
   public List<Float> createArrayListFloat(float[] floatList,int number) throws CheckException        //14,15//swami
   {       
	      Util.check(floatList);
	      List<Float> list=new ArrayList<Float>();
	      for(int i=0;i<number;i++)
	      {
	  	     list.add(floatList[i]);
	      }
		  return list;
   } 
   
   public List<Long> createArrayListLong(long[] longList,int number)  throws CheckException         //16
   {      
	      Util.check(longList);
	      List<Long> list=new ArrayList<Long>();
	      for(int i=0;i<number;i++)
	      {
	  	     list.add(longList[i]);
	      }
		  return list;
   } 
   
   public <T> int arraySize(List<T> list) throws CheckException     //all20
   {   
	   Util.check(list);
	   int size=list.size();
	   return size;
   }
  
   public  int fIndexOf(List<String> list,String string)  throws CheckException       //9,6
   {   Util.check(list);
	   int firstIndex=list.indexOf(string);
	   return firstIndex;
   }
   
   public  Iterator<String> iter(List<String> list)    throws CheckException   //7
   {   Util.check(list);
	   Iterator<String> iter=list.iterator();
	   return iter;
   }
   
   public String getList(int index,List<String> stringList) throws CheckException     //8
   {    Util.check(stringList);
	    int size=arraySize(stringList);
        if(size<index)
        {
        	throw new CheckException("index value is invalid");
        }
	   String word=stringList.get(index);
	   return word;
   }
   
   public  int lIndexOf(List<String> list,String string) throws CheckException   //9
   {   Util.check(list);
	   int lastIndex=list.lastIndexOf(string);//Swami
	   return lastIndex;
   }
   
   public List<String> insert(int index,String string,List<String> stringList)  throws CheckException      //10
   {    
	   int size=arraySize(stringList);
	   if(size<index)
	   {
       	throw new CheckException("index value is invalid");
       }
	   stringList.add(index, string);
	   return stringList;
   }
   
   public List<String> getSubList(int start,int end,List<String> stringList)   throws CheckException   //11
   {   
	   int size=arraySize(stringList);
	   if(size<start||size<end)
       {
    	   throw new CheckException("index value is invalid");
       }
      
	   List<String> finalList=stringList.subList(start, end);
	   return finalList;
   }
   
   public List<String> addTwoList(List<String> firstList,List<String> secondList) throws CheckException    //12
   {   Util.check(firstList);
       Util.check(secondList);
	  firstList.addAll(secondList);
	  return firstList;
   }
   
   public List<String> addTwoList1(List<String> firstList,List<String> secondList) throws CheckException     // 13
   {  
	  Util.check(firstList);
      Util.check(secondList);
	  secondList.addAll(firstList);
	  return secondList;
   }
   
  public List<Float> deleteIndex(List<Float> floatList,int index)   throws CheckException   //15
   {   
	  int size=arraySize(floatList);
      if(size<index)
      {
   	      throw new CheckException("index value is invalid");
      }
      floatList.remove(index);
	  return floatList;
   }
  
   public List<Float> deleteValue(List<Float> floatList,float value,int n)  throws CheckException      //14
   {   Util.check(floatList);
	  // floatList.removeIf(e->(e==value));//Swami
        floatList.remove(value);
        return floatList;
   }
   
   public List<Long> longDelete(List<Long> fullList,List<Long> subList) throws CheckException     //16
   {   Util.check(fullList);
       Util.check(subList);
	   fullList.removeAll(subList);
	   return fullList;
   }
   
   public List<Long> getSubList1(int start,int end,List<Long> longList)   throws CheckException       //16
   {  
	   int size=arraySize(longList);
       if(size<start||size<end)
       {
	      throw new CheckException("index value is invalid");
        }
 
	   List<Long> finalList=longList.subList(start, end);
	   return finalList;
   }
   
   public List<String> common(List<String> firstList,List<String> secondList) throws CheckException         //18
   {  Util.check(firstList);
      Util.check(secondList);
	  firstList.retainAll(secondList);
	  return firstList;
   }
   
   public List<String> different(List<String> firstList,List<String> secondList) throws CheckException       //17
   {   Util.check(firstList);
       Util.check(secondList);
	   //secondList.retainAll(firstList);//Swami
	   firstList.removeAll(secondList); 
	   return firstList;
   }
   
   public List<Long> remove(List<Long> longList) throws CheckException         //19
   {   Util.check(longList);
	   //longList.removeAll(longList);//Swami
       longList.clear();
	   return longList;
   }
   
   public boolean compare(List<String> stringList,String string)   throws CheckException       //20
   {   Util.check(stringList);
	   boolean check=stringList.contains(string);
	   return check;
   }
   
   }