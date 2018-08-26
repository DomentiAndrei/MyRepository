package Example;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class All {

	
	@Test
    public  void MyAll() throws Exception {
        
        WebDriver driver = new ChromeDriver();
        Logger log =  LogManager.getLogger("All");
        //PropertyConfigurator.configure("C:\\Users\\QA-3\\Desktop\\Selenium\\Selenium\\src\\main\\java\\My_Selenium\\All.properties");
        
        //System.setProperty("webdriver.firefox.marionette", "D:\\File_Java\\Driver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();    
        
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        wait(driver);
        driver.get("https://www.google.com/");
        screens(driver);
        WebElement field = driver.findElement(By.xpath("//input[@id='lst-ib']"));
        field.clear();
        String cat = "cat";
        field.sendKeys(cat);
        driver.findElement(By.xpath("//input[@name='btnK']")).click(); //looking for in google
        log.info(driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed());
        System.out.println("Element is display: " + driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed());
        
        wait(driver);
        driver.navigate().to("http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html");
        screens(driver);
        WebElement click = driver.findElement(By.xpath("//a[@id='jdk-10.0.1-oth-JPRXXXjdk-10.0.1_windows-x64_bin.exe']"));
        log.info(click.getText());
        System.out.println(click.getText());
        click.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        
        WebElement radioBut = driver.findElement(By.xpath("//html//div[@id='wrapper_lnav_maincont_rcol_foot']//input[1]"));
        radioBut.click();
        System.out.println("Element is selected" + radioBut.isSelected());
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Java SE Development Kit 10 Downloads')]")).getText());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String link = "https://mail.ru/";
        driver.get(link);
        screens(driver);
        driver.findElement(By.xpath("//a[@class='mailbox__footer']")).click();
        Thread.sleep(2000);
        //Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class='b-panel__header']")));
        
        String firstPage = driver.getWindowHandle();
        System.out.println(firstPage);
        driver.findElement(By.xpath("//a[@href='https://help.mail.ru/mail-help/UA']")).click();
        
        //log.info(driver.findElement(By.xpath("//div[@class='h-header__text']")).isDisplayed());
        for(String secPage : driver.getWindowHandles()) {
            driver.switchTo().window(secPage);
            if(!firstPage.equals(secPage)) {
                System.out.println(secPage);
            }
        }
        driver.switchTo().window(firstPage);
        driver.findElement(By.xpath("//input[@class='b-input b-input_responsive b-input_compact b-input_animate']")).sendKeys("Andrei");
        
        
        driver.navigate().to("http://www.hm.com/us");
        ;
        //System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().defaultContent();
        //driver.switchTo().alert().sendKeys("Yes, I confirm");
        driver.switchTo().alert().accept();
        
        screens(driver);    
        wait(driver);
        WebElement hov = driver.findElement(By.xpath("//html//nav[@class='mega-menu']/ul/li[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(hov).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='http://www.hm.com/us/products/ladies']")));
        driver.findElement(By.xpath("//a[@href='http://www.hm.com/us/products/ladies']")).click();
        System.out.println("Element is Display: " + driver.findElement(By.xpath("//a[@href='/us/']")).isDisplayed());
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        
        WebElement see =  driver.findElement(By.xpath("//div[@class='b-date__day']"));
        see.click();
        //see.se
        WebElement se = driver.findElement(By.xpath("//html//div[@class='b-date__day']//a[15]"));
        se.click();
        
        
        Thread.sleep(1000);
        driver.navigate().refresh();
        log.info(driver.getTitle());
        WebElement tex = driver.findElement(By.xpath("//span[@class='b-panel__header__text']"));
        log.info(tex.getText());
        
        wait(driver);
        driver.get("http://jqueryui.com/draggable/");
        screens(driver);
        driver.switchTo().frame(0);
        WebElement drog = driver.findElement(By.xpath("//div[@id='draggable']"));
        act.clickAndHold(drog).moveByOffset(150, 150).release(drog).build().perform();
        driver.switchTo().defaultContent();
        if(driver.getPageSource().contains("Droppable")) {
            System.out.println("URL is: " + driver.getCurrentUrl());
        }
        //act.moveToElement(drog).build().perform();
        
//        act = act.clickAndHold(drog);
//        
//        for(int i=0;i<20;i++){
//////            action = action.moveToElement(we);
//            act = act.moveByOffset(5, 5);
//            act = act.pause(500);
//        }
//        act.release(drog).build().perform();
        wait(driver);
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        act.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
        
        
        
        wait(driver);
        screens(driver);
        quit(driver);
        
    
        
    }
    public   void wait (WebDriver driver) {
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    
    public   void screens (WebDriver driver) throws Exception { 
        
        SimpleDateFormat dat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\QA-3\\Desktop\\FileJava\\ScreenShors\\AllTest\\" + dat.format(date)+ " " + this.getClass().getSimpleName() + ".png" ));
    }
public void quit(WebDriver driver) throws Exception{
        Thread.sleep(1000);
        driver.quit();
    }
    
}

