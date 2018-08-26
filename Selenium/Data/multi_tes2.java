package OntheLessons.IV_Lesson;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multi_tes2 /*extends BaseC_GR_1*/{
	WebDriver driver = new ChromeDriver(); 
		
	
	@Test//(priority = 1,enabled = false)
	public void bbb() throws Exception {
		//driver = new ChromeDriver();
		driver.get("https://mail.ru");
		//screen ();
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test(priority = 2)
	public void aaa() throws Exception {
		//driver = new ChromeDriver();
		driver.get("https://google.com");
		//screen ();
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority = 3)
	public void ccc() throws Exception {
		//driver = new ChromeDriver();
		driver.get("https://yandex.ru");
		//screen ();
		System.out.println(driver.getCurrentUrl());
		screen () ;
	}
	
public void screen () throws Exception{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\Andrei\\Desktop\\Java_Files\\Automation\\Screen\\";
		FileUtils.copyFile(src, new File(path + time()+" "+this.getClass().getSimpleName() +" "
		+driver.getClass().getSimpleName()+ ".png"));
	}
	public static  String time() {
		return new SimpleDateFormat ("dd-MM-yyyy HH-mm-ss").format(new Date());
	}
}
