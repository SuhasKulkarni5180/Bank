Feature: Apply loan

Background:
 	Given I open application using url "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC"
	Then I enter username as "Test12345" and password as "Qwerty"
	And I click on Login button
	Then I should be in a homepage



@tc002
Scenario Outline: Validate applyloan functionality
	Then I click on Request Loan 
	Then I enter loan amount as "<loanamount>"
	Then I enter downpayment as "<downpayment>"
	Then I select my from account "<accountnumber>"
	And I click on Apply loan
	
	Examples:
	|loanamount|downpayment|accountnumber|
	|12000|5000|12567|
	