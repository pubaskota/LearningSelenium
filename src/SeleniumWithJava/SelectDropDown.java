package SeleniumWithJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeDriver driver= new ChromeDriver(); 
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropd = driver.findElement(By.id("dropdowm-menu-1"));
		// Class ---- object ---- properties and methods
		Select select = new Select(dropd);
		
		// selectByIndex
		//select.selectByIndex(2);
		
		//selectByText
		select.selectByVisibleText("SQL");
		
		//selectByValue
		select.selectByValue("c#");
		
		
		// click on element 
		
		// testing ---- actual vs expected -----
		
		// arrangement  --- different --- local , staging , canary, production
		// action 
		// assertion
		
		


	}
}