package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class SFLoginPage  extends BasePage {
	
	static WebDriver driver;

	public SFLoginPage() {
		
	
			super(driver=BaseTest.getDriver());
		//Method which accepts String , By byobj 
		addObject("txt_login_username", By.id("username"));
		addObject("txt_login_password", By.id("password"));
		addObject("chk_login_rememberMe", By.id("rememberUn"));
		addObject("btn_login_loginBtn", By.name("Login"));
		addObject("pwd_error_msg", By.id("error"));
		addObject("chk_login_rememberme", By.id("rememberUn"));
		addObject("txt_login_prefilledusername", By.id("idcard-identity"));
		addObject("prefilled_id_select", By.id("idlist"));
		addObject("invalid_error_msg", By.id("error"));
		addObject("forgot_password_link", By.id("forgot_password_link"));
		addObject("pwd_reset_continue", By.id("continue"));
		addObject("check_email_msg", By.xpath("//h1[contains(text(),'Check Your Email')]"));
		addObject("username", By.xpath("//input[@id='un']"));
		
	}

}
