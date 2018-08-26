package Example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class for_web_Element_S {
	static WebDriver driver;
	@Test
	public static  void  cicle() throws Exception{
		driver = new ChromeDriver();//
		String url = "https://google.com";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement fi = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		fi.sendKeys("Bear");
		fi.submit();
		//driver.findElement(By.xpath("//input[@value='Поиск в Google']")).click();
		
		List <WebElement> links = driver.findElements(By.xpath("//h3[@class='r']/a"));//findElement[s] находи список элементов
		int listLinks = links.size(); //помещает в переменную listLinks типа int сколько элементов было найдено верхним xpath-фом
		
		System.out.println("Total Links on the Page: " + listLinks);
		
		for(int i=0;i<listLinks;i++) {
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			if(driver.getPageSource().contains("QA")) {//if = есль на открытои странице наидено QA 
				System.out.println("Yes"); // то тогда в консоли попадёт Yes
			}else {
				System.out.println("No");//есль не наидено QA то выведет No
			}
			driver.navigate().back();
			links = driver.findElements(By.xpath("//h3[@class='r']/a"));
			Thread.sleep(2000);
		}
		Thread.sleep(1500, 1);
		//close(driver);
	}
	public static void close(WebDriver driver) {
		driver.quit();
	}
	
	

}
