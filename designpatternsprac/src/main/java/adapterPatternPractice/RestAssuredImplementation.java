package adapterPatternPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredImplementation implements CommonInterfaces {

	
	

	@Override
	public void validateCreatedIncident(String IncidentNumber) {

		 String baseURL="https://dev89195.service-now.com/api/now/table/incident";
		
		Response response =RestAssured
				.given()
				.pathParam("number", IncidentNumber)
				.when()
				.get(baseURL);
		
				System.out.println(response.getStatusCode());				
				System.out.println(response.contentType());						
				response.prettyPrint();				
				System.out.println("Checking validation");
		
	}

	@Override
	public void launchApplication(String url) {
		
		
	}

	@Override
	public String createIncident(String caller, String shortDescription) {
		return null;
		
	}

}
