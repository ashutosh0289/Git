package com.pages.NRC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NRC_Section3 extends TestBase{
	
	
	
		public NRC_Section3() {
		
		PageFactory.initElements(driver, this);
	  }

	
@FindBy(xpath ="//input[@value='Close']")
WebElement Close;
	
	
@FindBy(xpath="//img[@alt='CLICK TO DOWNLOAD']")
WebElement ClickToDownload;



	public void CloseNRC(){
		
		Close.click();
		driver.switchTo().alert().accept();
		
		
	}
	
	
	public void clickOnDownload() {
		
		ClickToDownload.click();
	}


	
	
	
	

}
