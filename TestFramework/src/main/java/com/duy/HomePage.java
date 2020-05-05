package com.duy;

public class HomePage {

	static String url = "https://en.wikipedia.org/wiki/C_data_types";
	static String title = "C data types - Wikipedia";
	public void goTo() {
		Browser.goTo(url);
	}
	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
