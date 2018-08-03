package com.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class DefineWorkflowPage extends TestBase{

	Actions act;
	//String FormStatus;

			public DefineWorkflowPage() throws IOException {
			
			PageFactory.initElements(driver, this);
			act =new Actions(driver);
			}
	
	
	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_1-container']")
	WebElement SelectOfficerReportedUpon;

	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_2-container']")
	WebElement SelectLevel_2 ;

	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_3-container']")
	WebElement SelectLevel_3;

	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_4-container']")
	WebElement SelectLevel_4;

	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_5-container']")
	WebElement SelectLevel_5;

	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_6-container']")
	WebElement SelectLevel_6;

	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_7-container']")
	WebElement SelectLevel_7;
	
	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_8-container']")
	WebElement SelectLevel_8;
	
	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_9-container']")
	WebElement SelectLevel_9;
	
	@FindBy (xpath=".//*[@id='select2-workFlowStandardEmployeeDataID_2-container']")
	WebElement SelectCRsection;
	
	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_1-container")//span[@id='select2-workFlowRepDetailEmployeeDataID_1-container']
	WebElement SelectRepLevel1;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_2-container")
	WebElement SelectRepLevel2 ;


	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_3-container")
	WebElement SelectRepLevel3;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_4-container")
	WebElement SelectRepLevel4;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_5-container")
	WebElement SelectRepLevel5;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_6-container")
	WebElement SelectRepLevel6;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_7-container")
	WebElement SelectRepLevel7;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_8-container")
	WebElement SelectRepLevel8;

	@FindBy (id="select2-workFlowRepDetailEmployeeDataID_9-container")
	WebElement SelectRepLevel9;


	@FindBy (xpath=".//*[@id='STD_IMG_0_1']")
	WebElement Click_manual_OfficeReportedUpon ;

	@FindBy (xpath=".//*[@id='STD_IMG_1_1']")
	WebElement Click_manual_ReportingAuthority ;

	@FindBy (xpath=".//*[@id='STD_IMG_2_1']")
	WebElement Click_manual_DivisionalCommissioner;

	@FindBy (xpath=".//*[@id='STD_IMG_3_1']")
	WebElement Click_manual_ReviewingAuthority;

	@FindBy (xpath=".//*[@id='STD_IMG_4_1']")
	WebElement Click_manual_CRSectionToDisclose;

	@FindBy (xpath=".//*[@id='STD_IMG_5_1']")
	WebElement Click_manual_OfficeDisclosure;

	@FindBy (xpath=".//*[@id='STD_IMG_6_1']")
	WebElement Click_manual_CRSectionforClosing;
	
	@FindBy (xpath=".//*[@id='STD_IMG_7_1']")
	WebElement Click_manual_Level8;
	
	@FindBy (xpath=".//*[@id='STD_IMG_8_1']")
	WebElement Click_manual_Level9;

	@FindBy (xpath="//input[@title='Save']")
	WebElement ClickSaveWorkflow;
	
	@FindBy (xpath="//input[@title='update']")
	WebElement ClickUpdateWorkflow;
	
	@FindBy (xpath="//input[@class='select2-search__field' and @type='search']")
	WebElement ClickOnTextBox;
	
	@FindBy(xpath="//input[@id='nextBtnID']")
	WebElement ClickOnSaveAndNext;
	
	@FindBy(xpath="//input[@value='Back To Employee Search']")
	WebElement ClickOnBackToEmployeeSearch;
	
	
	
			public void SelectLevel_2Authority(){
				
				SelectLevel_2.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectLevel_3Authority(){
				SelectLevel_3.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectLevel_4Authority(){
				
				SelectLevel_4.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectLevel_5Authority(){
				
				SelectLevel_5.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectLevel_6Authority(){
				
				SelectLevel_6.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectLevel_7Authority(){
				
				SelectLevel_7.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
					
			public void SelectLevel_8Authority(){
				
				SelectLevel_8.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectLevel_9Authority(){
				
				SelectLevel_9.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			
			
			
			public void SelectRepLevel_1Authority(){
				
				SelectRepLevel1.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_2Authority(){
				SelectRepLevel2.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_3Authority(){
				
				SelectRepLevel3.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_4Authority(){
				
				SelectRepLevel4.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_5Authority(){
				
				SelectRepLevel5.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_6Authority(){
				
				SelectRepLevel6.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
					
			public void SelectRepLevel_7Authority(){
				
				SelectRepLevel7.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_8Authority(){
				
				SelectRepLevel8.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
			
			public void SelectRepLevel_9Authority(){
				
				SelectRepLevel9.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}

			
			public void SelectManualWork(){
				
				Click_manual_OfficeReportedUpon.click();
				Click_manual_ReportingAuthority.click();
				Click_manual_DivisionalCommissioner.click();
				Click_manual_ReviewingAuthority.click();
				Click_manual_CRSectionToDisclose.click();
				Click_manual_OfficeDisclosure.click();
				Click_manual_CRSectionforClosing.click();
			}
			public void SelectManualWork_dual(){
							
							Click_manual_OfficeReportedUpon.click();
							Click_manual_ReportingAuthority.click();
							Click_manual_DivisionalCommissioner.click();
							Click_manual_ReviewingAuthority.click();
							Click_manual_CRSectionToDisclose.click();
							Click_manual_OfficeDisclosure.click();
							Click_manual_CRSectionforClosing.click();
							Click_manual_Level8.click();
						}
			
			
			public void SelectManualWork_Rpresentation(){
				
				Click_manual_OfficeReportedUpon.click();
				Click_manual_ReportingAuthority.click();
				Click_manual_DivisionalCommissioner.click();
				Click_manual_ReviewingAuthority.click();
				Click_manual_CRSectionToDisclose.click();
				Click_manual_OfficeDisclosure.click();
				Click_manual_CRSectionforClosing.click();
				Click_manual_Level8.click();
				Click_manual_Level9.click();
			}
		
			
			public String getFormName() {
				
				String FormName=driver.findElement(By.xpath("//div[@class='col-md-4 lbl-normal']")).getText();
				return FormName;
			}
			
			public void ClickSaveWorkflow(){
				
				
				ClickSaveWorkflow.click();
				
			
			}
			

			public void ClickUpdateworkflow(){
				ClickUpdateWorkflow.click();
			}
		
		    public void SelectManualWork_2(){
				
				Click_manual_OfficeReportedUpon.click();
				Click_manual_ReportingAuthority.click();
				
			}
		    public void SelectNRC_CR_Section(){
				
		    	SelectCRsection.click();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
						
					}
	
	
		    public void ClickOnSaveANdNext() {
		    	
		    	ClickOnSaveAndNext.click();
		    }
	
		    public void ClickOnBackToEmpSearch() {
		    	
		    	ClickOnBackToEmployeeSearch.click();
		    }
	
	
		    
	
	
	
	
	
}
