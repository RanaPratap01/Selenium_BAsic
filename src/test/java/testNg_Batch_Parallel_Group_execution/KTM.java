package testNg_Batch_Parallel_Group_execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM {
	@Test
	public void ktmBike() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Browser open",true);
		driver.manage().window().maximize();
		Reporter.log("Maximize Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("Wait Is added",true);
		driver.get("https://www.ktmindia.com/");
		Reporter.log("ktmBike is Opened",true);
	     driver.close();
	     Reporter.log("Browser Closed", true);
	}

}
