Feature: Homepage behaviours

Background:
Given  User is on login page "SFLoginPage"
Then User enter valid username "txt_login_username" "oct2022@abcd.com"
Then User enters password "txt_login_password" "shuban0911"
When User clicks login button "btn_login_loginBtn"


Scenario: usermenu dropdown options
Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"


Scenario: my profilelink behaviour
Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My profile link "myProfileLink"
Then User clicks edit profile "editProfile"
Then User goes to edit contact frame "editContactframe"
And User clicks the about tab "aboutTab"
And User clicks the lastname "lastname" "dhanvin"
Then User clicks save "saveAllBtn"


Scenario: enter textarea
Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My profile link "myProfileLink"
When User clicks postlink "postLink"
Then User switches to frame "textareaFrame"
Then User enters post in the textarea "textarea" "Cucumber started"
Then User clicks share button "shareBtn"


Scenario: upload file

Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My profile link "myProfileLink"
When User clicks fileLink "fileLink"
Then User clicks upload from computer "uploadFromComputerButton"
Then User clicks choose file "chooseFile"
Then User clicks share button "shareBtn"


Scenario: my settings ,personal link

Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My settings link "mySettingLink"
When User clicks personal link "personalLink"
Then User scroll down "displayAndLayout"
Then User clicks loginHistory "loginHistoryLink"
Then User scroll down "downLoadLink"
Then User clicks download "downLoadLink"


Scenario: display and layout

Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My settings link "mySettingLink"
When User clicks personal link "personalLink"
Then User clicks displayAndLayout "displayAndLayout"
Then User clicks customizetab "customizeTab"
Then User scroll down "saveButton"
Then User selects dropdown "customAppDD" "Salesforce Chatter"
Then User selects tab "availableTabs" "Leads"
Then User clicks add "addTab"
Then User clicks save "saveButton"
Then tab are added on page "tab" "Leads"


Scenario: email settings

Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My settings link "mySettingLink"
Then User clicks email link "emailSetup"
Then User clicks email settings "myEmailSettings"
Then User enters name "emailNameField" "nov212022"
Then User enters id "emailIdField" "nov123@ss.com"
Then User clicks autoBCC "autoBcccheck"
Then User scroll down "saveButton"
Then User clicks save "saveButton"
Then User accept alert 

@new
Scenario: calendar and remaainder

Then User is on home page "SFHomePage"
Then User clicks usermenuLink "link_homepage_usermenu" "usermenu_items"
When User clicks My settings link "mySettingLink"
Then User scroll down "calendarsAndremainder"
Then User clicks calendar and remainder "calendarsAndremainder"
Then User clicks activity ramainder "activityRemainder"
Then User scroll down "openTestRemainderBtn"
Then User clicks open test remainder "openTestRemainderBtn"
Then Sample event window is displayed












