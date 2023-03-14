package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(2000);
		// get the window id's
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowHandle = it.next();
		String tweetWindow = it.next();

		// switch to twitter window
		driver.switchTo().window(tweetWindow);
		System.out.println("title :" + driver.getTitle());
		Thread.sleep(2000);
		// close the twitter driver
		driver.close();

		// switch to parent(Main) window
		driver.switchTo().window(parentWindowHandle);
		System.out.println("title :" + driver.getCurrentUrl());

		// System.out.println("title :"+driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();

		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();

		Thread.sleep(2000);

		String parentWindow1 = it1.next();

		String fbWindowId = it1.next();

		driver.switchTo().window(fbWindowId);
		System.out.println("current url :" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow1);
		System.out.println("current url :" + driver.getCurrentUrl());

		// youtube page
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click(); 

		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();
		Thread.sleep(2000);

		String parentWindow2 = it2.next();

		String youtubeWindow = it2.next();

		driver.switchTo().window(youtubeWindow);
		System.out.println("current url :" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow2);
		System.out.println("current url :" + driver.getCurrentUrl());

		// linkedin page
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		Set<String> handles3 = driver.getWindowHandles();
		Iterator<String> it3 = handles3.iterator();
		Thread.sleep(2000);

		String parentWindow3 = it3.next();

		String liWindow = it3.next();

		driver.switchTo().window(liWindow);
		System.out.println("current url :" + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindow3);
		System.out.println("current url :" + driver.getCurrentUrl());
	}

}
