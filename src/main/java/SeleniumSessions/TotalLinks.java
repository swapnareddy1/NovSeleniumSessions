package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		// find all the links in a webpage
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));

		// total no of links
		System.out.println("total no of links : " + linkslist.size());

		// int count = linkslist.size();

//		for (int i = 0; i < count; i++) {
//			String text = linkslist.get(i).getText();
//			//System.out.println(i + ":" + text);
//			if(text.length()>0) {
//				System.out.println(i + ":" + text);
//				
//			}
//		}
		int count = 0;
		
		for (WebElement e : linkslist) {
			String text = e.getText();// text of each link
			
			if (text.length() > 0) {
				System.out.println(count + " : " + text);// print the text of link avoiding blank text
			}
			count++;
		}
		int blanktext=linkslist.size()-count;
		
		System.out.println(blanktext);
	}

}
