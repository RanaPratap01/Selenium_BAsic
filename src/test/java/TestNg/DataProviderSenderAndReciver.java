package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSenderAndReciver extends BaseClass {
	
	@DataProvider(name="login")
	public Object[][] dataSender(){
		Object[][] obj=new Object[2][2];
		obj[0][0]="admin01@gmail.com";
		obj[0][1]="Admin";
		obj[1][0]="admin02@gmail.com";
		obj[1][1]="Admin02";
		return obj;
		
	}
	
	@Test(dataProvider = "login")
	public void reciver(String email,String password) {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
