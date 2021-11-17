package MY_PROG;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;
@Test
public class VerifyTheTableTest 
{
public void verifyThetableTest() throws Throwable
{
	String expectedData="sharif";
	//register the database
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		//connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		//create statement
		Statement stmt = con.createStatement();
		//execute my query
		ResultSet res=stmt.executeQuery("select firstname from students_info where firstname='vali';");
		boolean flag=false;
		while(res.next())
		{
			String actualData = res.getString(1);
			if(actualData.equals(expectedData))
			{
				System.out.println(expectedData+" is present");
				flag=true;
				break;
			}
			else
			{
				System.out.println(expectedData+" is not present");
			}
		}
		//Assert.assertEquals(flag, true);
		//con.close();
}
}
