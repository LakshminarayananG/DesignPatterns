package adapterPatternPractice;

public class ImplementationTest {
	
	//https://dev89195.service-now.com/navpage.do
	
	public static void main(String[] args) throws InterruptedException {
		String application_url = "https://dev89195.service-now.com/navpage.do";
		String incidentNumber = "";
		
		
		SeleniumImplementation driver = new SeleniumImplementation();
		RestAssuredImplementation rest = new RestAssuredImplementation();
		
		driver.launchApplication(application_url);
		incidentNumber= driver.createIncident(application_url, application_url);
		
		rest.validateCreatedIncident(incidentNumber);
		
		
	}

}
