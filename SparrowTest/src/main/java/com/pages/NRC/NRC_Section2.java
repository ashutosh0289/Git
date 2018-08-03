package com.pages.NRC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NRC_Section2 extends TestBase{
	
		public NRC_Section2() {
			
			PageFactory.initElements(driver,this);
		}
	
	
		

@FindBy(xpath="//input[@value='Send To CR Section']")
WebElement ClickOnSend;

@FindBy(xpath="//img[@alt='CLICK TO DOWNLOAD']")
WebElement ClickToDownload;
		
		
		
		
		




		public void SendToCRSection() {
			
			ClickOnSend.click();
			
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			
		
		
		public void clickOnDownload() {
			
			ClickToDownload.click();
		}








		

}
