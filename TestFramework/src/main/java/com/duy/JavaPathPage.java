package com.duy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage{

	@FindBy(how = How.CSS, using = "#firstHeading")
	WebElement pageElement;
	
	@Override
	public void goTo() {
		Browser.driver.findElement(By.linkText("Community portal")).click();
		
	}

	@Override
	public String pathName() {
		return pageElement.getText();
	}

}
