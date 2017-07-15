Feature: As A User I Want To Be Able To Login To My Inbox
	
@dup
Scenario: Access Inbox
Given I have navigated to the Sign in Screen
And i enter my email address into the field provided
When I select the next button the password screen appears
And i enter my password into the next input field
And select the Sign in button
Then my mailbox successfully open up