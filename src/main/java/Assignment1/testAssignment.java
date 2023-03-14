package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testAssignment {
	
    static WebDriver driver;
    
	public static void main(String[] args) {
		
		String browser = "firefox";
		
		BrowserUtility brUtil = new BrowserUtility();
		
		 driver=brUtil.initDriver(browser);
		
		brUtil.loateUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = brUtil.getpageTitle();
		System.out.println(title);
		
		//brUtil.quitBrowser();
		By email=By.id("input-email");
		By pwd=By.name("password");
		By loginbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By linktext=By.linkText("Register");
		//By header=By.tagName("h1");
		
		ElementUtility eleutil=new ElementUtility(driver);
		
		eleutil.doSendkeys(email,"awsde@gmail.com");
		eleutil.doSendkeys(pwd,"qwer");
		eleutil.doClick(loginbutton);
		String textinlink=eleutil.doGetText(linktext);
		System.out.println("text in the link is : "+textinlink);
		
		//String headertext=eleutil.doGetText(header);
		//System.out.println(headertext);
	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	public static void doSendkeys(By locator,String value) {
//		getElement(locator).sendKeys(value);
//	}
//	public static void doClick(By locator) {
//		getElement(locator).click();
//	}
       
	}


