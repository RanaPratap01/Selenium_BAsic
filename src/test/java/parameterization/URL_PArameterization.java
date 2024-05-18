package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class URL_PArameterization {
	@Parameters("URL")
@Test      ///  @test annotation means TEst case1
public void DWS(String dwsURL) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(dwsURL);
	driver.close();
}
	@Parameters("URL")
@Test      ///  @test annotation means TEst case2
public void DWS1(String dwsURL) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(dwsURL);
	driver.close();
}
	@Parameters("URL")
@Test      ///  @test annotation means TEst case3
public void DWS2(String dwsURL) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(dwsURL);
	driver.close();
}
}
