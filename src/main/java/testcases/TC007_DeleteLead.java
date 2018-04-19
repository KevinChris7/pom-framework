package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_Delete Lead";
		testDescription="Lead Deletion";
		testNodes="Leads";
		category="Smoke";
		authors="Kevin";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
public void login(String uName,String pwd,String companyname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLead()
		.clickFindLeads()
		.typeCompanyName(companyname)
		.clickFindLeadsButton()
		.clickFirstRecord()
		.clickDeleteButton();
		
	}

}
