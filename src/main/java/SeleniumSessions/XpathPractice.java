package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]")).click();

	}

}
