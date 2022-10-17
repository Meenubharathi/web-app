package methodpackage;

public class ExtendedThread extends Thread
{
	
	 public void run()
	  {
		  System.out.println("AFTER START");
		  System.out.println("name "+getName());
		  System.out.println("Priority "+getPriority());
		  System.out.println("state "+getState());
	  }
	  
}
