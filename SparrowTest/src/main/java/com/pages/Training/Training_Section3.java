package com.pages.Training;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class Training_Section3 extends TestBase {

	
	
			public Training_Section3() {
				PageFactory.initElements(driver, this);
			}

			
			
			
			
@FindBy(xpath ="//input[@value='Close']")
WebElement Close;
						
@FindBy(xpath="//img[@alt='CLICK TO DOWNLOAD']")
WebElement ClickToDownload;



						public void Close(){
							
							Close.click();
							driver.switchTo().alert().accept();
							
							
						}
						
						
						public void clickOnDownload() {
							
							ClickToDownload.click();
						}


				

}
