package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("SKMSRI");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("skm1234");
		driver.navigate().refresh();
		//For Handle stale element exception
		//comment try catch block for reproduce stalelement exception
		try {
			username.sendKeys("SKMSRI");	
		}
		catch(StaleElementReferenceException e) {
			username = driver.findElement(By.name("username"));
			username.sendKeys("SKMSRI");	
		}

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
 * Solution 1: Refreshing the web page. Solution 2: Using Try Catch Block.
 * Solution 3: Using ExpectedConditions. refreshed. Solution 4: Using POM.
 */