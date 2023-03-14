package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		List<String> sectionlist = getfooterSecList("Information");
		System.out.println(sectionlist);
	}

	public static List<String> getfooterSecList(String secname) {

		List<WebElement> footerlist = driver
				.findElements(By.xpath("//h5[text()='" + secname + "']/following-sibling::ul//a"));

		System.out.println(footerlist.size());

		List<String> seclist = new ArrayList<String>();

		for (WebElement e : footerlist) {
			String text = e.getText();
			seclist.add(text);
		}
		return seclist;

	}

}
