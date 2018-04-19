package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
     ViewLead(){
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(how=How.ID,using="viewLead_companyName_sp")
 	private WebElement eleCompanyName;
 	//@And("Enter the company name as Test")
 	public ViewLead verifyCompanyName(String data) {
 	verifyPartialText(eleCompanyName, data);
 		return this;		
 	}
 	//Entering to MyLeads page after deleting the record
   @FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
    public WebElement eleClickDeleteButton;
   @And("Click Delete button")
    public ViewLead clickDeleteButton() {
         click(eleClickDeleteButton);
         return this;
}
    @FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	@And("Click on Duplicate lead button")
	public DuplicateLead clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLead();		
	}
}
