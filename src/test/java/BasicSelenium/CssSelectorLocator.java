package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
public static void main(String[] args) throws InterruptedException {
	String baseURL="https://demowebshop.tricentis.com/";
	String searchTitlePage="Demo Web Shop. Login";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String currentURL=driver.getCurrentUrl();
	if (baseURL.equals(currentURL)) {
		System.out.println("You are in DemoWebShop Page");
		driver.findElement(By.cssSelector(".ico-login")).click();
		String currentTitle=driver.getTitle();
		if(searchTitlePage.equals(currentTitle)) {
          System.out.println("You are Login Page");
          driver.findElement(By.cssSelector("#Email")).sendKeys("admin02@gmail.com");
          Thread.sleep(1000);
          driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Admin02");
          Thread.sleep(1000);
          driver.findElement(By.cssSelector("#RememberMe")).click();
          Thread.sleep(1000);
          driver.findElement(By.cssSelector(".button-1.login-button")).click();
          Thread.sleep(1000);
         List<WebElement> community_pool = driver.findElements(By.cssSelector("input[type='radio']"));
            for(WebElement web:community_pool) {
            	 web.click();
            	 Thread.sleep(1000);
            	
            }
         
		}
		else {
			System.err.println("You are not in Login Page ");
		}
	}
	else
	{
		System.err.println("You are in  not in DemoWebShop Page");
	}
  driver.close();
}
}
