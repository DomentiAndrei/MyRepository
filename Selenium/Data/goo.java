package OntheLessons.IV_Lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;

public class goo extends BaseC_GR_1 {
	@Test
	public void tip() throws InterruptedException {
		
		driver.navigate().to("https://google.com");
		log.info("WebSite Opened");
		WebElement field = driver.findElement(By.xpath("//input[@name='q']"));
		field.sendKeys("QA ");
		field.submit();
		
		driver.findElement(By.xpath("//a[@href='https://ru.wikipedia.org/wiki/QA']")).click();

		System.out.println(driver.findElement(By.xpath("//a[@class='mw-wiki-logo']")).isDisplayed());

	}
}
