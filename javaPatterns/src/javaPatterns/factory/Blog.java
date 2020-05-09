package javaPatterns.factory;


public class Blog extends Website {
	Blog(){
		System.out.println("in blog..");
	}

	@Override
	public void creatWebsite() {
		pages.add(new ContactPage());
		pages.add(new AboutPage());
	}
	
	
	
	

}
