package com_qa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com_BasePage.TestBase;

public class HomePage extends TestBase {


	//1.Page 	Factory or Object Repo
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calender_link;
	
	@FindBy(xpath="//span[normalize-space()='Contacts']")
	WebElement contacts_link;
	
	@FindBy(xpath="//div[3]//button[1]//i[1]")
	WebElement create_contact_btn;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement company_link;
	
	
	//2.driver and this for current class reference
	public HomePage() {
		
		PageFactory.initElements(driver, this);

		//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
		//"this"   here this is for refer/pointing  to current class object
	}


	
	//3.Action
	public String Verify_homepage_title() {
		
		return driver.getTitle();
	}
	
	
	public CreateContact validate_contact_link() {
		
		contacts_link.click();
		
		return new CreateContact();
	}
	

	public CreateContact validate_Create_New_contact_btn() {
 
//---Here we use Action class for Mouse Movement----//
		
		//Method - 1
		//create_contact_btn.click();
		//return new Create_New_Contact();

		
		//Method - 2
		Actions action = new Actions(driver);
		action.moveToElement(contacts_link).build().perform();
		create_contact_btn.click();
		
		return new CreateContact();

	}


}
