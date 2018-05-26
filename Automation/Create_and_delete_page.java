package HomeW.Tests;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import HomeW.LogIN;
import HomeW.BaseT.BaseClass;

public abstract class Create_and_delete_page extends BaseClass /*implements LogIN*/{

	@Test//(priority = 8)
	public void Create_and_delete() throws Exception {

		PropertyConfigurator
				.configure("C:\\Users\\Andrei\\eclipse-workspace\\Selenium\\src\\main\\java\\HomeW\\Log4j.properties");
		// String b = "Busea ";
		System.out.println("Page title is: " + driver.getTitle().toLowerCase()/* .startsWith("love") */);
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
		// WebElement abc = (new WebDriverWait (driver,
		// 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("abc")));
		passWord.sendKeys("qatesting");

		log.info("Password introduced");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		log.info("User Entered");
		
		WebElement hov = driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(text(),'Страницы')]"));
		Actions act = new Actions(driver);
		act.moveToElement(hov).build().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[@href='post-new.php?post_type=page']")).click();
		log.info("Opened new Window for adding new Page");
		WebElement title = driver.findElement(By.xpath("//input[@id='title']"));
		log.info("Title Introduced");
		title.sendKeys("Last Test");
		WebElement body = driver.findElement(By.xpath("//iframe[@id='content_ifr']"));
		body.sendKeys(" Great Job!");
		log.info("Body of Page has been introduced");
		driver.findElement(By.xpath("//input[@id='publish']")).click();
		log.info("Published");
		//driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.navigate().to("https://qatesting512.wordpress.com/wp-admin/edit.php?post_type=page");
		
//		List rows = driver.findElements(By.xpath("//input[@id='cb-select-446']"));
//		
//		Thread.sleep(2000);
//		for (int i =1;i<rows.size();i++)
//        {    
//			
//			rows = driver.findElements(By.xpath("//input[@id='cb-select-"+(i+1)+"']"));
//			
//        }
		
//			WebElement hov1 = driver.findElement(By.xpath("//td[@class='title column-title has-row-actions column-primary page-title']"));
//			act.moveToElement(hov1).build().perform();
//			Thread.sleep(1000);
//			WebElement delete = driver.findElement(By.xpath("//a[@href='https://qatesting512.wordpress.com/wp-admin/post.php?post=470&action=trash&_wpnonce=bb4e9a9a42']"));
//			delete.click();
		
		if(driver.getPageSource().contains("Last Test")) {
		driver.findElement(By.xpath("//input[@id='cb-select-all-1']")).click();
		}
		Thread.sleep(2000);
		Select drop = new Select(driver.findElement(By.xpath("//select[@id='bulk-action-selector-top']")));
		drop.selectByIndex(2);
		log.info("Delete option selected");
		driver.findElement(By.xpath("//input[@id='doaction']")).click();
		log.info("Page Deleted");
		
		
		
	}
}