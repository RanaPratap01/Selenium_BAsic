package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ByUsingChromeOptionsDisabledNotification {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions chrome_option=new ChromeOptions();
	chrome_option.addArguments("--disable-notification");
	WebDriver driver=new ChromeDriver(chrome_option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.get("https://redbus.in/");
	Actions action=new Actions(driver);
	driver.findElement(By.id("src")).sendKeys("Banglore");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Banglore']")));
	action.keyDown(Keys.ENTER).build().perform();
	driver.findElement(By.id("dest")).sendKeys("Chennai");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
	action.keyDown(Keys.ENTER).build().perform();
	driver.findElement(By.cssSelector("div[class='lableCalendarContainer']")).click();
	driver.findElement(By.xpath("//span[text()='20']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("search_button")).click();
}
}
 