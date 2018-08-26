package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class yandex {
	@Test
	public void yande() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yandex.ru/");
		WebElement log = driver.findElement(By.xpath("//span[@class='datetime__month']"));
		System.out.println(log.getText());
		WebElement lo = driver.findElement(By.xpath("//span[@class='datetime__min']"));
		System.out.println(lo.getText());
		System.out.println(driver.getTitle());
		
		String expected = "Яндекс";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);

		if(driver.getTitle().contains("Яндекс")) {
			System.out.println("Yes");
		}
		if (driver.getPageSource().contains("Кишинев")) {
			System.out.println("Yes");
		}
		WebElement but = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(but.getText());
		WebElement setting = driver.findElement(By.xpath("//span[@class='link__inner'][contains(text(),'Настройка')]"));
		System.out.println(setting.getText());
		
		
		
		
		
		
		driver.quit();
	}
}
