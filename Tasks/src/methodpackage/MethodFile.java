package methodpackage;

import exception.CheckException;
import utility.Util;
public class MethodFile
{
/*public Object check(Object string) throws CheckException
{
     if(string==null)
     {
     throw new CheckException("no string found");
     }
     return string;
}*/
public int getLength(String string) throws CheckException  //1
{
Util.check(string);
int len=string.length();
return len;
}
public char[] charArray(String string) throws CheckException    //2
{
  //int len=st.length();
  int len=getLength(string);
  char[] ch=new char[len];
  for(int i=0;i<len;i++)
  {
     ch[i]=string.charAt(i);
  }
  return ch;
}
public char penultimate(String string) throws CheckException   //3
{ Util.check(string);
  char lastBefore;
  lastBefore=string.charAt(string.length()-2);
  return lastBefore;
}
public int occurrence(String string,char search) throws CheckException  //4
{ 
   //int len=st.length();
   int length=getLength(string);
   int count=0;
   for(int i=0;i<length;i++)
   {
      if(string.charAt(i)==search)
      {
      count++;
      }
   }
   return count;
} 
public int greatPosition(String string,char search1) throws CheckException   //5
{  Util.check(string);
   int position=string.lastIndexOf(search1);
   return position;
}
public String lastNCharacters(String string,int number) throws CheckException    //6
{
    //int len=st.length();
    int length=getLength(string);
    String characters;
    if(number>length)
    {
        throw new CheckException("invalid number");
    }
    else 
    {  
    characters=string.substring(length-number);
    }
    return characters;     
}
public String firstNCharacters(String string,int number) throws CheckException   //7
{
    //int len=st.length();
    int length=getLength(string);
    String characters;
    if(number>length)
    {
         throw new CheckException("invalid number");
    }
    else
    {
    characters=string.substring(0,number);
    }
    return characters;
}
public String replacement(String string,String given) throws CheckException  //8
{  
    String target;
    int givenLength=getLength(given);
    String replace;
    target=firstNCharacters(string,givenLength);
    int targetLength=target.length();
    if(givenLength>targetLength)
    {
         throw new CheckException("invalid number");
    }
    else
    {
    replace=string.replace(target,given);
    }
    return replace;
}
public boolean stringStartsWith(String string,String given1) throws CheckException  //9
{  Util. check(string);
    boolean result1=string.startsWith(given1);
    return result1;
}
public boolean stringEndsWith(String string,String given2) throws CheckException   //10
{   Util.check(string);
    boolean result2=string.endsWith(given2);
    return result2;
}
public String convertToUpperCase(String given3) throws CheckException      //11
{  Util. check(given3);
    String convert1=given3.toUpperCase();
    return convert1;
} 
public String convertToLowerCase(String given4) throws CheckException    //12
{   Util.check(given4);
    String convert2=given4.toLowerCase();
    return convert2;
} 
public String reverseString(String given5) throws CheckException       //13
{   Util.check(given5); 
    char character[]=given5.toCharArray();
    String reverse=" ";
    for(int i=character.length-1;i>=0;i--)
    { 
      reverse+=character[i];
     }
    return reverse;             
}
public String concatenate(String line1)  throws CheckException     //15
{   Util.check(line1);
    String result1=line1.replaceAll("\\s","");
    return result1;
} 
public String[] splitString(String line2)  throws CheckException     //16
{   Util. check(line2);
     String[] result2;
     result2=line2.split(" ");
     return result2;
}
public String merge(String[] word) throws CheckException      //17
{   Util.check(word); 
     String result=String.join("-",word);
    return result;
}             
public boolean equalCase(String string1,String string2) throws CheckException    //18
{     Util.check(string1);
      Util.check(string2);
      boolean check1=string1.equals(string2);
      return check1; 
}
public boolean equalIgnoreCase(String string3,String string4) throws CheckException    //19
{      Util.check(string3);
       Util.check(string4);
       boolean check2=string3.equalsIgnoreCase(string4);
       return check2;
} 
public String trimSpace(String string5)  throws CheckException       //20
{      Util.check(string5);
       String check=string5.trim();
       return check;
}             
}

