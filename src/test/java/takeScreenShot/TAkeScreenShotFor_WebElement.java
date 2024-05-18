package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TAkeScreenShotFor_WebElement {
	@Test
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.demowebshop.tricentis");
	WebElement logo = driver.findElement(By.className("header"));
	LocalDateTime time = LocalDateTime.now();
	String date = time.toString().replace(":","-");
	File from = logo.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\Users\\ranap\\OneDrive\\Pictures\\Screenshots"+date+".png");
	FileHandler.copy(from, to);
}
}
