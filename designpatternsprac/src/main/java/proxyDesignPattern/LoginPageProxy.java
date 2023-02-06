package proxyDesignPattern;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageProxy {
	
	
	static Logger log = Logger.getLogger(LoginPageProxy.class);
	
	public LoginPageProxy(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using ="username")
	private WebElement eleUserName;
	
	@FindBy(how=How.ID, using ="password")
	private WebElement elePassword;
	
	@FindBy(how=How.CLASS_NAME, using ="decorativeSubmit")
	private WebElement eleLogin;
	
	public LoginPageProxy typeUserName(String username) {
		new ProxyElement(eleUserName).sendKeys(username);
		log.info("Username is entered");
		return this;
	}
	
	public LoginPageProxy typePassword(String password) {
		new ProxyElement(elePassword).sendKeys(password);
		log.info("Password is entered");
		return this;
	}
	
	
	public LoginPageProxy clickLogin() {
		new ProxyElement(eleLogin).click();
		log.info("Login is clicked");
		return this;
	}
	
	
	
	
	
	
	

}
