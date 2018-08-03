package com.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class WorkflowEmpSearchPage extends TestBase{
	

		Actions act;
		//String FormStatus;

					
					
			public WorkflowEmpSearchPage() throws IOException {
			
			PageFactory.initElements(driver, this);
			act =new Actions(driver);
			}


			
@FindBy (id="isProcess1")
WebElement IsprocessRdioBtn;

@FindBy (id="isCompleted1")
WebElement IsCompletedRdioBtn;

@FindBy (xpath="//input[@class='btn btn-primary' and @title='Search']")
WebElement ClickSearchBtn;
	
@FindBy (xpath=".//*[@id='select2-assessmentYearID-container']")
WebElement SelectAssessmentPeriod;

@FindBy (xpath="//li[@title='Workflow With All Organization Employee']")
WebElement ClickWorkflowWithAllOrganisation;

@FindBy (xpath=".//*[@id='datatableID']/tbody/tr[1]/td[3]/div")
WebElement Emp_Name;

@FindBy (xpath="//input[@class='btn btn-primary' and @title='Create Workflow']")
WebElement ClickCreateWorkflowBtn;

@FindBy (xpath="//input[@class='select2-search__field' and @type='search']")
WebElement ClickOnTextBox;










			public void UncheckIsProcess(){
				
			
				IsprocessRdioBtn.click();
			}
			
			public void UncheckIsCompleted(){
				
				IsCompletedRdioBtn.click();
			}
				
			public void ClickSearch(){
					
				ClickSearchBtn.click();
				
			}
				
			public void CreateWorkflow(){
				
				ClickCreateWorkflowBtn.click();
				
			}

			public void ClickOnWorkflowWithAllOrganisation() throws InterruptedException{
				
				Thread.sleep(1500);
				ClickWorkflowWithAllOrganisation.click();
				
			}

			
	
			public void SelectAssessmentPeriod(){
				
				SelectAssessmentPeriod.click();
				ClickOnTextBox.click();
				//ClickOnTextBox.sendKeys(prop.getProperty("AssessmentYear"));
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
				
			}
	
	
			public String SearchEmploye(){
				
				return Emp_Name.getText();
				
				
			}
}
