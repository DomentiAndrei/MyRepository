package HomeW.Tests;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;

public class Invite_new_User extends BaseClass {

	@Test(priority = 7)//(enabled = false)
	public void InvUser() throws Exception { 
		
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
		
		WebElement hov = driver.findElement(By.xpath("//li[@id='menu-users']"));
		Actions act = new Actions(driver);
		act.moveToElement(hov).build().perform();
		log.info("Opened Administration tab Friends");
		WebDriverWait wait4 = new WebDriverWait(driver, 4);
		
		WebElement addUs = driver.findElement(By.xpath("//a[@href='users.php?page=wpcom-invite-users']"));
		wait4.until(ExpectedConditions.visibilityOfAllElements(addUs));
		addUs.click();
//		if(driver.getPageSource().contains("@innastici")) {
//			
//		}
//		driver.navigate().back();
		driver.findElement(By.xpath("//span[contains(text(),'Пригласить')]")).click();
		log.info("Opened new Page for adding new user");
		WebElement textAr = driver.findElement(By.xpath("//div[@class='token-field__input-container']")); 
		
		textAr.sendKeys("inna.stici@gmail.com");
//		WebElement read = driver.findElement(By.xpath("//option[@value='contributor']"));
//		log.info("Element selected: "+  read.isDisplayed());
//		log.info("Email Introduced");
		
		WebElement message =driver.findElement(By.xpath("//textarea[@id='message']"));
		message.sendKeys("I would like to intive you ...");
		
		WebElement submit1 = driver.findElement(By.xpath("//button[@type='submit']"));
		log.info(submit1.getText() + " Invitation was sent");
		submit1.click();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
//		WebElement display = driver.findElement(By.xpath("//div[@style='margin-left:30px']"));
//		System.out.println("Element is Display: " + display.isDisplayed());
//		log.info(display.isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
