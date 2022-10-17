package methodpackage;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import exception.CheckException;
import utility.Util;

public class BackRegEx 
{
   public boolean phoneNo(String number) throws CheckException
   {
	   Util.check(number);
	   String pattern ="^[7-9]{1}[0-9]{9}$";
	   boolean match=Pattern.matches(pattern,number);
	   return match;	 
   }
   public boolean alphaNumericMatch(String string) throws CheckException
   {
	   Util.check(string);
	   String pattern ="[a-zA-Z0-9]{2,30}";
	   boolean match=Pattern.matches(pattern, string);
	   return match;
   }
   public Matcher checkMatch(String input,String match) throws CheckException
   {
	   Util.check(match);
	   Util.check(input);
	   Pattern pattern =Pattern.compile(match);
	   Matcher check=pattern.matcher(input);
	   return check;
   }
   public boolean checkStart(String input,String match) throws CheckException
   {
	   Util.check(match);
	   Util.check(input);
	   String pattern="^"+input+".*$";
	   boolean check=Pattern.matches(pattern,match);
	   return check;
   }
   public boolean checkEnd(String input,String match) throws CheckException
   {
	   Util.check(match);
	   Util.check(input);
	   String pattern="^.*"+input+"$";
	   boolean check=Pattern.matches(pattern,match);
	   return check;
   }
   public boolean exactMatch(String input,String match) throws CheckException
   {
	   Util.check(match);
	   Util.check(input);
       boolean check=Pattern.matches(match, input);
	   return check;
   }
   public Matcher caseMatch(String input,String match) throws CheckException
   {
	   Util.check(match);
	   Util.check(input);
	   Pattern pattern=Pattern.compile(match,Pattern.CASE_INSENSITIVE);
	   Matcher check=pattern.matcher(input);
	   return check;
   }
   public boolean emailCheck(String email) throws CheckException
   {
	   Util.check(email);
	   String pattern="^[a-zA-Z0-9_.-]{1,20}@[a-zA-Z0-9]{1,10}\\.[a-z]{1,5}$";
	   boolean match=email.matches(pattern);
	   return match;
   }
   public List<String> addList(String[] stringList,int number) throws CheckException  
   {      
	      Util.check(stringList);
	      List<String> list=new ArrayList<>();
	      for(int i=0;i<number;i++)
	      {
	  	     list.add(stringList[i]);
	      }
		  return list;
   }
   public boolean checkRange(String string,int start,int end) throws CheckException
   {
	   Util.check(string);
	   String pattern ="[a-zA-Z0-9]{"+start+","+end+"}";
	   boolean match=Pattern.matches(pattern, string);
	   return match;
   }
   public Map<String,Integer> getHashMap(Map<String,Integer> map,String key,Integer value) throws CheckException
   {
	   Util.check(map);
	   map.put(key, value);
	   return map;
   }
   public Matcher returnTag(String input) throws CheckException
   {
	   Util.check(input);
	   String pattern="<\\w*>|</\\w*>"; /// <p>adffa </p>
	   Pattern p=Pattern.compile(pattern);
	   Matcher match=p.matcher(input);
	   return match;	   
   }
   
}
