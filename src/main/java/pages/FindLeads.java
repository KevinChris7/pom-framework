package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}
	
    //For Entering the company name
    @FindBy(how=How.XPATH,using="(//input[@name='companyName'])[2]")
   
    private WebElement eleCompanyName;
  @And("Enter the company name as(.*)")
    public FindLeads typeCompanyName(String data) {
    	type(eleCompanyName,data);
    	return this;
    }
    
    //For clicking the Find Leads button
   
    @FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
    private WebElement eleFindLeadsButton;
    @And("Click Find Leads")
    public FindLeads clickFindLeadsButton() {
    	click(eleFindLeadsButton);
    	return this;
    }
    
    //For clicking the first record and viewing the lead to delete
    @FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a[1]")
    private WebElement eleClickFirstRecord;
    @And("Click First record from grid")
    public ViewLead clickFirstRecord() {
    	click(eleClickFirstRecord);
		return new ViewLead();
    }
    
    
    
    }
    
