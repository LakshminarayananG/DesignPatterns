package objectDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import selenium.factory.WebDriverPool;

public class TestObjectMultipleInstances {
	
	
	@Test
	public void eg1() {
		// create a new managed instance
		WebDriver driver = WebDriverPool.DEFAULT.getDriver(new FirefoxOptions());
		// do something with the driver
		driver.get("http://seleniumhq.org/");

		// obtain the same instance from the pool of the managed instances
		driver = WebDriverPool.DEFAULT.getDriver(new FirefoxOptions());
		// do something with the driver
		driver.get("http://selenium2.ru/");

		// destroy the driver
		WebDriverPool.DEFAULT.dismissDriver(driver);
	}

}
