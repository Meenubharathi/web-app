package methodpackage;

import exception.CheckException;
import utility.Util;
public class StringBuilderTask
{   
	/*public Object check(Object string) throws CheckException
	{
	     if(string==null)
	     {
	     throw new CheckException("no string found");
	     }
	     return string;
	}*/
	public StringBuilder getStringBuilder()        //1
	{
		StringBuilder line=new StringBuilder();
		return line;
	}
   public int getLength(StringBuilder stringBuilder) throws CheckException     //all 10
   {  
	   Util.check(stringBuilder);
	   int length=stringBuilder.length();
	   return length;
   }
   public StringBuilder append(String string) throws CheckException     //all 10
   { 
	  // Util.check(string);// ???
	   
	   StringBuilder line=getStringBuilder();
	  //check(line);
	  line.append(string);
	  return line;
   }
   public StringBuilder insert(String string,StringBuilder stringBuilder,String string1) throws CheckException   //3
   {  
	   Util.check(stringBuilder);
	   Util.check(string1);
       int number = stringBuilder.indexOf(string1);
      // string=" "+string;
       stringBuilder.insert(number, string1);
	   stringBuilder.insert(number+1, string);
	   return stringBuilder;
   }
   public StringBuilder append1(String[] string,StringBuilder stringBuilder,int number,String string1)   throws CheckException   //2
   {   
	   Util.check(stringBuilder);
	   Util.check(string);
	   //StringBuilder line=new StringBuilder(stringBuilder);
	   for(int i=0;i<number;i++)
	   {
		  stringBuilder.append(string1).append(string[i]);
	   }  
		  return stringBuilder;
   }
  public StringBuilder delete(StringBuilder stringBuilder,String string)  throws CheckException   //4
   {  
	   Util.check(stringBuilder);
	   Util.check(string);
	   int number=stringBuilder.indexOf(string);
	   StringBuilder sb=stringBuilder.delete(0, number);
	   return sb;
   }
   public StringBuilder reverse(StringBuilder stringBuilder)  throws CheckException   //6
   {   
	   Util.check(stringBuilder);
	   StringBuilder sb=stringBuilder.reverse();
	   return sb;
   }
   public StringBuilder delete1(int start,int end,StringBuilder sb) throws CheckException    //7
   {   
	   int length=getLength(sb);
        if(start>length||end>length)
        {
	        throw new CheckException("invalid");
        }
        StringBuilder stringBuilder=sb.delete(start, end);
	    return stringBuilder;
   }
   public StringBuilder replace(int start,int end,StringBuilder sb,String string1)  throws CheckException  //8
   {   Util.check(string1);
	   int length=getLength(sb);
       if(start>length||end>length)
       {
    	   throw new CheckException("invalid");
       }
       StringBuilder stringBuilder=sb.replace(start, end, string1);
	   return stringBuilder;
   }
   public int fIndex(StringBuilder stringBuilder,String string)  throws CheckException      //9
   {  
	   Util.check(stringBuilder);
	   Util.check(string);
	  int index=stringBuilder.indexOf(string);
	  return index;
   }
   public int lIndex(StringBuilder stringBuilder,String string)  throws CheckException       //10
   {  
	   Util.check(stringBuilder);
	   Util.check(string);
	  int index=stringBuilder.lastIndexOf(string);
	  return index;
   }
   public StringBuilder replace1(StringBuilder sb,String string,String string1)  throws CheckException   //5
   {   
	   Util.check(sb);
	   Util.check(string);              
       int number=sb.lastIndexOf(string);
       for(int i=0;i<number;i++)
       {
	   int index=sb.indexOf(string,i);
	   i=index;
	   sb.deleteCharAt(index);
	   sb.insert(index,string1);
       }
	   return sb;
   }   
   
}
