package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {
	public static WebDriver driver;
	// to open ChromeBrowser
	public static void OpenChromeBrowser() {
		driver=new ChromeDriver();
	}
	// to open EdgeBrowser
		public static void OpenEdgeBrowser() {
			driver=new EdgeDriver();
		}
	// to open FireFoxBrowser
		public static void OpenFireFoxBrowser() {
			driver=new FirefoxDriver();
		}
	// to open ChromeBrowser
		public static void OpenSafari() {
			driver=new SafariDriver();
		}
	// close ChromeBrowser
		public static void CloseBrowser() {
			driver.close();
		}
}
