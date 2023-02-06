package chainOfResp;

public interface OrderProcess  {

	public void setNext(OrderProcess nextProcess);
	public boolean process(Order order);
	
	
}
