package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementutil {

	private WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doClick(By locator) {
		getElement(locator).click();

	}

	public String doElementgetText(By locator) {
		String text = getElement(locator).getText();
		return text;

	}

	public void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);

		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getTotalElementCount(By locator) {
		int eleCount = driver.findElements(locator).size();
		System.out.println("total elements for :" + locator + "------->" + eleCount);
		return eleCount;

	}
}
