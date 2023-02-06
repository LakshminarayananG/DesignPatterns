package chainOfResp;

public class Payment implements OrderProcess {
	
	
	private OrderProcess nextProcess;

	@Override
	public void setNext(OrderProcess nextProcess) {
		this.nextProcess=nextProcess;
		
	}

	@Override
	public boolean process(Order order) {
		System.out.println("Payment done successfully");
		if(nextProcess!=null) {
			return nextProcess.process(order);
		}
		return false;
	}

}
