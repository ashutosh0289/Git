package com.pages.NRC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NRC_section1 extends TestBase {

	
		public NRC_section1() {
			
			PageFactory.initElements(driver, this);
		}
	
	
		
@FindBy(xpath="//input[@id='fileUpload']")
WebElement NRC_Upload;
		
		
@FindBy(xpath="//input[@id='lF.basicInformation.fu.refUpload']")
WebElement Ref_upload;		
		
@FindBy(xpath="//input[@id='draft']")
WebElement SaveASDraft;

@FindBy(xpath="//input[@value='Send To Officer Reported Upon']")
WebElement ClickOnSend;

@FindBy(xpath="//img[@alt='CLICK TO DOWNLOAD']")
WebElement ClickToDownload;


		
		
		
		
		
	public void SendToOfficerReportedupon() {
		
		ClickOnSend.click();
		
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
	
	public void NRC_Upload() {
		NRC_Upload.sendKeys(prop.getProperty("UploadFile"));
	}
	
	public void Ref_Upload() {
		Ref_upload.sendKeys(prop.getProperty("UploadFile"));
	}
		
	public void SaveAsDraft() {
		
		SaveASDraft.click();
		
	}
	
	public void clickOnDownload() {
		
		ClickToDownload.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
