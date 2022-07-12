Feature: Login feature

@tc001
Scenario Outline: Validate Login feature for valid credentials
	Given I open application using url "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC"
	Then I enter username as "<username>" and password as "<password>"
	And I click on Login button
	Then I should be in a homepage
	
Examples:
|username|password|
|Test12345|Qwerty|
#|arch123|1234|
|Test1234||
