package com.essautotest.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
		WebDriver driver;
		
		@FindBy(how = How.ID, id = "username")
		WebElement username;
		
		@FindBy(how = How.ID, id = "password")
		WebElement password;
		
		@FindBy(how = How.ID, id = "login")
		WebElement loginbutton;
		
		public LoginPage(WebDriver driver){
			this.driver = driver;
			this.username = driver.findElement(By.id("username"));
		    this.password = driver.findElement(By.id("password"));
	     	this.loginbutton = driver.findElement(By.id("login"));
		}

		public void login(String userName, String passWord){
			System.out.println("Start login in Loginpage...");
			System.out.println("userName="+userName);
			System.out.println("passWord="+passWord);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			username.sendKeys(userName);
			password.sendKeys(passWord);
			loginbutton.submit();
			
		}	
}

