package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC008_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC008_Duplicate Lead";
		testDescription="Lead Duplicate";
		testNodes="Leads";
		category="Smoke";
		authors="Kevin";
		browserName="chrome";
		dataSheetName="TC008";
	}
	@Test(dataProvider="fetchData")
public void login(String uName,String pwd,String cname,String forename,String lastname) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLead()
		.typecompanyName(cname)
		.typeforeName(forename)
		.typelastName(lastname)
		.clickSubmit()
		.verifyCompanyName(cname)
		//For delete lead operation
		/*.clickFindLeads()
		.typeCompanyName(companyname)
		.clickFindLeadsButton()
		.clickFirstRecord()
		.clickDeleteButton();*/
		.clickDuplicateLead()
		.typecompanyName(cname)
		.typeforeName(forename)
		.typelastName(lastname)
		.clickSubmit();
		
	}

}
