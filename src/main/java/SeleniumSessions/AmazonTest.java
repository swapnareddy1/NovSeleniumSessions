package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brutil=new BrowserUtil();
		
		brutil.initDriver("chrome");
		brutil.locateUrl("https://www.amazon.com");
		
		String acttitle=brutil.getPageTitle();

	}

}
