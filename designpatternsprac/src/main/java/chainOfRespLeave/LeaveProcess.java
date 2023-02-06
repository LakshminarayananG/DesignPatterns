package chainOfRespLeave;

public interface LeaveProcess {
	
	public void setNext(LeaveProcess nextProcess);
	public boolean approval(Leave order);

}
