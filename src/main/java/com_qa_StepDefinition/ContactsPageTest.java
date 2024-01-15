package com_qa_StepDefinition;

import org.junit.Assert;

import com_BasePage.TestBase;
import com_qa_pages.CreateContact;
import com_qa_pages.HomePage;
import com_qa_pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	CreateContact contact;

	public ContactsPageTest() {
		this.contact = new CreateContact();
	}
/*
	@Then("User enters  first_name and middle_name and last_name and company_name")
	public void user_enters_first_name_and_middle_name_and_last_name_and_company_name(String first_name, String middle_name, String last_name, String company_name) {


		contact.add_contact_details(first_name, middle_name, last_name, company_name);
		homepage.validate_Create_New_contact_btn();
	}
*/

@Given("User should on Add Contact link")
public void user_should_on_add_contact_link() {
	String contacttitle = contact.Verify_contact_title();
	Assert.assertEquals("Cogmento CRM", contacttitle);
}

@When("User enters first_name {string} and middle_name {string} and last_name {string} and company_name {string}")
public void user_enters_first_name_and_middle_name_and_last_name_and_company_name(String first_name, String middle_name, String last_name, String company_name) {
	
    contact.add_contact_details("hena","madan","peek","eduuuu");
}


@Then("close the browser")
public void close_the_browser() {
	driver.quit(); 
}

}




