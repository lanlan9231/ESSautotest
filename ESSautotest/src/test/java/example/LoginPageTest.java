package example;

import org.testng.annotations.Test;

import com.essautotest.browserdriver.DriverFactory;
import com.essautotest.pageobjects.EntitlementsPage;
import com.essautotest.pageobjects.HomePage;
import com.essautotest.pageobjects.LoginPage;
import com.essautotest.pageobjects.MainPage;
import com.essautotest.pageobjects.MyEntitledSoftWarePage;
import com.essautotest.pageobjects.NavigationSoftWare;
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
//	  mainpage.openMainPage("https://wwwbeta-sso.toronto.ca.ibm.com:444/servers/eserver/ess/index.wss");	 
	  mainpage.login(driver,"bftest04@esd.test","bftest04");
//	  LoginPage loginpage = new LoginPage(this.driver);
//	  String title = driver.getTitle();	
//	  Assert.assertTrue(title.contains("My Entitled Systems Support"));
	  System.out.println("after log in ...");
	  HomePage homePage = new HomePage(driver);
	  MyEntitledSoftWarePage myEntitledSoftWarePage = homePage.clickMyEntitledSoftware(driver);
	  EntitlementsPage entitlmentsPage = myEntitledSoftWarePage.clickEntitlements(driver);
	  entitlmentsPage = entitlmentsPage.clickContinueButton(driver);
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
