package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUseCases {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		By links=By.tagName("a");
		getTotalElementCount(links);
		
	}
	public static int getTotalElementCount(By locator){
		int eleCount=driver.findElements(locator).size();
		System.out.println("total elements for :"+locator+"------->"+eleCount);
		return eleCount;
		
	}
	

}
