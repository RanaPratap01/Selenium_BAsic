package BasicSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions action = new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		action.moveToElement(twitter).keyUp(Keys.SHIFT).click().build().perform();
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		//child.remove(parent);
		for (String str : child) {
			driver.switchTo().window(str);
			System.out.println(driver.getCurrentUrl());
			if(driver.getCurrentUrl().contains("twitter")) {
				System.out.println("Script is successful");
				driver.close();
			}
			driver.switchTo().window(parent);
			driver.close();
		}
		
		
	}

}
