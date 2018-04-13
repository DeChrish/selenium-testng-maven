//package com;
//
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.testng.Assert.fail;
//
//public class AuthMccPaymentScript {
//  private WebDriver driver;
//  private String baseUrl;
//  private boolean acceptNextAlert = true;
//  private StringBuffer verificationErrors = new StringBuffer();
//
//  @BeforeClass(alwaysRun = true)
//  public void setUp() throws Exception {
//    driver = new ChromeDriver();
//    baseUrl = "https://auth-dev10.kaiserpermanente.org/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }
//
//  @Test
//  public void testAuthMccPaymentScript() throws Exception {
//    driver.get(baseUrl + "editor.html/content/kporg/en/national/AutoPageName.html");
//    for (int second = 0;; second++) {
//      if (second >= 60) fail("timeout");
//      try { if (isElementPresent(By.cssSelector("#submit-button"))) break; } catch (Exception e) {}
//      Thread.sleep(1000);
//    }
//
//    driver.findElement(By.cssSelector("#username")).clear();
//    driver.findElement(By.cssSelector("#username")).sendKeys("c792401");
//    driver.findElement(By.cssSelector("#password")).clear();
//    driver.findElement(By.cssSelector("#password")).sendKeys("dev10");
//    driver.findElement(By.cssSelector("#submit-button")).click();
//    for (int second = 0;; second++) {
//      if (second >= 60) fail("timeout");
//      try { if (isElementPresent(By.cssSelector("div[id=\"Content\"] div[id=\"ContentScrollView\"] div[id=\"OverlayWrapper\"] div[data-path=\"/content/kporg/en/national/AutoPageName/jcr:content/paymentmethod\"]"))) break; } catch (Exception e) {}
//      Thread.sleep(1000);
//    }
//
//    driver.findElement(By.cssSelector("div[id=\"Content\"] div[id=\"ContentScrollView\"] div[id=\"OverlayWrapper\"] div[data-path=\"/content/kporg/en/national/AutoPageName/jcr:content/paymentmethod\"]")).click();
//    for (int second = 0;; second++) {
//      if (second >= 60) fail("timeout");
//      try { if (isElementPresent(By.xpath("//*[@data-action='CONFIGURE']"))) break; } catch (Exception e) {}
//      Thread.sleep(1000);
//    }
//
//    driver.findElement(By.xpath("//*[@data-action='CONFIGURE']")).click();
//    for (int second = 0;; second++) {
//      if (second >= 60) fail("timeout");
//      try { if (isElementPresent(By.cssSelector("button.cq-dialog-submit"))) break; } catch (Exception e) {}
//      Thread.sleep(1000);
//    }
//
//    driver.findElement(By.cssSelector("button.cq-dialog-submit")).click();
//    driver.get(baseUrl + "projects.html/content/projects");
//    for (int second = 0;; second++) {
//      if (second >= 60) fail("timeout");
//      try { if (isElementPresent(By.xpath("//coral-icon[@icon=\"user\"]"))) break; } catch (Exception e) {}
//      Thread.sleep(1000);
//    }
//
//    driver.findElement(By.xpath("//coral-icon[@icon=\"user\"]")).click();
//    for (int second = 0;; second++) {
//      if (second >= 60) fail("timeout");
//      try { if (isElementPresent(By.cssSelector("coral-popover-content coral-anchorbutton-label"))) break; } catch (Exception e) {}
//      Thread.sleep(1000);
//    }
//
//    driver.findElement(By.cssSelector("coral-popover-content coral-anchorbutton-label")).click();
//  }
//
//  @AfterClass(alwaysRun = true)
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }
//
//  private boolean isElementPresent(By by) {
//    try {
//      driver.findElement(by);
//      return true;
//    } catch (NoSuchElementException e) {
//      return false;
//    }
//  }
//
//  private boolean isAlertPresent() {
//    try {
//      driver.switchTo().alert();
//      return true;
//    } catch (NoAlertPresentException e) {
//      return false;
//    }
//  }
//
//  private String closeAlertAndGetItsText() {
//    try {
//      Alert alert = driver.switchTo().alert();
//      String alertText = alert.getText();
//      if (acceptNextAlert) {
//        alert.accept();
//      } else {
//        alert.dismiss();
//      }
//      return alertText;
//    } finally {
//      acceptNextAlert = true;
//    }
//  }
//}
