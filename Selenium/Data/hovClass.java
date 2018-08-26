package My_Personal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class hovClass extends BaseC_GR_1 {
@Test
	public void vori() throws Exception{

		String url = "https://www.marksandspencer.com/";
		driver.get(url);//перешли на сайт 
		
		Actions act = new Actions(driver);//Actions на основе драйвера
		WebElement food = driver.findElement(By.xpath("//span[contains(text(),'Food')]"));//на xpath куда будем наводить курсор
		
		act.moveToElement(food).build().perform();//мышка передвигается автоматически к элементу food
		Thread.sleep(1000);// ждём одну секунду 
		
		driver.findElement(By.xpath("//*[@id=\"SC_Level_1_14866033\"]/div/div/div[1]/div[2]/ul/li[4]/a")).click();// нажимаем на тот элемент на который мы хоти из выпадающего списка
		}
}
