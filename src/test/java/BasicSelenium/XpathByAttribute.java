package BasicSelenium;

import org.openqa.selenium.By;

import Utility.BrowserUtility;
import Utility.SeleniumUtility;


public class XpathByAttribute {
public static void main(String[] args) {
	BrowserUtility bu=new BrowserUtility();
	SeleniumUtility su=new SeleniumUtility();
	 bu.OpenChromeBrowser();
	 su.MaximizeBrowser();;
	 su.implicitWait();
	 bu.driver.get("https://demowebshop.tricentis.com/");
	 bu.driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	 bu.driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin02@gmail.com");
	 bu.driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Admin02");
	 bu.driver.findElement(By.xpath("//*[@id='RememberMe']")).click();
	 bu.driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
}
}
