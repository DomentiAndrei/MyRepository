package My_Personal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class facebook extends BaseC_GR_1 {

	@Test
	public void vori() throws Exception{
		
		
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DomAndy.92@mail.ru");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("buseamea1993");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		driver.findElement(By.xpath("//textarea[@id='js_1g']")).sendKeys("bla");
	//	driver.findElement(By.xpath("//span[contains(text(),'Опубликовать')]")).click();
		
		
	}
	
}
