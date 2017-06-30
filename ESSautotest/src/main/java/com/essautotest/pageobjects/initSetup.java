package com.essautotest.pageobjects;

import org.openqa.selenium.WebDriver;

import com.essautotest.browserdriver.DriverFactory;

public class initSetup {
	
	public WebDriver driver;
	
	public initSetup(WebDriver driver){
		this.driver = driver;
	}
	
//	public WebDriver setUp(){
//		System.out.println("Start setup remote driver...");
//		driver = DriverFactory.getRemoteDriver();
//		return driver;
//	}
//	
//	public void login(WebDriver driver){
//		System.out.println("Start test...");
//		MainPage mp1 = new MainPage(driver);
//		mp1.openMainPage("https://www-sso.toronto.ca.ibm.com/servers/eserver/ess/index.wss");
//		mp1.login("bftest04@esd.test","bftest04");
//	}
//	
//	public void Down(WebDriver driver){
//		System.out.println("After test...");
//		this.driver.quit();
//	}
}
