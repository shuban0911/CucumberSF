package com.training.steps;

import static org.testng.AssertJUnit.assertEquals;

import java.io.IOException;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinitions extends BaseTest{
	
	PageFactory pageFactory = new PageFactory();
	BasePage page;
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	
	@Given("User is on login page {string}")
	public void user_is_on_login_page(String pageName) {
		page=pageFactory.initialize(pageName);
	}

	@Then("User enter valid username {string} {string}")
	public void user_enter_valid_username(String elementName, String inputValue) {
		page.enterValue(elementName, inputValue);
	}

	@Then("User enters password {string} {string}")
	public void user_enters_password(String elementName, String inputValue) {
		page.enterValue(elementName, inputValue);
	}

	@When("User clicks login button {string}")
	public void user_clicks_login_button(String elementName) {
		page.clickElement(elementName);
	}
	
	@Then("Enter password error message must be displayed {string} {string}")
	public void enter_password_error_message_must_be_displayed(String password_err, String error_msg) {
		String errormsg  = page.getpassworderrmsg(password_err);
		assertEquals("The error message is not displayed correctly", errormsg, error_msg);
		
	}
	
	@Then("User clicks rememberme checkbox {string}")
	public void user_clicks_rememberme_checkbox(String elementName) {
		page.clickElement(elementName);
	}
	
	@Then("User click the displayed username {string} {string}")
	public void user_click_the_displayed_username(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("User is on loginpage {string}")
	public void user_is_on_loginpage(String pageName) {
		page=pageFactory.initialize(pageName);
		
	}
	@Then("The username must be prefilled {string}")
	public void the_username_must_be_prefilled(String elementName) {
		String username = page.getTextValue(elementName);
		System.out.println(username+"##############################");
	}
	
	@Then("User enters invalid username {string} {string}")
	public void user_enters_invalid_username(String elementName, String inputValue) {
		page.enterValue(elementName, inputValue);
	}
	@Then("User enters invalid password {string} {string}")
	public void user_enters_invalid_password(String elementName, String inputValue) {
		page.enterValue(elementName, inputValue);
	}
	@Then("Error is thrown {string}")
	public void error_is_thrown(String errormsg) {
	    String error ="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	    String actualmsg = page.getTextValue(errormsg);
	    assertEquals(error, actualmsg);
	}
	
	@Then("User clicks on {string} {string}")
	public void user_clicks_on(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User enters username {string} {string}")
	public void user_enters_username(String elementName, String inputValue) {
		page.enterValue(elementName, inputValue);
		
	}
	@When("User clicks on continue button {string}")
	public void user_clicks_on_continue_button(String continuebtn) {
		page.clickElement(continuebtn);
		
	}
	@Then("User get message {string}")
	public void user_get_message(String emailmsg) {
		String msg = page.getElementValue(emailmsg);
		System.out.println(msg);
	}
	
	@Then("User clicks on {string}")
	public void user_clicks_on(String forgotpwdlink) {
		page.clickElement(forgotpwdlink);
	}


	
	
	

}
