package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.pages.DefineWorkflowPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.WorkflowEmpSearchPage;
import com.pages.WorkflowSelectFormPage;
import com.utility.Util;

public class WorkflowTest_ServicesWar extends TestBase {
					
				LoginPage loginPage;
				HomePage homePage;
				Util util;
				String SheetName="LoginIds";
				WorkflowEmpSearchPage workflowEmpSearchPage;
				WorkflowSelectFormPage workflowSelectFormPage;
				DefineWorkflowPage defineWorkflowPage;
	
	public WorkflowTest_ServicesWar() {
		
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
		
			
	}
	
	
	
@DataProvider
	
	public Object[][] getTestData() {
		Object data[][]=null;
		data= util.getTestData(SheetName);
		return data;
				
		
	}
	
	
	@Test (dataProvider="getTestData", priority=0)
	
	public void TestWorkflowForWorking(String Service,String loginid,String pwd) throws InterruptedException, IOException {
		
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
		
		workflowSelectFormPage.Select_Working_TypeForm_InStatus();
		
		workflowSelectFormPage.SelectFormType1();
		
		workflowSelectFormPage.ClickContinue();
		
		defineWorkflowPage.SelectLevel_2Authority();
		defineWorkflowPage.SelectLevel_3Authority();
		defineWorkflowPage.SelectLevel_4Authority();
		defineWorkflowPage.SelectLevel_5Authority();
		defineWorkflowPage.SelectLevel_6Authority();
		defineWorkflowPage.SelectLevel_7Authority();
		
		defineWorkflowPage.SelectManualWork();
		String FormName=defineWorkflowPage.getFormName();
		defineWorkflowPage.ClickSaveWorkflow();
		
		
		System.out.println("Workflow of  " + Emp_Name +"  has been created succesfully for service :  " + Service +" and Form Name :  "+  FormName);
		
		
	}
	
	
	@Test (dataProvider="getTestData", priority=1)
	
	public void TestWorkflowForNRC(String Service,String loginid,String pwd) throws InterruptedException, IOException {
		
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
		
		workflowSelectFormPage.Select_NRC_TypeForm_InStatus();
		
		workflowSelectFormPage.SelectFormType1();
		
		workflowSelectFormPage.ClickContinue();
		
		defineWorkflowPage.SelectLevel_2Authority();
		
		
		
		defineWorkflowPage.SelectManualWork_2();
		
		String FormName=defineWorkflowPage.getFormName();
		defineWorkflowPage.ClickSaveWorkflow();
		
		
		System.out.println("NRC Workflow of  " + Emp_Name +"  has been created succesfully for service :  " + Service +" and Form Name :  "+  FormName);
		
		
	}
	
	
	

	@Test (dataProvider="getTestData", priority=2)
	
	public void TestWorkflowForLeave(String Service,String loginid,String pwd) throws InterruptedException, IOException {
		
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
		
		workflowSelectFormPage.Select_Leave_TypeForm_InStatus();
		
		workflowSelectFormPage.SelectFormType1();
		
		workflowSelectFormPage.ClickContinue();
		
		defineWorkflowPage.SelectLevel_2Authority();
		
		
		
		defineWorkflowPage.SelectManualWork_2();
		
		String FormName=defineWorkflowPage.getFormName();
		defineWorkflowPage.ClickSaveWorkflow();
		
	
		System.out.println("Leave Workflow of  " + Emp_Name +"  has been created succesfully for service :  " + Service +" and Form Name :  "+  FormName);


		
	}
	

	@Test (dataProvider="getTestData", priority=3)
	
	public void TestWorkflowForTraining(String Service,String loginid,String pwd) throws InterruptedException, IOException {
		
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
		String FormName=defineWorkflowPage.getFormName();
		defineWorkflowPage.ClickSaveWorkflow();
		
		
		System.out.println("Training Workflow of  " + Emp_Name +"  has been created succesfully for service :  " + Service +" and Form Name :  "+  FormName);

		
		
	}
	
	
	
	
	@AfterMethod
	
	public void TearDown() {
		
		//driver.quit();
	}
	
	
	
}
