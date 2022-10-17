package methodpackage;

public class RunnableThread implements Runnable
{
	 public void run()
    {
    	  System.out.println("AFTER START");
    	  System.out.println("name "+Thread.currentThread().getName());
		  System.out.println("Priority "+Thread.currentThread().getPriority());
		  System.out.println("state "+Thread.currentThread().getState());
	 
    }
	
}
