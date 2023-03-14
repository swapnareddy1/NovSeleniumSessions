package TestNGSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	public WebDriver driver;
	
	public boolean doLogin(String username,String password) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("username");
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errMesg=driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
		System.out.println(errMesg);
		
		if(errMesg.contains("Warning: Your account has exceeded allowed number of login attempts. ")) {
			return true;
		}
		return false;
		
	}
	@BeforeTest
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
	}
	
	@Test(dataProvider="getLoginNegativeData")
	public void loginTest(String username,String password) {
		boolean flag=doLogin(username,password);
		Assert.assertTrue(flag);
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		
		return new Object[][] {
			{"abcccccc@gmail.com", "testttt@123"},
			{"adsaaf1212@gmail.com", "testttt@123"},
			{"agfdsx", "testttt@123"},
			{"tnbvcxz@gmail.com", " "},
			{"testtttt@gmail.com", "testtttt"},
			{"#tghbfdssagmail.com", "asdasdasd"}
	};

}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	}
