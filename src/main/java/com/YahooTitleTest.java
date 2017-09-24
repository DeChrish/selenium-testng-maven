package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YahooTitleTest {
	private WebDriver driver = null;

	// public String URL = "http://www.nguoianphu.com";

	@Test
	@Parameters({ "myURL", "myTitle" })
	public void testEasy(String myURL, String myTitle) {
		driver.get(myURL);
		String title = driver.getTitle();
		Assert.assertTrue(title.contains(myTitle));
		// Assert.assertTrue(title
		// .contains("Home page Nguoi An Phu huyen An Phu tinh An Giang"));
	}

	@BeforeTest
	public void beforeTest() throws Exception {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
