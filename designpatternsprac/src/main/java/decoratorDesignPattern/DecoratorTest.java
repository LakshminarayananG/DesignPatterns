package decoratorDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DecoratorTest {
	
	
	public static WebDriver driver;
	public static WebElement element;
	static ElementDecorator decorator;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		element = driver.findElement(By.id("username"));
		decorator = new ElementDecorator(driver, element);
		decorator.sendKeys("demosalesmanager");
		
		element = driver.findElement(By.id("password"));
		decorator = new ElementDecorator(driver, element);
		decorator.sendKeys("crmsfa");
		
		element = driver.findElement(By.className("decorativeSubmit"));
		decorator = new ElementDecorator(driver, element);
		decorator.click();
		
		driver.quit();
		
	}

}
