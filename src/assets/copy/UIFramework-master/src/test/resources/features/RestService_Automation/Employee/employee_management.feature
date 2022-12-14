Feature: Employee Management 

Scenario Outline:Create new employee and verify is employee is created with correct details 
	Given Employee Service is up and running
	When  User create Employee with "<Name>","<Salary>","<Age>" details 
	Then  New Employee should get created with correct details 
	Examples: 
		|Name		|Salary|Age  |
		|Ashish  	|5000  | 25  |
		|Sam		|7000  |26   |
		
	
  