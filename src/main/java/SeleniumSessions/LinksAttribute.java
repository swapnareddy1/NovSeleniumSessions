package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		// locator for links
		By links = By.tagName("a");
		By images = By.tagName("img");

		// List<WebElement> linkslist = getElements(links);

//printing the values using for-each loop
//		for (WebElement e : linkslist) {
//			String hrefVal = e.getAttribute("href");
//			String linkText = e.getText();
//			System.out.println(hrefVal + ":::::::" + linkText);
		getElementAttributes(links, "href");
		getElementAttributes(images, "src");
//		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);

		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}
}
