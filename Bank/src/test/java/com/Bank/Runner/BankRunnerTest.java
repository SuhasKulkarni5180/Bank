package com.Bank.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/suhas/git/Bank/Bank/src/test/Resources/Features",
		glue="com.Bank.StepDef",
		plugin= {"pretty","html:/Users/suhas/git/Bank/Bank/target/Htmlreports/reports.html",
				"json:/Users/suhas/git/Bank/Bank/target/jsonreports/reports.json"},
		monochrome=true,
		tags= "@tc002"
		
		)


public class BankRunnerTest {

}
