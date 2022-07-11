Feature: Bill Feature 

Background: User is Logged In 

	Given User should on login page 
	And User should be logged in the application 
	
Scenario: validate send payment scenario 

	Given User Is On bill payment service page 
	When The Title Of The Page "ParaBank | Bill Pay" 
	When User enters the payee information 
		| Payee Name | Address | City | State | Zipcode | Phone | Account | Verify Account | Amount | From account |
		| Ajeet | c-22 | bangalore | Karnata | 600123 | 7979751111 | 13344 | 13344 | 1 | 13344 |
	And click send payment button 
	Then payment sucessfull message will be displayed 
	Then User closes the Application Window 
	
Scenario: Bill Pay Error Messages Validation 
   Given User click on Bill Pay
   When Page title should be "ParaBank | Bill Pay"
   And Click on Send Payment
   Then User verify error Msg as "Payee name is required." for empty PayeeName
   And User verify error msg as "Address is required." for empty payeeAddress
   And User verify error msg as "City is required." for empty payeeAddressCity
   And User verify error msg as "State is required." for empty payeeAddressState
   And User verify error msg as "Zip Code is required." for empty payeeAddressZip
   And User verify error msg as "Phone number is required." for empty payeePhoneNumber
   And User verify error msg as "Account number is required." for empty payeeAccountNumber
   And User verify error msg as "Account number is required." for empty payeeVerifyAccountNumber
   And User verify error msg as "The amount cannot be empty."  for empty payeeAmount
   Then user closes The Browser window
