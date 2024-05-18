package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://website.informer.com/");
		driver.navigate().to("https://www.redbus.in/");
		driver.navigate().back();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver .close();
		

	}

}
