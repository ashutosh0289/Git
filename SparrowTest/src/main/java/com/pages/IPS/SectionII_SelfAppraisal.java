package com.pages.IPS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SectionII_SelfAppraisal extends TestBase{
	
				File src = new File ("G:/TestNewData.xlsx");
				
				
			//	FileInputStream fis = new FileInputStream(src);
				
	
	public SectionII_SelfAppraisal(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
	WebElement OpenPar;
	
	@FindBy(xpath ="//textarea[@id='selfAppTaskPerformed_0']")
	WebElement InputField_Sec2_2_TaskToBePerformed;
	
	@FindBy(xpath ="//textarea[@id='selfAppInitialDeliverables_0']")
	WebElement InputField_Sec2_2_deleverable_initial;
	
	@FindBy(xpath ="//textarea[@id='selfMidDeliverables_0']")
	WebElement InputField_Sec2_2_deleverable_MidYear;
	
	@FindBy(xpath ="//textarea[@id='selfActualAchievement_0']")
	WebElement InputField_Sec2_ActualAchievement;
	
	@FindBy(xpath ="//textarea[@id='dutyDescription']")
	WebElement InputField_Sec2_DutyDescription;
	
	
	@FindBy(xpath ="//textarea[@id='exceptionalContribution']")
	WebElement InputField_Sec2_exceptionalContribution;
	
	@FindBy(xpath ="//textarea[@id='performanceHinderance']")
	WebElement InputField_Sec2_performanceHinderance;
	
	@FindBy(xpath ="//textarea[@id='forCurrentAssignmentUpgradeSkill']")
	WebElement InputField_Sec2_CurrentAssignmentUpgradeSkill;
	
	@FindBy(xpath ="//textarea[@id='forFutureCareerUpgradeSkill']")
	WebElement InputField_Sec2_5_FutureCareerUpgradeSkill;
	
	@FindBy (xpath="//input[@id='draft']")
	WebElement ClickOnSaveAsDraft;
	
	@FindBy (xpath="//input[@value='Send To Reporting Authority']")
	WebElement ClickOnSendToReportingAuthority;
	
	

	
	
			
			
			public void Searching_Officer_Reported_Upon_PAR(){
				Search.sendKeys("Officer Reported Upon");
				
			}
			
			
			public void Open_Par(){
				
				OpenPar.click();
			}
			
			public void Fill_Section_2_Form_1() throws InterruptedException, IOException{
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet1= wb.getSheetAt(2);
				String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
				String data66=sheet1.getRow(1)	.getCell(11).getStringCellValue();
					
					InputField_Sec2_DutyDescription.sendKeys(data66);
					InputField_Sec2_2_TaskToBePerformed.sendKeys(data66);
					InputField_Sec2_2_deleverable_initial.sendKeys(data66);
					InputField_Sec2_2_deleverable_MidYear.sendKeys(data66);
					InputField_Sec2_exceptionalContribution.sendKeys(data66);
					InputField_Sec2_ActualAchievement.sendKeys(data66);
					//InputField_Sec2_performanceHinderance.sendKeys(data66);
					//InputField_Sec2_CurrentAssignmentUpgradeSkill.sendKeys(data66);
					//InputField_Sec2_5_FutureCareerUpgradeSkill.sendKeys(data66);
					
				}
			
			
			
			public void Fill_Section_2_Form_2() throws InterruptedException, IOException{
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet1= wb.getSheetAt(2);
				String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
				String data66=sheet1.getRow(1)	.getCell(11).getStringCellValue();
					
					InputField_Sec2_DutyDescription.sendKeys(data66);
					InputField_Sec2_2_TaskToBePerformed.sendKeys(data66);
					InputField_Sec2_2_deleverable_initial.sendKeys(data66);
					InputField_Sec2_2_deleverable_MidYear.sendKeys(data66);
					InputField_Sec2_exceptionalContribution.sendKeys(data56);
					InputField_Sec2_ActualAchievement.sendKeys(data66);
					InputField_Sec2_performanceHinderance.sendKeys(data66);
					InputField_Sec2_CurrentAssignmentUpgradeSkill.sendKeys(data66);
					InputField_Sec2_5_FutureCareerUpgradeSkill.sendKeys(data66);
					
				}
				
			public void SaveAsDraft(){
				
				ClickOnSaveAsDraft.click();
			}
			
			
			public void ClickOnSubmit(){
				
				ClickOnSendToReportingAuthority.click();
				driver.switchTo().alert().accept();
			}
			
	
	
	
	
	
	
	
	
	
	
}
