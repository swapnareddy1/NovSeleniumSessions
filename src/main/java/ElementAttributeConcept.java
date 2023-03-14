import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By ph = (By.name("firstname"));
		String placehldrval = getElementAttribute(ph, "placeholder");
		System.out.println(" placeholder value is :" + placehldrval);

		// System.out.println(ph);

		String srcVal = driver.findElement(By.className("img-responsive")).getAttribute("src");
		String titVal = driver.findElement(By.className("img-responsive")).getAttribute("title");
		System.out.println(srcVal + " -------> " + titVal);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String getElementAttribute(By locator, String attribute) {
		return getElement(locator).getAttribute(attribute);
	}
}
