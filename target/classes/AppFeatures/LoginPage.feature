Feature: Login Page feature
Background:user is on login page

Scenario: Login page title
When user gets the title of the page
Then page title should be "OrangeHRM"

Scenario: Forgot Password link
Then forgot your password link should be displayed

Scenario: Login with correct credentials
When user enters username "Admin"
And user enters password "admin123"
And user clicks on Login button
Then user gets the title of the home page
And home page title should be "OrangeHRM"