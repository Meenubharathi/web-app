package methodpackage;

public class RunnableThreadSleepSet implements Runnable
{
	public void run()
	  {
		 System.out.println("Going to sleep:"+Thread.currentThread().getName()); 
		  try 
		  {
				Thread.sleep(3000);
		  } catch (InterruptedException e)
		  {
				e.printStackTrace();
		  }
		  System.out.println("After sleeping : "+Thread.currentThread().getName());
	  }
}
