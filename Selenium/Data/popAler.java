package My_Personal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class popAler extends BaseC_GR_1{
@Test
	public void st()  throws Exception{
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Andrei");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		
		
		
		
		
	}
}
