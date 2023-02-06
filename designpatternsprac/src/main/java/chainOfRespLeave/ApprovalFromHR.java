package chainOfRespLeave;

public class ApprovalFromHR implements LeaveProcess {

	private LeaveProcess nextProcess;
	
	
	@Override
	public void setNext(LeaveProcess nextProcess) {
		this.nextProcess = nextProcess;
		
	}

	@Override
	public boolean approval(Leave leave) {
		System.out.println("Leave Approval from HR");
		if(nextProcess!=null && leave.getLeaveInfo()>60) {
			return nextProcess.approval(leave);
		}
		return false;
	}

}
