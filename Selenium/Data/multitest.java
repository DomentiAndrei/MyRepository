package OntheLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;
import OntheLessons.III_Lesson.screens;

public class multitest  extends BaseC_GR_1{
@Test
	public void fil() throws Exception {
		
		driver.get("https://demoqa.com/registration/");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='name_3_firstname']"));
		System.out.println("Element is Display: " + user.isDisplayed());
		log.info(user.isDisplayed());
		WebElement 	marS =driver.findElement(By.xpath("//input[@value='single']"));
		marS.click();
		System.out.println(marS.isEnabled());
		
		WebElement dance = driver.findElement(By.xpath("//input[@value='dance']"));
		dance.click();
		System.out.println(dance.isSelected());
		
		screens src = new screens();
		src.screen(driver);
		
	}
}
