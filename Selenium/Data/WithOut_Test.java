package Example;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithOut_Test {
	@Test
	public  void tt() throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.ru/");
		//driver.navigate().to("https://mail.ru");
		//driver.navigate().back();
		Robot ru = new Robot(); 
		
		for(int a = 0; a < 5; a++) {
		WebElement field = driver.findElement(By.xpath("//input[@id='mailbox:login']"));
		field.sendKeys("First Test ");
		ru.delay(5000);
	
		
		field.clear();
		
		}
		
		WebElement button = driver.findElement(By.xpath("//input[@class='o-control']"));
		System.out.println("Tag Name" + button.getTagName());
		System.out.println(button.getText());
		
		
		driver.findElement(By.xpath("//a[@class='mailbox__footer']")).click();
		Robot r = new Robot();  
		r.keyPress(KeyEvent.VK_CONTROL);
		
		driver.close();
		

	}

}
