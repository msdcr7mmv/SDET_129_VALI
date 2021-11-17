package com.vtiger.genericutil;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;


public class PropertyFileUtility 
{

/**
 * This class is used to read data from Property file
 * @author MAHABOOBVALI
 *
 */

	
	@Test


	public String propertyFileUtility(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstant.PROPERTYFILEPATH);
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

}

