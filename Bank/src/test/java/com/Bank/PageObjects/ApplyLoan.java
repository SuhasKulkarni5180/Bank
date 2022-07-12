package com.Bank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplyLoan {
	
	public WebDriver driver;
	
	public ApplyLoan(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	
	}
		
	@FindBy(xpath="//a[contains(text(),'Request Loan')]")
	private WebElement requestloan;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement loanamount;
	
	
	@FindBy(xpath="//input[@id='downPayment']")
	private WebElement downPayment;
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	private WebElement fromaccountid;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement applyLoan;
	
	@FindBy(xpath="//h1[contains(text(),'Loan Request Processed')]")
	private WebElement message;
	
	public void clickRequestLoan() {
		requestloan.click();
	}
	public void enterLoanAmount(String loan) {
		loanamount.sendKeys(loan);
	}
	public void enterDownPayment(String down) {
		downPayment.sendKeys(down);
	}
	
	public void selectFromAccount(String account) {
		Select select = new Select(fromaccountid);
		select.selectByValue(account);
	}
	
	public void applyLoan() {
		applyLoan.click();
	}
	
	public String message() {
		String success= message.getText();
		return success;
	}
	
	
	

}
