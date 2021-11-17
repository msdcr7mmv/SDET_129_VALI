package MY_PROG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

@Test
public class ExecuteQueryTest 
{
public void executeQueryTest() throws Throwable
{
	//register the database
	Driver dref=new Driver();
	DriverManager.registerDriver(dref);
	//connect to database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	//create statement
	Statement stmt = con.createStatement();
	//execute my query
	ResultSet res=stmt.executeQuery("select * from students_info;");
	while(res.next())
	{
		System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
	}
	
	// Close the Connection
	con.close();
}


}
