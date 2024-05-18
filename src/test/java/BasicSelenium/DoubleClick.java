package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) {
	// open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	// implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    // enter into Guru99 
	driver.get("https://deml.guru99.com/test/simple_context_menu.html");
     // create Actions class
	Actions action=new Actions(driver);
	action.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).build().perform();
    try {
    	action.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).build().perform();
        System.err.println("My script is UnSuccessful");
	} catch (Exception e) {
		System.out.println("My script is successful");
	}
}
}
