package My_Selenium;
import java.io.File;
import java.io.IOException;
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
import org.testng.Reporter;
import org.testng.annotations.Test;


import ru.yandex.qatools.htmlelements.element.Select;

public class Try  extends Base{
	@Test
	public void  form() throws Exception {		
		//WebDriver driver = new ChromeDriver();
		PropertyConfigurator.configure("C:\\Users\\Andrei\\eclipse-workspace\\Selenium\\src\\main\\java\\My_Selenium\\Log4j.properties");
		
			log.info("Browser Opened");
		  		//Try.screen(driver);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		  		log.info("Window maxim size");
		  			Try.screen(driver);
		//driver.get("http://demoqa.com/registration/");
		  			log.info("Site has been opened");
		  				Try.screen(driver);
//		Thread.sleep(2000);
		WebElement Fname = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		Fname.clear();
		String b = "Andrei";
		Fname.sendKeys(b);
			log.info("First Name has been introduced");
				Try.screen(driver);
		WebElement Lname = driver.findElement(By.xpath("//input[@id='name_3_lastname']"));
		Lname.sendKeys("Domenti");
			log.info("Last Name has been introduced");
				Try.screen(driver);
				
		WebElement FirstTick = driver.findElement(By.xpath("//input[@value='married']"));
		FirstTick.click();
		//System.out.println();
			log.info(driver.findElement(By.xpath("//input[@value='married']")).isSelected());
			log.info("Status Selected");
				Try.screen(driver);
				
		WebElement SecondTick = driver.findElement(By.xpath("//input[@value='reading']"));
		SecondTick.click();
			log.info("Hobby selected");
				Try.screen(driver);
		WebElement FirstDropDown = (driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		FirstDropDown.click();
			log.info("Drop Down opened");
				Try.screen(driver);
		WebElement MDcountry = new Select (driver.findElement(By.xpath("//option[@value='Moldova']")));
		MDcountry.click();
			log.info("City Selected");
				Try.screen(driver);
		driver.findElement(By.xpath("//select[@id='yy_date_8']"));//.findElement(By.xpath("//option[@value='1993']"));
		//years.click();
		WebElement year = driver.findElement(By.xpath("//option[@value='1993']"));
		year.click();
			log.info("Year Selected");
				Try.screen(driver);
		WebElement months = driver.findElement(By.xpath("//select['@id=mm_date_8']"));//select[@id='mm_date_8']
		months.click();
		WebElement month = driver.findElement(By.xpath("//option[@value='12']"));
		month.click();
			log.info("Month Selected");
			  	Try.screen(driver);
		WebElement days = driver.findElement(By.xpath("//select[@id='dd_date_8']"));
		days.click();
		WebElement day = driver.findElement(By.xpath("//option[@value='15']"));
		day.click();
			log.info("Day Selected");
				Try.screen(driver);
		WebElement phoneN = driver.findElement(By.id("phone_9"));
		phoneN.sendKeys("37368466084");
			log.info("Phone Number Introduced");
				Try.screen(driver);
		WebElement UserN = driver.findElement(By.id("username"));
		UserN.sendKeys("DomAndy");
			log.info("Username Introduced");
				Try.screen(driver);
		WebElement Email = driver.findElement(By.id("email_1"));
		Email.sendKeys("DomAndy.92@mail.ru");
			log.info("E-mail Introduced");
				Try.screen(driver);
		
		driver.findElement(By.xpath("//input[@id='profile_pic_10']")).sendKeys("D:\\Revers Portfolio.png");//load any file
			log.info("Photo Loaded");
				Try.screen(driver);
		WebElement pass = driver.findElement(By.xpath("//input[@id='password_2']"));
		pass.sendKeys("qqaaww1A");
			log.info("Password Introduced");
				Try.screen(driver);
		WebElement ConfPass = driver.findElement(By.id("confirm_password_password_2"));
		String a = "qqaaww1A";
		ConfPass.sendKeys(a);
			log.info("Password Confirm Introduced");
				Try.screen(driver);
		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='description']"));
		textArea.sendKeys("My first automated test. I have never thought that i will could do it");
			log.info("Description introduced");
				Try.screen(driver);
		
		driver.findElement(By.name("pie_submit")).click();
			log.info("Form has been completed");
				Try.screen(driver);
			Thread.sleep(1);
			driver.quit();
		
	}	
}
