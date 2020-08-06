package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage {

	private WebDriver driver;

	// Create By locators --Object Repository

	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.id("loginBtn");
	By signUpLink = By.linkText("Sign up");

	// Create Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// create Page Actions
	public String getPageTitle() {
		return driver.getTitle();
		
		 

	}

	public boolean verifySignUpLink() {
		return driver.findElement(signUpLink).isDisplayed();
		

	}

	public HomePage doLogin(String name, String pass) {
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		return new HomePage(driver);

	}

}
