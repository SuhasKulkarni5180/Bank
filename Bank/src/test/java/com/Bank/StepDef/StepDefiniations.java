package com.Bank.StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.PageObjects.ApplyLoan;
import com.Bank.PageObjects.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefiniations {
	public WebDriver driver;
	public LoginPage lp ;
	public ApplyLoan ap;
	
	@Before
	@Given("I open web browser")
	public void i_open_web_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/suhas/git/Bank/Bank/src/test/Resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("I open application using url {string}")
	public void i_open_application_using_url(String url) {
		driver.get(url);
	}

	@Then("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String username, String password) {
		lp = new LoginPage(driver);
		lp.enterCredintials(username, password);
		

	}

	@And("I click on Login button")
	public void i_click_on_login_button() throws InterruptedException {
		lp.login();
		

	}

	@SuppressWarnings("deprecation")
	@Then("I should be in a homepage")
	public void i_should_be_in_a_homepage() throws InterruptedException {
		String expected ="ParaBank | Accounts Overview";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
		Thread.sleep(10000);


	}
	
	@Then("I should test")
	public void i_should_test() {
	}
	
	@Then("I click on Request Loan")
	public void i_click_on_request_loan() {
		ap = new ApplyLoan(driver);
		ap.clickRequestLoan();
		

	}

	@Then("I enter loan amount as {string}")
	public void i_enter_loan_amount_as(String loanamount) {
		ap.enterLoanAmount(loanamount);

	}

	@Then("I enter downpayment as {string}")
	public void i_enter_downpayment_as(String downPayment) {
		ap.enterDownPayment(downPayment);

	}

	@Then("I select my from account {string}")
	public void i_select_my_from_account(String account) {
		ap.selectFromAccount(account);
		

	}

	@Then("I click on Apply loan")
	public void i_click_on_apply_loan() throws InterruptedException {
		ap.applyLoan();
		Thread.sleep(5000);
		String expected = "Loan Request Processed'";
		String actual = ap.message();
		Assert.assertEquals(expected, actual);

	}
	
	
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException {
		
		if(scenario.isFailed()) {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			byte[] failedScreenshot =scrShot.getScreenshotAs(OutputType.BYTES);		
			scenario.attach(failedScreenshot, "image/png", "Failed Screenshots");	
					
		}
		Thread.sleep(10000);	
		driver.close();
		driver.quit();
	}

	



}
