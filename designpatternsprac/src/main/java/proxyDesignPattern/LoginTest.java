package proxyDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		LoginPageProxy login = new LoginPageProxy(driver);
		
		login.typeUserName("demosalesmanager")
		.typePassword("crmsfa")
		.clickLogin();
		
		driver.quit();
		
	}
}
