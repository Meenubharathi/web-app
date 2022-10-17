package methodpackage;

public class ExtendedThreadSleepSet extends Thread
{
	public void run()
	  {
		 System.out.println("Going to sleep:"+getName()); 
		  try 
		  {
				Thread.sleep(5000);
		  } catch (InterruptedException e)
		  {
				e.printStackTrace();
		  }
		  System.out.println("After sleeping : "+getName());
	  }
}
