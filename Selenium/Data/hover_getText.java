package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base_for_All.Base_Class;

public class hover_getText extends Base_Class{
@Test
	public void hov() throws Exception{
		
//		driver.get("http://discoverstyle.ru/");
//		
//		WebElement hover = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/ul[1]/li[4]/a[1]"));
//		String textFirst = hover.getText();
//		
//		Actions act = new Actions(driver);
//		Thread.sleep(1000);
//		act.moveToElement(hover).build().perform();
//		Thread.sleep(1000);
//		
//		WebElement on = driver.findElement(By.xpath("//*[@id=\"menu-item-4002\"]/a"));
//		on.click();
//		Thread.sleep(1000);
//		String textSecond = on.getText();
//		
//		Thread.sleep(1000);
//		driver.navigate().to("https://yandex.com");
//		driver.findElement(By.xpath("//input[@id='text']")).sendKeys(textFirst + textSecond );
//		Thread.sleep(1000);
		
		driver.get("https://www.marksandspencer.com/");
		
		WebElement hover = driver.findElement(By.xpath("//span[contains(text(),'Food')]"));
		String textFirst = hover.getText();
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(hover).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"SC_Level_1_14866033\"]/div/div/div[1]/div[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		String textSecond = driver.findElement(By.xpath("//*[@id=\"SC_Level_1_14866033\"]/div/div/div[1]/div[1]/ul/li[5]/a")).getText();
		
		Thread.sleep(1000);
		driver.get("https://yandex.com");
		driver.findElement(By.xpath("//input[@id='text']")).sendKeys(textFirst + textSecond );
		Thread.sleep(1000);
		
		
		
	}
	
}
