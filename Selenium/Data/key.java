package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class key extends BaseC_GR_1{

	public void keu() {
		
		driver.get("google.com");
		
		WebElement field = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		field.sendKeys("mouse");
		field.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
	}
}
