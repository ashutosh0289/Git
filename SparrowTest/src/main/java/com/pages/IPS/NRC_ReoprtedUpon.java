package com.pages.IPS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NRC_ReoprtedUpon extends TestBase {
	
	
	public NRC_ReoprtedUpon(){
		
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//input[@value='Send To Officer Reported Upon']")
	WebElement Send_To_Officer_Reported_Upon;
	
	
	@FindBy(xpath="//input[@id='fileUpload']")
	WebElement UploadFile;
	
	
	
	public void UploadFile(){
		
		UploadFile.sendKeys("E:/doShowFormAsPDF.pdf");
	}
	
	public void SendToOfficerReportedUpon(){
		
		Send_To_Officer_Reported_Upon.click();
		driver.switchTo().alert().accept();
	}
	
	
	
	
}
