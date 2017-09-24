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
	private String URL = "https://www.yahoo.com";
	private String TITLE = "Yahoo";

	@Test
	public void testEasy() {
		driver.get(URL);
		String title = driver.getTitle();
		Assert.assertTrue(title.contains(TITLE));
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
