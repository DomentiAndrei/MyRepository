package OntheLessons.I_Lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first_sO {
	@Test
	public void ee () throws Exception  {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://mail.ru");
		driver.navigate().refresh();
		
		String url = "https://youtube.com";
		driver.navigate().to(url);
		
		WebElement field = driver.findElement(By.xpath("//input[@id='search']"));
		field.sendKeys("Java");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		Thread.sleep(4000);
			
		exit(driver);
	}
	
	public void exit(WebDriver driver) {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
