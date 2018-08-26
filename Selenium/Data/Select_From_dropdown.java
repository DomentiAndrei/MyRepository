package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_From_dropdown {

	@Test
	public static void select () throws Exception{
		
		WebDriver driver  =  new ChromeDriver();
		driver.get("http://demoqa.com/registration/");	
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		Select mm = new Select(driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		mm.selectByIndex(5);
		Select dd = new Select(driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		dd.selectByVisibleText("4");
		Select yy = new Select(driver.findElement(By.xpath("//select[@id='yy_date_8']")));
		yy.selectByValue("1960");
		Thread.sleep(2000);
		
	}
}
