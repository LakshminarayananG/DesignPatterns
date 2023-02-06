package proxyDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoAction {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		WebElement element = driver.findElement(By.id("username"));
		
		new ProxyElement(element).sendKeys("demosalesmanager");
		new ProxyElement(element).click();
		new ProxyElement(element).clear();
		driver.quit();
		
	}

}
