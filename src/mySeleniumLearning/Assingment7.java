package mySeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment7 {

	public static void main(String[] args) {
		
		
		WebDriver driver;

		// Open Chrome Browser
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys("");
	

	}

}
