package example;

import org.testng.annotations.Test;

import com.essautotest.browserdriver.DriverFactory;
import com.essautotest.pageobjects.LoginPage;
import com.essautotest.pageobjects.MainPage;
import com.essautotest.pageobjects.initSetup;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class LoginPageTest {
	
	public WebDriver driver;
	
  @Test
  public void testLoginEss() {
	  System.out.println("Testing ess...");
	  MainPage mainpage = new MainPage(this.driver);
	  mainpage.openMainPage("https://www-sso.toronto.ca.ibm.com/servers/eserver/ess/index.wss");
	  mainpage.login("bftest04@esd.test","bftest04");
//	  LoginPage loginpage = new LoginPage(this.driver);
	  String title = driver.getTitle();	
	  Assert.assertTrue(title.contains("My Entitled Systems Support"));
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Start setup driver...");
	  this.driver = DriverFactory.getRemoteDriver();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test...");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
//	  System.out.println("After test...");
//	  Thread.sleep(3000);
//	  this.driver.quit();
  }

}
