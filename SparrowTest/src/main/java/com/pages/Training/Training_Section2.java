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

public class Training_Section2 extends TestBase {
						
							Util util;

	
	
		public Training_Section2() {
			PageFactory.initElements(driver, this);
			util =new Util();

		}
	

@FindBy(xpath="//textarea[@id='dutyDescription']")
WebElement dutyDescription;




@FindBy(xpath="//input[@id='fileUpload']")
WebElement Section_Upload;


@FindBy(xpath="//input[@id='ref_upload']")
WebElement Ref_upload;		

@FindBy(xpath="//input[@id='draft']")
WebElement SaveASDraft;

@FindBy(xpath="//input[@value='Send To CR Section']")
WebElement ClickOnSend;

@FindBy(xpath="//img[@alt='CLICK TO DOWNLOAD']")
WebElement ClickToDownload;






			
			public void SendToCRSection() {
			
			ClickOnSend.click();
			
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			}
			
			
			public void Section_Upload() {
			Section_Upload.sendKeys(prop.getProperty("UploadFile"));
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
			
			

			public void fillSection2() throws IOException {
				File src = new File ("G:/TestNewData.xlsx");
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet1= wb.getSheetAt(2);
				String data56=sheet1.getRow(1).getCell(12).getStringCellValue();
				String data66=sheet1.getRow(1).getCell(11).getStringCellValue();
				
				dutyDescription.sendKeys(data66);
			}
	


}
