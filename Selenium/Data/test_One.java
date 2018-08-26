package Base_for_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test_One extends Base_Class{

	@Test
	public void stears() throws Exception{
		
//		Base_Class base = new Base_Class();
//		base.step();
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Andrei");
		
		
	}
}
