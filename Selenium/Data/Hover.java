package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Hover {
@Test
	public void hov ()throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.inthestyle.com");
		
//		WebElement top = driver.findElement(By.xpath("//a[@class='level0 has-children']//span[contains(text(),'Tops')]"));
////		
		Actions act = new Actions(driver);
//		act.moveToElement(top).build().perform();
//		
//		Thread.sleep(1000);
//		WebElement bralet = driver.findElement(By.xpath("//a[@href='https://www.inthestyle.com/tops/bralets']"));
//		bralet.click();
//		
//		if(driver.findElement(By.xpath("//h1[contains(text(),'Bralets')]")).isDisplayed()) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//		
//		driver.navigate().back();
//		WebElement shose = driver.findElement(By.xpath("//a[@class='level0 has-children']//span[contains(text(),'Shoes')]"));
//		act.moveToElement(shose).build().perform();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//a[@href='https://www.inthestyle.com/shoes/boots']")).click();
		
		driver.get("https://www.marksandspencer.com/");
		
		WebElement appart = driver.findElement(By.xpath("//span[contains(text(),'Food')]"));
		
		act.moveToElement(appart).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"SC_Level_1_14866033\"]/div/div/div[1]/div[1]/ul/li[5]/a")).click();
		
		driver.navigate().back();
		
		WebElement flo = driver.findElement(By.xpath("//span[contains(text(),'Flowers')]"));
		 act.moveToElement(flo).build().perform();
		 Thread.sleep(1000);
//		 WebDriverWait waiting = new WebDriverWait(driver, 5);
//		waiting.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"SC_Level_1_16547523\\\"]/div/div/div[1]/div[3]/ul/li[1]/a")));
//		 driver.findElement(By.xpath("//*[@id=\\\\\\\"SC_Level_1_16547523\\\\\\\"]/div/div/div[1]/div[3]/ul/li[1]/a")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"SC_Level_1_16547523\"]/div/div/div[1]/div[3]/ul/li[1]/a")).click();
		
		driver.get("https://www.inthestyle.com/");
		
		WebElement shi = driver.findElement(By.xpath("//a[@class='level0 has-children']//span[contains(text(),'Shoes')]"));
		act.moveToElement(shi).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[13]/div/div[1]/div/ul/li[2]/a")).click();
		
		
		
		
	}
}
