package proxyDesignPattern;

public class AccessInternet {
	
	public static void main(String[] args) {
		
		Internet network  = new ProxyInternet();
		network.connect("https://abc.com");
	}

}
