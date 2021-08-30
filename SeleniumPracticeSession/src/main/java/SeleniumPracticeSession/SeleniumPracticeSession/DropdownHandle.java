package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\SAURABH\\Workspace\\SeleniumPracticeSession\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		

	}
}

/*
1.selectByVisibleText()/ deselectByVisibleText()- selects/deselects an option by its displayed text
2. selectByValue()/ deselectByValue():- selects/deselects an option by the value of its "value" attribute
3. selectByIndex()/ deselectByIndex():- selects/deselects an option by its index
4. isMultiple():- Returns TRUE if the drop-down element allows multiple selection at a time; FALSE if otherwise
5. deselectAll():- Deselects all previously selected options
6. Select by get options().
==================================
 * 1. How to use Select Class
 * 2. Different methods in Select Class
 * 3. Difference between Select by Index and Select by Visible Text Methods
 * 4. What is Get options Method in Select Class
 * 5. How to print all the values from Drop Down
 * 6. How to handle Drop Down without using Select Class using Find Elements Method.
 */
