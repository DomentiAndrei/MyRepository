package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getTextt {
@Test
	public void text() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		WebElement title = driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]"));
		String a  =   title.getText().toUpperCase();
		driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys(a);
		
		
		
		
	}
}
