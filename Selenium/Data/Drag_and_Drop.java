package Example;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_and_Drop {

	@Test
	public void dragDrop() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		//Thread.sleep(2000);
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//html/body[1]/div[1]"));
		WebElement drop = driver.findElement(By.xpath("//html/body[1]/div[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(drag).dragAndDrop(drag, drop).build().perform(); //or withoupt //".moveToElement(drag)"
		Thread.sleep(2000);
		
//		driver.switchTo().defaultContent();
//		
//		System.out.println("Element is display ?: " + driver.findElement(By.xpath("//h2[contains(text(),'Examples')]")).isDisplayed());
//		
//		if(driver.getPageSource().contains("Droppable")) {
//			System.out.println("Element Displayed");
//		}
		close(driver);
	}
	
	public void close(WebDriver driver) throws Exception{
		Thread.sleep(3000);
		driver.quit();;
	}
}
