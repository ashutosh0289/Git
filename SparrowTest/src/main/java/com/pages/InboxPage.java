package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class InboxPage extends TestBase {

	
	public InboxPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy (xpath="")
WebElement a;

@FindBy(xpath="//input[@type='search']")
WebElement SearchEmp;

@FindBy(id="tabID0")
WebElement MyPar;



@FindBy(id="tabID1")
WebElement AssessPar;


@FindBy(id="tabID3")
WebElement ManualPar;


@FindBy(id="tabID4")
WebElement Process;

@FindBy (xpath="//*[@id='dataGrid']/tbody/tr[1]/td[4]/a")
WebElement OpenAPARID;

@FindBy(xpath="//*[@id='dataGrid']/tbody/tr[1]/td[10]/div")
WebElement CurrentStage;







			public void ClickOnMyPar(){
				
				MyPar.click();
			}
			
			public void ClickOnAssessPar(){
					
					AssessPar.click();
				}
			
			public void ClickOnMannual() throws InterruptedException{
				
				Thread.sleep(1000);
				ManualPar.click();
			}
			
			public void ClickOnProcess(){
				
				Process.click();
			}
			
			
			public void OpenAParID(){
				
				//driver.findElement(By.xpath("//*[@id='dataGrid']/tbody/tr[1]/td[10]/div"));
				
				System.out.println("Opening Par In Stage " + CurrentStage.getText() + " Level");
				
				OpenAPARID.click();
				
				
				
			}
			
			public void SearchEmp(String EmployeeName) throws InterruptedException{
				
				Thread.sleep(1000);
				SearchEmp.sendKeys(EmployeeName);
			}


		

	
	
			
}
