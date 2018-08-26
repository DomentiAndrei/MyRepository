package OntheLessons.II_Lesson;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Boss {
	WebDriver driver;
	@BeforeMethod//действия которые выполняются до теста
	public void steps() {//обявление метода 
		Reporter.log("Select Browser",true );//выводит сообщение в консоль
		
		Scanner input = new Scanner(System.in);// сканер используется для ввода данных с клавиатуры
		String a = input.nextLine();//объявление переменной а // input.nextLine(); для ввода строки
		
		if(a.equals("C")) { // если пользователи дал значение переменной а = C 
			
			driver = new ChromeDriver();	// тогда откроется хром
			System.out.println(driver.getClass().getSimpleName()); // выводит какои тип браузера запустьлся
		}
		if(a.equals("F")) {// если пользователи дал значение переменной а = F
			System.setProperty("webdriver.gecko.driver", "C://Drivers//geckodriver.exe" );
			driver = new FirefoxDriver();// тогда откроется firefox
			System.out.println("FireFox Browser is Opening");// выводит в консоль то что промеж "-----"
		}
		driver.manage().window().maximize();// позволяет полностью открыть окно
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// должно открываться окно до 10 секунд если нет тогда тест падает
		
		////test
	}
	
	
	@AfterMethod
	public void exit() throws Exception{
	Thread.sleep(3000);//ждем 4 секунды
	driver.quit();//закрывает браузер
	}
}
