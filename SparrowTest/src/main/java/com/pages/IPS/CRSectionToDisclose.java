package com.pages.IPS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CRSectionToDisclose extends TestBase{

	
	public CRSectionToDisclose(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
	WebElement OpenPar;
	
	@FindBy(xpath="//input[@value='Disclose To Officer']")
	WebElement ClickOnSendDiscloseToOfficer;
	
	
	public void ParAtCRSectionToDisclose(){
		
		
		//Search.sendKeys("CR Section To Disclose");
		OpenPar.click();
		ClickOnSendDiscloseToOfficer.click();
		
		driver.switchTo().alert().accept();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
