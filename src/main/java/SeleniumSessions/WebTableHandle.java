package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		Thread.sleep(2000);

		/*
		 * driver.findElement(By.
		 * xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']"
		 * )) .click();
		 */
		selectUser("Ali khan");

//		String compname=driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/a[@context='company']")).getText();
//		System.out.println(compname);

		String compname = userCompany("Fatima Sana");
		System.out.println(compname);

		String num=driver
		.findElement(By
				.xpath("(//a[text()='Ali Khan']/parent::td/following-sibling::td/span)[position()=1]"))
		.getText();
		System.out.println(num);

	}

	public static void selectUser(String username) {

		driver.findElement(
				By.xpath("//a[text()='" + username + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}

	public static String userCompany(String username) {
		return driver
				.findElement(By
						.xpath("//a[text()='" + username + "']/parent::td/following-sibling::td/a[@context='company']"))
				.getText();
	}

//	public static String userPhone(String username) {
//		return driver
//				.findElement(By
//						.xpath("(//a[text()='" + username + "']/parent::td/following-sibling::td/span)[position()=1]"))
//				.getText();
//
//	}

}
