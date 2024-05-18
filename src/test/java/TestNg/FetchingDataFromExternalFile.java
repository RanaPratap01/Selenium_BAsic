package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FetchingDataFromExternalFile extends BaseClass {
	@Test
	public void loginDWS() throws EncryptedDocumentException, IOException ,FileNotFoundException{
		
File	file=new File("C:\\Users\\ranap\\OneDrive\\Desktop\\DWS_login.xlsx");
FileInputStream fis=new FileInputStream(file);
Workbook wbf = WorkbookFactory.create(fis);
Sheet sheet = wbf.getSheet("Sheet1");
String email = sheet.getRow(0).getCell(0).toString();
String password = sheet.getRow(0).getCell(1).toString();

driver.findElement(By.id("Email")).sendKeys(email);
driver.findElement(By.id("Password")).sendKeys(password);
driver.findElement(By.id("RememberMe")).click();
driver.findElement(By.xpath("//input[@value='Log in']")).click();

}
}