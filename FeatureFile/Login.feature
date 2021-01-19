Feature: OrangeHRM
@Loginwithsingledata
Scenario: Validate_Login
When i Launch url in brwser
And  i enter username and i enter password
When  i click login button
Then  i should see dashboard in url
When  i close browser
@scenariowithDatable
Scenario Outline: Login Functionality Validation
When i open url"<Browser>"
And i Enter"<Username>"in username textbox
And Enter"<Password>"in password textbox
And clicking login button
Then i should see dashboard text in url
When closing browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123|
|chrome|Admi|Qedge123!@#|
|firefox|Admi|Qedge124#|