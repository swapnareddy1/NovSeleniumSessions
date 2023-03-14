package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.xpath("//input[@id='input-email']");
		By pswd = By.id("input-password");
		By loginButton = By.xpath("//input[@type='submit']");

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement emailid =
		// wait.until(ExpectedConditions.presenceOfElementLocated(email));
		// emailid.sendKeys("test@gmail.com");
		// getElement(pswd).sendKeys("test@123");
		// getElement(loginButton).click();
		waitForElementPresence(5, email).sendKeys("test@gmail.com");
		waitForElementPresence(5, pswd).sendKeys("test@123");
		waitForElementPresence(5, loginButton).click();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement waitForElementPresence(int timeout, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public static WebElement waitForElementVisible(int timeout, By locator) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
}
