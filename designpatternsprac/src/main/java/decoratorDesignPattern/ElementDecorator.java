package decoratorDesignPattern;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementDecorator extends RemoteWebElement {
	
	private WebElement ele;
	private JavascriptExecutor jse;
	private WebDriverWait wait;
	
	public ElementDecorator(WebDriver driver, WebElement ele) {
		this.ele=ele;
		this.jse = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void click() {
		waitForClick();
		highlight();
		ele.click();
		
		try {
			reset();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private void highlight() {
		jse.executeScript("arguments[0].style.background='yellow'", ele);
		
	}
	
	private void reset() {
		jse.executeScript("arguments[0].style.background=''", ele);
	}
	
	private void waitForClick() {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	public void sendKeys(CharSequence keysToSend) {
		highlight();
		ele.sendKeys(keysToSend);
		reset();
	}

}
