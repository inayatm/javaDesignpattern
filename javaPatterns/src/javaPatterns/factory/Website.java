package javaPatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	public  List<Page> pages;
	
	public Website() {
		System.out.println("in Website..");
		pages=new ArrayList<>();
		this.creatWebsite();
	}
	
	public abstract void creatWebsite();

	public  List<Page> getPages() {
		return pages;
	}
	
	
	
}
