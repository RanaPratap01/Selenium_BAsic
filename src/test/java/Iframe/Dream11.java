package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11 {
	public static void main(String[] args) {
		ChromeOptions chrome_option=new ChromeOptions();
		chrome_option.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(chrome_option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		//move controller to inside frame
		
	//	driver.switchTo().frame(0);        // by using index moving into frame
		
		//driver.switchTo().frame("send-sms-iframe");    ///  by using id move to frame
		
		WebElement iframe = driver.findElement(By.className("send-sms-iframe"));
		//switch controller to frame by using webElement 
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("8120808786");
		
		//switch to parent frame
		driver.switchTo().parentFrame();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hamburger']")));
		driver.findElement(By.xpath("//div[@id='hamberger']")).click();
		
	}

}
