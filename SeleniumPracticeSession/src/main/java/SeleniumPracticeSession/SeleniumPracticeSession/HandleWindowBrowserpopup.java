package SeleniumPracticeSession.SeleniumPracticeSession;

import java.util.Set;
import java.util.Iterator;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowBrowserpopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/SKM/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// lauchchrome
		driver.get("https://www.salesforce.com/in");
		driver.findElement(
				By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
		Thread.sleep(5000);
		Set<String> WindowHandles = driver.getWindowHandles();

		Iterator<String> iterator= WindowHandles.iterator();
		String Parentwindow= iterator.next();
		System.out.println("Parent id is:"+Parentwindow);
		
		String childwindow= iterator.next();
		System.out.println("Child id is:"+childwindow);
		driver.switchTo().window(childwindow);
		//perform action in child window
		driver.findElement(By.name("UserFirstName")).sendKeys("SAURABH");
		driver.findElement(By.name("UserLastName")).sendKeys("Srivastava");
		
		driver.switchTo().window(Parentwindow);

	}
}
