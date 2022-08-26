package mySeleniumLearning;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assisment4 {

	
	public static void main(String[] args) {
		
		
		WebDriver driver;

		// Open Chrome Browser
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@name='fName']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@name='lName']")).sendKeys("xyz");
		driver.findElement(By.id("indiMobile")).sendKeys("2187235667");
		
		
		// need date picker 
		//driver.findElement(By.id("regdob")).sendKeys("01/30/1999");
		
		driver.findElement(By.xpath("//*[@class='Female rdb_cnt']")).click();
		
		// address line 
		
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("1234 texas road");
		driver.findElement(By.xpath("//*[@name='cityS']")).sendKeys("Dallas");
		
		// Country drop down
		
		
		//WebElement element = driver.findElement(By.xpath("//*[@name='countryS']"));
		//Select country = new Select (element);
		//country.selectByVisibleText("United States");
		
		
		WebElement element = driver.findElement(By.xpath("//*[@name='countryS']"));
		Select country = new Select (element);
		country.selectByVisibleText("India");
		
		
		
		
		// State 
		
		driver.findElement(By.name("statesS")).sendKeys("TX");
		driver.findElement(By.name("zipCode")).sendKeys("75056");
		
		// photoId
		
		WebElement photo = driver.findElement(By.xpath("//*[@name='proofS']"));
		Select photoid = new Select (photo);
		photoid.selectByVisibleText("Driving License");
		
		// PhotoId card number
		
		driver.findElement(By.id("proofid")).sendKeys("D86754");
		driver.findElement(By.name("emailId")).sendKeys("pubaskota@gmail.com");
		
		// creat password
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Ab1234567$");
		driver.findElement(By.xpath("//*[@name='repassword']")).sendKeys("Ab1234567$");
		
		
		
		
		
		
		
		
		
		
		
	}

}
