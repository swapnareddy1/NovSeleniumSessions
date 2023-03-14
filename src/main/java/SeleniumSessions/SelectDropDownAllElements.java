package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

		By dropdownele = By.id("Form_getForm_Country");
		//WebElement country = driver.findElement(dropdownele);

//		Select select = new Select(country);
//		List<WebElement> countrylist = select.getOptions();
//		System.out.println(countrylist.size());
//
//		select.selectByIndex(5);
//		Thread.sleep(2000);
//		select.selectByValue("India");
//		Thread.sleep(2000);
//		select.selectByVisibleText("Brazil");

//		for (WebElement e : countrylist) {
//			String countrynames = e.getText();
//			System.out.println(country);
//		}
		doSelectDropDownByIndex(dropdownele,6);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
}
