package com.Bank.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/suhas/Desktop/Class/Bank/src/test/Resources/Features",
		glue="com.Bank.StepDef",
		plugin= {"pretty","html:/Users/suhas/Desktop/Class/Bank/target/Htmlreports/reports.html"},
		monochrome=true,
		tags= "@tc002"
		
		)


public class BankRunner {

}
