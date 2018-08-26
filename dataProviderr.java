package GrOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderr {

	WebDriver driver = new ChromeDriver();
	
	@Test(dataProvider = "introduce")
	public void stepU(String user , String pass) {//передаюстя 2 параметра типа String 
		driver.get("https://ok.ru");
		driver.findElement(By.xpath("//input[@id='field_email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='field_password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@data-l='t,sign_in']")).click();
		
		if (driver.getPageSource().contains("D Andrei")) {
			System.out.println("Yes");
		}
		
//		List <WebElement> links = driver.findElements(By.xpath("//div[@unselectable='on']"));
//		int link = links.size();
//		System.out.println("Total links: "+ link);
//		for(int a = 0; a < link; a++) {
//			links.get(a).click();
//			System.out.println("Yes");
//			
//		}
//		driver.get("https://www.yandex.ru");
//		driver.findElement(By.xpath("//input[@id='text']")).sendKeys("QA");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		List<WebElement> lista = driver.findElements(By.xpath("//h2[@class='organic__title-wrapper typo typo_text_l typo_line_m']"));
//		
//		int linki = lista.size();
//		System.out.println("Total links :" + linki);
//		for(int b = 0; b < linki;  b++) {
//			links.get(b).click();
//			System.out.println(driver.getCurrentUrl());
//		}
		
		
		
		

	}
	@DataProvider(name = "introduce")
	public Object[][] concurrencyData() {
	    return new Object[][] {
	      {"DomAndy", "   "},
	      {"0000", "41234567"},
	      {"DomAndy1", "41234567"},
	      {"DomAndy1", "41234567"},
	      {"DomAndy11", "1041234567"},
	      {"11DomAndy11", "121041234567"},
	      {"1311DomAndy11", "14121041234567"},
	      {"151311DomAndy11", "1141210412345676"},
	      {"1151311DomAndy117", "111412104123456768"},
	      {"DomAndy", "armagidon1993"},
	    };
	  }
//	public Object [][]inser() {
//		Object [][] siteOK = new Object[2][2];
//		siteOK[0][0] = "DomAndy";
//		siteOK[0][1] = "armagidon";
//	
//		siteOK[1][0] = "DomAndy";
//		siteOK[1][1] = "armagidon1993";
//		
//	
// 		return siteOK;
//	}
	
	
}
