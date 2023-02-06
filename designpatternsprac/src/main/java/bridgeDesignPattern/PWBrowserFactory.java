package bridgeDesignPattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class PWBrowserFactory {
	
	
	public static Browser pwBrowserFactory(BrowserEngine type, Playwright pw) {
		switch (type) {
		case Chrome: 
			return pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		case Firefox:
			return pw.firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox").setHeadless(false));
			default:
				return null;
	}

}
	
}
