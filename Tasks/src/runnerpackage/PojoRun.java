package runnerpackage;

import java.util.Scanner;

import methodpackage.OldTask;

public class PojoRun 
{
	static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {   
    	OldTask oldTask=new OldTask();
        System.out.println("Enter the string:");
		String word=input.next();
		oldTask.setWord(word);
		System.out.println("the string is:  "+oldTask.getWord());
	    System.out.println("enter the number:");
	    int number=input.nextInt();
	    oldTask.setNumber(number);
	    System.out.println("the number is: "+oldTask.getNumber());
    }
}
