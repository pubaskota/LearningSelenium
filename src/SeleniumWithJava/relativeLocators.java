package SeleniumWithJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class relativeLocators {

	public static void main(String[] args)  throws InterruptedException {
		
		
		
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Below
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("password"))).click();
		
		
		
		//Above
		WebElement a = driver.findElement(RelativeLocator.with(By.tagName("div")).above(By.className("inventory_item_desc")));
		System.out.println(a.getText());
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// ToRightOf
		driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(By.className("inventory_item_price"))).click();
		
		
        // ToLeftOf
		driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(By.className("inventory_item_price"))).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Near
		driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.className("app_logo"))).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// List
		List<WebElement> b = driver.findElements(By.tagName("button"));
		System.out.println(a.getSize());
		

		driver.quit();

	}

}
