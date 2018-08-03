package com.pages.IPS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SectionIII_Appraisal extends TestBase{
		
		File src = new File ("G:/TestNewData.xlsx");
			
			
		
			
	public SectionIII_Appraisal(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	

	@FindBy(xpath ="//input[@name='lF.appraisal.assessmentAttribute[0].reportingAuthorityGrade']")
	WebElement InputField_Sec3_1_a;
	
	@FindBy(xpath ="//input[@name='lF.appraisal.assessmentAttribute[1].reportingAuthorityGrade']")
	WebElement InputField_Sec3_1_b;
	
	
	@FindBy(xpath ="//input[@name='lF.appraisal.assessmentAttribute[2].reportingAuthorityGrade']")
	WebElement InputField_Sec3_1_c;
	
	@FindBy(xpath ="//input[@name='lF.appraisal.assessmentAttribute[3].reportingAuthorityGrade']")
	WebElement InputField_Sec3_1_d;
	
	@FindBy(xpath ="//input[@name='lF.appraisal.assessmentAttribute[4].reportingAuthorityGrade']")
	WebElement InputField_Sec3_1_e;
	
	@FindBy(xpath ="//input[@name='lF.appraisal.assessmentAttribute[5].reportingAuthorityGrade']")
	WebElement InputField_Sec3_1_f;
	
	@FindBy(xpath ="//input[@id='secIII_TableII_TRI_TDIII_1']")
	WebElement InputField_Sec3_1_a_4;
	
	@FindBy(xpath ="//input[@id='secIII_TableII_TRI_TDIII_2']")
	WebElement InputField_Sec3_1_b_4;
	
	
	@FindBy(xpath ="//input[@id='secIII_TableII_TRI_TDIII_3']")
	WebElement InputField_Sec3_1_c_4;
	
	@FindBy(xpath ="//input[@id='secIII_TableII_TRI_TDIII_4']")
	WebElement InputField_Sec3_1_d_4;
	
	@FindBy(xpath ="//input[@id='secIII_TableII_TRI_TDIII_5']")
	WebElement InputField_Sec3_1_e_4;
	
	@FindBy(xpath ="//input[@id='secIII_TableII_TRI_TDIII_6']")
	WebElement InputField_Sec3_1_f_4;

	
	@FindBy(xpath =".//*[@id='secIII_TableI_TRI_TDIII_1']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a;
	
	@FindBy(xpath =".//*[@id='secIII_TableI_TRI_TDIII_2']")
	WebElement InputField_Sec3_2_b;
	
	@FindBy(xpath =".//*[@id='secIII_TableI_TRI_TDIII_3']")
	WebElement InputField_Sec3_2_c;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableI_TRI_TDIII_1']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableI_TRI_TDIII_2']")
	WebElement InputField_Sec3_2_b_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableI_TRI_TDIII_3']")
	WebElement InputField_Sec3_2_c_dual;
	
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_1']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_1;
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_2']")
	WebElement InputField_Sec3_2_b_2;
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_3']")
	WebElement InputField_Sec3_2_c_3;
	

	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_4']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_4;
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_5']")
	WebElement InputField_Sec3_2_b_5;
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_6']")
	WebElement InputField_Sec3_2_c_6;
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_7']")
	WebElement InputField_Sec3_2_c_7;
	
	@FindBy(xpath =".//*[@id='secIII_TableII_TRI_TDIII_8']")
	WebElement InputField_Sec3_2_c_8;
	
	@FindBy(xpath =".//*[@id='secIII_TableIII_TRI_TDIII_1']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_9;
	
	@FindBy(xpath =".//*[@id='secIII_TableIII_TRI_TDIII_2']")
	WebElement InputField_Sec3_2_b_10;
	
	@FindBy(xpath =".//*[@id='secIII_TableIII_TRI_TDIII_3']")
	WebElement InputField_Sec3_2_c_11;
	

	@FindBy(xpath =".//*[@id='secIII_TableIII_TRI_TDIII_4']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_12;
	
	@FindBy(xpath =".//*[@id='secIII_TableIII_TRI_TDIII_5']")
	WebElement InputField_Sec3_2_b_13;
	
	@FindBy(xpath =".//*[@id='secIII_TableIII_TRI_TDIII_6']")
	WebElement InputField_Sec3_2_c_14;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_1']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_1_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_2']")
	WebElement InputField_Sec3_2_b_2_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_3']")
	WebElement InputField_Sec3_2_c_3_dual;
	

	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_4']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_4_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_5']")
	WebElement InputField_Sec3_2_b_5_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_6']")
	WebElement InputField_Sec3_2_c_6_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_7']")
	WebElement InputField_Sec3_2_c_7_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableII_TRI_TDIII_8']")
	WebElement InputField_Sec3_2_c_8_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableIII_TRI_TDIII_1']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_9_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableIII_TRI_TDIII_2']")
	WebElement InputField_Sec3_2_b_10_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableIII_TRI_TDIII_3']")
	WebElement InputField_Sec3_2_c_11_dual;
	

	@FindBy(xpath =".//*[@id='secIIIAppII_TableIII_TRI_TDIII_4']")
	//input[@name='lF.appraisal.workOutputAssessment[0].reportingAuthorityGrade']
	WebElement InputField_Sec3_2_a_12_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableIII_TRI_TDIII_5']")
	WebElement InputField_Sec3_2_b_13_dual;
	
	@FindBy(xpath =".//*[@id='secIIIAppII_TableIII_TRI_TDIII_6']")
	WebElement InputField_Sec3_2_c_14_dual;
	
	
	@FindBy(xpath ="//*[@id='appCommentOnIntegrity']")
	WebElement InputField_Sec3_3;
	
	@FindBy(xpath ="//*[@id='appPenPictureByReportingOfficer']")
	WebElement InputField_Sec3_4;
	
	@FindBy(xpath ="//*[@id='commentOnIntegrityappII']")
	WebElement InputField_Sec3_3_dual;
	
	@FindBy(xpath ="//textarea[@id='appPenPictureByReportingOfficerappII']")
	WebElement InputField_Sec3_4_dual;
	
	@FindBy(xpath ="//*[@id='domainAssignAppraisal1']") //input[@id='domainAssignappraisalDual2']
	WebElement Radiobtn_Sec3_5_1;
	
	
	@FindBy(xpath ="//*[@id='domainAssignAppraisal2']")
	WebElement Radiobtn_Sec3_5_2;
	
	@FindBy(xpath ="//*[@id='domainAssignAppraisal4']")
	WebElement Radiobtn_Sec3_5_4;
	
	@FindBy(xpath ="//*[@id='domainAssignAppraisal3']")
	WebElement Radiobtn_Sec3_5_3;
	
	@FindBy(xpath ="//*[@id='domainAssignappraisalDual1']") //input[@id='domainAssignappraisalDual2']
	WebElement Radiobtn_Sec3_5_1_dual;
	
	
	@FindBy(xpath ="//*[@id='domainAssignappraisalDual2']")
	WebElement Radiobtn_Sec3_5_2_dual;
	
	@FindBy(xpath ="//*[@id='domainAssignappraisalDual4']")
	WebElement Radiobtn_Sec3_5_4_dual;
	
	@FindBy(xpath ="//*[@id='domainAssignappraisalDual3']")
	WebElement Radiobtn_Sec3_5_3_dual;
	
	
	@FindBy(xpath ="//img[@id='prof_image9']")//div[@class='TabbedPanelsContent TabbedPanelsContentVisible']//div//tbody//tr[13]//td[1]//ol[1]//img[1]
	WebElement OpenCloseButton;
	
	@FindBy(xpath ="//div[@class='TabbedPanelsContent TabbedPanelsContentVisible']//div//tbody//tr[13]//td[1]//ol[1]//img[1]")
	WebElement OpenCloseButton_dual;
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
	WebElement OpenPar;
	
	
	@FindBy (xpath="//input[@id='draft']")
	WebElement ClickOnSaveAsDraft;
	
	@FindBy (xpath="//input[@value='Send To Reviewing Authority']")
	WebElement ClickOnSendToReviewingAuthority;
	
	@FindBy (xpath="//input[@value='Send To Reporting Authority']")
	WebElement ClickOnSendToReportingAuthority;
	
	
	@FindBy(xpath="//textarea[@id='agreeOnWorkPlanFactualDetail']")//*[@id="agreeOnWorkPlanFactualDetailappII"]
	WebElement agreeOnWorkplan;
	
	@FindBy(xpath="//textarea[@id='commentOnExceptionalContribution']")
	WebElement commentOnExcepContri;
	
	@FindBy(xpath="//textarea[@id='significantFailureInWork']")
	WebElement significantFailure;
	
	@FindBy(xpath="//textarea[@id='agreeSkillUpgradationobj']")
	WebElement agreeSkill;
	
	
	@FindBy(xpath="//textarea[@id='agreeOnWorkPlanFactualDetailappII']")//*[@id="agreeOnWorkPlanFactualDetailappII"]
	WebElement agreeOnWorkplan_dual;
	
	@FindBy(xpath="//textarea[@id='commentOnExceptionalContributionappII']")
	WebElement commentOnExcepContri_dual;
	
	@FindBy(xpath="//textarea[@id='significantFailureInWorkappII']")
	WebElement significantFailure_dual;
	
	@FindBy(xpath="//textarea[@id='agreeSkillUpgradationobjappII']")
	WebElement agreeSkill_dual;
	
	
	
	
	
	
	
	
	
	
	
	

	
	public void Fill_Section_3_Form_2() throws InterruptedException, IOException{
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(2);
		String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
		//Search.sendKeys("Reporting Authority");
		//OpenPar.click();
		
		agreeOnWorkplan.sendKeys(data56);
		commentOnExcepContri.sendKeys(data56);
		significantFailure.sendKeys(data56);
		agreeSkill.sendKeys(data56);
		
		InputField_Sec3_2_a.sendKeys("8");
		InputField_Sec3_2_b.sendKeys("8");
		InputField_Sec3_2_c.sendKeys("8");
		Thread.sleep(1500);
		InputField_Sec3_2_a_1.sendKeys("8");
		InputField_Sec3_2_b_2.sendKeys("8");
		InputField_Sec3_2_c_3.sendKeys("8");
		InputField_Sec3_2_a_4.sendKeys("8");
		InputField_Sec3_2_b_5.sendKeys("8");
		InputField_Sec3_2_c_6.sendKeys("8");
		InputField_Sec3_2_c_7.sendKeys("8");
		InputField_Sec3_2_c_8.sendKeys("8");
		OpenCloseButton.click();
		Thread.sleep(1500);
		InputField_Sec3_2_a_9.sendKeys("8");
		InputField_Sec3_2_b_10.sendKeys("8");
		InputField_Sec3_2_c_11.sendKeys("8");
		InputField_Sec3_2_a_12.sendKeys("8");
		InputField_Sec3_2_b_13.sendKeys("8");
		InputField_Sec3_2_c_14.sendKeys("8");
		OpenCloseButton.click();
		Thread.sleep(1500);

		InputField_Sec3_3.sendKeys(data56);
		InputField_Sec3_4.sendKeys(data56);
		Radiobtn_Sec3_5_1.click();
		Radiobtn_Sec3_5_2.click();
		Radiobtn_Sec3_5_3.click();
		Radiobtn_Sec3_5_4.click();
		
	}
	

	public void Fill_Section_3_Form_4() throws InterruptedException, IOException{
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(2);
		String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
		//Search.sendKeys("Reporting Authority");
		//OpenPar.click();
		
		//agreeOnWorkplan.sendKeys(data56);
		//commentOnExcepContri.sendKeys(data56);
		//significantFailure.sendKeys(data56);
		//agreeSkill.sendKeys(data56);
		
		InputField_Sec3_1_a_4.sendKeys("8");
		InputField_Sec3_1_b_4.sendKeys("8");
		InputField_Sec3_1_c_4.sendKeys("8");
		InputField_Sec3_1_d_4.sendKeys("8");
		InputField_Sec3_1_e_4.sendKeys("8");
		InputField_Sec3_1_f_4.sendKeys("8");
		OpenCloseButton.click();
		Thread.sleep(1500);
		InputField_Sec3_2_a.sendKeys("8");
		InputField_Sec3_2_b.sendKeys("8");
		InputField_Sec3_2_c.sendKeys("8");
		Thread.sleep(1500);
		OpenCloseButton.click();
		InputField_Sec3_3.sendKeys(data56);
		InputField_Sec3_4.sendKeys(data56);
		Radiobtn_Sec3_5_1.click();
		Radiobtn_Sec3_5_2.click();
		Radiobtn_Sec3_5_3.click();
		Radiobtn_Sec3_5_4.click();
			
	}

	
public void Fill_Section_3_Form_2_dual() throws InterruptedException, IOException{
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(2);
		String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
		//Search.sendKeys("Reporting Authority");
		//OpenPar.click();
		
		agreeOnWorkplan_dual.sendKeys(data56);
		commentOnExcepContri_dual.sendKeys(data56);
		significantFailure_dual.sendKeys(data56);
		agreeSkill_dual.sendKeys(data56);
		
		InputField_Sec3_2_a_dual.sendKeys("8");
		InputField_Sec3_2_b_dual.sendKeys("8");
		InputField_Sec3_2_c_dual.sendKeys("8");
		Thread.sleep(1500);
		InputField_Sec3_2_a_1_dual.sendKeys("8");
		InputField_Sec3_2_b_2_dual.sendKeys("8");
		InputField_Sec3_2_c_3_dual.sendKeys("8");
		InputField_Sec3_2_a_4_dual.sendKeys("8");
		InputField_Sec3_2_b_5_dual.sendKeys("8");
		InputField_Sec3_2_c_6_dual.sendKeys("8");
		InputField_Sec3_2_c_7_dual.sendKeys("8");
		InputField_Sec3_2_c_8_dual.sendKeys("8");
		Thread.sleep(1500);
		//OpenCloseButton.click();
		Thread.sleep(1500);
		InputField_Sec3_2_a_9_dual.sendKeys("8");
		InputField_Sec3_2_b_10_dual.sendKeys("8");
		InputField_Sec3_2_c_11_dual.sendKeys("8");
		InputField_Sec3_2_a_12_dual.sendKeys("8");
		InputField_Sec3_2_b_13_dual.sendKeys("8");
		InputField_Sec3_2_c_14_dual.sendKeys("8");
		//OpenCloseButton.click();
		Thread.sleep(1500);

		InputField_Sec3_3_dual.sendKeys(data56);
		InputField_Sec3_4_dual.sendKeys(data56);
		Radiobtn_Sec3_5_1_dual.click();
		Radiobtn_Sec3_5_2_dual.click();
		Radiobtn_Sec3_5_3_dual.click();
		Radiobtn_Sec3_5_4_dual.click();
		
	}
	
	
public void Fill_Section_3_Form_1() throws InterruptedException, IOException{
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(2);
		String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
		//Search.sendKeys("Reporting Authority");
		//OpenPar.click();
		
		
		InputField_Sec3_1_a.sendKeys("8");
		InputField_Sec3_1_b.sendKeys("8");
		InputField_Sec3_1_c.sendKeys("8");
		InputField_Sec3_1_d.sendKeys("8");
		InputField_Sec3_1_e.sendKeys("8");
		InputField_Sec3_1_f.sendKeys("8");
		OpenCloseButton.click();
		Thread.sleep(1500);
		InputField_Sec3_2_a.sendKeys("8");
		InputField_Sec3_2_b.sendKeys("8");
		InputField_Sec3_2_c.sendKeys("8");
		Thread.sleep(1500);
		OpenCloseButton.click();
		InputField_Sec3_3.sendKeys(data56);
		InputField_Sec3_4.sendKeys(data56);
		Radiobtn_Sec3_5_1.click();
		Radiobtn_Sec3_5_2.click();
		Radiobtn_Sec3_5_3.click();
		Radiobtn_Sec3_5_4.click();
		
	}
		public void Open_Par(){
			
			OpenPar.click();
		}
	
		
		public void ClickOnSubmit(){
			
			ClickOnSendToReviewingAuthority.click();
			driver.switchTo().alert().accept();
		}
	
	public void ClickOnSubmit_dual(){
			
			ClickOnSendToReportingAuthority.click();
			driver.switchTo().alert().accept();
		}
}
