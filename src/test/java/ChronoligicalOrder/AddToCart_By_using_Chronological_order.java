package ChronoligicalOrder;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCart_By_using_Chronological_order {
	WebDriver driver;
	@BeforeClass
	public void PreCondition() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");

	}
	@BeforeMethod
	public void Login() {
		driver.findElement(By.className("ico-login"));
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
	@Test
	public void addTocart() {
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.className("ico-logout")).click();
	}
	@AfterClass
	public void postCondition() {
		driver.quit();
	}

}
