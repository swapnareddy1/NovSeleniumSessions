package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();

		String text = alert.getText();

		System.out.println(text);

		if (text == "Please enter a valid user name") {

			Thread.sleep(2000);
			alert.accept();

		} else {
			alert.dismiss();
			System.out.println("dismiss");
		}
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();

		Alert alert1 = driver.switchTo().alert();

		String txt = alert1.getText();

		System.out.println(txt);
		alert1.accept();
	}

}
