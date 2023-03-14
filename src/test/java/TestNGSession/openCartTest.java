package TestNGSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openCartTest extends BaseTest{
		
	@Test
	public void isSearchExist() {
		
		boolean flag=driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=1)
	public void titleTest() {
		
		//driver.get(url);
		String title=driver.getTitle();
		System.out.println("page title :"+title);
		Assert.assertEquals(title, "Your Store");
	}
	
	

}
