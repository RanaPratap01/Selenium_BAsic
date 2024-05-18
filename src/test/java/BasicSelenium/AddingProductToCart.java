package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingProductToCart {
public static void main(String[] args) throws InterruptedException {

	String baseURL="https://demowebshop.tricentis.com/";
	//String searchTitlePage="Demo Web Shop. Login";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	if (baseURL.equals(driver.getCurrentUrl())) {
		System.out.println("You are in DemoWeb Page");
		driver.findElement(By.linkText("Digital downloads")).click();
		if(driver.findElement(By.cssSelector("div[class='page-title']")).isDisplayed()) {
		System.out.println("You are in Digital DownLoad page");
		List<WebElement> digitalDownloadProducts = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		// to add digitaldownloadProduct to cart
		for (WebElement web : digitalDownloadProducts) {
			web.click();
			Thread.sleep(2000);
		    }
		driver.findElement(By.cssSelector(".cart-label")).click();
		WebElement Shopping_cart = driver.findElement(By.cssSelector("div[class='page-title']"));
		if(Shopping_cart.isDisplayed()) {
			System.out.println("You are in Shopping Cart Page");
			// for checking the checkbox
			List<WebElement> remove_checkBoxs = driver.findElements(By.cssSelector("input[type='checkbox']"));
	          remove_checkBoxs.remove(remove_checkBoxs.size()-1); // this will remove the element from List for which we pass the INdex i.e, 4th element removed
			for (WebElement cb : remove_checkBoxs) {
	    	   cb.click();
		}
			//for removing the product from cart
	       driver.findElement(By.cssSelector(".button-2.update-cart-button")).click();
		}
		else {
			System.err.println("You are not in Shopping cart Page");
		}
		}
		else {
			System.err.println("You are not in Digital downLoad page");
		}
		
    }
	else {
		System.err.println("You are not in Demo web page");
	}
 driver.quit();

	}

}