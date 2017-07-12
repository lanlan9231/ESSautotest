package com.essautotest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EntitlementsPage extends NavigationSoftWare {
	
	@FindBy(how = How.ID, id ="select2-customersearch-container")
	WebElement selectCustomer;
	
	@FindBy(how = How.ID, id ="machinesearchtypein")
	WebElement machineSearchTypeIn;
	
	@FindBy(how = How.ID, id ="select2-machinesearch-container")
	WebElement selectMachine;
	
	@FindBy(how = How.NAME, name ="command_NewListEntitlementsCommand")
	WebElement continueButton;
	
	WebElement selectAll;
	WebElement viewDetailsButton;
	WebElement generatePDFButton;
	WebElement transferButton;
	WebElement cancelButton;
	public EntitlementsPage (WebDriver driver){
		super(driver);
	}
	public EntitlementsPage clickContinueButton(WebDriver driver){		
		continueButton.click();	
		return PageFactory.initElements(driver, EntitlementsPage.class);
	}

	
	
	
      
}
