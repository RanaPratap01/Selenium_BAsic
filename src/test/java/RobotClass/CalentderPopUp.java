package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.AddWebDriverSpecHeaders;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalentderPopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.agoda.com/");
		WebElement no_Thanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks")));
		no_Thanks.click();
		
	}

}
