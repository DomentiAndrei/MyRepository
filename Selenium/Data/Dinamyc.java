package Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dinamyc {

	 @Test
	 public static void din()throws Exception{
		 
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://qatesting512.wordpress.com/wp-admin/edit.php?post_type=page");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement userName = driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
			userName.clear();
			userName.sendKeys("DomAndy.92@mail.ru");
			
			WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));
			continu.click();
			//Thread.sleep(2000);
			
			WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfAllElements(passWord));
			//WebElement abc = (new WebDriverWait (driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("abc")));
			passWord.sendKeys("qatesting");
			
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
		 driver.findElement(By.xpath("//a[@href='https://qatesting512.wordpress.com/wp-admin/post-new.php?post_type=page']")).click();
		
			WebElement title = driver.findElement(By.xpath("//input[@id='title']"));
			
			title.sendKeys("Last Test");
			WebElement body = driver.findElement(By.xpath("//iframe[@id='content_ifr']"));
			body.sendKeys(" Great Job!");
			
			driver.findElement(By.xpath("//input[@id='publish']")).click();
		
			//driver.switchTo().alert().accept();
			Thread.sleep(2000);
			driver.navigate().to("https://qatesting512.wordpress.com/wp-admin/edit.php?post_type=page");
			if(driver.getPageSource().contains("Last Test"));
			driver.findElement(By.xpath("//input[@id='cb-select-all-1']")).click();
			
			
			List check = driver.findElements(By.xpath("//input[@id='cb-select-all-1']"));
			System.out.println(check.size());
			
			
			
			
			
//			Select drop = new Select(driver.findElement(By.xpath("//select[@id='bulk-action-selector-top']")));
//			drop.selectByIndex(2);
			
			driver.findElement(By.xpath("//input[@id='doaction']")).click();
			
		 
		 
		 
		 
	 }
}
