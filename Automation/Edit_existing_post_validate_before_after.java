package HomeW.Tests;

import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import HomeW.BaseT.BaseClass;

public class Edit_existing_post_validate_before_after extends BaseClass {

	@Test(priority = 4)
	public  void editPost() throws Exception{
		
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
		
		WebElement hover = driver.findElement(By.xpath("//li[@id='menu-posts']"));
		Actions actt = new Actions(driver);
		actt.moveToElement(hover).build().perform();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href='edit.php'][contains(text(),'Все записи')]")))).click();
		
		WebElement hover2 = driver.findElement(By.xpath("//tr[@id='post-374']//td[@class='title column-title has-row-actions column-primary page-title']"));
		actt.moveToElement(hover2).build().perform();
		wait2.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href='https://qatesting512.wordpress.com/?p=374&preview=true']")))).click();
		Thread.sleep(1500);
		if(driver.getPageSource().contains("Busea does sport")) {
			System.out.println("Present");
		}else {
			System.out.println("No Present");
		}
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Beautiful')]")).getText().matches("Beautiful"));
		if (driver.findElement(By.xpath("//p[contains(text(),'Beautiful')]")).getText().matches("Beautiful")) {
	    	System.out.println("Yes");
	    }else {
	    	System.out.println("No");
	    }
		driver.navigate().back();
		//Thread.sleep(2000);
		
													
		WebElement h = driver.findElement(By.xpath("//tr[@id='post-374']//td[@class='title column-title has-row-actions column-primary page-title']"));
		actt.moveToElement(h).build().perform();
		driver.findElement(By.xpath("//a[@href='https://qatesting512.wordpress.com/wp-admin/post.php?post=374&action=edit'][contains(text(),'Редактировать')]")).click();
		
			
		WebElement title = driver.findElement(By.xpath("//input[@id='title']"));
		title.clear();
		//title.sendKeys("Let's learn Java");
		WebElement body = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]"));
		Thread.sleep(1000);
		//body.clear();
		//body.sendKeys(" All in this time ");
		
		String firstPage = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@id='post-preview']")).click();
		
		for (String secPage : driver.getWindowHandles()) {
			driver.switchTo().window(secPage);
		}
		if(driver.getPageSource().contains("Let's learn Java")) {
			driver.switchTo().window(firstPage);
			System.out.println("Element present");
		}else {
			System.out.println("No present");
		}
		Thread.sleep(2000);
		
		
		
		
		
	}
}
