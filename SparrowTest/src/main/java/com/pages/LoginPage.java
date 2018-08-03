package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class LoginPage extends TestBase{
	
	Select dropdown;
	
	
	
	
			public LoginPage(){
					
					PageFactory.initElements(driver, this);
					
					
				}
	
	
			
@FindBy (id="username")
WebElement username;
			
@FindBy(id="password")
WebElement password;
			
@FindBy(xpath="//input[contains(@onclick,'return doSubmit()')]")
WebElement loginButton;
			
			
@FindBy(xpath="//a[@href='http://eoffice.gov.in/servicesSparrowContact'])")
WebElement ContactUs;
			
@FindBy (id="instanceId")
WebElement SelectService;
				
	
	

		public HomePage  LoginWithExcelDataForServicesWar(String Service,String loginid, String pwd) throws InterruptedException{
			
			dropdown=new Select(SelectService);
			
			dropdown.selectByValue(Service);
			
			username.sendKeys(loginid);	
			password.sendKeys(pwd);
			Thread.sleep(1500);
			loginButton.click();
			
			return new HomePage();
			
		}
	
		public HomePage  LoginWithExcelData(String loginid, String pwd) throws InterruptedException{
			
			
			username.sendKeys(loginid);	
			password.sendKeys(pwd);
			Thread.sleep(1500);
			loginButton.click();
			
			return new HomePage();
			
		}
	
		public HomePage ValidateLoginPage(String loginid, String pwd) throws InterruptedException{
			
			
			
			username.sendKeys(loginid);	
			password.sendKeys(pwd);
			Thread.sleep(1500);
			loginButton.click();
			
			return new HomePage();
			
		}
	
		public String validateContactus(){
			
			ContactUs.click();
			return driver.getWindowHandle();
			
			
		}
		
		public void Selectservice(){
			
			dropdown=new Select(SelectService);
			dropdown.selectByValue(prop.getProperty("Service"));
			//dropdown.selectByValue(prop.getProperty(Service));
			
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
	

}
