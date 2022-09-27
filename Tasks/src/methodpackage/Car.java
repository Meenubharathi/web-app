package methodpackage;

public class Car
{
   int yearOfMake;
   String engineNumber;
   String types;
   public Car()
   {
	   
   }
   public Car(String string)
   {
	   System.out.println(string);
   }
   public void setYearOfMake(int newYearOfMake)
   {
	   yearOfMake=newYearOfMake;
   }
   public int getYearOfMake()
   {
	   return yearOfMake;
   }
   public void setEngineNumber(String eN)
   {
	   engineNumber=eN;
   }
   public String getEngineNumber()
   {
	   return engineNumber;
   }
   public void setTypes(String newTypes)
   {
	   types=newTypes;
   }
   public String getTypes()
   {
	   return types;
   }
   public void maintanance()
   {
	   System.out.println("car under maintanance");
   }
}
