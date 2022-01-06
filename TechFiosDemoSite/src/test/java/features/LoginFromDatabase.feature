@DBLogin
Feature: Techfios Billing Site Functionality Testing with data from MySQL

Background: 
	Given user is on TechFios Login Site 

@DBScenario1
Scenario: 
	User should be able to log into the Techfios Billing site with valid credentials 
	
	When user enters "username" from mysql database  
	When user enters "password" from mysql database  
	And user clicks on sign in button 
	Then user will land on Dashboard page 
	
		
		
