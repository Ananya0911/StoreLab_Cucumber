package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		//features = "src/test/resources/features/ShippingAddressForm.feature",
		features = "src/test/resources/features/CustomerSignUp.feature",
		glue={"StepDef","util"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}

		)

public class TestNGCucumberRunner extends AbstractTestNGCucumberTests  {
/*This will remain empty*/
}
