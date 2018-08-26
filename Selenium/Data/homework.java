package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import OntheLessons.III_Lesson.screens;

public class homework {
WebDriver driver = new ChromeDriver();
final String url = "http://demoqa.com/registration/";

  	screens scr = new screens();
  	
	@Test(priority = 2, enabled = false)
	public void home1() {
		driver.get(url);
		WebElement user = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		System.out.println("Element is Displayed: " + user.isDisplayed());
		
	}
	@Test(priority = 1, dependsOnMethods = "home1")
	public void home2() {
		driver.get(url);
		System.out.println("Element is Enabled: " + driver.findElement(By.xpath("//input[@value='single']")).isEnabled());
		
	}
	@Test(priority = 10)
	public void home3() throws Exception {
		driver.get(url);
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		boolean a = driver.findElement(By.xpath("//input[@value='dance']")).isSelected();
		System.out.println("Element is Selected: " + a);
		
		scr.screen(driver);
		wxit();
	}
	@Ignore
	public void wxit() {
		driver.quit();
	}
}
