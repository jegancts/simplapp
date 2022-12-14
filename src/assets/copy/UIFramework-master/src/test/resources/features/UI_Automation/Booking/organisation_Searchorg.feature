#IELTS BDD Based UI Level Automation -- DEMO Feature File
#Modified By : IELTS Automation Team
#Last Modification Date: 26-March-2020
Feature: Organisation Search Org


	Scenario Outline: Validate if Candidate is able to search Organization Based on the orgname
		Given Candiate is on IELTS home page
		When Candiate select "<IELTS_org>" and search for the Organization name
		Then Candidate should see the list of organisation name based on entered "<IELTS_org>"
		Examples:
			|IELTS_org|
			|junk	|



