package Features;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/main/java/Features/editlead.feature",glue= {"pages","hooks"},monochrome=true)
@RunWith(Cucumber.class)
public class Runner {

}

