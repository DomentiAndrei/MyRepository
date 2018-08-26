package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Max_Full_Screen {
	WebDriver driver = new ChromeDriver();
	

	
	@Test(dataProvider = "inputDate")
	public void stp(String user, String pass) throws Exception{
		
		String url = "https://ok.ru";
		driver.navigate().to(url);
		driver.findElement(By.xpath("//input[@id='field_email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='field_password']")).sendKeys(pass);
		
//		for (int a = 0 ; a < 10; a ++) {
//			WebElement field = driver.findElement(By.xpath("//input[@id='field_email']")); //
//			field.sendKeys("Maxim_Opera");
//			
//			Thread.sleep(1500);
//			driver.findElement(By.xpath("//input[@value='Войти']")).click();
//			Thread.sleep(1000);
//			field.clear();
//		}
	}
	
	@DataProvider(name = "inputDate")
	public Object [][] testq() {
		Object[][] okkk = new Object[2][2];
		okkk[0][0] = "DomAndy";
		okkk[0][1] = "123456789";
		okkk[1][0] = "Dom";
		okkk[1][1] = "123456";
		
		return okkk;
		
		
	}
	
	
}
