package VariousConcepetsofSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopUp {
	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {
		// Setting Properties
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver87.exe");
		// Creating Object for Chrome Driver
		driver = new ChromeDriver();
		// Navigating to the Website
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();
		// Using Implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(2000);
		String alertMsg =driver.switchTo().alert().getText();
		System.out.println(alertMsg);
		driver.switchTo().alert().accept();
		
		
		
	//	driver.close();
	}
	
	
	
	
	
}
