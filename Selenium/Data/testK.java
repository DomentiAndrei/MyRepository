package My_Personal;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class testK extends BaseC_GR_1{

	@Test
	public void steps() throws Exception {
		
		driver.get("https://mail.ru");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='mailbox:login']"));
		user.sendKeys("DomAndy.92@mail.ru");
		
		WebElement pass =  driver.findElement(By.xpath("//input[@id='mailbox:password']"));
		pass.sendKeys("buseamea199");
		
		WebElement tick =  driver.findElement(By.xpath("//input[@id='mailbox:saveauth']"));
		tick.click();
		
		WebElement button =  driver.findElement(By.xpath("//input[@class='o-control']"));
		button.click();
		
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Входящие")) {///Важно
			
			
		}
		
		Thread.sleep(1000);
		if(driver.getPageSource().contains("Неверное имя или пароль")) {
			pass.clear();
			pass.sendKeys("buseamea1993");
			Thread.sleep(2000);
			button.click();
			
		}
		
		
		
	}
	//@Test(priority = 1)
	public void stepsk() {
		driver.get("https://google.com");
	}
	//@Test(priority = 2)
	public void tir() {
		driver.navigate().to("https://gmial.com");
	}
}
