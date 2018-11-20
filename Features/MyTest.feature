Feature: Login Functionality Check
Scenario: Checking if login button exists on Home page of Trading platform application
	Given I have the browser open
	When I launch the application
	Then Login button should exist
	
Scenario: Login into the application
	Given I have the browser open
	And I launch the application
	When I enter username and password
	Then login to home page