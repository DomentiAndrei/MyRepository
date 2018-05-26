package HomeW.BaseT;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
		protected WebDriver driver;
		protected Logger log = Logger.getLogger("BaseClass");
		
		@BeforeClass
		public void baseStep() throws Exception{
			Reporter.log("=== Test Start ===", true);
			log.info(getClass().getSigners());
			
			if ("driverFromConfig" .equals("FireFox")) {
				driver = new FirefoxDriver();
			}else if ("driverFromConfig" .equals("Chrome")) {
				driver = new ChromeDriver();
			}
			driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://qatesting512.wordpress.com/wp-admin/");
//		Thread.sleep(2000);
//		driver.get("http://google.com");
//		Thread.sleep(2000);
		//driver.navigate().back();
		//driver.navigate().refresh();
		
		//Thread.sleep(1000);
	}
		
		@AfterClass
		public void finish() throws Exception {
			screenShot();
			Reporter.log("=== Test Finish ===", true);
			log.info("Browser CLosed");
			Thread.sleep(1000);
			driver.quit();
		}
		
		public  void screenShot () {
			try {
				
//				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
//				Date date = new Date();
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File ("C:\\Users\\Andrei\\Desktop\\Java_Files\\HWscreens\\Screens\\"  + 
			
		" "	+ this.getClass().getSimpleName() + " " + timestamp() + ".png")); //or without method "timestamp" and only use "//dateFormat.format(date)"
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		public static String timestamp() {
	        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	    }
	

	

}
