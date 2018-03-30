package My_Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.htmlelements.element.Select;
@Test
public abstract class Try {

	public static void main (String [] agrs) throws Exception  {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		Thread.sleep(2000);
		WebElement Fname = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		Fname.clear();
		String b = "Andrei";
		Fname.sendKeys(b);
		WebElement Lname = driver.findElement(By.xpath("//input[@id='name_3_lastname']"));
		Lname.sendKeys("Domenti");
		WebElement FirstTick = driver.findElement(By.xpath("//input[@value='married']"));
		FirstTick.click();
		WebElement SecondTick = driver.findElement(By.xpath("//input[@value='reading']"));
		SecondTick.click();
		WebElement FirstDropDown = (driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		FirstDropDown.click();
		WebElement MDcountry = new Select (driver.findElement(By.xpath("//option[@value='Moldova']")));
		MDcountry.click();
		
		driver.findElement(By.xpath("//select[@id='yy_date_8']"));//.findElement(By.xpath("//option[@value='1993']"));
		//years.click();
		WebElement year = driver.findElement(By.xpath("//option[@value='1993']"));
		year.click();
			
		WebElement months = driver.findElement(By.xpath("//select['@id=mm_date_8']"));//select[@id='mm_date_8']
		months.click();
		WebElement month = driver.findElement(By.xpath("//option[@value='12']"));
		month.click();
		WebElement days = driver.findElement(By.xpath("//select[@id='dd_date_8']"));
		days.click();
		WebElement day = driver.findElement(By.xpath("//option[@value='15']"));
		day.click();
		WebElement phoneN = driver.findElement(By.id("phone_9"));
		phoneN.sendKeys("37368466084");
		WebElement UserN = driver.findElement(By.id("username"));
		UserN.sendKeys("DomAndy");
		WebElement Email = driver.findElement(By.id("email_1"));
		Email.sendKeys("DomAndy.92@mail.ru");
		
		driver.findElement(By.xpath("//input[@id='profile_pic_10']")).sendKeys("D:\\Revers Portfolio.png");//load any file
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password_2']"));
		pass.sendKeys("qqaaww1A");
		WebElement ConfPass = driver.findElement(By.id("confirm_password_password_2"));
		String a = "qqaaww1A";
		ConfPass.sendKeys(a);
		WebElement textArea = driver.findElement(By.xpath("//textarea[@id='description']"));
		textArea.sendKeys("My first automated test. I have never thought that i will could do it");
		
		
		driver.findElement(By.name("pie_submit")).click();
		//input[@name='pie_submit']			
	}
}
