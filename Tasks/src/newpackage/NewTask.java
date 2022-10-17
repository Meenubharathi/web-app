package newpackage;

import java.lang.reflect.Constructor;

	import java.lang.reflect.InvocationTargetException;
	import java.lang.reflect.Method;

	public class NewTask 
	{   
	   
	    public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	    {  
	    	try
	    	{
	    	Class<?> task=Class.forName("methodpackage.OldTask");      //ClassNotFoundException
			Constructor<?> cons=task.getConstructor();             //NoSuchMethodException,SecurityException
			Object obj=cons.newInstance();                         //InstantiationException,IAE,IAE,ITE
			Method set=task.getMethod("setWord",String.class);
			set.invoke(obj, "word");
			Method get=task.getMethod("getWord");
			System.out.println(get.invoke(obj));
			
			Constructor<?> cons1=task.getConstructor(String.class,int.class);
			Object obj1=cons1.newInstance("reflection",15);
			Method get1=task.getMethod("getNumber");
			System.out.println(get1.invoke(obj1));
			Method get2=task.getMethod("getWord");
			System.out.println(get2.invoke(obj1));
	    	}catch(ClassNotFoundException ex)
	    	{
	    		ex.printStackTrace();
	    	}
	    }
	}   


