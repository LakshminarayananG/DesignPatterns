package chainOfResp;

public class AddToCart implements OrderProcess {
	
	
	private OrderProcess nextProcess;

	@Override
	public void setNext(OrderProcess nextProcess) {
		this.nextProcess=nextProcess;
		
	}

	@Override
	public boolean process(Order order) {
		System.out.println("Added items to the cart successfully");
		if(nextProcess!=null) {
			return nextProcess.process(order);
		}
		return false;
	}

}
