package My_Personal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import OntheLessons.III_Lesson.screens;

public class clasr {
	
	@Test
	public void teil() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.ru");
		screens src = new screens();
		src.screen(driver);
		
		driver.get("https://youtube.com");
		src.screen(driver);
		
		
		driver.get("https://gmail.com");
		src.screen(driver);
		
		
	}
	
}
