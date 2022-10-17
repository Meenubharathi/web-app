package methodpackage;

public class ExtendedThreadSleep extends Thread
{
	int seconds;
	public ExtendedThreadSleep()
	{
		
	}
	public ExtendedThreadSleep(int sec)
	{
		this.seconds=sec;
	}
    public void run()
    {
    	System.out.println("Going to sleep:"+getName()); 
		  try 
		  {
				Thread.sleep(seconds);
		  } catch (InterruptedException e)
		  {
				e.printStackTrace();
		  }
		  System.out.println("After sleeping : "+getName());
	
    }
}
