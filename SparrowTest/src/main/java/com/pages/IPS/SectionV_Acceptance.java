package com.pages.IPS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SectionV_Acceptance extends TestBase {
				
				
					File src = new File ("G:/TestNewData.xlsx");

	
	
	
		public SectionV_Acceptance() throws IOException{
			
			PageFactory.initElements(driver, this);
			
			

		}
	
	@FindBy (xpath=".//*[@id='differenceOfOpinionDetailacc']")//textarea[@id='differenceOfOpinionDetailAcc']
	WebElement InputField_Sec5_2_differenceOfOpinionDetail;
	
	@FindBy (xpath="//textarea[@id='differenceOfOpinionDetailAcc']")
	WebElement InputField_Sec5_2_differenceOfOpinionDetail_1;
	
	@FindBy (xpath="//textarea[@id='differenceOfOpinionDetailapp']")
	WebElement InputField_Sec5_2_differenceOfOpinionDetail_1_2;
	
	@FindBy (xpath=".//*[@id='agreeRemarksReportingReviewingNO']")
	WebElement RadioBtn_Sec5_1_differenceOfOpinionDetail;
	
	@FindBy (xpath=".//*[@id='draft']")
	WebElement ClickOnSaveAsDraft;
	
	@FindBy (xpath="//input[@value='Send To CR Section']")
	WebElement ClickOnSendToCR_Section;
	
	@FindBy (xpath="//*[@id='overallGrade']")//input[@id='acceptanceInformationGradeID']
	WebElement OverallGrade;
	
	@FindBy (xpath="//input[@id='acceptanceInformationGradeID']")
	WebElement OverallGrade_1;
	
	@FindBy (xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
	WebElement OpenPar;
	
	
	public void Fill_Section_5_form_ForYes(){
		
		
		Search.sendKeys("Accepting Authority");
		OpenPar.click();
		ClickOnSendToCR_Section.click();
	}
	
	public void SaveAsDraft(){
		ClickOnSaveAsDraft.click();
	}

	
	public void Fill_Section_5_form_ForNO() throws IOException{
					FileInputStream fis = new FileInputStream(src);
					
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sheet1= wb.getSheetAt(2);
					String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
					
		//Search.sendKeys("Accepting Authority");
		//Search.sendKeys("B M Laxmi Pra");
		//OpenPar.click();
			
		
		RadioBtn_Sec5_1_differenceOfOpinionDetail.click();
		
		InputField_Sec5_2_differenceOfOpinionDetail.sendKeys(data56);
		OverallGrade.sendKeys("9");
		//ClickOnSendToCR_Section.click();
		//driver.switchTo().alert().accept();
		
		

	
	}
	
			public void Fill_Section_5_form2_ForNO() throws IOException{
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet1= wb.getSheetAt(2);
				String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
				
		//Search.sendKeys("Accepting Authority");
		//Search.sendKeys("B M Laxmi Pra");
		//OpenPar.click();
		
		
		RadioBtn_Sec5_1_differenceOfOpinionDetail.click();
		
		InputField_Sec5_2_differenceOfOpinionDetail_1.sendKeys(data56);
		OverallGrade_1.sendKeys("9");
		//ClickOnSendToCR_Section.click();
		//driver.switchTo().alert().accept();
		
		
		
		
		}
			
			
			public void Fill_Section_5_form2_ForNO_4() throws IOException{
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet1= wb.getSheetAt(2);
				String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
				
		//Search.sendKeys("Accepting Authority");
		//Search.sendKeys("B M Laxmi Pra");
		//OpenPar.click();
				
		
		RadioBtn_Sec5_1_differenceOfOpinionDetail.click();
		
		InputField_Sec5_2_differenceOfOpinionDetail_1_2.sendKeys(data56);
		OverallGrade.sendKeys("9");
		//ClickOnSendToCR_Section.click();
		//driver.switchTo().alert().accept();
		
		
		
		
		}


	
	 public void OpenPar(){
		 
		 OpenPar.click();
	 }
	 
	 public void ClickOnsubmit(){
		 
		 ClickOnSendToCR_Section.click();
		 driver.switchTo().alert().accept();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
