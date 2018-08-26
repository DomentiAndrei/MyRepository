package My_Personal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GetTitleO extends BaseC_GR_1{
	@Test
	public void sys() {
		
		driver.get("https://google.com");
		
		String expected = "Google";
		String actual = driver.getTitle();
		
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
		
		
		
	}
}
