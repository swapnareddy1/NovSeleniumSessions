package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {
	public static void main(String[] args) {

		String browser = "chrome";

		BrowserUtil brUtil = new BrowserUtil();

		// initialize driver

		WebDriver driver = brUtil.initDriver(browser);

		brUtil.locateUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// String pageTitle = brUtil.getPageTitle();

		// System.out.println(pageTitle);
		String title = brUtil.getPageTitle();
		System.out.println("page title is:"+title);

        //locate webelements
		// By firstname=By.id("input-firstname");//ID locator
		By firstname = By.name("firstname");// NAME locator
		// By firstname= By.className("form-control");//classname locator
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confpassword = By.id("input-confirm");
		By checkbox = By.name("agree");
		By continueButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

		// By link=By.linkText("Forgotten Password");

		// String header= driver.findElement(By.tagName("h1")).getText();
		// System.out.println(header);
		By text1 = By.tagName("h1");
		// performing action
		Elementutil eleUtil = new Elementutil(driver);

		eleUtil.doSendKeys(firstname, "swapna5");
		eleUtil.doSendKeys(lastname, "reddy");
		eleUtil.doSendKeys(email, "sasd1@gmail.com");
		eleUtil.doSendKeys(telephone, "123456789");
		eleUtil.doSendKeys(password, "swapna123");
		eleUtil.doSendKeys(confpassword, "swapna123");
		eleUtil.doClick(checkbox);
		eleUtil.doClick(continueButton);
		// eleUtil.doClick(link);

		String header = eleUtil.doElementgetText(text1);
		System.out.println(header);

	}

}
