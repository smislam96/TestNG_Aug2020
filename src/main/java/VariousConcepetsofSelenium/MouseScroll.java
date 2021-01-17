package VariousConcepetsofSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScroll {

	WebDriver driver;
	@Before
		public void launchBrowser() {
			// Setting Properties
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver87.exe");
			// Creating Object for Chrome Driver
			driver = new ChromeDriver();
			// Navigating to the Website
			driver.get("https://www.techfios.com/billing/?ng=admin/");
			driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			// Using Implicitly wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
		public void loginTest() throws InterruptedException {
			//[structure of any input is = Variable type--Variable name = Value. EX: int x = 4; or String asd = "asdfas";
			
			//Storing WebElement or 
			//Element Library
		
				
			WebElement USERNAME_FIELD = driver.findElement(By.xpath("//input[@id='username']"));
			WebElement PASSWORD_FIELD = driver.findElement(By.xpath("//input[@id='password']"));
		
			
			USERNAME_FIELD.sendKeys("demo@techfios.com");
			PASSWORD_FIELD.sendKeys("abc123");
			
			//Keyboard event
			Actions act = new Actions(driver);
			act.sendKeys(Keys.RETURN).build().perform();
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;			
			js.executeScript("scroll(0,5000)");
			
			
			
		}
	
	
	
	
	
}
