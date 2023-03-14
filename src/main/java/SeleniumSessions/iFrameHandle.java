package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

		driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("2022");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("BMW");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys("F-150");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys("black");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys("70");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-7']")).sendKeys("CA-6754");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-8']")).sendKeys("swapna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-9']")).sendKeys("38761 street 2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-11']")).sendKeys("sandiego");
		Thread.sleep(2000);
		
		WebElement stateSelect = driver.findElement(By.xpath("//select[@name='RESULT_RadioButton-12']"));
		Select select = new Select(stateSelect);
		select.selectByVisibleText("Arizona");
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-13']")).sendKeys("92130");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-14']")).sendKeys("498723421");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-15']")).sendKeys("swapna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FSsubmit']")).click();
		Thread.sleep(2000);
		
		
		
	}

}
