package chainOfRespLeave;

public class ChainOfResp {

	public static void main(String[] args) {
	
		
		LeaveProcess manager = new ApprovalFromManager();
		LeaveProcess director = new ApprovalFromDirector();
		LeaveProcess hr = new ApprovalFromHR();
		
		manager.setNext(director);
		director.setNext(hr);
		
		LeaveInfo leave = new LeaveInfo();
		leave.setNoOfLeaves(30);
		manager.approval(leave);

	}

}
