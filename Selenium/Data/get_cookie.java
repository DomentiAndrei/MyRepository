package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get_cookie {
	@Test
	public void cooke() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.ru");
		System.out.println(driver.manage().getCookieNamed("SesionID"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}
}
