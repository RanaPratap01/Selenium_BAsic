package BasicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13ShoppingCart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String given_url = "https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		String given_title="Demo Web Shop. Digital downloads";
		String url = driver.getCurrentUrl();
		if(given_url.equals(url)) {
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			String current_Title = driver.getTitle();
			if(current_Title.equals(given_title)) {
				// items added to cart
				List<WebElement> ele = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				for(WebElement webEle:ele) {
					webEle.click();
					Thread.sleep(2000);
				}
				// click on Shopping cart link
				driver.findElement(By.linkText("Shopping cart")).click();
				// validating Shopping cart Text is Displayed
				if(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1")).isDisplayed())
				{
					System.out.println("Shopping cart Page is  Displayed");
					List<WebElement> remove_checkboxs = driver.findElements(By.cssSelector("input[name='removefromcart']"));
					// for clicking remove Checkbox 
					for(WebElement remove_chkb:remove_checkboxs) {
						remove_chkb.click();
						Thread.sleep(2000);
					}
					
				// for click on update cart link
					driver.findElement(By.name("updatecart")).click();
				// validating 
					if(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div[2]/div[1]/h1")).isDisplayed())
					{
					System.out.println("PASS");
					}
				}else
				{
					System.err.println("Shopping cart Page is not Displayed");	
				}
				
			}
			else
			{
				System.err.println("Title doesnot Matched");
			}
			
		}
			
		else {
			System.err.println("URL is not matching");
		}
		 driver.quit();
		
	}

}
