package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void precondition() {
		driver=new ChromeDriver();
		Reporter.log("ChromeBrowser Opened",true);
		driver.manage().window().maximize();
		Reporter.log("Maximize the Browser", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Wait statement added to each step", true);
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("DemoWeb Shop Opened", true);
	
	}
	
	 @AfterClass
	   public void postCondition() {
		driver.close();
		Reporter.log("Browser closed",true);
	   }

}
