package HomeW.Tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;
import junit.framework.Assert;

public class LogInWP extends BaseClass{
	

	@Test(priority = 1, alwaysRun = true)
	public void testLogIn() throws Exception {
		LogInWP name = new LogInWP();
		Class a = name.getClass();
		Class superClass = a.getSuperclass();
		System.out.println(superClass);
		
		//Logger log = LogManager.getLogger(LogInWP.class);
		PropertyConfigurator.configure("C:\\Users\\Andrei\\eclipse-workspace\\Selenium\\src\\main\\java\\HomeW\\Log4j.properties");
		
		log.info("Browser Opened");
		WebElement userName = driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
		userName.clear();
		userName.sendKeys("DomAndy.92@mail.ru");
		log.info("E-mail introduced");
		WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));
		continu.click();
		//Thread.sleep(2000);
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(passWord));
		//WebElement abc = (new WebDriverWait (driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("abc")));
		passWord.sendKeys("qatesting");
		
		log.info("Password introduced");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		log.info("User Entered");
//		WebElement display = driver.findElement(By.xpath("//h1[contains(text(),'Консоль')]"));
//		//Assert.assertTrue(true);
//		log.info(display);
//		if ( display.isDisplayed()) {
//			System.out.println("Yes");
//		}
		WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Консоль')]"));
		(new WebDriverWait(driver, 10))
		          .until(ExpectedConditions.visibilityOf(element));
		if ( element.isDisplayed()) {
			log.info(element.isDisplayed() + " Element Displayed");
			
			log.info(driver.findElement(By.xpath("//h1[contains(text(),'Консоль')]")).getText());
			
			WebElement stap1 = driver.findElement(By.id("wp-admin-bar-my-account"));
			stap1.click();
			WebElement stap2 = driver.findElement(By.xpath("//button[@class='ab-sign-out']"));
			stap2.click();
			System.out.println("Page title is: " + driver.getTitle());
		}
	}

		
		
	
}
