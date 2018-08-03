package com.pages.IPS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class BasicInformationPage extends TestBase{
		Alert alert;
	
	public  BasicInformationPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@value='Send To Officer Reported Upon']")
	WebElement sendButton;
	
	
	
	
	@FindBy(xpath="//input[@id='fileUpload']")
	WebElement UploadFile;
	
	
	
	public void UploadFile(){
		
		UploadFile.sendKeys("E:/doShowFormAsPDF.pdf");
	}
	
	public void Leave_SendToOfficerReportedUpon(){
		
		sendButton.click();
		//driver.switchTo().alert().accept();
	}
	
public void Training_SendToOfficerReportedUpon(){
		
		sendButton.click();
		//driver.switchTo().alert().accept();
	}
	
	
	
	
	
	public void ClickOnSendButton(){
		
		sendButton.click();
		
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//alert.getText();
		//alert.accept();
	}
	

}
