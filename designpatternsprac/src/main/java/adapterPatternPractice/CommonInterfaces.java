package adapterPatternPractice;

public interface CommonInterfaces {
	
	
	void launchApplication(String url) throws InterruptedException;
	String createIncident(String caller, String shortDescription);
	void validateCreatedIncident(String IncidentNumber);
	

}
