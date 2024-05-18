package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpliciteWait {
	public static void main(String[] args) {
		//To open chromeBrowser
		WebDriver driver=new ChromeDriver();
		//to maximize Browser
		driver.manage().window().maximize();
		// For Implicitewait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		///  ExpliciteWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='deopbtn']")).click();
		WebElement faceBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		faceBook.click();
	}

}
