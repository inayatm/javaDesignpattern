package javaPatterns.factory;

public class WebsiteFactory {
	
	public static Website getWebsite(WebsiteGenerator websiteType) {
		
		switch(websiteType) {

		case BLOG:
			return new Blog();
		
		case SHOPPING:
		    return new Shopping();
		default:
			return null;
	}
		
	}

}
