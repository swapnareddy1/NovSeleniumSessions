package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open the browser
		//ChromeDriver driver=new ChromeDriver();
		String browser="edge";
		
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("enter the correct browser");
		}
		
		
		//url
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		
		System.out.println("page title:"+title);
		
		if(title.equals("Google")) {
			
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();
		

	}

}
