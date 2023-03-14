package TestNGSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class RegistrationPageTest {
	public WebDriver driver;

	public void doRegister() {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys("swapna");

		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys("reddy");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swapnaabc@gmail.com");

	}

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
