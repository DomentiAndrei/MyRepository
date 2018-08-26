package My_Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	WebDriver driver;
	Logger log = Logger.getLogger("Try");

	@BeforeClass
	public void setup() throws Exception {
		Reporter.log("=====Browser Session Start=====", true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("demoqa.com/registration/");
		WebElement faaaa = driver.findElement(By.xpath("//input[@value='Поиск в Google']"));
		faaaa.click();
		driver.findElement(By.xpath("//a[contains(text(),'Registration | Demoqa')]")).click();
		// driver.get("http://demoqa.com/registration/");
		Thread.sleep(2000);
	}

	@AfterClass
	public void close() {

		Reporter.log("=====Browser Session End=====", true);
		driver.quit();
	}

	public static void screen(WebDriver lddriver) {
		try {
			File src = ((TakesScreenshot) lddriver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src,
					new File("C:\\Users\\Andrei\\Desktop\\Java_Files\\ScreenShots\\Try\\" + timeDate() + ".png"));

			// System.out.println(this.getClass().getSimpleName());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String timeDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}