package com.pages.Training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;
import com.utility.Util;

public class Training_Section1 extends TestBase {

			Util util;
	
	public Training_Section1() {
		
		PageFactory.initElements(driver, this);
		util=new Util();
	}
	
	
	
	
	
@FindBy(xpath="//input[@id='trainingNameID0']")
WebElement TrainingDetailCourse;
	
	
@FindBy(xpath="//input[@id='instituteNameID0']")
WebElement TrainingDetailInstitute;		
	
@FindBy(xpath="//input[@id='degreeID0']")
WebElement DetailOfDegree;

@FindBy(xpath="//input[@id='evaluationID0']")
WebElement Evaluation;

@FindBy(xpath="//input[@id='datePickerPropertyReturnFillingDateID']")
WebElement ClickOnDateofPropertyReturn;

@FindBy(xpath="//div[19]//div[1]//div[3]//div[7]")
WebElement PickDate;


@FindBy(xpath="//input[@id='ref_upload']")
WebElement Ref_upload;		

@FindBy(xpath="//input[@id='draft']")
WebElement SaveASDraft;

@FindBy(xpath="//input[@value='Send To Officer Reported Upon']")
WebElement ClickOnSend;

@FindBy(xpath="//img[@alt='CLICK TO DOWNLOAD']")
WebElement ClickToDownload;

	
	
	
	
	
public void SendToOfficerReportedupon() {
	
	ClickOnSend.click();
	
	try {
		driver.switchTo().alert().accept();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
	


public void Ref_Upload() {
	Ref_upload.sendKeys(prop.getProperty("UploadFile"));
}
	
public void SaveAsDraft() {
	
	SaveASDraft.click();
	
}

public void clickOnDownload() {
	
	ClickToDownload.click();
}


	
public void FillLeaveForm() throws IOException {
	File src = new File ("G:/TestNewData.xlsx");
	FileInputStream fis = new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1= wb.getSheetAt(2);
	String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
	String data66=sheet1.getRow(1).getCell(11).getStringCellValue();
	
	TrainingDetailCourse.sendKeys(data66);
	TrainingDetailInstitute.sendKeys(data66);
	ClickOnDateofPropertyReturn.click();
	PickDate.click();
}




}
