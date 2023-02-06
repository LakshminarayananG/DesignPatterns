package chainOfResp;

public class ChainOfResp {

	public static void main(String[] args) {
		
		
		OrderProcess addToCart = new AddToCart();
		OrderProcess shipping = new Shipping();
		OrderProcess payment = new Payment();
		
		addToCart.setNext(shipping);
		shipping.setNext(payment);
		
		
		OrderInfo order = new OrderInfo();
		addToCart.process(order);

	}

}
