package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {

	private WebDriver driver;

	public ElementUtility(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		String text = getElement(locator).getText();
		return text;
	}
}
