package runnerpackage;
import java.util.Scanner;

import exception.CheckException;
import methodpackage.StringBuilderTask;

import java.util.InputMismatchException;
public class StringBuilderRunner 
{ 
	static Scanner inp=new Scanner(System.in);
	public String enterString()
	{
		System.out.println("Enter string:");
		String string=inp.nextLine();
		return string;
	}
	public static void main(String[] args) 
	{
		StringBuilderTask run=new StringBuilderTask();
		StringBuilderRunner test=new StringBuilderRunner();
		try
		{
		System.out.println("Enter program number 1 to 10:");
		int number=inp.nextInt();
		inp.nextLine();
		switch(number)
		{
		case 1:
			//String st=test.enterString();
			StringBuilder string1=run.getStringBuilder();
			int len=run.getLength(string1);
			System.out.println("the length is "+len);
			String string2=test.enterString();
			StringBuilder string3=run.append(string2);
			int len1=run.getLength(string3);
			System.out.println("the length is "+len1);
			System.out.println("the final string is :"+string3);
			break;
		case 2:
			String st2=test.enterString();
			StringBuilder str2=run.append(st2);
			int len2=run.getLength(str2);
			System.out.println("the length:"+len2);
			System.out.println("Enter n numbers:");
			int num=inp.nextInt();
			String[] sti=new String[num];
			for(int i=0;i<num;i++)
			{
				System.out.println("enter strings:"+(i+1));
				sti[i]=inp.next();
			}
			System.out.println("enter the character");
			String character5=inp.next();
		    StringBuilder str4=run.append1(sti,str2,num,character5);
		    System.out.println("the final string is :"+str4);
		    break;
		case 3:
			String st3=null;  //test.enterString();
			StringBuilder str3=run.append(st3);
			int len4=run.getLength(str3);
			System.out.println("the length:"+len4);
			System.out.println("Enter the string to be inserted");
		    String st4=inp.next();
		    System.out.println("enter the character");
			String character6=inp.next();
			StringBuilder line1=run.insert(st4,str3,character6);
			System.out.println("the final string is:"+line1);
			int len5=run.getLength(line1);
		    System.out.println("the length is:"+len5);
		    break;
		case 4:
			String st6=test.enterString();
			StringBuilder str6=run.append(st6);
			int len6=run.getLength(str6);
			System.out.println("the length:"+len6);
			System.out.println("enter the character:");
			String character=inp.next();
			StringBuilder str9=run.delete(str6,character);
			 System.out.println("the final String is :"+str9);
			 int len9=run.getLength(str9);
			 System.out.println("the length is:"+len9);
			 break;
		case 5:
			String state=test.enterString();
			StringBuilder state1=run.append(state);
			int length=run.getLength(state1);
			System.out.println("the length:"+length);
			System.out.println("enter separator:");
			String line9=inp.next();
			//System.out.println("enter the element to be cut");
			//String character3=inp.next();
			System.out.println("enter the element to be inserted");
			String character4=inp.next();
			StringBuilder line5=run.replace1(state1, line9, character4);
			System.out.println("the final string is "+line5);
			 break;
		
		case 6:
			String statement=test.enterString();
			StringBuilder statement1=run.append(statement);
			int length1=run.getLength(statement1);
			System.out.println("the length:"+length1);
            StringBuilder statement2=run.reverse(statement1);
            System.out.println("the reverse statement is:"+statement2);
            int length2=run.getLength(statement2);
			System.out.println("the length:"+length2);
			break;
		case 7:
			String statement3=test.enterString();
			StringBuilder statement4=run.append(statement3);
			int length3=run.getLength(statement4);
			System.out.println("the length:"+length3);
			System.out.println("Enter the number from where youwant to delete:");
			int number3=inp.nextInt();
			System.out.println("Enter the element to where you want to delete:");
			int number4=inp.nextInt();
			StringBuilder line3=run.delete1(number3,number4,statement4);
			System.out.println("String after deletion:"+line3);
			int length4=run.getLength(line3);
			System.out.println("the length:"+length4);
			break;
		case 8:
			String statement5=test.enterString();
			StringBuilder statement6=run.append(statement5);
			int length5=run.getLength(statement6);
			System.out.println("the length:"+length5);
			System.out.println("Enter the number from where youwant to delete:");
			int number5=inp.nextInt();
			System.out.println("Enter the element to where you want to delete:");
			int number6=inp.nextInt();
			System.out.println("Enter the string to be replaced:");
			String statement7=null;//inp.next();
			StringBuilder string4=run.replace(number5, number6, statement6, statement7);
			System.out.println("String after replacement:"+string4);
			int length6=run.getLength(string4);
			System.out.println("the length:"+length6);
			break;
		case 9:
			String statement8=test.enterString();
			StringBuilder statement9=run.append(statement8);
			int length7=run.getLength(statement9);
			System.out.println("the length:"+length7);
			System.out.println("enter the character");
			String character1=inp.next();
			int index=run.fIndex(statement9,character1);
			System.out.println("first index of # is"+index);
			break;
		case 10:
		String state8=test.enterString();
		StringBuilder state9=run.append(state8);
		int length8=run.getLength(state9);
		System.out.println("the length:"+length8);
		System.out.println("enter the character");
		String character2=inp.next();
			int index1=run.lIndex(state9,character2);
		System.out.println("last index of # is"+index1);
		break;
		default:
		    System.out.println("Enter the number less than 10");
		}   
		}catch(InputMismatchException ex)
		{
			System.out.println("invalid");
		}catch(CheckException e)
		{
		    System.out.println(e.getMessage()); 
		}

	}

}
