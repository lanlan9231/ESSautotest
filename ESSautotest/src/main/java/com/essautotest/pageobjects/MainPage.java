package com.essautotest.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement loginlink;
	WebElement logoutlink;
	
	public MainPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openMainPage(String url){
		driver.get(url);
		System.out.print("Open mainpage, and find signin...");
		loginlink = driver.findElement(By.id("signinID"));
	}
	
	public void login(String username, String password){
		loginlink.click();
		System.out.println("click signin...");
		LoginPage loginpage = new LoginPage(this.driver);
		loginpage.login(username,password);
	}
	
}
