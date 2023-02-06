package proxyDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageClass {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://leaftaps.com/opentaps");
		
		LoginPage login = new LoginPage(driver);
		
		
	}
	

}
