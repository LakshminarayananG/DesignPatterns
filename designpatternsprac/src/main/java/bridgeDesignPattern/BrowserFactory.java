package bridgeDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver browserFactory(BrowserEngine type) {
		switch (type) {
		case Chrome: 
			return new ChromeDriver();
		case Firefox:
			return new FirefoxDriver();
			default:
				return null;
	}

}
}
