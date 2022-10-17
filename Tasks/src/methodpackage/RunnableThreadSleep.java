package methodpackage;

public class RunnableThreadSleep implements Runnable
{
	int seconds;
	public RunnableThreadSleep()
	{
		
	}
	public RunnableThreadSleep(int sec)
	{
		this.seconds=sec;
	}
	public void run() 
	{
		  	 System.out.println("Going to sleep:"+Thread.currentThread().getName()); 
			  try 
			  {
					Thread.sleep(seconds);
			  } catch (InterruptedException e)
			  {
					e.printStackTrace();
			  }
			  System.out.println("After sleeping : "+Thread.currentThread().getName());
			
	}
}
