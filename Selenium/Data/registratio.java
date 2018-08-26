package OntheLessons.I_Lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registratio {
	@Test
	public void regist() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		
		WebElement firstN = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		firstN.sendKeys("Andrei");
		
		WebElement lastN = driver.findElement(By.xpath("//input[@id='name_3_lastname']"));
		lastN.sendKeys("Dom");
		
		driver.findElement(By.xpath("//input[@value='married']")).click();
		
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		
		Select country = new Select (driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		country.selectByIndex(5);
		
		Select month = new Select (driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		month.selectByValue("12");
		
		Select day = new Select (driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		day.selectByVisibleText("15");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yy_date_8']"));
		year.click();
		Thread.sleep(2000);
		WebElement sel = driver.findElement(By.xpath("//option[@value='2010']"));
		sel.click();
		
		
		driver.quit();
	}
}
