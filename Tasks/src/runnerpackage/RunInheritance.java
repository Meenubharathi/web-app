package runnerpackage;

import java.util.InputMismatchException;
import java.util.Scanner;
import methodpackage.Car;
import methodpackage.BirdAbstract;
import methodpackage.Bird;
import methodpackage.Swift;
import methodpackage.XUV;
import methodpackage.Scross;
import methodpackage.ParrotMod;
import methodpackage.Duck;

public class RunInheritance
{ 
	static Scanner inp=new Scanner(System.in);
	public  void method(Car object)
	{
	    if(object instanceof Swift)
	    {
	    	System.out.println("Hatch");
	    }
	    else if(object instanceof XUV)
	    {
	    	System.out.println("SUV");
	    }
	    else if(object instanceof Scross)
	    {
	    	System.out.println("Sedan");
	    }
	}
	public  void method1(Swift object)
	{
		
	}
	public static void main(String args[])
	{   
		BirdAbstract birdabstract=new ParrotMod();          //9
		Bird bird=new Duck();                               //10
		RunInheritance run=new RunInheritance();
		Swift swiftCar=new Swift();
		XUV xuvCar=new XUV();
		Scross scrossCar=new Scross();
		Car myCar1=new Scross();
		Car Car1=new Car();
		try
		{
		System.out.println("Enter program number 1 to 10:");
		int enter=inp.nextInt();
		inp.nextLine();
		switch(enter)
		{
		case 2:
		System.out.println("Enter the number of steats:");
		int number=inp.nextInt();
		swiftCar.setSeat(number);
		System.out.println("number of seats are  "+swiftCar.getSeat());
	    System.out.println("Enter the number of airbags:");
	    int number1=inp.nextInt();
	    swiftCar.setAirbag(number1);
	    System.out.println("number of Airbags are: "+swiftCar.getAirbag());
	    System.out.println("Enter the model of swiftcar:");
	    String model=inp.next();
	    swiftCar.setModel(model);
	    System.out.println("The model of swift car "+swiftCar.getModel());
	    System.out.println("Enter the color of swift car:");
	    String color=inp.next();
	    swiftCar.setColor(color);
	    System.out.println("The color of swift car "+swiftCar.getColor());
	    break;
	    
		case 3:
	    System.out.println("Enter the number of seats:");
		int number2=inp.nextInt();
		scrossCar.setSeat(number2);
		System.out.println("number of seats are  "+scrossCar.getSeat());
	    System.out.println("Enter the number of airbags:");
	    int number3=inp.nextInt();
	    scrossCar.setAirbag(number3);
	    System.out.println("number of Airbags are: "+scrossCar.getAirbag());
	    System.out.println("Enter the model of scross car:");
	    String model1=inp.next();
	    scrossCar.setModel(model1);
	    System.out.println("The model of scross car "+scrossCar.getModel());
	    System.out.println("Enter the color of scross car:");
	    String color1=inp.next();
	    scrossCar.setColor(color1);
	    System.out.println("The color of scross car "+scrossCar.getColor());
	    System.out.println("Enter the year of making of scross car:");
	    int year=inp.nextInt();
	    scrossCar.setYearOfMake(year);
	    System.out.println("The year of making of scross car is "+scrossCar.getYearOfMake());
	    System.out.println("Enter the engine number of scross car:");
	    String engineNumber=inp.next();
        scrossCar.setEngineNumber(engineNumber);
        System.out.println("The engine number of scross car is "+scrossCar.getEngineNumber());
        System.out.println("Enter the type of scross car:");
        String type=inp.next();
        scrossCar.setTypes(type);
        System.out.println("The type of the scross car is "+scrossCar.getTypes());
        break;
        
		case 4:
			run.method(swiftCar);
			run.method(xuvCar);
			run.method(scrossCar);
		     break;
		     
		case 6:
			run.method1(swiftCar);
			//run.method1(myCar);
			//run.method1(xuvCar);
			//run.method1(scrossCar);
			break;
			
		case 7:
			scrossCar.maintanance();
			myCar1.maintanance();
			Car1.maintanance();
			swiftCar.maintanance();
			break;
			
		case 9:
			birdabstract.fly();
			birdabstract.speak();
			break;
			
		case 10:
			bird.fly();
			bird.speak();
			break;
		default:
		    System.out.println("Enter the number less than 10");
		}   
		}catch(InputMismatchException ex)
		{
			System.out.println("invalid");
	
		}
	}
}
    