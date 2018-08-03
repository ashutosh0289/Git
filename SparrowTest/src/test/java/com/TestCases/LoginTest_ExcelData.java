package com.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestBase.TestBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utility.Util;

public class LoginTest_ExcelData extends TestBase {
					
				LoginPage loginPage;
				HomePage homePage;
				Util util;
				String SheetName ="LoginIds";
	
	
	public LoginTest_ExcelData() {
		
		super();
	}

	
	@BeforeMethod 
	
	
	public void setup() {
		
		initialization();
		
		loginPage = new LoginPage();
		homePage = new HomePage();
		util = new Util();
		
		
		
	}
	
	
	
@DataProvider 

public Object [][] getTestData() {
		
		 Object data[][] = null;
		data= util.getTestData(SheetName);
		
		return data;
		
}
	
	
@Test(dataProvider="getTestData")

	public void TestLoginWithExcelData(String Service,String loginid,String pwd) throws InterruptedException {
	
			homePage = loginPage.LoginWithExcelDataForServicesWar(Service, loginid, pwd);
			
			System.out.println("Logged into the application succesfully with Login ID= " + loginid );
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	
	public void TearDown() {
		
		driver.quit();
	}
	
	
	

	
	
}
