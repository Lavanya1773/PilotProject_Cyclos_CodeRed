Feature: Login to  Demo Cyclos classic payment software Application

	@ValidCredentials
	Scenario: User Login with Valid credentials
		Given User is on Demo Cyclos classic Homepage
		When User click the Signin
		And User provides credentials
		| LoginName  | Password    |
		| angitha999 | Angitha@123 |
	
		Then User Should be able to login successfully and see the HomePage
		
	#To Update the Profile
		And User click the user profile
		And User click the edit profile
		And Update the Website
		|  Website   |           
		| expleo.com |
		
		And User enter the Gender
		And User enter the bussinessType
		Then User click the Save and able to see Saved successfully msg
		
	#To add multiple phone number	
	#	And User click the Phone
		#And User click the New
		#And User click the Mobilephone in dropdown
		#And User enter the MobileNumber
		#|     Number    |
		#|+91 9876543210 |
		
		#And User click the New
		#And User click the Lanline in dropdown
		#And User enter the lanlineNumber
		#|     Number    |
		#| (201)550-1111 |
		#Then User able to see Updated Contact
		
	#To Manage Password 
	  #And User click the Passwords
	  #And User click the change
	  #And User enter the OldPassword NewPassword ConfrimPassword
		#| OldPassword | NewPassword | ConfrimPassword |
		#| Angitha@123 | Angitha@123 | Angitha@123 |
		#Then User click the confirm and able to see password changed message
		
	#To Manage Contact
	  #And User click the Mycontact
	  #And User click the Add
	 # And user enter the NewContact
	 # | NewContact |
	 # |   lavan    |
	  #Then User Click save and user able to see Added massage
	

	@InvalidCredentials
	Scenario Outline: User Login with Valid credentials
		Given User is on Demo Cyclos classic Homepage
		When User click the Signin
		And User provides credentials
		| LoginName  | Password    |
		| angitha99  | Angitha@123 |
		| angitha999 | Angitha@12  |
		
		
		Then User Should be able see Unsuccessfull error message  
		
		