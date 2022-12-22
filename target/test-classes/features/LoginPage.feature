@login
Feature: Login feature of SalesForce Application

Scenario: Valid username and password

Given  User is on login page "SFLoginPage"
Then User enter valid username "txt_login_username" "oct2022@abcd.com"
Then User enters password "txt_login_password" "shuban0911"
When User clicks login button "btn_login_loginBtn"

Scenario: Valid username and empty password

Given  User is on login page "SFLoginPage"
Then User enter valid username "txt_login_username" "oct2022@abcd.com"
Then User enters password "txt_login_password" ""
When User clicks login button "btn_login_loginBtn"
Then Enter password error message must be displayed "pwd_error_msg" "Please enter your password."


#Scenario: Remember me checkbox is checked,when logging back in username must be prefilled

#Given  User is on login page "SFLoginPage"
#Then User enter valid username "txt_login_username" "oct2022@abcd.com"
#Then User enters password "txt_login_password" "shuban0911"
#Then User clicks rememberme checkbox "chk_login_rememberme"
#When User clicks login button "btn_login_loginBtn"
#Then User is on home page "SFHomePage"
#Then User clicks usermenuLink "link_homepage_usermenu" "logout"
#Then User is on loginpage "SFLoginPage"
#Then The username must be prefilled "txt_login_prefilledusername" 

Scenario: Invaild username and invalid password ,error msg must be displayed

Given  User is on login page "SFLoginPage"
Then User enters invalid username "txt_login_username" "oct2022@abcde.com"
Then User enters invalid password "txt_login_password" "shuban091112"
When User clicks login button "btn_login_loginBtn"
Then Error is thrown "invalid_error_msg" 

Scenario: Forgot password 

Given  User is on login page "SFLoginPage"
Then User clicks on "forgot_password_link"
Then User enters username "username" "oct2022@abcd.com"
When User clicks on continue button "pwd_reset_continue"
Then User get message "check_email_msg"



