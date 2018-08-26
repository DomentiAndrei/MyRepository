package Example;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alert_popUp {

	@Test
	public void alerPopUp()  throws Exception{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://demo.guru99.com/test/delete_customer.php";
		driver.navigate().to(url);
		
		WebElement field = driver.findElement(By.xpath("//input[@name='cusid']"));
		field.sendKeys("123");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		field.clear();
//		
		field.sendKeys("andrei");
		submit.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		String b = "Busea";
		field.sendKeys(b);
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		field.sendKeys(b + " Mea");
		Thread.sleep(1000);
		screen(driver);
//		
//		
		driver.get("http://demo.guru99.com/popup.php");
		String mainPage = driver.getWindowHandle();
		System.out.println(mainPage);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement link = driver.findElement(By.xpath("//a[@href='../articles_popup.php']"));
		link.click();
		Thread.sleep(4000);
//		
		for (String newTab : driver.getWindowHandles()) {
		Thread.sleep(4000);
		driver.switchTo().window(newTab);
		if (!newTab.equals(mainPage)) {
			System.out.println(newTab);
			}
//		}
		WebElement nextField = driver.findElement(By.xpath("//input[@name='emailid']"));
		nextField.sendKeys("DomAdy.92@mail.ru");
		Thread.sleep(4000);
		nextField.clear();
		nextField.sendKeys("1234");
		WebElement butt = driver.findElement(By.xpath("//input[@type='submit']"));
		butt.click();
		Thread.sleep(4000);
		WebElement error = driver.findElement(By.xpath("//label[@id='message9']"));
		System.out.println(error);
		nextField.clear();
		nextField.sendKeys("DomAdy.92@mail.ru");
		butt.click();
		driver.switchTo().window(mainPage);
		Thread.sleep(4000);
		
		screen(driver);
		quit(driver);
		//driver.manage().getCookies()
		}
	}
	public void quit(WebDriver driver) {
		driver.quit();
	}
	public void screen(WebDriver driver)throws Exception {
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date dat = new Date();
		String path = "C:\\Users\\Andrei\\Desktop\\Java_Files\\ScreenShots\\Screen\\Alert\\";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File (path +  this.getClass().getSimpleName() + " "+  date.format(dat) + ".png"));
		
	}
	
}
