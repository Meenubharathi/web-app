package runnerpackage;


public class EnumClass
{
	
        public static void main(String[] args)
		{
			for(Rainbow color:Rainbow.values())
			{
				System.out.println("color code of "+color+" is "+color.getValue());
				System.out.println(color+" ordinal "+color.ordinal());
			}
		}
    
}
