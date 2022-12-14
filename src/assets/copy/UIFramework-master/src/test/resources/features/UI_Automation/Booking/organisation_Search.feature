#IELTS BDD Based UI Level Automation -- DEMO Feature File
#Modified By : IELTS Automation Team
#Last Modification Date: 26-March-2020
Feature: Organisation Search Score


Scenario Outline: Validate if Candidate is able to search Organization Based on the Score 
	Given Candiate is on IELTS home page 
	When Candiate select "<IELTS_Score>" and search for the Organization 
	Then Candidate should see the list of organisation based on entered "<IELTS_Score>"
	Examples: 
		|IELTS_Score|
        |9			|




