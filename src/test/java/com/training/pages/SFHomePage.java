package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class SFHomePage extends BasePage {

	static WebDriver driver;
	
//Method which accepts String , By byobj 
public SFHomePage() {
	super(driver=BaseTest.getDriver());
	

addObject("link_homepage_usermenu", By.id("userNavLabel"));
addObject("logout", By.xpath("//a[contains(text(),'Logout')]"));
addObject("usermenu_items", By.xpath("//div[@id='userNav-menuItems']/a"));
addObject("myProfileLink", By.xpath("//a[@title='My Profile']"));
addObject("editProfile", By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img"));
addObject("editContactframe",By.id("contactInfoContentId"));
addObject("aboutTab", By.xpath("//a[contains(text(),'About')]"));
addObject("lastname", By.id("lastName"));
addObject("saveAllBtn", By.xpath("//input[@value='Save All']"));
addObject("postLink",By.id("publisherAttachTextPost"));
addObject("sharePost", By.xpath("//span[text()='Post']"));
addObject("textarea", By.xpath("//textarea[@id='publishereditablearea']"));
addObject("textareaFrame", By.xpath("//div[@role='presentation']/iframe"));
addObject("textarea", By.xpath("/html/body"));
addObject("shareBtn", By.id("publishersharebutton"));
addObject("fileLink", By.xpath("//a[@id='publisherAttachContentPost']"));
addObject("uploadFromComputerButton", By.id("chatterUploadFileAction"));
addObject("chooseFile", By.id("chatterFile"));
addObject("mySettingLink", By.xpath("//a[@title='My Settings']"));
addObject("personalLink", By.id("PersonalInfo_font"));
addObject("displayAndLayout", By.id("DisplayAndLayout_font"));
addObject("loginHistoryLink", By.id("LoginHistory_font"));
addObject("downLoadLink", By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
addObject("displayAndLayout",By.id("DisplayAndLayout_font"));
addObject("customizeTab", By.id("CustomizeTabs_font"));
addObject("saveButton", By.name("save"));
addObject("customAppDD", By.id("p4"));
addObject("availableTabs", By.id("duel_select_0"));
addObject("addTab", By.id("duel_select_0_right"));
addObject("downArrow", By.xpath("//*[@title='Down']"));
addObject("tab", By.xpath("//ul[@id='tabBar']//li"));
addObject("emailSetup", By.id("EmailSetup_font"));
addObject("myEmailSettings", By.id("EmailSettings_font"));
addObject("emailNameField", By.id("sender_name"));
addObject("emailIdField", By.id("sender_email"));
addObject("autoBcccheck", By.id("auto_bcc1"));
addObject("calendarsAndremainder", By.id("CalendarAndReminders_font"));
addObject("activityRemainder", By.id("Reminders_font"));
addObject("openTestRemainderBtn", By.id("testbtn"));







}
}
