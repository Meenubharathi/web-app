package methodpackage;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;

import exception.CheckException;
import utility.Util;

public class FileMethod
{
	public void writeLine(String[] line,String myFile) throws IOException,CheckException
    {
		  Util.check(line);
		  Util.check(myFile);
    	  try (FileWriter writer = new FileWriter(myFile))//swami
    	    {
    	         int size = line.length;//swami
    	         for (int i=0; i<size; i++)
    	         {
    		            writer.write(line[i] + "\n");
	    	        	System.out.println(line[i]);

    	         }
    	   	}
    }
    public File dirName(String name)
    {
    	File myFile=new File(name);
        myFile.mkdirs();
    	return myFile;
    }
    public File fileName(String name) throws CheckException
    {
    	Util.check(name);
    	File myFile=new File(name);
        return myFile;
    }
    public void store(String myFile,Properties property) throws IOException, CheckException 
    {
    	Util.check(property);
    	Util.check(myFile);
    	try(FileWriter writer=new FileWriter(myFile))
    	{
    	property.store(writer, null);
    	//return myFile;
    	}
     }
    public Properties getProperty()
	 {
		 Properties property=new Properties();
		 return property;
	 }
    public Properties read(String myFile,Properties property) throws IOException, CheckException
    {
    	Util.check(property);
    	Util.check(myFile);
    	FileReader read=new FileReader(myFile);
    	property.load(read);
    	return property;
    	
    }
    public LocalDateTime dateTime()
    {
 	   LocalDateTime dateTime=LocalDateTime.now();
 	   return dateTime;
    }
    public long milliseconds()
    {
 	  // long milliSeconds=System.currentTimeMillis();//SWAMI
    	Clock clock=Clock.systemDefaultZone();
    	long milliSecond=clock.millis();
 	   return milliSecond;
    }
    
    public DayOfWeek currentDay()
    {
 	  LocalDateTime local=dateTime();
 	  DayOfWeek day=local.getDayOfWeek();
 	  return day;
   }
   public Month month() 
   {
 	  LocalDateTime local=LocalDateTime.now();
 	  Month month=local.getMonth();
 	  return month;
   }
   public int currentYear()
   {
 	 LocalDateTime local=dateTime();
 	 int year=local.getYear();
 	 return year;
 	 
   }
   public ZonedDateTime anyZone(String place) throws CheckException
   {
	 Util.check(place);
 	 ZoneId zoneId=ZoneId.of(place); 
 	 ZonedDateTime zone =ZonedDateTime.now(zoneId);
 	 return zone;
   }
   public DayOfWeek zoneCurrentDay(String place) throws CheckException
   {
	  ZonedDateTime zone=anyZone(place);
	  DayOfWeek day=zone.getDayOfWeek();
	  return day;
   }
   public Month zoneMonth(String place) throws CheckException
   {
	   ZonedDateTime zone=anyZone(place);
	   Month month = zone.getMonth();
	   return month;
   }
	public int zoneYear(String place) throws CheckException
	{
		ZonedDateTime zone=anyZone(place);
		int year=zone.getYear();
		return year;
	}
}


