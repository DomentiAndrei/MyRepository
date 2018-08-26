package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class dataProvider {
		WebDriver driver;
	@BeforeTest
	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "datatest", priority = 2)
	public void testChrome(String username,  String password) {
		
		
		//1 browser
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);	
		
	}
	@Test(dependsOnMethods = "other", dataProvider = "dataMail", priority = 10)
	public void mail(String username,  String password) {
		driver.get("https://mail.ru/");
		driver.findElement(By.xpath("//input[@id='mailbox:login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='mailbox:password']")).sendKeys(password);
		
	}
	@DataProvider(name = "dataMail")
	public Object [][]testMail(){
		Object[][] mail = new Object [2][2];
		mail[0][0] = "DomAndy@mail.ru";
		mail[0][1] = "bugagaga";
		mail[1][0] = "dddd";
		mail[1][1] = "bu";
		return mail;
	}
	
	
	
	@DataProvider(name = "datatest")
	public Object[][]TestDataFeed(){
		Object[][] facebookData = new Object[2][2];
		facebookData[0][0] = "DomAndy.92@mail.ru";
		facebookData[0][1] = "buseamea";
		facebookData[1][0] = "DomAndy.93@mail.ru";
		facebookData[1][1] = "buseamea";
		return facebookData;
		
		
	}
	@Test(priority = 1)
	private void other() {
		driver.get("https://google.com/");
		String expected = "Google";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);	
	}
	
	

	@AfterTest
	public void after() {
		driver.quit();
	}
}
