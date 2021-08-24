package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonClasses {
	public static WebDriver driver = null;

	public static void initilize() {
		// Use Of Singleton Concept and Initilize webDriver
		if (driver == null) {
			if (ConstantVariable.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (ConstantVariable.browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (ConstantVariable.browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.edge.driver",
						"F:\\Photon_Workspace\\SingletonPracticeProject\\Drivers\\MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			}
		}

		// Perform Basic Operations
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	public static void quit() {
		driver.quit();
		driver = null; // we destroy the driver object after quit operation
	}

	public static void close() {
		driver.close();
		driver = null; // we destroy the driver object after quit operation
	}

	public static void openurl(String URL) {
		driver.get(URL);
	}
}}

/*
 * It is a class that can have only one object (an instance of the class) at a
 * time.
 * 
 * To create the singleton class, we need to have static member of class,
 * private constructor and static factory method. 1. Static member: It gets
 * memory only once because of static, itcontains the instance of the Singleton
 * class. 2. Private constructor: It will prevent to instantiate the Singleton
 * class from outside the class.
 */