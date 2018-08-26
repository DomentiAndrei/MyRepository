package OntheLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testik {
	@Test
	public void teil() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		WebElement title = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		String a = title.getText().toUpperCase();
		driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys(a);
		
		
		
		
		
		
	}
}
