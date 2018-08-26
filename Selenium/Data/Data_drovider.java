package OntheLessons;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;

public class Data_drovider  extends BaseC_GR_1{

	@Test(dataProvider = "password")
	public void steps(String user, String pass) {
		driver.get("https://ok.ru");
		
		driver.findElement(By.xpath("//input[@id='field_email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='field_password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Войти']")).click();
		
		if(driver.getPageSource().contains("Andrei M")) {
			System.out.println("Yes");
		}
	
	}
	@DataProvider(name = "password")
	public Object [][] concurrencyData(){
		return new Object[][] {
			{"1234","fitiairrer"},
			{"domew","operifre"},
			{"1234","fitiairrer"},
			{"rrrr","operttttttifre"},
			{"cvcv","gfgfgfgf"},
			{"34565","operifre"},
			{"1234","frtg9999"},
			{"    ","thytyhyt"},
			{"####","frffr"},
			{"vvdfd","1234567"},
		};	
	}
}
