package SeleniumWithJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonCheckBox {
	

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		// Arrangement

		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropd = driver.findElement(By.id("dropdowm-menu-2"));
		Select select = new Select(dropd);
		select.selectByIndex(1);
		select.selectByValue("junit");
		select.selectByVisibleText("Maven");

		WebElement checkBox= driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
		checkBox.click();
		
	    // CheckBox
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> checkBoxAll = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for (int j = 0; j< checkBoxAll.size(); j ++) {
			System.out.println(j);
			
		    if (!checkBoxAll.get(j).isSelected()){
			checkBoxAll.get(j).click();
		
		
		// Radio buttons
		
		driver.findElement(By.cssSelector("input[value=\"green\"]")).click();
		
		if(driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected()){
			System.out.println("Green Radio button selected");
		}
		
		 //Click on every radio button	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> button = driver.findElements(By.xpath("//*[@type='radio']"));
		for (int i = 0; i < button.size(); i++) {
			if (!button.get(i).isSelected()) {
				button.get(i).click();
				System.out.println("all radio button selected");
			}

		}
		
		driver.quit();

	}

}
}
}