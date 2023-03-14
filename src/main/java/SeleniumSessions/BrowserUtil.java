package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	
		/**
		 * this class is used to initialize the driver on the basis of given browser
		 * 
		 */
	
	private WebDriver driver;
	//intialize driver by passing browsername
	
	public WebDriver initDriver(String browsername)
	{
		switch(browsername) {
		
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		default:
				System.out.println("enter the valid browser");
				break;
				
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
	}
	//method to pass url
	public void locateUrl(String url) {
		driver.get(url);
	}
	//method to get title of the page
	public String getPageTitle() {
		String title=driver.getTitle();
		//System.out.println(title);
		return title;
	}
	
public void closeBrowser() {
	driver.close();
}
public void quitBrowser() {
	if(driver!=null) {
	driver.quit();
	}
}
	
	
	
	
	}
	


