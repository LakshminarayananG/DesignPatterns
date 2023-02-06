package chainOfRespLeave;

public class ApprovalFromManager implements LeaveProcess {
	
	private LeaveProcess nextProcess;

	@Override
	public void setNext(LeaveProcess nextProcess) {
		this.nextProcess=nextProcess;
		
	}

	@Override
	public boolean approval(Leave leave) {
		System.out.println("Leave Approval from Manager");
		if(nextProcess!=null && leave.getLeaveInfo()>7) {
			return nextProcess.approval(leave);
		}
		return false;
	}

	
	
}
