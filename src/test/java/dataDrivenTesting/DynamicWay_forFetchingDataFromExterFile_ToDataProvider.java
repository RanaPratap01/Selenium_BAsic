package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg.BaseClass;

public class DynamicWay_forFetchingDataFromExterFile_ToDataProvider extends BaseClass{ 
	
	@DataProvider(name="loginTestData")
	public Object[][] DataProviderSenderDynamically() throws EncryptedDocumentException, IOException{
		
		File file = new File("C:\\Users\\ranap\\OneDrive\\Desktop\\DWS_login.xlsx");
		FileInputStream fis = new FileInputStream(file);  //for enstabllising connection bet eclipse and excel file
		Workbook wbf = WorkbookFactory.create(fis);   //for fetching data from excel 
		Sheet sheet = wbf.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();     //return tot. no .of rows
		 int column = sheet.getRow(0).getPhysicalNumberOfCells();   //return total no. of columns
		System.out.println(row);
		System.out.println(column);
		Object[][] obj= new Object[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
			
		}
		return obj;	
	}
	@Test(dataProvider = "loginTestData")
	public void LoginTest(String email,String password) {		
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
