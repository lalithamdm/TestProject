package com.qa.hubspot.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.hubspot.base.BasePage;
import com.qa.hubspot.pages.LoginPage;
import com.qa.hubspot.utils.Constants;

public class LoginPageTest {

	WebDriver driver;

	LoginPage loginpage;
	BasePage basepage;
	Properties prop;

	@BeforeTest
	public void setup() {

		basepage = new BasePage();
		driver = basepage.init_driver("chrome");
		basepage.init_driver(prop);
		loginpage = new LoginPage(driver);

	}

	@Test(priority = 1)
	public void verifySignUpLinkTest() {
		Assert.assertTrue(loginpage.verifySignUpLink(), "SignUp linke is not displayed");

	}

	@Test(priority = 2)
	public void getTitlePageTest() {
		String title = loginpage.getPageTitle();
		System.out.println("Title of the Page:" + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE, "Login page Title is not matched");

	}

	@Test(priority = 3)
	public void doLoginTest() {
		loginpage.doLogin();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
