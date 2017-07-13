package com.essautotest.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NavigationBase{
	
	WebDriver driver;
	
//	@FindBy(how = How.LINK_TEXT,linkText ="My Entitled Systems Support")
	WebElement myEntitledSystemsSupport;
	
//	@FindBy(how = How.LINK_TEXT,linkText ="My entitled software")
	WebElement myEntitledSoftware;
	
//	@FindBy(how = How.LINK_TEXT,linkText ="My entitled hardware")
	WebElement myEntitledHardware;
	
//	@FindBy(how = How.LINK_TEXT,linkText ="Help")
	WebElement help;
	
//	@FindBy(how = How.LINK_TEXT,linkText ="Language selection")
	WebElement languageSelection;
	
	public NavigationBase(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePage clickMyEntitledSystemsSupport(WebDriver driver){
		driver.findElement(By.linkText("My Entitled Systems Support")).click();
		return PageFactory.initElements(driver, HomePage.class);
	}	
	public MyEntitledSoftWarePage clickMyEntitledSoftware(WebDriver driver){
		System.out.println(" before findElement");
        driver.findElement(By.linkText("My entitled software")).click();
		System.out.println(" before clickMyEntitledSoftware");
		return PageFactory.initElements(driver, MyEntitledSoftWarePage.class);
	}

}
