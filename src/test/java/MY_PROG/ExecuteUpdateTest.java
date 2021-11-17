package MY_PROG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

@Test
public class ExecuteUpdateTest 
{
public void executeUpdateTest() throws Throwable 
{
	try {
		//register the database
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		//connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		//create statement
		Statement stmt = con.createStatement();
		//execute my query
		int res=stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values('4', 'noorullah','shaik', 'h');");
		//int res1=stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values('5', 'kishore','kadiyala', 'h');");

		System.out.println(res);
		//System.out.println(res1);
		if(res==1)	
		{
			System.out.println("data insert in database");
		}
		//if(res1==2)	
		{
			System.out.println("data insert in database");
		}
		
		//else
		{
			System.out.println("data not inserted in database");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}

		
}

}

