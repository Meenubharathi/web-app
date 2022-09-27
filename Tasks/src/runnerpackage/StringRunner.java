package runnerpackage;
import java.util.Scanner;

import exception.CheckException;
import methodpackage.MethodFile;

import java.util.InputMismatchException;
public class StringRunner
{
static Scanner inp=new Scanner(System.in);
public static void main(String args[])
{ 
String str="";
if(args.length==0)
{  
System.out.println("no statement found");
}
else
{
str=args[0];
}
MethodFile run=new MethodFile();
//static Scanner inp=new Scanner(System.in);
try
{
System.out.println("Enter program number 1 to 20: ");
int enter=inp.nextInt();
switch(enter)
{ 
   case 1:
  // String string;
   //run.check(str);
   int len=run.getLength(str);
   System.out.println("Length of the string: "+len);
   break;
   
   case 2:
   System.out.println("Enter the String:");
   String statement2=inp.next();
   char ch[];
   ch=run.charArray(statement2);
   for(char ch1:ch)
   {
        System.out.println(ch1);
    }
   break;
   
   case 3:
   System.out.println("Enter the String:");
   String statement3=inp.next();
   //run.check(statement3);
   char lastBefore=run.penultimate(statement3);
   System.out.println("penultimate of the given string is: "+lastBefore);
   break;
   
   case 4:
   System.out.println("Enter the String:");
   String statement4=inp.next();
   //run.check(statement4);
   System.out.println("Enter the character to get the number of occurrence:");
   char search=inp.next().charAt(0);
   int count=run.occurrence(statement4,search);
   System.out.println(count);
   break;
   
   case 5:
   System.out.println("Enter the String:");
   String statement5=inp.next();
   //run.check(statement5);
   System.out.println("Enter the character to get the greatest position:");
   char search1=inp.next().charAt(0);
   System.out.println("greatest position of "+search1+" is");
   int position=run.greatPosition(statement5,search1);
   System.out.println(position);
   break;
   
   case 6:
   System.out.println("Enter the String:");
   String statement6=inp.next();
   //run.check(statement6);
   System.out.println("Enter the n number to get the last n characters:");
   int num=inp.nextInt();
   System.out.println("The last "+num+" characters");
   String characters=run.lastNCharacters(statement6,num);
   System.out.println(characters);
   break;
   
   case 7:
   System.out.println("Enter the String:");
   String statement7=inp.next();
   //run.check(statement7);
   System.out.println("Enter the n number to get the first n charathers:");
   int num1=inp.nextInt();
   System.out.println("Enter the first "+num1+" Characters");
   String characters1=run.firstNCharacters(statement7,num1);
   System.out.println(characters1);
   break;
   
   case 8:
   System.out.println("Enter the String:");
   String statement8=inp.next();
   //run.check(statement8);
   System.out.println("Enter the n characters to be replaced at the starting:");
   String given=inp.next();
   String replace=run.replacement(statement8,given);
   System.out.println(replace); 
   break; 
   
   case 9:
   System.out.println("Enter the String:");
   String statement9=inp.next();
   //run.check(statement9);
   System.out.println("Enter the characters to check the starting:");
   String given1=inp.next();
   boolean result1=run.stringStartsWith(statement9,given1);
   if(result1==true)
      System.out.println("The String starts with "+given1);
   else
      System.out.println("The String not starts with "+given1);   
    break;
    
    case 10:
    System.out.println("Enter the String:");
    String statement=inp.next();
    //run.check(statement);
    System.out.println("Enter the characters to cheak the ending:");
    String given2=inp.next();
    boolean result2=run.stringEndsWith(statement,given2);
    if(result2==true)
       System.out.println("The String Ends with "+given2);
    else
       System.out.println("The String not Ends With "+given2);   
    break; 
    
    case 11:
    System.out.println("Enter the string to be converted into uppercase:");
    String given3=inp.next();
    //run.check(given3);
    String convert1=run.convertToUpperCase(given3);
    System.out.println(convert1);
    break;
    
    case 12:
    System.out.println("Enter the string to be converted into lowercase:");
    String given4=inp.next();
    //run.check(given4);
    String convert2=run.convertToLowerCase(given4);
    System.out.println(convert2);
    break;
    
    case 13:
    System.out.println("Enter the string to get reversed :");
    String given5=inp.next();
    //run.check(given5);
    String reverse=run.reverseString(given5);
    System.out.println(reverse);
    break;
    
    case 14:
    System.out.println("enter multiple string:");
    String given6=inp.nextLine();
    //run.check(given6);
    String line=inp.nextLine();
    System.out.println("The line is:"+line);
    break;
    
    case 15:
    System.out.println("enter multiple string:");
    String given7=inp.nextLine();
    //run.check(given7);
    String line1=inp.nextLine();
    String res1=run.concatenate(line1);
    System.out.println("The line without space is:"+res1);
    break;
    
    case 16:
    System.out.println("enter multiple string:");
    String given8=inp.nextLine();
    //run.check(given8);
    String line2=inp.nextLine();
    String[] res2=run.splitString(line2);
    for(String str1:res2)
    {
    System.out.println(str1);
    }
    break;
    
    case 17:
    System.out.println("enter n numbers:");
    int num9=inp.nextInt();
    String[] word= new String[num9];
    String word1=" ";
    for(int i=0;i<num9;i++)
    {
    System.out.println("Enter the string"+(i+1));
    word[i]=inp.next();
    //run.check(word[i]);
    }
    word1=run.merge(word);
    System.out.println("The Strings are:"+word1);
    break;
    
    case 18:
    System.out.println("Enter the string1:");
    String string1=inp.next();
    //run.check(string1);
    System.out.println("Enter the string2:");
    String string2=inp.next();
    //run.check(string2);
    boolean check1=run.equalCase(string1,string2);
    if(check1==true)
    System.out.println("Both strings are equal");
    else
    System.out.println("Both strings are not equal");
    break;
    
    case 19:
    System.out.println("Enter the string3:");
    String string3=inp.next();
    //run.check(string3);
    System.out.println("Enter the string4:");
    String string4=inp.next();
    //run.check(string4);
    boolean check2=run.equalIgnoreCase(string3,string4);
    if(check2==true)
    System.out.println("Both strings are equal");
    else
    System.out.println("Both strings are not equal");
    break;
    
    case 20:
    String check3=inp.nextLine();
    System.out.println("Enter the string5:");
    String string5=inp.nextLine();
    //run.check(string5);
    String check=run.trimSpace(string5);
    System.out.println(check);
    break;
    
    default:
    System.out.println("Enter the number less than 20");
    }
}catch(CheckException e)
{
    System.out.println(e.getMessage()); 
}catch(InputMismatchException ex)
{
     System.out.println("invalid");
}       
}
}  
  
   
   
