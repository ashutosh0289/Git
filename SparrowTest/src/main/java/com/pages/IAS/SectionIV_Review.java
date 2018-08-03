package com.pages.IAS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SectionIV_Review extends TestBase {
	
			File src = new File ("G:/TestNewData.xlsx");
	
		public SectionIV_Review(){
			
			PageFactory.initElements(driver, this);
		}
	
	@FindBy (xpath=".//*[@id='agreeReportingOfficerAssessmentNO']")
	WebElement radioBtn_Sec4_1_NO;
	
	@FindBy (xpath=".//*[@id='differenceOfOpinionDetail']")
	WebElement InputField_Sec4_2_differenceOfOpinionDetail;
	
	@FindBy (xpath=".//*[@id='commentOnPenPictureByReportingAuthority']")
	WebElement InputField_Sec4_3_commentOnPenPictureByReportingAuthority;
	
	@FindBy (xpath=".//*[@id='domainAssignReview3']")
	WebElement RadiobtnDomain_Sec4_4aAssignemnt3;
	
	@FindBy (xpath=".//*[@id='domainAssignReview4']")
	WebElement RadiobtnDomain_Sec4_4bAssignemnt4;
	
	@FindBy (xpath=".//*[@id='domainAssignReview5']")
	WebElement RadiobtnDomain_Sec4_4cAssignemnt5;
	
	@FindBy (xpath=".//*[@id='domainAssignReview1']")
	WebElement RadiobtnDomain_Sec4_4dAssignemnt1;
	
	
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
	WebElement OpenPar;
	
	@FindBy (xpath="//input[@value='Send To Accepting Authority']")
	WebElement ClickSubmit;
	
	
	
	
	
	
	
	
	
	
	public void Fill_Section_4_Form_Yes() throws IOException{
		
				FileInputStream fis = new FileInputStream(src);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sheet1= wb.getSheetAt(2);
				String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
				
		//Search.sendKeys("Reviewing Authority");
		//OpenPar.click();
		
		InputField_Sec4_3_commentOnPenPictureByReportingAuthority.sendKeys(data56);
		RadiobtnDomain_Sec4_4aAssignemnt3.click();
		RadiobtnDomain_Sec4_4bAssignemnt4.click();
		RadiobtnDomain_Sec4_4cAssignemnt5.click();
		RadiobtnDomain_Sec4_4dAssignemnt1.click();
		
		ClickSubmit.click();
		
	}
	
	
	
	public void Fill_Section_4_Form_No() throws IOException{
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1= wb.getSheetAt(2);
		String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
		
		//Search.sendKeys("Reviewing Authority");
		//OpenPar.click();
		radioBtn_Sec4_1_NO.click();
		InputField_Sec4_2_differenceOfOpinionDetail.sendKeys(data56);
		InputField_Sec4_3_commentOnPenPictureByReportingAuthority.sendKeys(data56);
		RadiobtnDomain_Sec4_4aAssignemnt3.click();
		RadiobtnDomain_Sec4_4bAssignemnt4.click();
		RadiobtnDomain_Sec4_4cAssignemnt5.click();
		RadiobtnDomain_Sec4_4dAssignemnt1.click();

		//ClickSubmit.click();
		//driver.switchTo().alert().accept();

} 
	
	public void OpenPar(){
		OpenPar.click();
	}
	
	public void ClickonSubmit(){
		ClickSubmit.click();
		driver.switchTo().alert().accept();
		
	}
	
	
	
	
	

}
