package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinlText {

	public static void main(String arg[]) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	String given_url="https://demowebshop.tricentis.com/";
	String given_Title="Demo Web Shop. Login";
	driver.get("https://demowebshop.tricentis.com/");
	String current_url=driver.getCurrentUrl();
	 if (given_url.equals(current_url)) {	 
	driver.findElement(By.linkText("Log in")).click();
	String current_Title= driver.getTitle();
	if(current_Title.equals(given_Title)) {
		System.out.println("Title matched");
		
		driver.close();
	}
	
	 }else
	 {
		 System.err.println("Title is not matching");
	 }
}
}
