package My_Personal;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class lessonaAllert  extends BaseC_GR_1{
@Test
	public void test() {
		driver.get("http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html");
		
		driver.findElement(By.xpath("//a[@id='jre-8u181-oth-JPRXXXjre-8u181-solaris-sparcv9.tar.gz']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//form[@name='agreementFormjre-8u181-oth-JPR']//input[1]")).click();
		driver.findElement(By.xpath("//a[@id='jre-8u181-oth-JPRXXXjre-8u181-solaris-sparcv9.tar.gz']")).click();
		
		
		
		


		
		
	}
}
