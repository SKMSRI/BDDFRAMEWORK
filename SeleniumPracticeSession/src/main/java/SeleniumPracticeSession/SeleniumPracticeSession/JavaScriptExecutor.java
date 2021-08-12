package SeleniumPracticeSession.SeleniumPracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/SAURABH/Workspace/SeleniumPracticeSessions/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://www.facebook.com");
//		driver.findElement(By.name("email")).sendKeys("SKM");
//		driver.findElement(By.name("pass")).sendKeys("1234");
		WebElement loginbtn = driver.findElement(By.name("login"));
		flash(loginbtn, driver);

	}

	//JavaScript executor sytax
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,200,0)", element, driver);// 1
			changeColor(bgcolor, element, driver);// 2
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
}
