package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.TestBase.TestBase;

public class GenerateParPage extends TestBase{
	
		Select dropdown;
	
	
	
		public GenerateParPage() {
			
			PageFactory.initElements(driver, this);
		}
	
		
		
		
		
		
@FindBy()
WebElement  a  ;

@FindBy(id="assessmentYearID")
WebElement SelectAssessmentPeriod;

@FindBy(xpath =".//*[@id='hasGenerated']")
WebElement UncheckGeneratedCheckBox;

@FindBy(xpath="//button[@onclick='onSearchClick();']")
WebElement ClickOnSearch;

@FindBy(xpath="//button[@class='btn btn-primary' and text()='Generate']")
WebElement ClickOnGenerate;

@FindBy (xpath=".//*[@id='empNameID']")
WebElement SearchEmployee;


public void SelectAssessmentPeriod(){
	
	dropdown=new Select(SelectAssessmentPeriod);
	dropdown.selectByVisibleText(prop.getProperty("AssessmentYear"));
	//dropdown.selectByValue("122");
	
	
}

public void ClickOnGeneratePAR() throws InterruptedException{
	UncheckGeneratedCheckBox.click();
	ClickOnSearch.click();
	Thread.sleep(1000);
	ClickOnGenerate.click();
}

public void SearchEmp(String Employee_name){
	
	
	SearchEmployee.sendKeys(Employee_name);
	
}


		
		
	
	

}
