package My_Personal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OntheLessons.III_Lesson.screens;

public class GetWindowHandle extends BaseC_GR_1 {

	@Test
	public void biog() throws Exception{
	
		driver.get("https://www.bing.com/");
		
	String first = driver.getWindowHandle();
		System.out.println(first);
		driver.findElement(By.xpath("//li[@id='outlook']//a[@id='off_link']")).click(); //bing
//		for(String second : driver.getWindowHandles()) {
//			driver.switchTo().window(second);
//			System.out.println(driver.getCurrentUrl());
//			driver.switchTo().window(first);
//			if(!second.equals(first)) {
//				System.out.println(second);
//				driver.switchTo().window(second);
//				Thread.sleep(1000);
//				driver.switchTo().window(first);
//				Thread.sleep(1000);
//				driver.switchTo().window(second);
//				Thread.sleep(1000);
//				driver.switchTo().window(first);
//				Thread.sleep(1000);
//				driver.switchTo().window(second);
//				Thread.sleep(1000);
//				driver.switchTo().window(first);
//				
//			}
//		}
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		
		
		Thread.sleep(2000);
		driver.switchTo().window(newTab.get(0));
		
		driver.switchTo().window(newTab.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='msccLearnMore']")).click();//bing
		getTi();
		//scr.screen(driver);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Что нового')]")).click();
		getTi();
		Thread.sleep(2000);
		driver.switchTo().window(newTab.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(newTab.get(0));
		
		driver.switchTo().window(newTab.get(1));
	
			
	}
	public void getTi() {
		
		System.out.println(driver.getTitle());
	}
}
