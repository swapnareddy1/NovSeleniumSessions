package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertsPopUp {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// System.out.println(alert.getText());
		// alert.accept();
		String txt = waitForAlertText(10);
		System.out.println(txt);
		//alert.accept();
		AlertAccept(5);
		//alertSendKeys(10,"swapna hi");
	}

	public static Alert waitForAlertPresent(int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String waitForAlertText(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return waitForAlertPresent(timeout).getText();
	}

	public static void AlertAccept(int timeout) {
		waitForAlertPresent(10).accept();
		
	}
	public static void AlertDismiss(int timeout) {
		waitForAlertPresent(10).dismiss();
		
	}
	public static void alertSendKeys(int timeout,String value) {
		waitForAlertPresent(10).sendKeys(value);
		
	}
}
