package adapterDesignPattern;

public interface AmazonActions {
	
	void launch(String url);
	void searchProduct(String product);
	void addProductToCart(String product, int quantity);
	void checkout();
	void  makePayment(String paymentType);
	void verifyOrder(String orderNum);
	

}
