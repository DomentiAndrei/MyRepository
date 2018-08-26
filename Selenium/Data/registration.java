package OntheLessons.I_Lesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;


public class registration {
	
//	@Test(priority = 1)
//	public void test() throws Exception{
//		//System.setProperty("webdriver.chrome.driver", "");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		//driver.manage().window().fullscreen();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		
//		driver.get("https://youtube.com");
//		driver.navigate().refresh();
//		driver.navigate().to("https://mail.ru");
//		driver.navigate().back();
//		
//		link(driver);
//		
//	}
	WebDriver driver = new ChromeDriver();
	@Test
	public void link()  throws Exception{
		
		driver.get("http://demoqa.com/registration/");
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		fName.sendKeys("Andrei");
		driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys("Dom");
		
		driver.findElement(By.xpath("//input[@value= 'single']")).click();
		driver.findElement(By.xpath("//input[@value= 'dance']")).click();
		driver.findElement(By.xpath("//input[@value= 'reading']")).click();
		
		
		Select country = new Select (driver.findElement(By.xpath("//select[@id='dropdown_7']")));
		country.selectByIndex(5);
		
		Select month = new Select (driver.findElement(By.xpath("//select[@id='mm_date_8']")));
		month.selectByValue("12");
		
		
		Select day = new Select (driver.findElement(By.xpath("//select[@id='dd_date_8']")));
		day.selectByVisibleText("10");
		/////////
		WebElement year = driver.findElement(By.xpath("//select[@id='yy_date_8']"));
		year.click();
		 
		WebElement cli = driver.findElement(By.xpath("//option[@value='2013']"));
		cli.click();
		
		driver.findElement(By.xpath("//input[@id='profile_pic_10']")).sendKeys("C:\\file.jpg");
		
		
		
		
//		WebElement dropF = driver.findElement(By.xpath("//select[@id='dropdown_7']"));
//		dropF.click();
//		driver.findElement(By.xpath("//option[@value='Andorra']")).click();
		
//		Select country = new Select (driver.findElement(By.xpath("//select[@id='dropdown_7']")));
//		country.selectByIndex(10);
		
//		Select month = new Select (driver.findElement(By.xpath("//select[@id='mm_date_8']")));
//		month.selectByIndex(11);
//		Select day = new Select (driver.findElement(By.xpath("//select[@id='dd_date_8']")));
//		day.selectByValue("15");
//		Select year = new Select (driver.findElement(By.xpath("//select[@id='yy_date_8']")));
//		year.selectByVisibleText("1993");
		



		
	}
	@Test
	public void airk()  throws Exception{
		driver.get("https://mail.ru");
	}
}
