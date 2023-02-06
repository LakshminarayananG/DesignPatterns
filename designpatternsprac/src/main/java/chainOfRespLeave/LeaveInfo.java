package chainOfRespLeave;

public class LeaveInfo implements Leave {

	private int numberOfLeaves;
	
	@Override
	public int getLeaveInfo() {
		
		return numberOfLeaves;
	}

	@Override
	public void setNoOfLeaves(int numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}
	
	

}
