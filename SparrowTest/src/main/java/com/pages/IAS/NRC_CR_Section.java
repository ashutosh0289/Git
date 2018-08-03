package com.pages.IAS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class NRC_CR_Section extends TestBase{
	
	
	public  NRC_CR_Section() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//input[@value='Close']")
	WebElement Close;
	
	
	public void CloseNRC(){
		
		Close.click();
		driver.switchTo().alert().accept();
		
		
	}
	
}
