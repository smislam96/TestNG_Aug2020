package VariousConcepetsofSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws InterruptedException {
		// Setting Properties
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver87.exe");
		// Creating Object for Chrome Driver
		driver = new ChromeDriver();
		// Navigating to the Website
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().deleteAllCookies();
		// driver.manage().window().maximize();
		// Using Implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Switching to iFrame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.applet")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AppletContext")).click();
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		String titleApletContext= driver.findElement(By.xpath("/html/body/div[3]/h2")).getText();
		System.out.println(titleApletContext);
		
		Assert.assertEquals("Wrong page!!", "Interface AppletContexte", titleApletContext);
		
		
	
	
	}
	
	
	
}
