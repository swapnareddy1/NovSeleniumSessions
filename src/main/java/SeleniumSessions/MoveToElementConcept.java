package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		WebElement ele=driver.findElement(By.cssSelector("a.menulink"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).build().perform();
		
		driver.findElement(By.linkText("COURSES")).click();

	}

}
