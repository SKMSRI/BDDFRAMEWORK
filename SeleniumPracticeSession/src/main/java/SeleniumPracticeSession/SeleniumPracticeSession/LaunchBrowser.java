package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// Firexfox driver
//			System.setProperty("webdriver.gecko.driver", "C:/Tools/Selenium/geckodriver-v0.29.0-win64/geckodriver.exe");
//			WebDriver driver =new FirefoxDriver();
//			driver.get("https://www.google.com");
		// chromeDriver
		System.setProperty("webdriver.chrome.driver",
				"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String title = driver.getTitle();// Get Title
		System.out.println(title);
		// Validation point
		if (title.equals("Google")) {
			System.out.println("correct Title");
		} else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());// for print current url
		driver.quit();// for quit bowser

	}
}
