package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IndependentAndDependentXpath {
public static void main(String[] args)  {
	String given_Tittle = "Demo Web Shop";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	String current_Tittle=driver.getTitle();
	if(given_Tittle.equals(current_Tittle)) {
		System.out.println("Tittle Matched");
		List<WebElement> product_items = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li/a"));
	    for (WebElement prod : product_items) {
	    	
	    	//System.out.println(prod.getText());
	    	if(prod.getText().equalsIgnoreCase("DIGITAL DOWNLOADS")) {
	    		prod.click();
	    		String Actual_price = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]//parent::h2//parent::div//child::div[3]//child::div[1]/span")).getText();
	    		System.out.println(Actual_price);
	    	}
	    	/* else {
	    		System.err.println("DIGITAL DOWNLOADS not Found");
	    	}
	    */
		}
	}
	else {
		System.err.println("Tittle does not matched");
	}
driver.close();	
}

}
