package Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Reflection.Annotation.first;

public class Alert {
	//@Ignore
	@Test
	@first
	public void alertt() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	driver.navigate().to("http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html");
	
	driver.findElement(By.xpath("//a[@id='jre-8u181-oth-JPRXXXjre-8u181-windows-x64.exe']")).click();
	
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form[@name='agreementFormjre-8u181-oth-JPR']//input[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@id='jre-8u181-oth-JPRXXXjre-8u181-windows-x64.exe']")).click();
//	driver.findElement(By.xpath("//span[contains(text(),'Training')]")).click();
//	driver.findElement(By.xpath("//span[contains(text(),'Technologies')]")).click();
	
	
	driver.get("http://www.google.com");
	exit(driver);
	
	
	
	}
	public void exit(WebDriver d) throws Exception{
		Thread.sleep(1000);
		d.quit();
	}
	
}
