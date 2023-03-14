package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiExample {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		WebElement enterText=driver.findElement(By.xpath("//input[@id='searchInput']"));
		enterText.sendKeys("india");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'pure-button')]")).click();

	}

}
