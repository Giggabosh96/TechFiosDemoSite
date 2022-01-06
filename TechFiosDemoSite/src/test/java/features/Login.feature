@LoginFeature 
Feature: Techfios Billing Site Functionality Testing 

Background: 
	Given user is on TechFios Login Site 
	
@One 
Scenario Outline: 
	User should be able to log into the Techfios Billing site with valid credentials 
	
	When user enters username as "<username>" 
	When user enters password as "<password>" 
	And user clicks on sign in button 
	Then user will land on Dashboard page 
	
	Examples: 
		|username|password|
		|demo@techfios.com|abc123|
		|demo1@techfios.com|abc123|
		|demo@techfios.com|abc1234|
		|demo1@techfios.com|abc1234|
		
		
