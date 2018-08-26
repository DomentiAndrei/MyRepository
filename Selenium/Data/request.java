package OntheLessons.IV_Lesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Example.YouTube.exitt;
import OntheLessons.III_Lesson.screens;

public class request /*extends BaseC_GR_1*/{
@Test
	public void ste() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.ru");
		screens scr = new screens();
		scr.screen(driver);//driver trebuee sa fie scris in paranteze cind doar transmitem WebDriver  driver in method
		
		//scr.exit(driver);
		driver.get("https://google.com");
		scr.screen(driver);
		driver.navigate().to("https://youtube.com");
		scr.screen(driver);
		
		
		
		exitt ec = new exitt();
		ec.after(driver);
		
	}
}
