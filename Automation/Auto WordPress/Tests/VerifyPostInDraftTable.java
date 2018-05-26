package HomeW.Tests;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;

public class VerifyPostInDraftTable  extends BaseClass{
	
	@Test(priority = 5)
	public void draftPost() throws Exception{
		
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
		
		
		WebElement hover = driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Записи')]"));
		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		WebDriverWait waitH = new WebDriverWait(driver, 4);
		waitH.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='post-new.php']")));
		WebElement clickk = driver.findElement(By.xpath("//a[@href='post-new.php']"));
		clickk.click();
		log.info("Opened window for adding new Post");
		
		WebElement posttitle = driver.findElement(By.xpath("//input[@id='title']"));
		posttitle.sendKeys("Create and move to draft Post, check presence in table");
		log.info("Title has been intoduced");
		
		WebElement postBody = driver.findElement(By.xpath("//iframe[@id='content_ifr']"));
		postBody.sendKeys("I've done");
		log.info("Post's body introduced");
		driver.findElement(By.xpath("//input[@id='save-post']")).click();
		log.info("Post saved");
		//go to draft
		driver.findElement(By.xpath("//a[@href='edit.php'][contains(text(),'Все записи')]")).click();
		log.info("Go back to All Records");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='edit.php?post_status=draft&post_type=post']")).click();
		log.info("Opened section Draft");
		//Display in draft
		WebElement fin = driver.findElement(By.xpath("//a[@href='edit.php?post_type=post&author=137158336']"));
		log.info(fin.isDisplayed());
		log.info(driver.findElement(By.xpath("//a[@class='row-title']")).getText());
		
		
		
	}
}
