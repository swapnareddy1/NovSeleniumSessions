package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleUrl {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("Forgotten Password")).click();
		// System.out.println(driver.getTitle());

		String title = waitForTitleContainsAndFetch(10, "Password");
		// System.out.println(title);

		if (title.contains("Forgot Your Password?")) {
			System.out.println("PASS");
		}
		

		waitForURLContainsAndFetch(10,"forgotten");
	}

	public static String waitForTitleContainsAndFetch(int timeout, String titlefractionvalue) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(titlefractionvalue));
		return driver.getTitle();
	}

	public static String waitForTitleAndFetch(int timeout, String titlevalue) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(titlevalue));
		return driver.getTitle();
	}
	
	public static String  waitForURLContainsAndFetch(int timeout,String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(urlFraction));
		return driver.getCurrentUrl();
		
	}

}
