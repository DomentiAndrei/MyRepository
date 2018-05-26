package HomeW.Tests;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;

public class CreateaPublishnewPage extends BaseClass{
	@Test(priority = 3)
	public void page () throws Exception {
		
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
		
		//Introduce in field textArea next....
		driver.findElement(By.xpath("//iframe[@id='content_ifr']")).sendKeys("I like life");
		driver.findElement(By.xpath("//input[@id='save-post']")).click();
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		//log.info(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//h1[@class='wp-heading-inline']")).click();
		driver.findElement(By.xpath("//a[@href='edit.php?post_type=page'][contains(text(),'Все страницы')]")).click();
		//driver.navigate().to("https://qatesting512.wordpress.com/wp-admin/edit.php?post_type=page");
		
		
		log.info(driver.findElement(By.xpath("//h1[@class='wp-heading-inline']")).getText());
		WebElement pagess = driver.findElement(By.xpath("//h1[@class='wp-heading-inline']"));
		if (pagess.isDisplayed()) {
			System.out.println(" Displayes");
		}else {
			System.out.println(" Not display");
		}
		
		
		
		
		
		
		
	}
	
	
}
