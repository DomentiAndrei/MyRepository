package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mail_verify_wieth_Submit {
@Test
	public void mail() {
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://mail.ru");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='mailbox:login']"));
		user.sendKeys("DomAndy.92@mail.ru");
		WebElement pass = driver.findElement(By.xpath("//input[@id='mailbox:password']"));
		pass.sendKeys("buseamea1993");
		pass.sendKeys(Keys.ENTER);
		
		
		
	}
}
