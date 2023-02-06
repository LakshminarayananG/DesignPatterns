package adapterDesignPattern;

import io.restassured.response.Response;

public class RestAssuredAdapter implements AmazonActions{
	
	private String baseURL;
	private Response response;
	
	
	public RestAssuredAdapter() {
		
	}
	

	@Override
	public void launch(String url) {
		// TODO Auto-generated method stub
		this.baseURL=url;
		
	}

	@Override
	public void searchProduct(String product) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyOrder(String orderNum) {
		// TODO Auto-generated method stub
		
	}

}
