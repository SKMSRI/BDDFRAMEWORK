package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitConcept_ImplicitWait {

public static void main(String[] args) {

		
	System.setProperty("webdriver.chrome.driver", "C:/Users/SKM/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("http://www.half.ebay.com"); //enter URL
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

}
}
//Implicit waits tell to the WebDriver to wait for a certain amount of time before it throws an exception. 
//Once we set the time, WebDriver will wait for the element based on the time we set before it throws an exception. 
//The default setting is 0 (zero). We need to set some wait time to make WebDriver to wait for the required time.
//1. IT's always applied globally.
//2.dynamic in nature
//3.it can be change anywhereand at anytime of ur code.