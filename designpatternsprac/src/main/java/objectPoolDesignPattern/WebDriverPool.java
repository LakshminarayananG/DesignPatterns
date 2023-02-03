package objectPoolDesignPattern;

import java.util.concurrent.LinkedBlockingDeque;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPool {

	
	private LinkedBlockingDeque<WebDriver> availableDrivers;
	private int initialSize;
	
	public WebDriverPool(int initialSize) {
		this.initialSize=initialSize;
		availableDrivers = new LinkedBlockingDeque<>(initialSize);
		
		for(int i=0;i<initialSize;i++) {
			availableDrivers.add(createDriver());
		}
		
	}
	
	private WebDriver createDriver() {
		return new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		try {
			
			return availableDrivers.take();
			
			
		} catch (Exception e) {
			if(availableDrivers.size()<initialSize)
			return createDriver();
		}
		
		return null;
	}
	
	
	public void releaseDriver(WebDriver driver) {
		availableDrivers.offer(driver);
	}
	
	
	public void closeAllDrivers() {
		availableDrivers.forEach(driver -> driver.quit());
	}
	
	
}
