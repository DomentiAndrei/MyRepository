package OntheLessons.II_Lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;

public class mail extends BaseC_GR_1{ // наследуем с помощью слова "extends" 
	@Test
	public void mill() throws Exception {
	
		driver.get("https://mail.ru");
		log.info("WebSite acces");
		WebElement user = driver.findElement(By.xpath("//input[@id='mailbox:login']"));
		user.sendKeys("DomAndy.92@mail.ru");
		log.info("Email Introduced ");
		System.out.println("Email Introduced");
		WebElement pass = driver.findElement(By.xpath("//input[@id='mailbox:password']"));
		pass.sendKeys("armagidon199");
		log.info("Password Introduced ");
		WebElement check = driver.findElement(By.xpath("//input[@id='mailbox:saveauth']"));
		check.click();
		System.out.println(check.isEnabled());//выводит на экран true если галочка не стоит
		log.info(check.isEnabled());
		WebElement button = driver.findElement(By.xpath("//input[@class='o-control']"));
		button.click();
		
		Thread.sleep(1500);
		
		if(driver.getPageSource().contains("Неверное имя или пароль")) {
			pass.clear(); //чистит поле пароля
			pass.sendKeys("armagidon1993");
		}
		
		Thread.sleep(2000);
		
		button.click();
		
		
		
		
		
		
		
		
	}
}
