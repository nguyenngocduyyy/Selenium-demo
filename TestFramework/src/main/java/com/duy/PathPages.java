package com.duy;

import org.openqa.selenium.By;

public class PathPages {

	static String url = "https://en.wikipedia.org/wiki/Main_Page";
	static String title = "Wikipedia:Community portal - Wikipedia";
	
	public void goTo() {
		Browser.goTo(url);
	}
	
	public PathPage getPathPage(String page) {
		switch(page) {
		case "Java":
			return Pages.javaPathPage();
		}
		
		return null;
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
	
	

}
