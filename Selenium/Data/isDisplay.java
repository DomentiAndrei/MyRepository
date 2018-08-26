package Example;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ch.qos.logback.core.util.FileUtil;

public class isDisplay {

	@Test
	public  void lowerCas()  throws Exception{
		
		
		Logger log = Logger.getLogger("isDisplay");
		PropertyConfigurator.configure("C:\\Users\\Andrei\\eclipse-workspace\\Selenium\\src\\main\\java\\Example\\Log4j.properties");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    String baseUrl = "http://www.google.com";
	    
	    driver.get(baseUrl);
	    log.info("Google Base Page Opened");
	    //First approache
	    
	    if(driver.getPageSource().contains("Поиск в Google"	) ) {
	    	log.info("Yes with getPageSource");
	    	System.out.println("Yes with getPageSource");
	    }else
	    	System.out.println("No");
	    
	   System.out.println("Element is: " + driver.findElement(By.xpath("//input[@id='lst-ib']")).isEnabled());
	   log.info("Element is present");
	   WebElement chees = driver.findElement(By.xpath("//input[@id='lst-ib']")); 
	   chees.sendKeys("Cheese");
	   log.info("Inscription Introduced");
	   System.out.println(chees.getSize());
	  
	   
	    //next approache
	    Assert.assertTrue(driver.findElement(By.xpath("//span[@class='Q8LRLc']")).getText().matches("Молдова"));
	    if (driver.findElement(By.xpath("//span[@class='Q8LRLc']")).getText().matches("Молдова")) {
	    	System.out.println("Yes with Asser + matches");
	    }else {
	    	System.out.println("No");
	    }
	    log.info("Found");
	    
	    				//finding 					//xpath for finding 	
	    Assert.assertEquals("Почта", driver.findElement(By.xpath("//a[@class='gb_P'][contains(text(),'Почта')]")).getText());
	
	    //one more approache
	    WebElement konf = driver.findElement(By.xpath("//a[@class='Fx4vi'][contains(text(),'Конфиденциальность')]"));
	    log.info(konf.getText());
	    if(konf.isDisplayed()) {
	    	System.out.println("Yes with is Display");
	    }else {
	    	System.out.println("No");
	    }
//	    WebElement eng = driver.findElement(By.xpath("//a[@href='https://www.google.com/setprefs?sig=0_ta8TxskHX3YD-0YciT7Utbk709k%3D&hl=ro&source=homepage"
//	    		+ "&sa=X&ved=0ahUKEwjMur_209_aAhUJKVAKHfS9CU0Q2ZgBCAk']"));
//	    eng.click();
	    //
	    driver.findElement(By.xpath("//a[@class='Fx4vi'][contains(text(),'Конфиденциальность')]")).click();
	    log.info("Move to next Link");
	    
	   
	    WebElement size1 = driver.findElement(By.xpath("//h1[@class='VssgIe']"));
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(size1));
	    
	    if (size1.isDisplayed()) {
	    	System.out.println("Yes with driver wait");
	    }
	    log.info("Element is: " + size1.isDisplayed() );
	    
	    Thread.sleep(1000);
	    if(driver.getPageSource().contains("Представляем" ) ) {
	    	System.out.println("Yes with Thread Sleep");
	    }else 
	    	System.out.println("No");
	    log.info("Element with name " + driver.getPageSource().contains("Обзор"));
	    Assert.assertTrue(driver.getPageSource().contains("Обзор"));
	    System.out.println("Yes - Обзор found on source page");
	   // isDisplay.screen(driver);
	    
	    log.info("data correct");	
	    
	    
	    apply(driver);
	    screen(driver);
	    log.info("Screen has been done");
	    exit(driver, log);
	   
	  
	    
}
	public  Boolean apply (WebDriver d) {
		return d.getTitle().toLowerCase().startsWith("cheese!!!");
	}
	
	public    void screen(WebDriver dr) throws Exception {
		DateFormat dateF = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		File src = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\Users\\Andrei\\Desktop\\Java_Files\\Log4j\\Example\\Screens\\" + this.getClass().getSimpleName() + " " +   dateF.format(date)  +  ".png"));
		
		
	}
	
	public  void exit(WebDriver driver , Logger log) throws Exception{
		Thread.sleep(2000);
		driver.quit();
		log.info("Browser Close");
	}
	
	
	
	
	
}