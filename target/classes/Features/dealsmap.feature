Feature: Deal data creation 

#DataTable approach
Scenario: Free CRM Create a new deal Scenario

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		| username | password|
		| rakhideulkar10@gmail.com | Rakhi@123 |
		
	Then user clicks on Login button 
	Then user is on HomePage 
	Then move to new deal page 
	Then user enters deal details 
		| title      | amount | probability | commission |
		| test deal1 | 1000 | 20 | 10 |
		| test deal2 | 2000 | 21 | 20 |
		| test deal3 | 3000 | 22 | 30 |
		
	Then close the browser 
	
	
