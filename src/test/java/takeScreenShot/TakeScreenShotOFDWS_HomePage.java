package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOFDWS_HomePage {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.demowebshop.tricentis");
	LocalDateTime time = LocalDateTime.now();
    String date = time.toString().replace(":","-");
	TakesScreenshot ts = (TakesScreenshot)driver;    //downcasting
	 File from = ts.getScreenshotAs(OutputType.FILE);
	 File to=new File("C:/Users/ranap/OneDrive/Pictures/Screenshots/"+date+"DWS.png");
	 FileHandler.copy(from, to);
}
}
