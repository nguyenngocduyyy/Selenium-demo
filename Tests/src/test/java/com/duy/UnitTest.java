package com.duy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnitTest {

	@Before
	public void init() {
		System.setProperty("webdriver.gecko.driver", "D:\\Dev\\Tools\\geckodriver.exe");

	}

	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
	}

	@Test
	public void canGoToJavaPathPage() {
		Pages.pathPages().goTo();
		PathPage pathPage = Pages.pathPages().getPathPage("Java");
		pathPage.goTo();
		Assert.assertTrue(pathPage.isAtPathPage("Wikipedia:Community portal"));
	}

	@AfterClass
	public static void cleanUp() {
		Browser.close();
	}

}
