package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {

	private WebDriver driver;

	 String browser="firefox";

	public WebDriver initDriver(String browsername) {

		switch (browsername.toLowerCase().trim()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("enter the correct browser");
			break;

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;
	}

	public void loateUrl(String url) {
		driver.get(url);
	}

	public String getpageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void quitBrowser() {
		if (driver!= null) {
			driver.quit();
		}
	}
}
