package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rectangle {
@Test
	public void rect() {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.ru");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='mailbox:login']"));
		System.out.println(user.getSize());
		System.out.println(user.getLocation());
		
		
		
		
		driver.close();
	}
}
