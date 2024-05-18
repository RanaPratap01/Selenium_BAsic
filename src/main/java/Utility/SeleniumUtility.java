package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class SeleniumUtility {
	
	public static WebDriver driver;
	public static String baseUrl="https://demowebshop.tricentis.com/";
	 
	//To maximize
	public static void MaximizeBrowser() {
		driver.manage().window().maximize();
	}
	 
		//To minimize
		public static void MinimizeBrowser() {
			driver.manage().window().minimize();
		}
     //to implicit wait
		public  static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
}
