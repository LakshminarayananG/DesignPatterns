package proxyDesignPattern;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private Internet network = new PublicInternet();
	private static List<String> bannedSites;
	
	
	static {
		bannedSites = Arrays.asList("https://abc.com","https://www.amazon.in");
	}
	
	
	
	@Override
	public void connect(String host) {
		if(bannedSites.contains(host)) {
			
			throw new RuntimeException("Not allowed to access this website: "+host);
			
		}
		
		network.connect(host);
		
	}

}
