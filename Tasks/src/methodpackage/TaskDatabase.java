package methodpackage;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import runnerpackage.Database;

public class TaskDatabase 
{
	public void table(String table) throws SQLException             //1
	{  
		try(Connection connect=Database.getConnection();
	  	 PreparedStatement	statement =connect.prepareStatement(table);)
		{
	         statement.execute(table);
		}
	}
    public String createTable()          //1
     {
    	String query="create table EMPLOYEE"+"(EMPLOYEE_ID integer(10) NOT NULL,"+"NAME varchar(20) NOT NULL,"
                                              +"MOBILE integer(10) NOT NULL,"+"EMAIL varchar(30) NOT NULL,"
    			                              +"DEPARTMENT varchar(20) NOT NULL,"+"PRIMARY KEY (EMPLOYEE_ID))";
     	 return query;
     }
     public void insertTable(int id,String name,long mobile,String email,String dept) throws SQLException    //2
     {
    	 String query="insert into EMPLOYEE"+"(EMPLOYEE_ID,NAME,MOBILE,EMAIL,DEPARTMENT)"+
                          "values (?,?,?,?,?)";
    	 try(Connection connect=Database.getConnection();
    		  	 PreparedStatement	statement =connect.prepareStatement(query);)
    	 {
    		statement.setInt(1, id);
    		statement.setString(2,name);
    		statement.setLong(3,mobile);
    		statement.setString(4,email);
    		statement.setString(5,dept);
    		
    		statement.executeUpdate();
    	 }
    }
    public void insertPOJO(List<PojoDataBase> list) throws SQLException             //8
      {
    	 String query="insert into EMPLOYEE"+"(EMPLOYEE_ID,NAME,MOBILE,EMAIL,DEPARTMENT)"+
                 "values (?,?,?,?,?)";
        try(Connection connect=Database.getConnection();
	  	 PreparedStatement	statement =connect.prepareStatement(query);)
        {
        	for(PojoDataBase pojo:list)
        	{
        		statement.setInt(1, pojo.getEmployee_id());
        		statement.setString(2, pojo.getName());
        		statement.setLong(3, pojo.getMobile());
        		statement.setString(4, pojo.getGmail());
        		statement.setString(5, pojo.getDepartment());
        		
        		statement.execute();
        	}
        }

     }
     public List<Object> getDetails(int id) throws SQLException             //3 map
     {
    	//String  detail="select * from EMPLOYEE "+"where EMPLOYEE_ID= "+id+"";
    	 List<Object> list=new ArrayList<Object>();
    	 String  query="select * from EMPLOYEE where EMPLOYEE_ID= ? ";
    	 try(Connection connect=Database.getConnection();
    		  	 PreparedStatement	statement =connect.prepareStatement(query);)
    	 {
    		statement.setInt(1, id);
    	    try(ResultSet result=statement.executeQuery();)
    	    {
    	    	while(result.next())
    	    	{
    	    		  Map<Object,Object> map=new HashMap<Object,Object>();
    	     		  map.put("EMPLOYEE_ID",result.getInt(1));
    	     		  map.put("NAME",result.getString(2));
    	     		  map.put("MOBILE",result.getLong(3));
    	     		  map.put("EMAIL",result.getString(4));
    	     		  map.put("DEPARTMENT",result.getString(5));
    	     		  
    	     		  list.add(map);
    	     	
             	}
    	    	return list;
    	    }
    	 } 
      }
     public List<Object> getFullDetails() throws SQLException           //5
     {
    	 List<Object> list=new ArrayList<Object>();
     	 String  query="select * from EMPLOYEE ";
     	try(Connection connect=Database.getConnection();
   		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
     	{
     		while(result.next())
     		{
     		  Map<Object,Object> map=new HashMap<Object,Object>();
     		  map.put("EMPLOYEE_ID",result.getInt(1));
     		  map.put("NAME",result.getString(2));
     		  map.put("MOBILE",result.getLong(3));
     		  map.put("EMAIL",result.getString(4));
     		  map.put("DEPARTMENT",result.getString(5));
     		  
     		  list.add(map);
     		}
     		return list;
     	}
     }
     public String orderList() throws SQLException
     {
    	 String query="select * from EMPLOYEE order by name ";
       	 return query;
     }
     public String deleteRow(int id)                           //7
     {
    	 String query="delete from EMPLOYEE "+"where EMPLOYEE_ID = "+id+"";
    	 return query;
     }
     public void update(String field,String oldValue,String newValue) throws SQLException         //4
     {
    	 String query="update EMPLOYEE set "+field+" = ? where "+field+" = ?";
    	 try(Connection connect=Database.getConnection();
    		  	 PreparedStatement	statement =connect.prepareStatement(query);)
    	 {
    		statement.setString(1,newValue);
    		statement.setString(2,oldValue);
    		statement.executeUpdate();
    	 }
     }
     public String createDeptTable()              //9
     {
    	 String query="create table PERSONAL (EMPLOYEE_ID integer(10) NOT NULL,IndexNum integer(3) NOT NULL,NAME varchar(20) NOT NULL,"
                              +"AGE integer(3) NOT NULL,"
                              +"RELATIONSHIP varchar(20) NOT NULL," +"PRIMARY KEY (IndexNum),"
                              +"FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEE(EMPLOYEE_ID))";
    	 return query;
     }
     public void insertDeptTable(int id,int index,String name,int age,String relation) throws SQLException             //10
     {
    	 String query="insert into PERSONAL"+"(EMPLOYEE_ID,IndexNum,NAME,AGE,RELATIONSHIP)"+"values(?,?,?,?,?)";
    	 try(Connection connect=Database.getConnection();
    		  	 PreparedStatement	statement =connect.prepareStatement(query);)
    	 {
    		 statement.setInt(1,id);
    		 statement.setInt(2, index);
    		 statement.setString(3, name);
    		 statement.setInt(4, age);
    		 statement.setString(5, relation);
    		
    		 statement.executeUpdate();
    	 }
     }
     public List<Object> deptDetail(int id) throws SQLException
     {
    	 
    	 List<Object> list=new ArrayList<Object>();
      	//String query="select * from PERSONAL";
    	 String query="select*from PERSONAL INNER JOIN EMPLOYEE ON EMPLOYEE.EMPLOYEE_ID=PERSONAL.EMPLOYEE_ID where EMPLOYEE.EMPLOYEE_ID= "+id+"";
    	 try(Connection connect=Database.getConnection();
       		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
         	{
         		while(result.next())
         		{
         	      Map<Object,Object> map=new HashMap<Object,Object>();
                  map.put("EMPLOYEE_ID",result.getInt(1));
           	      map.put("INDEX",result.getInt(2));
           	      map.put("NAME",result.getString(3));
           	      map.put("AGE",result.getInt(4));
           	      map.put("RELATION",result.getString(5));
           	      list.add(map);
           	     
         		}
         		return list;
         	}
     }
     public List<Object> deptOrderList() throws SQLException
     {
    	 List<Object> list=new ArrayList<Object>();
       	 String query="select * from PERSONAL order by name ";
       	try(Connection connect=Database.getConnection();
      		  	 PreparedStatement	statement =connect.prepareStatement(query);ResultSet result=statement.executeQuery();)
        	{
        		while(result.next())
        		{
        		  Map<Object,Object> map=new HashMap<Object,Object>();
        	      map.put("EMPLOYEE_ID",result.getInt(1));
        	      map.put("INDEX",result.getInt(2));
        	      map.put("NAME",result.getString(3));
        	      map.put("AGE",result.getInt(4));
        	      map.put("RELATION",result.getString(5));
        	      list.add(map);
        	      
        		}
        		return list;
           }
      }  
}
