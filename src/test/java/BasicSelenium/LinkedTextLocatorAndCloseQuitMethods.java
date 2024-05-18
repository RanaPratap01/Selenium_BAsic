package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextLocatorAndCloseQuitMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Twitter")).click();
		driver.close();  /// it will close the parent window
		// driver.quit();     //it will close all the open windows parents as well as child windows
		
		
	}

}
