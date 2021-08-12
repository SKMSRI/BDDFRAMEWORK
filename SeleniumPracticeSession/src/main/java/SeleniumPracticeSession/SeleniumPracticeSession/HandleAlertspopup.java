package SeleniumPracticeSession.SeleniumPracticeSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertspopup {
	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "C:/Tools/Selenium/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/SKM/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);

		// 3 line syntax for pop & alerts
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		// alert.accept(); // for OK button

		// validtion of message
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct message");
		} else {
			System.out.println("In-correct message");
		}
		alert.accept(); // for OK button
//		alert.dismiss(); //for cancel button

		
	}

}
