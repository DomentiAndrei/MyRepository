package OntheLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import My_Personal.BaseC_GR_1;
import OntheLessons.III_Lesson.screens;

public class drag_drop extends BaseC_GR_1{

	@Test
	public void drop() throws Exception {
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.xpath("//body/div[1]"));
		WebElement drop = driver.findElement(By.xpath("//body/div[2]"));
		
		Actions act = new Actions(driver);
		screens src = new screens();
		src.screen(driver);
		
		act.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
		
		
	}
}
