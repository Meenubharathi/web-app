package exception;
import java.lang.Exception;
public class CheckException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public CheckException()
	{
		
	}
    public CheckException(String str)
    {
      super(str);
    }
    /*public Object check(Object string) throws CheckException
    {
         if(string==null)
         {
         throw new CheckException("no string found");
         }
         return string;
    }*/

}   

	  

