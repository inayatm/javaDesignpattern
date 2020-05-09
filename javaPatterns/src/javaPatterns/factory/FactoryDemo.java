package javaPatterns.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		Website site=WebsiteFactory.getWebsite(WebsiteGenerator.BLOG);
		
		
		System.out.println(site);
		System.out.println(site.getPages());
		
		WebsiteFactory.getWebsite(WebsiteGenerator.SHOPPING);
		
		System.out.println(site.getPages());

		
	}
	
}
