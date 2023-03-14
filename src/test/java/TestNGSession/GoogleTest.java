package TestNGSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	@Test
	public void isSearchVisible() {
		boolean flag=driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public void titleTest() {
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("title is :"+title);
		Assert.assertEquals(title,"Google");
	}
	
	
}
