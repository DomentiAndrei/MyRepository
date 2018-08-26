package OntheLessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cikle {
	@Test
	public void cil() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		String url = "https://google.com";
		driver.navigate().to(url);
		
		for(int a = 0; a < 10; a++) {
			
			WebElement field = driver.findElement(By.xpath("//input[@id='lst-ib']"));
			
			field.sendKeys("Moldova");
			
			Thread.sleep(2000);
			
			field.clear();
		
		}
		exit(driver);
	}
	public void exit(WebDriver driver) {
		driver.close();
	}
	
}
