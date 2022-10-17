package methodpackage;

public class ExtendedThreadDump extends Thread
{
	boolean condition;
    public void setCondition(boolean condition)
    {
    	this.condition=condition;
    }
    public void run()
    {
    	while(condition)
    	{
    		System.out.println("The Thread name is (extends)"+getName());
    	  try 
		    {
				Thread.sleep(5000);
				//Thread.dumpStack();
		    } catch (InterruptedException e)
		    {
				e.printStackTrace();
		    }
    	}
    }
  
} 
