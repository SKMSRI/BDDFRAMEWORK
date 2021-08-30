package SeleniumPracticeSession.SeleniumPracticeSession;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementsConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.goindigo.in/");

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.linkText("Manage"))).build().perform();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Flight Status")).click();

	}
}
