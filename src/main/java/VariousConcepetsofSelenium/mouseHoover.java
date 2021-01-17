package VariousConcepetsofSelenium;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoover {

	WebDriver driver;

	@Before
	public void LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver87.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// Using Implicitly wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}
	
	@Test
	public void loginTest() {
		
		WebElement PRODUCT_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1\"]"));
		WebElement MONITR_MENU_LOCATOR = driver.findElement(By.xpath("//*[@id=\"l1_6\"]/span"));
		WebElement MONITOR_FOR_HOME = driver.findElement(By.xpath("//*[@id=\"dell-masthead\"]/div[3]/nav/ul/li[1]/ul/li[9]/ul/li[1]/a/img"));		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(PRODUCT_MENU_LOCATOR).build().perform();
		action.moveToElement(MONITR_MENU_LOCATOR).build().perform();
		MONITOR_FOR_HOME.click();
		
		String PageConf = driver.findElement(By.xpath("//*[@id=\"page-title\"]/div/div/h1/span")).getText();
		System.out.println(PageConf);
		
		
	}
	
	
	
	}
	
	
	
