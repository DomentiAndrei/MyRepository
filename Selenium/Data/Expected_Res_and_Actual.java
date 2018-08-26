package OntheLessons.IV_Lesson;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;

public class Expected_Res_and_Actual  extends BaseC_GR_1{
	@Test
	public void ext() {
		
		driver.get("https://youtube.com");
		
		String expected = "YouTube";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		
		Assert.assertEquals(true, driver.findElement(By.xpath("//input[@id='search']")).isDisplayed());
		
		
		
	///arata exception	
		
	}
}
