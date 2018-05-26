package HomeW.Tests;

import java.time.LocalDateTime;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;

public class CreatePublishnewPost extends BaseClass {
	@Test(priority = 2)
	public void NewPost() throws Exception {

		PropertyConfigurator
				.configure("C:\\Users\\Andrei\\eclipse-workspace\\Selenium\\src\\main\\java\\HomeW\\Log4j.properties");

//		LogInWP lp = new LogInWP(driver);
//		lp.testLogIn("DomAndy.92@mail.ru", "qatesting!");
		
		log.info("Browser Opened");
		WebElement userName = driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
		userName.clear();
		userName.sendKeys("DomAndy.92@mail.ru");
		log.info("E-mail introduced");
		WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));
		continu.click();
		// Thread.sleep(2000);

		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(passWord));

		passWord.sendKeys("qatesting");

		log.info("Password introduced");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		log.info("User Entered");
		//     Hover ///
		WebElement we = driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Записи')]"));
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
		WebDriverWait waitt = new WebDriverWait(driver, 5);
		waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='post-new.php']")));
		driver.findElement(By.xpath("//a[@href='post-new.php']")).click();
		//	   Hover ///

//		WebElement AllRecords = driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Записи')]"));
//		AllRecords.click();
//		WebElement addNew = driver.findElement(By.xpath("//a[@href='https://qatesting512.wordpress.com/wp-admin/post-new.php']"));
//		addNew.click();

		WebElement header = driver.findElement(By.xpath("//input[@id='title']"));
		header.sendKeys("Busea does sport");

		WebElement enterData = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]"));
		enterData.sendKeys(" Beautiful Country ");
		
		
		WebElement ButSave = driver.findElement(By.xpath("//input[@id='save-post']"));
		ButSave.click();
		
//		WebElement move = driver.findElement(By.xpath("//li[@id='wp-admin-bar-jumptotop-button-menu']//a[@class='ab-item']"));
//		Actions mAc = new Actions(driver);
//		mAc.moveToElement(move).build().perform();
//		move.click();
//		
//		WebDriverWait waiit = new WebDriverWait(driver, 10);
//		waiit.until(ExpectedConditions.visibilityOfAllElements(ButSave));
//		ButSave.click();
		log.info("New post has been saved and added in list");
		
		WebElement gotoAllR = driver.findElement(By.xpath("//a[@href='edit.php'][contains(text(),'Все записи')]"));
		gotoAllR.click();
		log.info("Return to All Posts");

		
		
		WebElement display = driver.findElement(By.xpath("//th[@id='categories']"));
		// LocalDateTime date = LocalDateTime.now();
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(display));

		//if (display.isDisplayed()) {
			log.info(display.isDisplayed() + " Element is Visible");
		//}

	}
}
