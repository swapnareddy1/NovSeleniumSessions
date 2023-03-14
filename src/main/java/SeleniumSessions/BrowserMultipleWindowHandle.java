package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentwindowid = driver.getWindowHandle();
		Thread.sleep(1500);

		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		Thread.sleep(1500);
		liEle.click();
		fbEle.click();
		twEle.click();
		ytEle.click();

		//driver.switchTo().window(parentwindowid);
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		while(it.hasNext()) {
			
			String windowId = it.next();
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			
			if(!(windowId.equals(parentwindowid))) {
				driver.close();
			}
			
		}

	}

}
