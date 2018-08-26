package My_Personal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cilce {

	@Test
	public void step() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().getSize();
		String url = "https://google.com";
		driver.navigate().to(url);
		
		
		for(int a = 0; a < 2; a++ ) {
		WebElement  fil=  driver.findElement(By.xpath("//input[@id='lst-ib']"));
		fil.sendKeys("Moldova");
		
		Thread.sleep(2000);
		fil.clear();
		
		}
		exit(driver);
	}
	public void exit(WebDriver driver) {
		driver.quit();
	}
}
