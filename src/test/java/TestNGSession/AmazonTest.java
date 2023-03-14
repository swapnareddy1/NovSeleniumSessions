package TestNGSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	
	//testcases should be independent
	//priority will give the sequence of testcases
	//by default testcases will execute in alphabetical order
	//AAA stands for :Arrange ,Act , Assert
	//1 testcase with 1 assert is the bestpractice
	
	@Test(priority = 1)
	public void amazonTitleTest() { 
		driver.get("https://www.amazon.com");
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
	
}
