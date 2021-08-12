package SeleniumPracticeSession.SeleniumPracticeSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Images {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/SAURABH/Workspace/SeleniumPracticeSessions/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://www.amazon.in/");
		
		
}
//**For checking the broken links, you will need to do the following steps.
//
//1. Collect all the links in the web page based on "a" and "img" tags.
//2. Send HTTP request for the link and read HTTP response code.
//3. Find out whether the link is valid or broken based on HTTP response code.
//4. Repeat this for all the links captured.