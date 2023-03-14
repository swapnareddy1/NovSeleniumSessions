package TestNGSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestWithBM {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		
	}
	
	
	@Test(priority = 1)
	public void amazonTitleTest() { 
		String title=driver.getTitle();
		System.out.println("page title :"+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	@Test(priority = 2)
	public void isSearchTabExist() {
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void isHelpExist() {
		boolean flag=driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}

