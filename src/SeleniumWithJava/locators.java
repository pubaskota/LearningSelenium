package SeleniumWithJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver","\Users\bashudevbaskota\Documents\SeleniumWebDriver\chromedriver");
		ChromeDriver driver= new ChromeDriver();

		// https://www.selenium.dev/documentation/webdriver/elements/locators/
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// id 
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		
		//name
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		
		// className
		//driver.findElement(By.className("input_error")).sendKeys("standard_user");
		
		
		//tagName
		//driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		
		//Css selector
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		
		// Xpath
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		
		
		//linkText 
		
		//driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		//driver.findElement(By.linkText("Overview")).click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Getting")).click();
		
		driver.manage().window().maximize();
		driver.close();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
