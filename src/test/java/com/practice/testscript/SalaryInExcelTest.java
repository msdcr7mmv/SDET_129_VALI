package com.practice.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class SalaryInExcelTest 
{
	@Test
public void salaryInExcelTest() throws Throwable 
{
FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
Workbook workbook1 = WorkbookFactory.create(fis);
int lastrow = workbook1.getSheet("Sheet2").getLastRowNum();
for(int i=1;i<=lastrow;i++)
	
{
	String salaryemp = workbook1.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
	if(Integer.parseInt(salaryemp)>50000)
{
System.out.println( workbook1.getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue()+" "+salaryemp);
}
}

}
}
