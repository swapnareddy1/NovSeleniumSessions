package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementFromPageSection {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> panelLinksList = driver.findElements(By.xpath("//div[@class='col-sm-3']//a"));
//
//		System.out.println(panelLinksList.size());
//
//		for (WebElement e : panelLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//	}
//}

		By rightPanelLinks = By.xpath("//aside[@id='column-right']//a");
		By downPanelLinks = By.xpath("//div[@class='col-sm-3']//a");
		List<String> downText = getElementsTextList(downPanelLinks);
		// List<String> text = getElementsTextList(rightPanelLinks);
		System.out.println(downText.size());
		System.out.println(downText);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsTextList(By locator) {

		List<String> textpanel = new ArrayList<String>();
		// List<String> textpanel=new <String>;

		List<WebElement> panellink = getElements(locator);

		for (WebElement e : panellink) {
			String panellinktext = e.getText();
			textpanel.add(panellinktext);
		}
		return textpanel;

	}

}
