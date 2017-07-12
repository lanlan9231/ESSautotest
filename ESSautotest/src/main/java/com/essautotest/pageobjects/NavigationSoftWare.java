package com.essautotest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NavigationSoftWare extends NavigationBase{
	
	@FindBy(how = How.LINK_TEXT,linkText ="Software updates")
	WebElement softwareUpdates;
	
	@FindBy(how = How.LINK_TEXT,linkText ="Software downoads")
	WebElement softwareDownoads;
	
	@FindBy(how = How.LINK_TEXT,linkText ="IBM i evaluation and NLV download")
	WebElement tryAndBuy;
	
	@FindBy(how = How.LINK_TEXT,linkText ="Entitlements")
	WebElement entitlements;
	
	@FindBy(how = How.LINK_TEXT,linkText ="IBM i software keys")
	WebElement IBMiSoftwareKeys;
	
	@FindBy(how = How.LINK_TEXT,linkText ="SWMA records")
	WebElement SWMArecords;
	
	@FindBy(how = How.LINK_TEXT,linkText ="Data report")
	WebElement dataReport;
	
	@FindBy(how = How.LINK_TEXT,linkText ="Register IBM customer number")
	WebElement registerIBMCustomerNumber;
	
	@FindBy(how = How.LINK_TEXT,linkText ="Register for Business Partner Access")
	WebElement registerForBPPage;
	
	@FindBy(how = How.LINK_TEXT,linkText ="Manage customer numbers")
	WebElement manageCustomerNumbers;
	
	@FindBy(how = How.LINK_TEXT,linkText ="View my authorizations")
	WebElement viewMyAuthorization;
	
	@FindBy(how = How.LINK_TEXT,linkText ="User preferences")
	WebElement userPreferences;
	
	public NavigationSoftWare(WebDriver driver){
		super(driver);
	}
	public MyEntitledSoftWarePage clickMyEntitledSoftware(WebDriver driver){
		myEntitledSoftware.click();	
		return PageFactory.initElements(driver, MyEntitledSoftWarePage.class);
	}
	
	public EntitlementsPage clickEntitlements(WebDriver driver){
		entitlements.click();	
		return PageFactory.initElements(driver, EntitlementsPage.class);
	}

}
