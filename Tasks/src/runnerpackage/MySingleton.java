package runnerpackage;

public class MySingleton
{
     private static final MySingleton obj=new MySingleton();
     public String object;
     private MySingleton()
     {
    	 
     }
     public static MySingleton getInstance()
     {
    	 return obj;
     }
     public void setObject(String object)
     {
    	 this.object=object;
     }
     public String getObject()
     {
    	 return object;
     }
     public String toString()
     {
    	 return object;
     }
     public static void main(String[] args)
     {
    	// System.out.println(obj.hashCode());
    	 MySingleton x=MySingleton.getInstance();
    	 MySingleton y=MySingleton.getInstance();
    	 x.setObject("Singleton");
    	 System.out.println("name "+x+" the hashcode value is "+x.hashCode());
    	 y.setObject("otherSingleton");
    	 System.out.println("name "+y+" the hashcode value is "+y.hashCode());
    	 obj.setObject("objSingleton");
    	 System.out.println("name "+obj+" the hashcode value is "+obj.hashCode());
     }
   
}
