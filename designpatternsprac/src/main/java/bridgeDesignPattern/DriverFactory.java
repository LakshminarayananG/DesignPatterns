package bridgeDesignPattern;

public class DriverFactory {
	
	
	public static WebActions driverFactory(DriverTypes type, BrowserEngine browsertype) {
		
		switch(type) {
			case Playwright : return new PlaywrightImpl(browsertype);
			case Webdriver : return new WebDriverImpl(browsertype);
			default : return null;
		}
		
	}

}