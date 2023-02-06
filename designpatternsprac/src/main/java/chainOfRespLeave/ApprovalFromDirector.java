package chainOfRespLeave;

public class ApprovalFromDirector implements LeaveProcess {

	private LeaveProcess nextProcess;
	
	
	@Override
	public void setNext(LeaveProcess nextProcess) {
		this.nextProcess= nextProcess;
		
	}

	@Override
	public boolean approval(Leave leave) {
		System.out.println("Leave Approval from Director");
		if(nextProcess!=null && leave.getLeaveInfo()>30) {
			return nextProcess.approval(leave);
		}
		return false;
	}

}
