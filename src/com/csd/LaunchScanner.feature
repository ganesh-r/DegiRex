Feature: DegiRex 

Scenario: "Bob" wants to scan the prescription 
	Given "Bob" has a Smart phone with "Camera" 
	And the phone has memory greater than "500 MB" 
	When "Bob" clicks to Scan record from the DegiRex application
	Then the native camera application should get launched 	 
	
	
Scenario: User clicks "Scan" button to input the prescription
Given the user has least "500Mb" free memory
When user clicks the "Scan" button 
Then application will store the scanned photo and display "Scuccefully Scanned"  