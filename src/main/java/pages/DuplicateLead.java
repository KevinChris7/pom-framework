package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	DuplicateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCname;
	@And("Input the Company (.*)")
	public DuplicateLead typecompanyName(String data) {
		type(eleCname,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleForeName;
	@And("Input Firstname as (.*)")
	public DuplicateLead typeforeName(String data) {
		type(eleForeName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Input lastname as (.*)")
	public DuplicateLead typelastName(String data) {
		type(eleLastName,data);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmit;
	@And("Click on the submit button of lead")
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();		
	}
	@FindBy(how=How.CLASS_NAME,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	@And("View the Created lead")
	public ViewLead clickDuplicateLead() {
		click(eleDuplicateLead);
		return new ViewLead();		
	}

}
