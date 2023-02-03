package objectDesignPattern;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectPoolDesignPattern.WebDriverPool;

public class TestObjectPool {
	
	
	WebDriverPool pool;
	List<String> urls;
	WebDriver driver;
	int index=0;
	
	
	@BeforeClass
	public void initialize() {
		pool = new WebDriverPool(2);
		urls = Arrays.asList(
				"https://www.google.com",
				"https://www.amazon.com",
				"https://www.twitter.com",
				"https://www.instagram.com");
	}
	
	
	@BeforeMethod
	public void getDriverInstance() {
		driver = pool.getDriver();
	}
	
	
	@Test(invocationCount = 4)
	public void eg1() {
		driver.get(urls.get(index++));
	}
	
	
	@AfterMethod
	public void returnDriver() {
		pool.releaseDriver(driver);
	}
	
	@AfterClass
	public void tearDown() {
		pool.closeAllDrivers();
	}

}
