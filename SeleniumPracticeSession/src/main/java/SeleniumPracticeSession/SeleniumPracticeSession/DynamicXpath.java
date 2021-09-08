package SeleniumPracticeSession.SeleniumPracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();// lauchchrome
	driver.get("https://www.cricbuzz.com/");
	driver.findElement(By.xpath("//a[@class ='cb-nws-hdln-ancr text-hvr-underline']")).click();
}
}