package adapterPatternPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumImplementation implements CommonInterfaces {
	
	private WebDriver driver;
	
	public SeleniumImplementation() {
		driver = new ChromeDriver();
		
	}

	
	@Override
	public void validateCreatedIncident(String IncidentNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launchApplication(String url) throws InterruptedException {
		driver.get(url);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("+XVujQj=G2p9");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(15000);
		
	}

	@Override
	public String createIncident(String caller, String shortDescription) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating Incident");
		String incidentNumber = driver.findElement(By.id("incident.number")).getText();
		return incidentNumber;
		
		
		
		
		
		
	}

}
