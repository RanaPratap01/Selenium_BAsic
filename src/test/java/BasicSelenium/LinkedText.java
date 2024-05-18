package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedText {
public static void main(String[] args) {
	String givenURL= "https://demowebshop.tricentis.com/";
	String givenTitle="Demo Web Shop. Login";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	 String currentURL=driver.getCurrentUrl();
	 if(givenURL.equals(currentURL)) {
		 System.out.println("Successfully Entered");
		 driver.findElement(By.linkText("Log in")).click();
		 String currentTitle=driver.getTitle();
		 if(givenTitle.equals(currentTitle)) 
		 {
			 System.out.println("You are In Login Page");
			
		 }
		 else {
			 System.out.println("You are not in Login Page");
		 }
		 
	 }
	 else {
		 System.out.println("Not successfully entered");
	 }
	 driver.quit();
}
}
