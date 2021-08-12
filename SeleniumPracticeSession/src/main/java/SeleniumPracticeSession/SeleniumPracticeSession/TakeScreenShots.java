package SeleniumPracticeSession.SeleniumPracticeSession;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {

	static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/SAURABH/Workspace/SeleniumPracticeSessions/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();// lauchchrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		takescreenshot("login_page");

	}

	private static void takescreenshot(String filename) {
//		 Take screenshot and store as a file format
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(s, new File("C:\\SAURABH\\Workspace\\SeleniumPracticeSessions\\Screenshots.png"));
	}
}
