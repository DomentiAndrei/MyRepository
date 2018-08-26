package Example;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTo {
	@Test
	public static void swetch()  throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

	    String baseUrl = "http://www.google.co.uk/";
	    driver.get(baseUrl);
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    System.out.println(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0)); //switches to new tab
	    driver.get("https://www.facebook.com");

	    driver.switchTo().window(tabs.get(1)); // switch back to main screen        
	    driver.get("https://www.news.google.com");
	    /////////////////////////////////////////////////////////
//		String url = "http://www.google.com";
//		 
//		//while (url != null) {
//			
//		
//			
//		driver.get(url);
//		
////		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
//		driver.findElement(By.linkText("www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
//		Thread.sleep(3000);
//		driver.get("http://www.mail.ru");
//		driver.navigate().back();
//	//	}
//		
		driver.close();
		
	}
}
