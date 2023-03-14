package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	 driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//1:create webelement
//		driver.findElement(By.id("input-email")).sendKeys("swana@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("swapna123");
		
       // 2:2nd approach
//	WebElement email=driver.findElement(By.id("input-email"));
//	WebElement pwd= driver.findElement(By.id("input-password"));
//	email.sendKeys("swapna@gmail.com");
//	email.sendKeys("swapna");
		
      // 3rd approach
//		By email=By.id("input-email");
//		By pwd=By.id("input-password");
//		WebElement eid=driver.findElement(email);
//		WebElement password=driver.findElement(pwd);
//		eid.sendKeys("swapna@gmail.com");
//		password.sendKeys("swapna@gmail.com");
		
		//4th approach
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		
		getElement(email).sendKeys("swapna@gmail.com");
		getElement(pwd).sendKeys("swapna");
		
		
		
		}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
    public static void doSendKeys(By locator,String value) {
    	getElement(locator).sendKeys(value);
	 
 }
}
