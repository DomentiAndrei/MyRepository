package OntheLessons;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;
import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class getWindHend  extends BaseC_GR_1 {
	@Test
	public void ret() throws InterruptedException {
		
		driver.get("https://bing.com");
		
		String first = driver.getWindowHandle();
		System.out.println("First get Window handle is: " + first);
		
		driver.findElement(By.xpath("//li[@id='outlook']//a[@id='off_link']")).click();
		
		for(String second : driver.getWindowHandles()) {
			driver.switchTo().window(second);
			System.out.println("Link is: " + driver.getCurrentUrl());
			driver.switchTo().window(first);
			if(!second.equals(first)) {
				System.out.println(second);
				Thread.sleep(2000);
				
				driver.switchTo().window(second);
				Thread.sleep(2000);
				
				driver.switchTo().window(first);
				
				driver.switchTo().window(second);
				Thread.sleep(2000);
				driver.switchTo().window(first);
				
				driver.switchTo().window(second);
				Thread.sleep(2000);
				driver.switchTo().window(first);
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
