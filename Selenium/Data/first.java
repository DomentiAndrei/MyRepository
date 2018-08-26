package OntheLessons.I_Lesson;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; // все что "импорт" 'это библиотеки
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class first { // class

	@Test//аннотация  
	public void steps() throws Exception {// создаем метод
		
		
		WebDriver driver = new ChromeDriver(); // 
		driver.manage().window().maximize(); // позволяет полностью открыть окно
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // должно открываться окно до 10 секунд если нет тогда тест падает
		driver.get("https://mail.ru"); // первый способ чтобы открыть сайт
		driver.navigate().refresh();// обновляет страницу 
		
		String url = "https://youtube.com"; // даром значение переменной стринг >  "https://youtube.com"
		driver.navigate().to(url); //второи способ чтобы открыть саит
		
		WebElement field = driver.findElement(By.xpath("//input[@id='search']")); //находим уникальный путь по xpath 
		field.sendKeys("Java"); // sendKeys >Для передачи значения
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click(); //нажимаем на элемент
		
		Thread.sleep(3000); //ждем 3 секунды
		
		driver.navigate().back();//возвращается на шаг назад
		driver.navigate().refresh(); // обновляет страницу 
		Thread.sleep(4000);//ждем 4 секунды
		
		exit(driver); //привязывает второи метод к первому
		
	}// граница первого метода
	
	public void exit (WebDriver driver) {// создаем  2 метод
		driver.quit(); //закрывает браузер
	}//граница 2 метода 
	
	
}//class
