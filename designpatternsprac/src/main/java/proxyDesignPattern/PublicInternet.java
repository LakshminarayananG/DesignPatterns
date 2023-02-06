package proxyDesignPattern;

public class PublicInternet implements Internet{

	@Override
	public void connect(String host) {
		System.out.println("The site: "+host+ " is connected");
		
	}

}
