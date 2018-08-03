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
import com.pages.IPS.BasicInformationPage;
import com.pages.IPS.CRSectionToDisclose;
import com.pages.IPS.CRSectionforClosing;
import com.pages.IPS.OfficerDisclosure;
import com.pages.IPS.SectionIII_Appraisal;
import com.pages.IPS.SectionII_SelfAppraisal;
import com.pages.IPS.SectionIV_Review;
import com.pages.IPS.SectionV_Acceptance;
import com.utility.Util;

public class IPS_WorkingFormTest extends TestBase{
								
				LoginPage loginPage;
				HomePage homePage;
				Util util;
				String SheetName="IPS";
				WorkflowEmpSearchPage workflowEmpSearchPage;
				WorkflowSelectFormPage workflowSelectFormPage;
				DefineWorkflowPage defineWorkflowPage;
				BasicInformationPage section_1;
				SectionII_SelfAppraisal section_2;
				SectionIII_Appraisal section_3;
				SectionV_Acceptance section_5;
				SectionIV_Review section_4;
				CRSectionforClosing section_8;
				CRSectionToDisclose section_6;
				OfficerDisclosure section_7;
				InboxPage inbox;
				GenerateParPage generatePar; 
	
		public IPS_WorkingFormTest() {
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
			 section_1=new BasicInformationPage();
			 section_2= new SectionII_SelfAppraisal();
			 section_3=new SectionIII_Appraisal();
			 section_4=new SectionIV_Review();
			 section_5=new SectionV_Acceptance();
			 section_6=new CRSectionToDisclose();
			 section_7=new OfficerDisclosure();
			 section_8=new CRSectionforClosing();
			 inbox=new InboxPage();
			 generatePar=new GenerateParPage();
			
				
		}

	
@DataProvider

			public Object[][] getTestData() {
				Object data[][]=null;
				data= util.getTestData(SheetName);
				return data;
						
				
			}


@Test (dataProvider="getTestData", priority=2)

		public void TestForm_IPSonDeputation(String Service,String loginid,String pwd) throws InterruptedException, IOException {
			
	
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
			
			homePage.EnterInPAR();
			generatePar.SelectAssessmentPeriod();
			
			Thread.sleep(1000);
			generatePar.SearchEmp(Emp_Name);
			Thread.sleep(1000);
			generatePar.ClickOnGeneratePAR();
			Thread.sleep(1000);
			section_1.ClickOnSendButton();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_2.Open_Par();
			section_2.Fill_Section_2_Form_1();
			section_2.ClickOnSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_3.Open_Par();
			section_3.Fill_Section_3_Form_1();
			section_3.ClickOnSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_4.OpenPar();
			section_4.Fill_Section_4_Form_No();
			section_4.ClickonSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_5.OpenPar();
			section_5.Fill_Section_5_form_ForNO();
			section_5.ClickOnsubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_6.ParAtCRSectionToDisclose();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_7.ParAtOfficerDisclosure();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_8.ParAtCRSectionToDisclose();
			System.out.println("PAR has been closed");
			
			try {
				util.takeScreenshotAtEndOfTest();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

		
@Test (dataProvider="getTestData", priority=1)

			public void TestForm_IPS_ExceptADGandDG(String Service,String loginid,String pwd) throws InterruptedException, IOException {
				
			
				homePage = loginPage.LoginWithExcelDataForServicesWar(Service, loginid, pwd);
				
				System.out.println("Logged into the application succesfully with Login ID= " + loginid );
				
				homePage.EnterWorkflow();
				
				Thread.sleep(2000);
				
				workflowEmpSearchPage.ClickOnWorkflowWithAllOrganisation();
				
				workflowEmpSearchPage.SelectAssessmentPeriod();
				
				workflowEmpSearchPage.UncheckIsProcess();
				
				workflowEmpSearchPage.UncheckIsCompleted();
				
				workflowEmpSearchPage.ClickSearch();
				
				String Emp_Name= workflowEmpSearchPage.SearchEmploye();
				System.out.println("Creating Workflow of employee: " + Emp_Name);
				
				workflowEmpSearchPage.CreateWorkflow();
				
				workflowSelectFormPage.Select_Working_TypeForm_InStatus();
				
				workflowSelectFormPage.SelectFormType2();
				
				workflowSelectFormPage.ClickContinue();
				
				defineWorkflowPage.SelectLevel_2Authority();
				defineWorkflowPage.SelectLevel_3Authority();
				defineWorkflowPage.SelectLevel_4Authority();
				defineWorkflowPage.SelectLevel_5Authority();
				defineWorkflowPage.SelectLevel_6Authority();
				defineWorkflowPage.SelectLevel_7Authority();
				defineWorkflowPage.SelectLevel_8Authority();
				
				defineWorkflowPage.SelectManualWork_dual();
				String FormName=defineWorkflowPage.getFormName();
				defineWorkflowPage.ClickSaveWorkflow();
				
				
				System.out.println("Workflow of  " + Emp_Name +"  has been created succesfully for service :  " + Service +" and Form Name :  "+  FormName);
				
				
				homePage.EnterInPAR();
				generatePar.SelectAssessmentPeriod();
				
				Thread.sleep(1000);
				generatePar.SearchEmp(Emp_Name);
				Thread.sleep(1000);
				generatePar.ClickOnGeneratePAR();
				Thread.sleep(1000);
				section_1.ClickOnSendButton();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_2.Open_Par();
				section_2.Fill_Section_2_Form_2();
				section_2.ClickOnSubmit();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_3.Open_Par();
				section_3.Fill_Section_3_Form_2();
				section_3.ClickOnSubmit_dual();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_3.Open_Par();
				section_3.Fill_Section_3_Form_2_dual();
				section_3.ClickOnSubmit();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_4.OpenPar();
				section_4.Fill_Section_4_Form_No();
				section_4.ClickonSubmit();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_5.OpenPar();
				section_5.Fill_Section_5_form2_ForNO();
				section_5.ClickOnsubmit();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_6.ParAtCRSectionToDisclose();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_7.ParAtOfficerDisclosure();
				
				homePage.EnterInInbox();
				inbox.ClickOnMannual();
				inbox.SearchEmp(Emp_Name);
				
				section_8.ParAtCRSectionToDisclose();
				System.out.println("PAR has been closed");
				
				try {
					util.takeScreenshotAtEndOfTest();
				} catch (org.openqa.selenium.NoSuchElementException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				
				
	
	
	
	
	
	
	
	
	
	
	
}


@Test (dataProvider="getTestData", priority=3)

		
		public void TestForm_IPS_ExceptADGandDG_WithoutDual(String Service,String loginid,String pwd) throws InterruptedException, IOException {
			
		
			homePage = loginPage.LoginWithExcelDataForServicesWar(Service, loginid, pwd);
			
			System.out.println("Logged into the application succesfully with Login ID= " + loginid );
			
			homePage.EnterWorkflow();
			
			Thread.sleep(2000);
			
			workflowEmpSearchPage.ClickOnWorkflowWithAllOrganisation();
			
			workflowEmpSearchPage.SelectAssessmentPeriod();
			
			workflowEmpSearchPage.UncheckIsProcess();
			
			workflowEmpSearchPage.UncheckIsCompleted();
			
			workflowEmpSearchPage.ClickSearch();
			
			String Emp_Name= workflowEmpSearchPage.SearchEmploye();
			System.out.println("Creating Workflow of employee: " + Emp_Name);
			
			workflowEmpSearchPage.CreateWorkflow();
			
			workflowSelectFormPage.Select_Working_TypeForm_InStatus();
			
			workflowSelectFormPage.SelectFormType3();
			
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
			
			homePage.EnterInPAR();
			generatePar.SelectAssessmentPeriod();
			
			Thread.sleep(1000);
			generatePar.SearchEmp(Emp_Name);
			Thread.sleep(1000);
			generatePar.ClickOnGeneratePAR();
			Thread.sleep(1000);
			section_1.ClickOnSendButton();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_2.Open_Par();
			section_2.Fill_Section_2_Form_2();
			section_2.ClickOnSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_3.Open_Par();
			section_3.Fill_Section_3_Form_2();
			section_3.ClickOnSubmit();
			
						
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_4.OpenPar();
			section_4.Fill_Section_4_Form_No();
			section_4.ClickonSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_5.OpenPar();
			section_5.Fill_Section_5_form2_ForNO();
			section_5.ClickOnsubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_6.ParAtCRSectionToDisclose();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_7.ParAtOfficerDisclosure();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_8.ParAtCRSectionToDisclose();
			System.out.println("PAR has been closed");
			
			try {
				util.takeScreenshotAtEndOfTest();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		
}

			

@Test (dataProvider="getTestData", priority=0)

		
		public void TestForm_IPS_Form_ADGandDG(String Service,String loginid,String pwd) throws InterruptedException, IOException {
			
		
			homePage = loginPage.LoginWithExcelDataForServicesWar(Service, loginid, pwd);
			
			System.out.println("Logged into the application succesfully with Login ID= " + loginid );
			
			homePage.EnterWorkflow();
			
			Thread.sleep(2000);
			
			workflowEmpSearchPage.ClickOnWorkflowWithAllOrganisation();
			
			workflowEmpSearchPage.SelectAssessmentPeriod();
			
			workflowEmpSearchPage.UncheckIsProcess();
			
			workflowEmpSearchPage.UncheckIsCompleted();
			
			workflowEmpSearchPage.ClickSearch();
			
			String Emp_Name= workflowEmpSearchPage.SearchEmploye();
			System.out.println("Creating Workflow of employee: " + Emp_Name);
			
			workflowEmpSearchPage.CreateWorkflow();
			
			workflowSelectFormPage.Select_Working_TypeForm_InStatus();
			
			workflowSelectFormPage.SelectFormType4();
			
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
			
			Thread.sleep(1000);
			homePage.EnterInPAR();
			generatePar.SelectAssessmentPeriod();
			
			Thread.sleep(1000);
			generatePar.SearchEmp(Emp_Name);
			Thread.sleep(1000);
			generatePar.ClickOnGeneratePAR();
			Thread.sleep(1000);
			section_1.ClickOnSendButton();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_2.Open_Par();
			//section_2.Fill_Section_2_Form_2();
			section_2.ClickOnSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_3.Open_Par();
			section_3.Fill_Section_3_Form_4();
			section_3.ClickOnSubmit();
			
						
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_4.OpenPar();
			section_4.Fill_Section_4_Form_No();
			section_4.ClickonSubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_5.OpenPar();
			section_5.Fill_Section_5_form2_ForNO_4();
			section_5.ClickOnsubmit();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_6.ParAtCRSectionToDisclose();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_7.ParAtOfficerDisclosure();
			
			homePage.EnterInInbox();
			inbox.ClickOnMannual();
			inbox.SearchEmp(Emp_Name);
			
			section_8.ParAtCRSectionToDisclose();
			System.out.println("PAR has been closed");
			
			try {
				util.takeScreenshotAtEndOfTest();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
		
}


}
