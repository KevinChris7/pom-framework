package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	//This is for create lead testcase
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	@And("Click on the Create lead")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();		
	}
	
	//This is for Delete lead testcase
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	//@And("Enter the company name as (.*)")
	public FindLeads clickFindLeads() {
		click(eleFindLeads);
		return new FindLeads();
	}
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	
	public DuplicateLead clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLead();		
	}

}
