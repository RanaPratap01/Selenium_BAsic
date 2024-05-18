package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateBetweenTwoWebPage {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.redbus.in/");
Thread.sleep(5000);
driver.navigate().to("https://demowebshop.tricentis.com/");
driver.navigate().back();
Thread.sleep(5000);
System.out.println(driver.getCurrentUrl());
driver.navigate().forward();
Thread.sleep(5000);
System.out.println(driver.getCurrentUrl());
Thread.sleep(5000);
driver.navigate().refresh();
driver.close();



	}

}
