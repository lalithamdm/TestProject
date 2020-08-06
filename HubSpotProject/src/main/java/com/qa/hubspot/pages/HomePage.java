package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class HomePage extends BasePage{
	
	private WebDriver driver;

	
	By header=By.xpath("/html/body/div[3]/div/div[1]/div/section/header/div[1]/div/h1/i18n-string");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getHomePgaeHeaderText() {
		if(driver.findElement(header).isDisplayed()) {
			return driver.findElement(header).getText();
		}
		return null;
		
	}
	
	
}
