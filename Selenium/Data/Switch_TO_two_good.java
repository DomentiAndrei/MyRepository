package Example;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Switch_TO_two_good {
	@Test
	public  void switc() throws Exception{
		
		
		Logger log = Logger.getLogger("Switch_TO_two_good");
		PropertyConfigurator.configure("C:\\Users\\Andrei\\eclipse-workspace"
				+ "\\Selenium\\src\\main\\java\\Example\\Log4j.properties");
		
		//System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver.exe"); //for FireFox
		//WebDriver driver = new FirefoxDriver(); //for FireFox
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(2000);
		String url = "https://account.mail.ru/signup?from=main&rf=auth.mail.ru";
		driver.navigate().to(url);
		log.info("Page Opened");
		String mainTab = driver.getWindowHandle();
		System.out.println("First Name: " + mainTab);
		
		driver.findElement(By.xpath("//a[@href='https://help.mail.ru/mail-help/UA']")).click();
		log.info("Opened new Tab");
		
		Thread.sleep(2000); ////for FireFox
		for (String newTab : driver.getWindowHandles()) {
			driver.switchTo().window(newTab);
			if(!newTab.equals(mainTab)) {
			System.out.println("Second Name: " + newTab);
			}
		}
		
		if (driver.getPageSource().contains("Пользовательское Соглашение")) {
			System.out.println("Element is Present");
		}
		WebElement h1 = driver.findElement(By.xpath("//div[@class='h-header__text']"));
		System.out.println(h1.isDisplayed());
		
		driver.switchTo().window(mainTab);
		
		driver.findElement(By.xpath("//input[@class='b-input b-input_r"
				+ "esponsive b-input_compact b-input_animate']")).sendKeys("Busea");
		
		DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
				Date date = new Date();
				
			//String fileName = dataFormat.format(date) + ".png";	// we can use this method for receive date and time in name of screens 
				
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\Andrei\\Desktop\\Java_Files"
				+ "\\Log4j\\Example\\SwitchTo\\" + dataFormat.format(date) + " " + this.getClass().getSimpleName() +  ".jpg"));
		
		
		Thread.sleep(2000);
		//driver.switchTo().alert().accept(); //for FireFox
		driver.quit();
		
		
				
	}
		
}
