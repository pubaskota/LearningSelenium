package mySeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assisment5 {

	public static void main(String[] args) {
		
		

		WebDriver driver;

		// Open Chrome Browser
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//drop down 
		
		Select speed = new Select (driver.findElement(By.id("speed")));
		speed.selectByVisibleText("Medium");
		
		Select file = new Select (driver.findElement(By.id("files")));
		file.selectByVisibleText("PDF file");
		
		Select number = new Select (driver.findElement(By.id("number")));
		number.selectByVisibleText("5");
		
		Select product = new Select (driver.findElement(By.id("products")));
		product.selectByVisibleText("Iphone");
		
		Select animal = new Select (driver.findElement(By.id("animals")));
		animal.selectByVisibleText("Avatar");
		
		
		
		
	}

}
