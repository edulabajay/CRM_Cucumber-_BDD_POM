package com_qa_StepDefinition;

import java.io.IOException;
import org.junit.Assert;
import com_BasePage.TestBase;
import com_qa_pages.CreateContact;
import com_qa_pages.HomePage;
import com_qa_pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase {

	// When you create an object, memory is allocated for its instance variables 
	LoginPage loginpage = new LoginPage();
	HomePage homepage;
	CreateContact contact;

	@Given("user should open browser")
	public void user_should_open_browser() throws IOException {
		TestBase.initialize();
	}

	@Then("user is on login page")
	public void user_is_on_login_page() {
		String loginpagetitle = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", loginpagetitle);
	}

	@Then("user logged successfully by entering valid username and password")
	public void user_logged_successfully_by_entering_valid_username_and_password() {

		//initializing the LoginPage object ensures that its elements are set up, allowing you to use the login method without encountering NullPointerExceptions or other issues related to uninitialized state.
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		contact = homepage.validate_contact_link();
		homepage.validate_Create_New_contact_btn();
	}

	@Then("validate home page title")
	public void validate_home_page_title() {
		String homepagetitle = homepage.Verify_homepage_title();
		Assert.assertEquals("Cogmento CRM", homepagetitle);
	}

}


