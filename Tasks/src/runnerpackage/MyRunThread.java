package runnerpackage;

import java.util.Scanner;

import methodpackage.ExtendedThread;
import methodpackage.ExtendedThreadDump;
import methodpackage.ExtendedThreadSleep;
import methodpackage.ExtendedThreadSleepSet;
import methodpackage.ExtendedThreadStop;
import methodpackage.RunnableThread;
import methodpackage.RunnableThreadDump;
import methodpackage.RunnableThreadSleep;
import methodpackage.RunnableThreadSleepSet;
import methodpackage.RunnableThreadStop;

public class MyRunThread 
{   
	static Scanner input=new Scanner(System.in);
	public void getMethod(Thread thread)
	{   
		System.out.println("BEFORE START");
		System.out.println("the current thread name:"+thread.getName());
   	    System.out.println("the priority is :"+thread.getPriority());
   	    System.out.println("the state is :"+thread.getState());
   	   
	}
	/*public String[] getName(int number)
	{
		System.out.println("Enter thread name : ");
		String[] name=new String[number];
		for(int i=0;i<number;i++)
		{
			//System.out.println("Enter thread name");
			name[i]=input.next();
		}
		return name;
	}
	public void setName(String name,Thread thread)
	{
		thread.setName(name);
		thread.start();
	}*/
	
	public int getSeconds()
	{
		System.out.println("Enter the seconds");
		int sec=input.nextInt();
		return sec;
	}
    public static void main(String[] args)
    {      
    	
    	   MyRunThread run=new MyRunThread();
    	   System.out.println("enter number 1 to 7");
    	   int enter=input.nextInt();
    	   switch(enter)
    	   {
    	   case 1:
    	     ExtendedThread thread=new ExtendedThread();
   	  	     run.getMethod(thread);
   	         thread.start();
   	         break;
   	         
    	   case 2:
    		  Runnable runThread=new RunnableThread();
    		  Thread myThread=new Thread(runThread);
    		  run.getMethod(myThread);
    		  myThread.start();
    		  break;
    		  
    	   case 3:
    		   ExtendedThread thread1=new ExtendedThread();
    		    run.getMethod(thread1);
    		   thread1.setName("ExtendedThreadSleepSet");
       		   thread1.start();
    		   Runnable runThread1=new RunnableThread();
    		   Thread myThread1=new Thread(runThread1);
    		   run.getMethod(myThread1);
    		   myThread1.setName("RunnableThread");
       		   myThread1.start();
       		   break;
       		   
    	   case 4:
    		   ExtendedThreadSleepSet threadName1=new ExtendedThreadSleepSet();
    		   ExtendedThreadSleepSet threadName2=new ExtendedThreadSleepSet();
    		   ExtendedThreadSleepSet threadName3=new ExtendedThreadSleepSet();
    		   ExtendedThreadSleepSet threadName4=new ExtendedThreadSleepSet();
    		   ExtendedThreadSleepSet threadName5=new ExtendedThreadSleepSet();
    		   
    		   Runnable runThreads1=new RunnableThreadSleepSet();
     		   Thread myThreads1=new Thread(runThreads1);
     		   Runnable runThreads2=new RunnableThreadSleepSet();
   		       Thread myThreads2=new Thread(runThreads2);
   		       Runnable runThreads3=new RunnableThreadSleepSet();
		       Thread myThreads3=new Thread(runThreads3);
		       Runnable runThreads4=new RunnableThreadSleepSet();
		       Thread myThreads4=new Thread(runThreads4);
		       Runnable runThreads5=new RunnableThreadSleepSet();
		       Thread myThreads5=new Thread(runThreads5);
		       
		       threadName1.setName("ExtendedThread1");
		       threadName2.setName("ExtendedThread2");
		       threadName3.setName("ExtendedThread3");
		       threadName4.setName("ExtendedThread4");
		       threadName5.setName("ExtendedThread5");
		       
		       myThreads1.setName("RunnableThread1");
		       myThreads2.setName("RunnableThread2");
		       myThreads3.setName("RunnableThread3");
		       myThreads4.setName("RunnableThread4");
		       myThreads5.setName("RunnableThread5");
		       
		       threadName1.start();
		       threadName2.start();
		       threadName3.start();
		       threadName4.start();
		       threadName5.start();
		       
		       myThreads1.start();
		       myThreads2.start();
		       myThreads3.start();
		       myThreads4.start();
		       myThreads5.start();
		     /*  String[] threadName=run.getName(5);
		       String[] runnableName=run.getName(5);
		       
		       Thread[] threadNames= {threadName1,threadName2,threadName3,threadName4,threadName5};
		       Thread[] runnableThreads= {myThreads1,myThreads2,myThreads3,myThreads4,myThreads5};
		       for(int i=0;i<5;i++)
		       {
		    	    run.setName(threadName[i],threadNames[i]);
		    	    run.setName(runnableName[i],runnableThreads[i]);
		       }*/
		       break;
		       		
    	   case 5:
    		   ExtendedThreadSleep threadObj1=new ExtendedThreadSleep(run.getSeconds());
    		   ExtendedThreadSleep threadObj2=new ExtendedThreadSleep(run.getSeconds());
    		   ExtendedThreadSleep threadObj3=new ExtendedThreadSleep(run.getSeconds());
    		   ExtendedThreadSleep threadObj4=new ExtendedThreadSleep(run.getSeconds());
    		   ExtendedThreadSleep threadObj5=new ExtendedThreadSleep(run.getSeconds());
    		   
    		   Runnable runnable1=new RunnableThreadSleep(run.getSeconds());
     		   Thread objRunnable1=new Thread(runnable1);
     		   Runnable runnable2=new RunnableThreadSleep(run.getSeconds());
   		       Thread objRunnable2=new Thread(runnable2);
   		       Runnable runnable3=new RunnableThreadSleep(run.getSeconds());
		       Thread objRunnable3=new Thread(runnable3);
		       Runnable runnable4=new RunnableThreadSleep(run.getSeconds());
		       Thread objRunnable4=new Thread(runnable4);
		       Runnable runnable5=new RunnableThreadSleep(run.getSeconds());
		       Thread objRunnable5=new Thread(runnable5);
		       
		       threadObj1.setName("ExtendedThread1");
		       threadObj2.setName("ExtendedThread2");
		       threadObj3.setName("ExtendedThread3");
		       threadObj4.setName("ExtendedThread4");
		       threadObj5.setName("ExtendedThread5");
			      
			   objRunnable1.setName("RunnableThread1");  
			   objRunnable2.setName("RunnableThread2");  
			   objRunnable3.setName("RunnableThread3");  
			   objRunnable4.setName("RunnableThread4");  
			   objRunnable5.setName("RunnableThread5");  
			     
		       threadObj1.start();
		       threadObj2.start();
		       threadObj3.start();
		       threadObj4.start();
		       threadObj5.start();
				 
		       
		       objRunnable1.start();
		       objRunnable2.start();
		       objRunnable3.start();
		       objRunnable4.start();
		       objRunnable5.start();
		      /* threadName=run.getName(5);
		       runnableName=run.getName(5);
		       
		       Thread[] threadObj= {threadObj1,threadObj2,threadObj3,threadObj4,threadObj5};
		       Thread[] objRunnable= {objRunnable1,objRunnable2,objRunnable3,objRunnable4,objRunnable5};
		       for(int i=0;i<5;i++)
		       {
		    	    run.setName(threadName[i],threadObj[i]);
		    	    run.setName(runnableName[i],objRunnable[i]);
		       }*/
		       break;
		      
    	   case 6:
    		   ExtendedThreadDump threadDump1=new ExtendedThreadDump();
    		   ExtendedThreadDump threadDump2=new ExtendedThreadDump();
    		   ExtendedThreadDump threadDump3=new ExtendedThreadDump();
    			    	 
    		   threadDump1.setCondition(true);
    		   threadDump2.setCondition(true);	    	 
    		   threadDump3.setCondition(true);	
    		   
    		   threadDump1.start();
    		   threadDump2.start();
    		   threadDump3.start();
    		   
    		   RunnableThreadDump runnableDump1=new RunnableThreadDump();
    		   Thread runDump1=new Thread(runnableDump1);
    		   RunnableThreadDump runnableDump2=new RunnableThreadDump();
    		   Thread runDump2=new Thread(runnableDump2);
     		   RunnableThreadDump runnableDump3=new RunnableThreadDump();
     		   Thread runDump3=new Thread(runnableDump3);
     		      	 
    		   runnableDump1.setCondition(true);
    		   runnableDump2.setCondition(true);	    	 
    		   runnableDump3.setCondition(true);	
    		   
    		   runDump1.start();
    		   runDump2.start();
    		   runDump3.start();
    		   break;
    		   
    	   case 7:
    		   ExtendedThreadStop threadStop1=new ExtendedThreadStop();
    		   ExtendedThreadStop threadStop2=new ExtendedThreadStop();
    		   ExtendedThreadStop threadStop3=new ExtendedThreadStop();
    			    	 
    		   threadStop1.setCondition(true);
    		   threadStop2.setCondition(true);	    	 
    		   threadStop3.setCondition(true);	
    		   
    		   threadStop1.start();
    		   threadStop2.start();
    		   threadStop3.start();
    		
    		   RunnableThreadStop runnableThreadStop1=new RunnableThreadStop();
    		   Thread runStop1=new Thread(runnableThreadStop1);
    		   RunnableThreadStop runnableThreadStop2=new RunnableThreadStop();
    		   Thread runStop2=new Thread(runnableThreadStop2);
     		   RunnableThreadStop runnableThreadStop3=new RunnableThreadStop();
     		   Thread runStop3=new Thread(runnableThreadStop3);
     		      	 
    		   runnableThreadStop1.setCondition(true);
    		   runnableThreadStop2.setCondition(true);	    	 
    		   runnableThreadStop3.setCondition(true);	
    		   
    		   runStop1.start();
    		   runStop2.start();
    		   runStop3.start();
    		  
    		   try
    		   {
    		        Thread.sleep(10000);
    		   }catch(InterruptedException e)
   		       {
   				    e.printStackTrace();
   		       }
    		   
    		   threadStop1.setCondition(false);
    		   try
    		   {
    		        Thread.sleep(10000);
    		   }catch(InterruptedException e)
   		       {
   				    e.printStackTrace();
   		       }
    		  
    		   threadStop2.setCondition(false);
    		   try
    		   {
    		        Thread.sleep(10000);
    		   }catch(InterruptedException e)
   		       {
   				    e.printStackTrace();
   		       }
    		  
    		   threadStop3.setCondition(false);
    		   
    		   try
    		   {
    		        Thread.sleep(10000);
    		   }catch(InterruptedException e)
   		       {
   				    e.printStackTrace();
   		       }
    		   
    		   runnableThreadStop1.setCondition(false);
    		   try
    		   {
    		        Thread.sleep(10000);
    		   }catch(InterruptedException e)
   		       {
   				    e.printStackTrace();
   		       }
    		  
    		   runnableThreadStop2.setCondition(false);
    		   try
    		   {
    		        Thread.sleep(10000);
    		   }catch(InterruptedException e)
   		       {
   				    e.printStackTrace();
   		       }
    		  
    		   runnableThreadStop3.setCondition(false);	
    		 
    		   System.out.println(threadStop1.isAlive());
    		   System.out.println(threadStop2.isAlive());
    		   System.out.println(threadStop3.isAlive());
     		  
    		   System.out.println(runStop1.isAlive());
    		   System.out.println(runStop2.isAlive());
    		   System.out.println(runStop3.isAlive());
     		  
    		   System.out.println("task completed");
    		   
    	    	  
    	   } 
    }
}
