package SeleniumWithJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentLocator1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");

		// get all the links of page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement webElement : allLinks) {
			System.out.println("the links are : " + webElement.getText() + "   " + webElement.getAttribute("href"));
		}

		// Women title isDisplayed() ?
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean womenTitle = driver.findElement(By.xpath("//*[text()='Women' and @class='sf-with-ul']")).isDisplayed();
		System.out.println(womenTitle);

		// dress title is displayed ?
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean dressTitle = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).isDisplayed();
		System.out.println(dressTitle);

		// T-shirts
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean tshirtsTitle = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"))
				.isDisplayed();
		System.out.println(tshirtsTitle);
		
		// get text
		WebElement a= driver.findElement(By.xpath("(//a[@class='product-name'])[9]")); 
		

		// getting picture size and color

		List<WebElement> images = driver.findElements(By.tagName("img"));
		for (WebElement webElement : images) {
			System.out.println("images on the webpages is : " + webElement.getText() + webElement.getAttribute("img"));

		}

		// get color of first image
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String image1 = driver.findElement(By.tagName("img")).getCssValue("color");
		System.out.println("the color of first image is : " + image1);

		// getSize()
		System.out.println("the size of the first image is :"
				+ driver.findElement(By.xpath("//*[@class='bx-viewport']")).getSize());

		// getLocation()
		System.out.println("the location of first image is :"
				+ driver.findElement(By.xpath("//*[@class='bx-viewport']")).getLocation());

		// get color of second image
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String ThreedaySaleImage = driver.findElement(By.tagName("img")).getCssValue("color");
		System.out.println("The color of second image is : " + ThreedaySaleImage);

		// getSize()
		System.out.println("the size of the 3daySaleImage is :"
				+ driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img")).getSize());

		// getLocation()
		System.out.println("the location of 3daySaleImage is :"
				+ driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[1]/a/img")).getLocation());

		// get color of onlyOnlineSummer image
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String onlyOnlineSummer = driver.findElement(By.tagName("img")).getCssValue("color");
		System.out.println("The color of onlyOnline Summer image is  : " + onlyOnlineSummer);

		// getSize()
		System.out.println("the size of the onlyOnlineSummerimage is :"
				+ driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[2]/a/img")).getSize());

		// getLocation()
		System.out.println("the location of onlyOnlineSummer image is :"
				+ driver.findElement(By.xpath("//*[@id=\"htmlcontent_top\"]/ul/li[2]/a/img")).getLocation());

		// adding shopping cart

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@alt='Faded Short Sleeve T-shirts'][1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@type='submit' and @name='Submit']")).click();

	}

}
