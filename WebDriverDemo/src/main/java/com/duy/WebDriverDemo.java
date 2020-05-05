package com.duy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Dev\\Tools\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new RemoteWebDriver(new java.net.URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
		driver.get("http://www.GOOGLE.com");
		
		WebElement searchField = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		
		searchField.sendKeys("thanos");
		searchField.submit();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".hdtb-mitem:nth-child(2) > .q"))); /*("/html/body/div[6]/div[3]/div[3]/div/div/div[1]/div/div/div[1]/div/div[2]/a")));*/
		
		WebElement imagesLink = driver.findElement(By.cssSelector(".hdtb-mitem:nth-child(2) > .q"));
		imagesLink.click();
		WebElement imageLink = driver.findElement(By.cssSelector(".isv-r:nth-child(30) .rg_i"));
		imageLink.click();
		
		driver.close();
		
	}

}
