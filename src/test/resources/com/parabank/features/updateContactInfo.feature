Feature: Update Contact Information Feature 

Background: User is Logged In 

	Given User should be on login page 
	And User should logged in the application 
	
Scenario: validate update contact information 

	Given User Is On Upadate Contact Info Page page 
	When The page title is "ParaBank | Update Profile" 
	When User enters the contact info details 
		| First Name | last Name | Address | City | State | Zipcode | Phone Number |
		| Test | User | M-13 | bangalore | kar | 100000 | 636187777 | 
	And click on update profile button 
	Then "Profile Updated" message will be displayed 
	Then User Closed The Window
	
Scenario: UpdateContact Info -Error Msg validation
   Given User click on Update Contact 
   When Page Title should be "ParaBank | Update Profile"
   And User Clears the First Name Column and verify Error msg as "First name is required."
   And User Clears the Last Name Column and verify Error msg as "Last name is required." 
   And User Clears the Address  Column and verify Error msg as "Address is required."
   Then User Clears the city  Column and verify Error msg as "City is required."
   And User Clears the state  Column and verify Error msg as "State is required."
   And User Clears the Zip code Column and verify Error msg as "Zip Code is required."
   Then application window is closed by user
