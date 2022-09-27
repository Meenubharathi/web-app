package runnerpackage;

import java.util.InputMismatchException;
import exception.CheckException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import methodpackage.MethodArrayList;
//import utility.Util;

public class RunnerArrayList 
{  
	 static Scanner input=new Scanner(System.in);
	 public int count()
	 {
	     System.out.println("Enter the number of elements:");
		 int num=input.nextInt();
		 return num;
	 }
	 public String[] getString(int num)  throws CheckException
	 {  
		 String[] string=new String[num];
		 //Util.check(string);
		 System.out.println("enter string");
	     for(int i=0;i<num;i++)
		 {
			string[i]=input.next();
		 }
		 return string;
	 }	 
		
     public static void main(String[] args) //throws CheckException
     {
    	 MethodArrayList arrayList=new MethodArrayList();
    	 RunnerArrayList run=new RunnerArrayList();
    	 try
    	 {
    	 System.out.println("Enter program number 1 to 20:");
 		 int enter=input.nextInt();
 		 input.nextLine();
 		 switch(enter)
 		 {
 		 case 1:
 			 List<String> arrayL=arrayList.create();
 			 int size=arrayList.arraySize(arrayL);
 			 System.out.println("the size is:"+size);
 			 break;
 		 case 2:
 			 int num=run.count();
 			 String[] string=run.getString(num);
 			 List<String> stringList=arrayList.createAL(string,num);
 			 System.out.println("the array list is "+stringList);
 			 size=arrayList.arraySize(stringList);
 			 System.out.println("the size is:"+size);
 			 break;
 			 
 		 case 3:
 		     num=run.count();//.nextInt();
 			 int[] num2=new int[num];
 			 System.out.println("enter integer:");
			 for(int i=0;i<num;i++)
 			 {
 				 num2[i]=input.nextInt();
 			 }
 			 List<Integer> al1=arrayList.createAL1(num2, num);
 			 System.out.println("the array list is "+al1);
 			 size=arrayList.arraySize(al1);
 			 System.out.println("the size is:"+size);
 			 break;
 			
 		 case 4:
 			 Object[] obj=new Object[2];
 			 obj[0]=run;
 			 obj[1]=arrayList;
 			 List<Object> obj9= arrayList.create2(obj,2);
 			 System.out.println("output"+obj9);
 			 break;
 			 
 		 case 5:
 			 obj=new Object[6];
 			 obj[0]=run;
 			 obj[1]=arrayList;
 			 System.out.println("enter string");
 			 obj[2]=input.next();
 			 System.out.println("enter string");
 			 obj[3]=input.next();
 			 System.out.println("enter integer");
 			 obj[4]=input.nextInt();
 			 System.out.println("enter integer");
 			 obj[5]=input.nextInt();
 			 obj9=arrayList.create2(obj,6);
 			 System.out.println("the output"+obj9);
 			 size=arrayList.arraySize(obj9);
			 System.out.println("the size is:"+size);
			 break;
			
 		 case 6:
 			 num=run.count();
 			 string=run.getString(num);
 			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 System.out.println("Enter the string:");
			 String string2=input.next();
			 size=arrayList.fIndexOf(stringList,string2);
			 System.out.println("the index is :"+size);
			 break;
 			 
 		 case 7:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 Iterator<String> iter=arrayList.iter(stringList);
 		     for(int i=0;i<num;i++)
			 {
			    System.out.println(iter.next());
			 }
 		     break;
 		     
 		 case 8:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 System.out.println("enter the index:");
			 int n6=input.nextInt();
			 String string6=arrayList.getList(n6,stringList);
			 System.out.println("the String is "+string6);
			 break;
			 
 		 case 9:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 System.out.println("enter the string:");
			 String string8=input.next();
			 int firstIndex=arrayList.fIndexOf(stringList, string8);
			 System.out.println("the firstindex is:"+firstIndex);
			 int lastIndex=arrayList.lIndexOf(stringList, string8);
			 System.out.println("the last index is "+lastIndex);
			 break;
			 
 		 case 10:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 System.out.println("enter the string:");
			 String word=input.next();
			 System.out.println("Enter the index:");
			 int index =input.nextInt();
			 stringList=arrayList.insert(index,word,stringList);
	         System.out.println("the final arraylist is :"+stringList);
	         size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
             break;
             
 		 case 11:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 System.out.println("the start index");
			 int start=input.nextInt();
			 System.out.println("the end index");
			 int end=input.nextInt();
			 List<String> list=arrayList.getSubList(start, end,stringList);
			 System.out.println("the final arraylist is "+list);
			 break;
			 
 		 case 12:	 
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 num=run.count();
			 string=run.getString(num);
			 List<String> stringList1=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList1);
			 size=arrayList.arraySize(stringList1);
			 System.out.println("the size is:"+size);
			 List<String> fullList=arrayList.addTwoList(stringList,null);
			 System.out.println("the final list is "+fullList);
		     size=arrayList.arraySize(fullList);
		     System.out.println("the size is:"+size);
		     break;
		     
 		 case 13:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 num=run.count();
			 string=run.getString(num);
			 stringList1=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList1);
			 size=arrayList.arraySize(stringList1);
			 System.out.println("the size is:"+size);
			 List<String> fullList1=arrayList.addTwoList1(stringList,stringList1);
			 System.out.println("the final list is "+fullList1);
		     size=arrayList.arraySize(fullList1);
		     System.out.println("the size is:"+size);
		     break;
		     
 		 case 14:
 			 num=run.count();
			 float[] f1=new float[num];
			 System.out.println("the float value is:");
			 for(int i=0;i<num;i++)
			 {
				 f1[i]=input.nextFloat();
			 }
			 List<Float> floatList2=arrayList.createAL2(f1, num);
			 System.out.println("the array list is:"+floatList2);
			 size=arrayList.arraySize(floatList2);
			 System.out.println("the size is "+size);
		     System.out.println("Enter the value to be removed:");
			 float f3=input.nextFloat();
			 floatList2=arrayList.deleteValue(floatList2, f3);
			 System.out.println("the final list is:"+floatList2);
			 size=arrayList.arraySize(floatList2);
			 System.out.println("the size is "+size);
		     break;
		     
 		 case 15:
 			 num=run.count();
 			 float[] f=new float[num];
 			 System.out.println("the float value is:");
 			 for(int i=0;i<num;i++)
 			 {
 				 f[i]=input.nextFloat();
 			 }
 			 List<Float> floatList=arrayList.createAL2(f, num);
 			 System.out.println("the array list is:"+floatList);
 			 size=arrayList.arraySize(floatList);
			 System.out.println("the size is "+size);
		     System.out.println("enter the index to be removed:");
			 int remove=input.nextInt();
			 floatList=arrayList.deleteIndex(floatList,remove);
			 System.out.println("the final float list is:"+floatList);
			 size=arrayList.arraySize(floatList);
			 System.out.println("the size is:"+size);
			 break;
			 
 		 case 16:
 			 num=run.count();
 			 long[] value = new long[num];
 			 System.out.println("the long value is:");
 			 for(int i=0;i<num;i++)
 			 {
 				 value[i]=input.nextLong();
 			 }
 			 List<Long>  longList=arrayList.createAL3(value, num);
 			 System.out.println("the array list is:"+longList);
 			 size=arrayList.arraySize(longList);
 			 System.out.println("the size is:"+size);
 			 System.out.println("enter the start index:");
 			 int start1=input.nextInt();
 			 System.out.println("enter the end index: ");
 			 int end1=input.nextInt();
 			 List<Long> longList2=arrayList.getSubList1(start1, end1,longList);
			 System.out.println("the final arraylist is "+longList2);
		     List<Long> longList3=arrayList.longDelete(longList,longList2);
 			 System.out.println("the final index is:"+longList3);
 			 size=arrayList.arraySize(longList3);
 			 System.out.println("the size is"+size);
 			 break;
 			 
 		 case 17:
 			 num=run.count();
			 string=run.getString(num);
			 stringList=arrayList.createAL(string,num);
			 System.out.println("the array list is "+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 num=run.count();
			 string=run.getString(num);
			 List<String> list6=arrayList.createAL(string,num);
			 System.out.println("the array list is "+list6);
			 int number7=arrayList.arraySize(list6);
			 System.out.println("the size is:"+number7);
			 stringList=arrayList.different(stringList, list6);
			 System.out.println("the final list is"+stringList);
			 size=arrayList.arraySize(stringList);
			 System.out.println("the size is:"+size);
			 break;
			 
 		 case 18:	 
 			 num=run.count();
 			 string=run.getString(num);
			 List<String> list3=arrayList.createAL(string,num);
			 System.out.println("the array list is "+list3);
			 size=arrayList.arraySize(list3);
			 System.out.println("the size is:"+size);
			 num=run.count();
			 string=run.getString(num);
			 List<String> list4=arrayList.createAL(string,num);
			 System.out.println("the array list is "+list4);
			 size=arrayList.arraySize(list4);
			 System.out.println("the size is:"+size);
			 list3=arrayList.common(list3,list4);
			 System.out.println("the common string:"+list3);
			 size=arrayList.arraySize(list3);
			 System.out.println("the size is:"+size);
			 break;
			 
 		 case 19:
 			 num=run.count();
			 long[] value1 = new long[num];
			 System.out.println("the float value is:");
			 for(int i=0;i<num;i++)
			 {
				 value1[i]=input.nextLong();
			 }
			 List<Long>  longList1=arrayList.createAL3(value1, num);
			 System.out.println("the array list is:"+longList1);
			 size=arrayList.arraySize(longList1);
			 System.out.println("the size is:"+size);
		     longList1=arrayList.remove(longList1);
		     System.out.println("the final list is:"+longList1);
		     size=arrayList.arraySize(longList1);
		     System.out.println("the size is:"+size);
		     break;
		     
 		 case 20:
 		 num=run.count();
		 string=run.getString(num);
		 List<String> list9=arrayList.createAL(string,num);
		 System.out.println("the array list is "+list9);
		 size=arrayList.arraySize(list9);
		 System.out.println("the size is:"+size);
		 System.out.println("enter the string:");
		 String str=input.next();
		 boolean check=arrayList.compare(list9, str);
		 System.out.println("the string is present "+check);
		 break;
 		default:
		    System.out.println("Enter the number less than 20");
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
