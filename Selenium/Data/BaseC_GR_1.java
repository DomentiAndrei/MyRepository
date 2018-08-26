package My_Personal;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseC_GR_1 {
	protected WebDriver driver;
	protected Logger log = Logger.getLogger("BaseC_GR_1");
	@BeforeSuite 
	public void before() {
		
		Reporter.log("Select Browser", true );
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		log.info("String a has been introduced ");
		
		if(a.equals("CC")) {
			driver = new ChromeDriver();
			System.out.println(driver.getClass().getSimpleName() + " Browser has been selected");
			log.info("Browser Chrome Selected");
		}
		if(a.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe" );
			driver = new FirefoxDriver();
			System.out.println("FireFox Browser has been selected");
			log.info("Browser FireFox Selected");
		}
		
		
		driver.manage().window().maximize();
		log.info("Browser's window is in Maxim Size Position");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
//test	
	@AfterSuite
	public void after()  throws Exception{
		screen();
		
		Thread.sleep(1000);
		driver.quit();
		
	}
	public void screen () throws Exception{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//TakesScreenshot делает скрин. getScreenshotAs получяем скрин 
		String path = "C:\\Users\\Andrei\\Desktop\\Java_Files\\Automation\\Screen\\"; //путь куда уидёт скрим
		FileUtils.copyFile(src, new File(path + time()+" "+this.getClass().getSimpleName() +" " //FileUtils робота с фаломи. copyFile копирует в нужны путь  (path) и в название фаила "this.getClass().getSimpleName()" > имя класса."driver.getClass().getSimpleName()" тип браузера    
		+driver.getClass().getSimpleName()+ ".png")); //фотмат скрина png
	}
	public static  String time() {//метод time 
		return new SimpleDateFormat ("dd-MM-yyyy HH-mm-ss").format(new Date());
	}
}


















