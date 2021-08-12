package SeleniumPracticeSession.SeleniumPracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadpopup {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:/Tools/Selenium/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/SKM/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("/Users/SKM/Downloads/original.txt");

	}
}
