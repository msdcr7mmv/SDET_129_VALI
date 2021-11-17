package TestNGPractice;

import java.util.Date;

import org.testng.annotations.Test;

public class GetDate 
{
	@Test
	public void getDate()
	{
		new Date().toString().replace(" ", "_").replace(":", "_");
	}
}
