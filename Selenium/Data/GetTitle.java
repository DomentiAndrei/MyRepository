package Example;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GetTitle {

	WebDriver driver;
	
	
	@BeforeTest
	public void befor() {
			driver = new ChromeDriver();
			
			
	}
	@Test(priority = 5)
	public void test() {
		String url = "https://www.google.com/";	
		driver.get(url);
		String expected = "Google";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		if(expected == actual) {
			System.out.println("True...");
		}
		
	}
	@Test(priority = 1)
	public void secondTest() {
		driver.get("https://www.facebook.com/");
		String expected = "Facebook — войдите или зарегистрируйтесь";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual );
	}
	@AfterTest
	public void after() throws Exception{
		Thread.sleep(500);
		driver.quit();
	}
}
