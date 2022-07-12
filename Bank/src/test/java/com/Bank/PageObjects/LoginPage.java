package com.Bank.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@class='button']")
	private WebElement submit;
	
	
	public void enterCredintials(String user , String password) {
		
		username.click();
		username.sendKeys(user);
		pass.click();
		pass.sendKeys(password);
		
	}
	
	public void login() throws InterruptedException {
		Thread.sleep(10000);
		submit.click();
	}
	
	

}
