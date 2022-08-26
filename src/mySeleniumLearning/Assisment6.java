package mySeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assisment6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		// Open Chrome Browser
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://www.justrechargeit.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("jriTop_signin9")).click();
		
		driver.findElement(By.id("txtUserName")).sendKeys("pu@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("txt123");
		
		// refresh page
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		
		// go back window
		driver.navigate().back();
		Thread.sleep(5000);
		
		// go to next page by using forward icon
		driver.navigate().forward();
		Thread.sleep(5000);
		
		
		// quit the page
		driver.quit();
		
		
		
		

	}

}
