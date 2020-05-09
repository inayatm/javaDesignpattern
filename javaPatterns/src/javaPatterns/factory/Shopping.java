package javaPatterns.factory;


public class Shopping extends Website {

	@Override
	public void creatWebsite() {
		pages.add(new Cartpage());
		pages.add(new AboutPage());
	}
	
	

}
