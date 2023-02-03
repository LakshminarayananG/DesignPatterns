package bridgeDesignPattern;

public class BridgeTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverImpl impl = new WebDriverImpl();
		//PlaywrightImpl impl = new PlaywrightImpl();
		WebActions impl = DriverFactory.driverFactory(DriverTypes.Webdriver,BrowserEngine.Firefox);
		impl.launch("http://leaftaps.com/opentaps");
		impl.type("//input[@id='username']", "demosalesmanager");
		impl.type("//input[@id='password']", "crmsfa");
		impl.click("//input[@class='decorativeSubmit']");
		impl.click("//a[contains(text(),'CRM/SFA')]");
		impl.click("//a[contains(text(),'Create Lead')]");
		impl.type("//input[@id='createLeadForm_companyName']", "TL Software");
		impl.type("//input[@id='createLeadForm_firstName']", "MyFirstName");
		impl.type("//input[@id='createLeadForm_lastName']", "MyFirstName");
		impl.click("//input[@value='Create Lead']");
		Thread.sleep(10000);
		String text = impl.getText("//span[@id='viewLead_companyName_sp']");
		if(text.contains("TL Software")) {
			System.out.println("Matches");
		}
		impl.close();
	}

}
