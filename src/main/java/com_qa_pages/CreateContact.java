package com_qa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_BasePage.TestBase;

public class CreateContact extends TestBase {


	//1.Page 	Factory or Object Repo
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;

	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastname;

	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middlename;

	@FindBy(xpath="//div[@name='company']//input[@type='text']")
	private WebElement companyname;

	@FindBy(xpath="//div[@name='status']//i[@class='dropdown icon']")
	private WebElement status_dropdown;

	@FindBy(xpath="//button[@class='ui linkedin button']")
	private WebElement save_btn;


	//2.driver and this for current class reference
	public CreateContact() {
		PageFactory.initElements(driver, this);

		//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
		//"this"   here this is for refer/pointing  to current class object
	}

	//3.Action 

	//WITH DATA DRIVEN TESTING
	public void add_contact_details(String first_name, String last_name,String Middle_name,String company_name) {
		
		//Select select = new Select (driver.findElement(By.name("Status")));
		//select.selectByVisibleText(Status);
		
		firstname.sendKeys(first_name);
		lastname.sendKeys(last_name);
		middlename.sendKeys(Middle_name);
		companyname.sendKeys(company_name);



		save_btn.click();


		//WITHOUT DATA DRIVEN TESTING
		/*public void add_contact_details() {
			firstname.sendKeys("Ajay");
			lastname.sendKeys("Edulab");
			middlename.sendKeys("Test");
			companyname.sendKeys("Edulab");

			Select select = new Select (driver.findElement(By.name("Status")));
			select.selectByVisibleText(Status);



			save_btn.click();*/

	}
}
