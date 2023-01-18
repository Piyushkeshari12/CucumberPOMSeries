package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//By Locators:
	private By loginId = By.name("username");
	private By password = By.name("password");
	private By loginButton = By.xpath("//button[@type='submit']");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	
	//constructor of the page class
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//page actions: features of the page the form of methods
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(loginId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();
	}
	
	
	
}
