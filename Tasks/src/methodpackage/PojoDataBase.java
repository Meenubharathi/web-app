package methodpackage;

public class PojoDataBase
{
     private int employee_id;
     private String name;
     private long mobile;
     private String gmail;
     private String department;
     
     public void setEmployee_id(int employee_id)
     {
    	 this.employee_id=employee_id;
     }
     public int getEmployee_id()
     {
    	 return employee_id;
     }
     public String getName() 
    {
 		return name;
 	}
 	public void setName(String name)
 	{
 		this.name = name;
 	}
 	public long getMobile()
 	{
 		return mobile;
 	}
 	public void setMobile(long mobile)
 	{
 		this.mobile = mobile;
 	}
 	public String getGmail()
 	{
 		return gmail;
 	}
 	public void setGmail(String gmail)
 	{
 		this.gmail = gmail;
 	}
 	public String getDepartment()
 	{
 		return department;
 	}
 	public void setDepartment(String department)
 	{
 		this.department = department;
 	}
}
