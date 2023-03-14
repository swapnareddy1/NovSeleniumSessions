package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilevelMenuHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		By L1Cat = By.cssSelector("a.meganav-shop");
		
		
		Actions act=new Actions(driver);
		act.moveToElement(shopbycategory).build().perform();
		Thread.sleep(5000);
		
		WebElement level1 =driver.findElement(By.linkText("Fruits & Vegetables"));
		act.moveToElement(level1).build().perform();
		Thread.sleep(3000);
		
		WebElement level2 =driver.findElement(By.linkText("Fresh Fruits"));
		act.moveToElement(level2).build().perform();
		Thread.sleep(3000);
		
		WebElement level3 =driver.findElement(By.linkText("Mangoes"));
		level3.click();
		
		
		
	}

}
