package Base_for_All;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Example.DIfferent_Browsers.parent;

public class Base_Class {

	protected static WebDriver driver;
	@BeforeMethod
	public void step() throws Exception{
		Reporter.log("Select Browser", true);
		Scanner input = new Scanner(System.in);
		String selectBrowser = input.nextLine();
		
		if (selectBrowser.equals("CC")) {
			driver = new ChromeDriver();
			Reporter.log("Chrome Browser is Opening", true);
		}
		if (selectBrowser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe" );
			driver = new FirefoxDriver();
			Reporter.log("FirefoxDriver Browser is Opening", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void exit() throws Exception{
		screen();
		driver.quit();
	}
	public void screen() throws Exception {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\NewScreenS\\parent\\" + timeS() + " "+this.getClass().getSimpleName()  +" "+ driver.getClass().getSimpleName() + ".png"));
		

	}
	public static String timeS() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
