package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();// Get Title
		System.out.println(title);
		// Validation point
		if (title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("correct Title");
		} else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());// for print current url
		//driver.quit();// for quit bowser

	}


	}

