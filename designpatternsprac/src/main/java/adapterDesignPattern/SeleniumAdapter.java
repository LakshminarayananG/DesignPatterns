package adapterDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAdapter implements AmazonActions {
	
	private WebDriver driver;
	
	public SeleniumAdapter() {
		driver = new ChromeDriver();
	}

	@Override
	public void launch(String url) {
		driver.get(url);
		
	}

	@Override
	public void searchProduct(String product) {
		
		
	}

	@Override
	public void addProductToCart(String product, int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void makePayment(String paymentType) {
		
	}
	
	@Override
	public void verifyOrder(String orderNum) {
		
	}

}
