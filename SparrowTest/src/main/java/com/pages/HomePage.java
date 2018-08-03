package com.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase{
	
	
	
	

				public  HomePage(){
					
					PageFactory.initElements(driver, this);
					
			}
				

				
@FindBy(xpath=".//*[@id='wrapper']/nav/ul/li[1]/a")
WebElement AboutUs1;

@FindBy(xpath=".//a[contains(@href,'web/version-sparrow.jsp')]")
WebElement Version1;

@FindBy(xpath =".//a[contains(@href,'SPARROW-Manual/Release_Note_of_Sparrow_3.1.pdf')]")
WebElement ReleaseNote;

@FindBy(xpath =".//*[@id='wrapper']/nav/ul/li[2]/a")
WebElement ClickOnUserName;

@FindBy(xpath =".//*[@id='wrapper']/nav/ul/li[2]/ul/li[2]/a")
WebElement UpdateInformation;

@FindBy(xpath ="//a[contains(@onclick,'callAadhaarVerificationFunc')]")
WebElement UpdateAadhaar;

@FindBy(xpath ="//a[contains(@href,'javascript:document.getElementById')]")
WebElement Logout;

@FindBy(xpath ="//a[@href='inbox/doShow']")
WebElement Inbox;

@FindBy(xpath ="//a[@href='sent/doShow']")
WebElement SentBox;

@FindBy(xpath ="//a[@href='roleDetail/doShow']")
WebElement RoleDetail;

@FindBy(xpath ="//a[@href='redirection/doRedirectToSupport']")
WebElement ServiceDesk;

@FindBy (linkText="Work flow")
WebElement ClickWorkflow;
	
@FindBy (xpath ="//a[@href='workflow/doShow?searchType=WITHORGDATA']")
WebElement ClickCreateUpdate;

@FindBy (linkText="PAR")
WebElement ClickPAR;

 @FindBy(xpath ="//a[@href='generation/doShow']")
WebElement ClickOnGenerate;
 
@FindBy(xpath ="//a[@href='updatesection/doShow']")
WebElement ClickOnUpdateSection1;

@FindBy(xpath ="//a[@href='tracking/doShow']")
WebElement ClickOnTracking;

@FindBy(xpath ="//a[@href='forceforward/doShow']")
WebElement ClickOnForceForward;






			
			
			public  HomePage validateAboutus(){
				
				AboutUs1.click();
				return new HomePage();
			}
			
			public Set<String> validateVersion(){
				AboutUs1.click();
				Version1.click();
				
				return driver.getWindowHandles();
				
			}
			
			
			public Set<String> validateReleasenote(){
				
				AboutUs1.click();
				ReleaseNote.click();
				
				return driver.getWindowHandles();
			}
			
			
			public WorkflowEmpSearchPage EnterWorkflow() throws IOException, InterruptedException{
				
				Thread.sleep(1500);
				ClickWorkflow.click();
				ClickCreateUpdate.click();
				
				return new WorkflowEmpSearchPage();
			}
			
			
			public GenerateParPage EnterInPAR() throws IOException{
				
				ClickPAR.click();
				ClickOnGenerate.click();
				
				return new GenerateParPage();
				
			}
			
				public UpdateSection1Page EnterInUpdateSection1(){
						
						ClickPAR.click();
						ClickOnUpdateSection1.click();
						
						return new UpdateSection1Page();
						
					}
					
				public TrackingPage EnterInTracking(){
					
					ClickPAR.click();
					ClickOnTracking.click();
					
					return new TrackingPage();
					
				}
				
				public ForceForwardPage EnterInForceForward(){
					
					ClickPAR.click();
					ClickOnForceForward.click();
					
					return new ForceForwardPage();
					
				}
			
				public void EnterInInbox(){
					
					Inbox.click();
				}

	
			
			
			
			
			

				
	

			
			
			
			
	
	
	
	
	
	
	
	
	

}
