package com.pages.IAS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NRC_OfficerReportedUpon extends TestBase{
	
	
	
	public NRC_OfficerReportedUpon(){
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="")
	WebElement UploadFile;
	
	
	
	@FindBy (xpath="//input[@value='Send To CR Section']")
	WebElement SendToCRsection;
	
	
	
	public void UploadFile(){
		
		UploadFile.sendKeys("E:/doShowFormAsPDF.pdf");
	}
	
	
	
	public void SendToCrsection(){
		
		SendToCRsection.click();
		driver.switchTo().alert().accept();
	}
	
	
	
}
