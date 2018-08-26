package My_Personal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_With_Enter {
@Test
	public void enter() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		WebElement fil = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		fil.sendKeys("LG");
		fil.sendKeys(Keys.ENTER);
		
		WebElement fil2 = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		fil2.clear();
		
		fil2.sendKeys("Samsung");
		fil2.submit();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	}
