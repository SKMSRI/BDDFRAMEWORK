package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://www.pavantestingtools.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		/*
		 * WebElement link=driver.findelement(by.xpath()).click();
		 * driver.navigate.back(); Thread.sleep(5000);
		 * 
		 * try { link.click(); } catch(StaleElementReferenceException e) { WebElement
		 * link=driver.findelement(by.xpath()).click(); }
		 */

	}

}

/*
 * Solution 1: Refreshing the web page. 
 * Solution 2: Using Try Catch Block.
 * Solution 3: Using ExpectedConditions. refreshed. 
 * Solution 4: Using POM.
 */