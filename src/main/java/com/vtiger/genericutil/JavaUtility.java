package com.vtiger.genericutil;

import java.util.Random;

import org.junit.Test;

public class JavaUtility 
{
	/**
	 * This class to generate random number
	 * @author MAHABOOBVALI
	 *
	 */
			/**
		 * this method will return a random number
		 * @return
		 */
		@Test
		public static int generateRandomNumber()
		{
			Random r=new Random();
			int number = r.nextInt(1000);
			return number;
		}

	}

