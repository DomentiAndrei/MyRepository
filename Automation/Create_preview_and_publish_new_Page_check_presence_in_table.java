package HomeW.Tests;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;


public class Create_preview_and_publish_new_Page_check_presence_in_table  extends BaseClass{
	@Test(priority = 6)
	public  void preview() throws Exception{
		
PropertyConfigurator.configure("C:\\Users\\Andrei\\eclipse-workspace\\Selenium\\src\\main\\java\\HomeW\\Log4j.properties");
		//String b = "Busea ";
		System.out.println("Page title is: " + driver.getTitle().toLowerCase()/*.startsWith("love")*/);
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
		//hover
		WebElement pages = driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Страницы')]"));
		Actions action = new Actions(driver);
		action.moveToElement(pages).build().perform();
		WebDriverWait waiting = new WebDriverWait(driver, 5);
		waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='post-new.php?post_type=page']")));
		driver.findElement(By.xpath("//a[@href='post-new.php?post_type=page']")).click();
		//hover
		WebElement title = driver.findElement(By.xpath("//input[@id='title']"));
		title.sendKeys("My new Page");
		log.info("Titele Introduced");
		//Introduce in field textArea next....
		driver.findElement(By.xpath("//iframe[@id='content_ifr']")).sendKeys("I love life");
		log.info("Text Introduced");
	
		//move to following tab
		
		String parentHandle = driver.getWindowHandle(); 
	    System.out.println(parentHandle);
		driver.findElement(By.xpath("//a[@id='post-preview']")).sendKeys(Keys.CONTROL +"t");
		log.info("Has been opened new tab");
		driver.findElement(By.xpath("//a[@id='post-preview']")).click();
		
		Thread.sleep(3000);
		
		for (String child : driver.getWindowHandles()) {
			if(!child.equals(parentHandle)) {
				driver.switchTo().window(parentHandle);
				System.out.println(child);
			}
		}
		
		log.info("Moved back to parent page");
		
		
		
		WebElement displayTitle = driver.findElement(By.xpath("//input[@id='title']"));
		WebDriverWait  wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOf(displayTitle));
//		
		log.info(displayTitle.isDisplayed() +  " Element Is Display");
		log.info(driver.findElement(By.xpath("//input[@id='title']")).getText());
		driver.findElement(By.xpath("//input[@id='publish']")).click();
		
		
		
		
		
		
		
	}
}
