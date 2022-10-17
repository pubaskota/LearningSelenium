package SeleniumWithJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String getTitle = driver.getTitle();
		System.out.println("The page title is  : " + getTitle);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//tagname[@attribute ='value']
		//Xpath=//td[text()='UserID']
		
	    //driver.findElement(By.xpath("//*[text()='Employee List']")).click();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[text()='Employee List']")).click();
	    driver.findElement(By.xpath("//*[text()='Add Employee']")).click();
	    driver.findElement(By.xpath("//*[text()='Reports']")).click();
	    
		
		

		
		
//			driver.navigate().back();
//			
//			driver.navigate().forward();
//			
//			driver.navigate().refresh();
//			
//			
//			
//			driver.close();
//			
//			driver.quit();
		

	}

}
