package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hov extends BaseC_GR_1{
@Test
	public void hov ()throws Exception {
	driver.get("https://www.marksandspencer.com/");
	Actions act = new Actions(driver);
	WebElement appart = driver.findElement(By.xpath("//span[contains(text(),'Food')]"));
	
	act.moveToElement(appart).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"SC_Level_1_14866033\"]/div/div/div[1]/div[1]/ul/li[5]/a")).click();
	
	driver.navigate().back();
	
	WebElement flo = driver.findElement(By.xpath("//span[contains(text(),'Flowers')]"));
	 act.moveToElement(flo).build().perform();
	 Thread.sleep(1000);
//	 WebDriverWait waiting = new WebDriverWait(driver, 5);
//	waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"SC_Level_1_16547523\\\"]/div/div/div[1]/div[3]/ul/li[1]/a")));
//	 driver.findElement(By.xpath("//*[@id=\\\\\\\"SC_Level_1_16547523\\\\\\\"]/div/div/div[1]/div[3]/ul/li[1]/a")).click();
	 
	 driver.findElement(By.xpath("//*[@id=\"SC_Level_1_16547523\"]/div/div/div[1]/div[3]/ul/li[1]/a")).click();
	}
}
