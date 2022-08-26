package mySeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) {
		
		
		
		WebDriver driver;

		
		driver = new ChromeDriver();

		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/alerts");
		
		
		// first alert
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.id("alertButton")).click();
		String Text = driver.switchTo().alert().getText();
		System.out.println("this is alert text from first alert : " + Text);
		driver.switchTo().alert().accept();
		System.out.println("executed successfully");
		//driver.switchTo().defaultContent();
		
		
		// second alert
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("timerAlertButton")).click();
	    // adding explictly wait command to wait until alert is present 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.alertIsPresent());
	 
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String SecondAlertText = driver.switchTo().alert().getText();
		System.out.println("This is second text alert : " + SecondAlertText);
		driver.switchTo().alert().accept();
		System.out.println("executed second alert successfully");
		
	
		// third alert
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("confirmButton")).click();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String ThirdAlertText = driver.switchTo().alert().getText();
		System.out.println("this is third alert text : " + ThirdAlertText);
		driver.switchTo().alert().accept();
		System.out.println("executed Third alert successfully");
	}

}
