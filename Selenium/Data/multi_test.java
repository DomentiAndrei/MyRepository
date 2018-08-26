package My_Personal;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multi_test  /*extends  BaseC_GR_1*/{
	static WebDriver driver = new ChromeDriver();
	
	Logger log = Logger.getLogger("multi_test");
	@Test//(priority = 1)
	public void bbb() throws Exception  {
		// driver = new ChromeDriver();
		driver.get("https://yandex.ru");
		//screen();
		
		log.info(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
	}
	@Test//(priority = 2)
	public void aaa() throws Exception  {
		// driver = new ChromeDriver();
		driver.get("https://mail.ru");
		//screen();
		log.info(driver.getCurrentUrl());
		System.out.println();
	}
	@Test//(priority = 3)
	public void ccc () throws Exception  {
		//driver = new ChromeDriver();
		
		driver.get("https://youtube.com");
		//screen();
		log.info(driver.getCurrentUrl());
	
		//nu face screen deoarece nu are imprtat
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
