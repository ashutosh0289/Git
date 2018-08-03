package com.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.pages.DefineWorkflowPage;
import com.pages.GenerateParPage;
import com.pages.HomePage;
import com.pages.InboxPage;
import com.pages.LoginPage;
import com.pages.WorkflowEmpSearchPage;
import com.pages.WorkflowSelectFormPage;

import com.pages.Training.Training_Section1;
import com.pages.Training.Training_Section2;
import com.pages.Training.Training_Section3;
import com.utility.Util;

public class TrainingFormTest_ServicesWar extends TestBase {
						LoginPage loginPage;
						HomePage homePage;
						
						String SheetName ="LoginIds";
						String Service;
						WorkflowEmpSearchPage workflowEmpSearchPage;
						WorkflowSelectFormPage workflowSelectFormPage;
						DefineWorkflowPage defineWorkflowPage;
						GenerateParPage generatePar;
						Training_Section1 training_section1;
						Training_Section2 training_section2;
						Training_Section3 training_section3;
						InboxPage inbox;
						Util util;
	
			public TrainingFormTest_ServicesWar() {
				super();
			}

			
			@BeforeMethod
			
			public void steup() throws IOException {
				
				initialization();
				homePage =new HomePage();
				loginPage=new LoginPage();
				util =new Util();
				workflowEmpSearchPage=new WorkflowEmpSearchPage();
				workflowSelectFormPage=new WorkflowSelectFormPage();
				defineWorkflowPage=new DefineWorkflowPage();
				generatePar=new GenerateParPage();
				training_section1=new Training_Section1();
				training_section2=new Training_Section2();
				training_section3=new Training_Section3();
				inbox=new InboxPage();
					
			}
			
	@DataProvider

	public Object[][] getTestData() {
		Object data[][]=null;
		data= util.getTestData(SheetName);
		return data;
				
		
	}


	@Test (dataProvider="getTestData", priority=0)	

	public void TestTrainingFlow(String Service,String loginid,String pwd) throws InterruptedException, IOException {
		
		homePage = loginPage.LoginWithExcelDataForServicesWar(Service, loginid, pwd);
		
		System.out.println("Logged into the application succesfully with Login ID= " + loginid );
		
		homePage.EnterWorkflow();
		
		//Thread.sleep(2000);
		
		workflowEmpSearchPage.ClickOnWorkflowWithAllOrganisation();
		
		workflowEmpSearchPage.SelectAssessmentPeriod();
		
		workflowEmpSearchPage.UncheckIsProcess();
		
		workflowEmpSearchPage.UncheckIsCompleted();
		
		workflowEmpSearchPage.ClickSearch();
		
		String Emp_Name= workflowEmpSearchPage.SearchEmploye();
		System.out.println("Creating Workflow of employee: " + Emp_Name);
		
		workflowEmpSearchPage.CreateWorkflow();
		
		workflowSelectFormPage.Select_Training_TypeForm_InStatus();
		
		workflowSelectFormPage.SelectFormType1();
		
		workflowSelectFormPage.ClickContinue();
		
		defineWorkflowPage.SelectLevel_2Authority();
		
		
		
		defineWorkflowPage.SelectManualWork_2();
		
		defineWorkflowPage.ClickSaveWorkflow();

		System.out.println("Training Workflow of  " + Emp_Name +"  has been created succesfully for service :  " + Service);
		
		
		homePage.EnterInPAR();
		generatePar.SelectAssessmentPeriod();
		generatePar.SearchEmp(Emp_Name);
		
		generatePar.ClickOnGeneratePAR();
		
		training_section1.FillLeaveForm();
		Thread.sleep(1500);
		training_section1.SendToOfficerReportedupon();
		
		Thread.sleep(3000);
		homePage.EnterInInbox();
		Thread.sleep(3000);
		inbox.ClickOnMannual();
		Thread.sleep(1500);
		try{
		inbox.SearchEmp(Emp_Name);
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex){
			inbox.SearchEmp(Emp_Name);
			
		}
		inbox.OpenAParID();
		training_section2.SendToCRSection();
		
		Thread.sleep(3000);
		homePage.EnterInInbox();
		Thread.sleep(3000);
		inbox.ClickOnMannual();
		Thread.sleep(3000);
		inbox.SearchEmp(Emp_Name);
		inbox.OpenAParID();


		training_section3.Close();
		
		
		System.out.println("NRC par of " + Emp_Name + " has been closed succesfully");
		
	}
			
			
			
			
			
}
