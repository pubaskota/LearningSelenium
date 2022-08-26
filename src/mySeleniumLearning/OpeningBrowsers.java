package mySeleniumLearning;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class OpeningBrowsers {
	
	// declaring Web driver 
	public static WebDriver driver;
	
	// Separating locators from code 
	By USERNAME = By.id("txtUserName");
	By PASSWORD = By.id("txtPasswd");
	By CAPTCHA = By.id("txtCaptcha");
	By SIGNIN = By.id("imgbtnSignin");
	
	
	
	@BeforeMethod
	public static void openingBrowser() {
		driver = new ChromeDriver();		
		driver.get("https://www.justrechargeit.com/SignIn.aspx ");
		driver.manage().window().maximize();	
	}
	
	
	@Test
	public  void testGoogle() {
		driver.findElement(USERNAME).sendKeys("pubaskota@gmail.com");
		driver.findElement(PASSWORD).sendKeys("java123");
		driver.findElement(PASSWORD).sendKeys("94");
		driver.findElement(SIGNIN).click();
		
	}

	
	
	//@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
	
}
