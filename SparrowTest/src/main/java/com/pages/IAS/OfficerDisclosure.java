package com.pages.IAS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class OfficerDisclosure extends TestBase {

		public OfficerDisclosure(){
			
			PageFactory.initElements(driver, this);
		}
	
	
	@FindBy (xpath="//input[@value='I Accept']")
	WebElement ClickonIAccept;
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
	WebElement OpenPar;
	
	@FindBy (xpath="//input[@value='Put for Representation']")
	WebElement PutForRepresentation;
	
	
	public void ParAtOfficerDisclosure(){
		
		//Search.sendKeys("Officer Disclosure");
		OpenPar.click();
		
		ClickonIAccept.click();
		
		driver.switchTo().alert().accept();
	}
	
	public void ParForPutForRepresentation() {
		
		PutForRepresentation.click();
	}
	
	
	
}
