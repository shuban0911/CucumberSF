package com.training.steps;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions extends BaseTest{
	
	PageFactory pageFactory = new PageFactory();
	BasePage page;
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	
	@Then("User is on home page {string}")
	public void user_is_on_home_page(String pageName) {
		page=pageFactory.initialize(pageName);
	}
	@Then("User clicks usermenudropdown {string} {string}")
	public void user_clicks_usermenudropdown(String elementName, String menuitems) {
		List<String> options = page.clickElement(elementName,menuitems);
		for(String item:options) {
		System.out.println(item);
		}
		
	}
	
	@Then("User clicks usermenuLink {string} {string}")
	public void user_clicks_usermenu_link(String elementName, String menuitems) {
		List<String> options = page.clickElement(elementName,menuitems);
		for(String item:options) {
		System.out.println(item);
		}
		assertEquals(5,options.size() );
	}
	
	
	@When("User clicks My profile link {string}")
	public void user_clicks_my_profile_link(String myProfileLink) {
		page.clickElement(myProfileLink);
		
	}
	@Then("User clicks edit profile {string}")
	public void user_clicks_edit_profile(String editProfile) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.clickElementByJS(editProfile);
	}
	@Then("User goes to edit contact frame {string}")
	public void user_goes_to_edit_contact_frame(String editContactframe) {
		page.switchtoframe(editContactframe);
	}
	@Then("User clicks the about tab {string}")
	public void user_clicks_the_about_tab(String aboutTab) {
		page.clickElement(aboutTab);
	}
	@Then("User clicks the lastname {string} {string}")
	public void user_clicks_the_lastname(String lastname, String input) {
		page.enterValue(lastname, input);
	}
	@Then("User clicks save {string}")
	public void user_clicks_save(String saveAllBtn) {
		page.clickElement(saveAllBtn);
	}
	@When("User clicks postlink {string}")
	public void user_clicks_postlink(String sharePost) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.clickElementByJS(sharePost);
	}
	@Then("User switches to frame {string}")
	public void user_switches_to_frame(String textareaFrame) {
		page.switchtoframe(textareaFrame);
	}
	@Then("User enters post in the textarea {string} {string}")
	public void user_enters_post_in_the_textarea(String textarea, String input) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.clickElement(textarea);
		page.enterValue(textarea, input);
	}
	@Then("User clicks share button {string}")
	public void user_clicks_share_button(String shareButton) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.switchdefault();
		page.clickElement(shareButton);
		
	}
	
	@When("User clicks fileLink {string}")
	public void user_clicks_file_link(String fileLink) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.clickElement(fileLink);
	}
	@Then("User clicks upload from computer {string}")
	public void user_clicks_upload_from_computer(String uploadFromComputerButton) {
		page.clickElement(uploadFromComputerButton);
	}
	@Then("User clicks choose file {string}")
	public void user_clicks_choose_file(String chooseFile) {
		page.uploadFile(chooseFile);
	}
	
	@When("User clicks personal link {string}")
	public void user_clicks_personal_link(String personalLink) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.clickElement(personalLink);
	}
	
	@Then("User scroll down {string}")
	public void user_scroll_down(String element) {
		page.scrollToElement(element);
	}
	@Then("User clicks loginHistory {string}")
	public void user_clicks_login_history(String loginHistoryLink) {
		page.clickElement(loginHistoryLink);
	}
	@Then("User clicks download {string}")
	public void user_clicks_download(String downLoadLink) {
		page.clickElement(downLoadLink);
	}
	
	@Then("User clicks displayAndLayout {string}")
	public void user_clicks_display_and_layout(String displayAndLayout) {
		page.clickElement(displayAndLayout);
	}
	@Then("User clicks customizetab {string}")
	public void user_clicks_customizetab(String customizeTab) {
		page.clickElement(customizeTab);
	}
	@Then("User selects dropdown {string} {string}")
	public void user_selects_dropdown(String dd_element, String option) {
		page.selectddoption(dd_element, option);
	}
	@Then("User selects tab {string} {string}")
	public void user_selects_tab(String dd_element, String option) {
		page.selectddoption(dd_element, option);
	}
	@Then("User clicks add {string}")
	public void user_clicks_add(String addTab) {
		page.clickElement(addTab);
	}

	@Then("tab are added on page {string}")
	public void tab_are_added_on_page(String tabs) {
		page.isElementDisplayed(tabs);
	}
	
	@Then("tab are added on page {string} {string}")
	public void tab_are_added_on_page(String tabs, String selected) {
		assertEquals(page.isElementDisplayed(tabs,selected),true);
		
	}
	
	@Then("User enters name {string} {string}")
	public void user_enters_name(String elementName, String input) {
		page.enterValue(elementName, input);
	}
	@Then("User enters id {string} {string}")
	public void user_enters_id(String elementId, String input) {
		page.enterValue(elementId, input);
	}
	@Then("User clicks autoBCC {string}")
	public void user_clicks_auto_bcc(String elementName) {
		page.clickElement(elementName);
	}
	@Then("User accept alert")
	public void user_accept_alert() {
		page.switchToAlert();
	}
	
	@When("User clicks My settings link {string}")
	public void user_clicks_my_settings_link(String mysettingslink) {
		page.clickElement(mysettingslink);
	}
	
	@Then("User clicks email link {string}")
	public void user_clicks_email_link(String emailLink) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.clickElement(emailLink);
	}
	@Then("User clicks email settings {string}")
	public void user_clicks_email_settings(String emailsettings) {
		page.clickElement(emailsettings);
	}
	
	@Then("User scroll down")
	public void user_scroll_down() {
		page.scrolldown();
	}
	@Then("User clicks calendar and remainder {string}")
	public void user_clicks_calendar_and_remainder(String calendarsAndremainder) {
		page.clickElement(calendarsAndremainder);
	}
	@Then("User clicks activity ramainder {string}")
	public void user_clicks_activity_ramainder(String activityRemainder) {
		page.clickElement(activityRemainder);
	}
	@Then("User clicks open test remainder {string}")
	public void user_clicks_open_test_remainder(String openTestRemainderBtn) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		page.clickElement(openTestRemainderBtn);
	}
	@Then("Sample event window is displayed")
	public void sample_event_window_is_displayed() {
		assertEquals(true, page.isWindowOpened());
	}


}

	
	  
	 



