package SeleniumPracticeSession.SeleniumPracticeSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Testing_withoutBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		// ChromeOptions object
		ChromeOptions opt = new ChromeOptions();
		// headless parameter
		opt.addArguments("headless");
		// set parameter to Chrome driver
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/questions/index.php");
		// obtain page title
		System.out.println("Page title without browser: " + driver.getTitle());
		driver.quit();
	}
}

//Syntax

//ChromeOptions opt = new ChromeOptions();
//opt.addArguments("headless");
//WebDriver d = new ChromeDriver(opt);