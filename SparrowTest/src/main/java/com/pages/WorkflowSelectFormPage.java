package com.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class WorkflowSelectFormPage extends TestBase {
	Actions act;
	//String FormStatus;
	
			public WorkflowSelectFormPage() throws IOException {
					
					PageFactory.initElements(driver, this);
					act =new Actions(driver);
				}	
			
			

@FindBy (xpath=".//*[@id='select2-workStatusComID_1-container']")
WebElement ClickOnStatus;

@FindBy (xpath="//input[@class='select2-search__field' and @type='search']")
WebElement ClickOnTextBox;


@FindBy (xpath=".//*[@id='select2-uploadFormComID_1-container']")
WebElement ClickOnFormType;	
	
@FindBy (xpath="//input[@value='Continue']")
WebElement ClickContinue;	
	
	
	
	







			public void Select_Working_TypeForm_InStatus(){
				
				ClickOnStatus.click();
				ClickOnTextBox.clear();
				ClickOnTextBox.click();
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.DOWN);
				ClickOnTextBox.sendKeys(Keys.ENTER);
			}
			
			public void Select_Leave_TypeForm_InStatus(){
						
						ClickOnStatus.click();
						ClickOnTextBox.clear();
						ClickOnTextBox.click();
						ClickOnTextBox.sendKeys(Keys.DOWN);
						
						ClickOnTextBox.sendKeys(Keys.ENTER);
					}
					
				public void Select_NRC_TypeForm_InStatus(){
					
					ClickOnStatus.click();
					ClickOnTextBox.clear();
					ClickOnTextBox.click();
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
			
					ClickOnTextBox.sendKeys(Keys.ENTER);
				}
				
				public void Select_Training_TypeForm_InStatus(){
					
					ClickOnStatus.click();
					ClickOnTextBox.clear();
					ClickOnTextBox.click();
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
			
					ClickOnTextBox.sendKeys(Keys.ENTER);
				}

				
				public void SelectFormType1(){
					
					ClickOnFormType.click();
					ClickOnTextBox.click();
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.ENTER);
					
				}
				
				public void SelectFormType2(){
					
					ClickOnFormType.click();
					ClickOnTextBox.click();
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.ENTER);
					
				}
				
				public void SelectFormType3(){
					
					ClickOnFormType.click();
					ClickOnTextBox.click();
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.ENTER);
					
				}
				
				public void SelectFormType4(){
					
					ClickOnFormType.click();
					ClickOnTextBox.click();
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.DOWN);
					ClickOnTextBox.sendKeys(Keys.ENTER);
					
				}
			
				public void ClickContinue(){
					
					ClickContinue.click();
				}
	
	
	
	

	

}
