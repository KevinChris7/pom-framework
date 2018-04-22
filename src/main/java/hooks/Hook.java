package hooks;




import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods{
	@Before
	
	public void beforeRun()
	{
		startResult();
		startTestModule("Edit Lead", "Edit the lead");
		test = startTestCase("Leads");
		test.assignCategory("Regression");
		test.assignAuthor("Kevin");
		startApp("chrome");
	}
	@After
	public void afterRun()
	{
		endResult();
		closeAllBrowsers();
	}

}
