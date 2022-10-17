package methodpackage;

public class RunnableThreadStop implements Runnable
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
    		System.out.println("the thread is running"+Thread.currentThread().getName());
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
