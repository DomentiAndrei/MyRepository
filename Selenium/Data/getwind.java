package My_Personal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class getwind extends BaseC_GR_1 {
@Test
	public void bior() throws Exception{
	
		driver.get("https://www.bing.com/"); 
		
		String first = driver.getWindowHandle(); //переменная стринг с именем (first) в  который записывается первый код
		System.out.println(first);//печатаем наш код страницы в консоль (уникален и каждый раз разныи )
		
		driver.findElement(By.xpath("//li[@id='outlook']//a[@id='off_link']")).click(); //делаем клик - открывается новая вкладка
		
		for(String sec : driver.getWindowHandles()) { // цикл For и снова переменная стринг в которую записывается уже остальные коды страницы
			
			driver.switchTo().window(sec);//переключается на новую вкладку
			System.out.println(driver.getCurrentUrl());// получаем ссылку сайта
			driver.switchTo().window(first);//переключается на первую вкладку
			
			
			driver.switchTo().window(sec);//переключается на вторую вкладку
			Thread.sleep(1000);
			driver.switchTo().window(first);
			Thread.sleep(1000);
			driver.switchTo().window(sec);
			Thread.sleep(1000);
			driver.switchTo().window(first);
			Thread.sleep(1000);
			driver.switchTo().window(sec);
			Thread.sleep(1000);
			driver.switchTo().window(first);
			if(!sec.equals(first)) { // если второи  код не равен первому тогда печатаем код второи  
				System.out.println(sec);
			}
			
		}		
	}
}
