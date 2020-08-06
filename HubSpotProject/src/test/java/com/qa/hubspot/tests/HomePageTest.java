package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest {
	
	WebDriver driver;

	LoginPage loginpage;
	BasePage basepage;
	Properties prop;
	HomePage homepage;

	@BeforeTest
	public void setup() {

		basepage = new BasePage();
		driver = basepage.init_driver("chrome");
		basepage.init_driver(prop);
		loginpage = new LoginPage(driver);
		homepage=new HomePage(driver);

	}

}
