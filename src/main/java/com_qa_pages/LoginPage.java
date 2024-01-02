package com_qa_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com_BasePage.TestBase;

public class LoginPage extends TestBase {

	//1.Page 	Factory or Object Repo
		@FindBy(name = "email")
		WebElement username;
		
		@FindBy(name= "password")
		WebElement password;
		
		@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
		WebElement login_button;
		
		@FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
		WebElement forget_password_link;
		
		@FindBy(xpath = "//a[normalize-space()='Sign Up']")
		WebElement  sign_up_link;
		
		
		public LoginPage() {
			
			PageFactory.initElements(driver, this);

			//"driver" here driver is use for initialize browser for all WebElement that we initialize above with @FindBy
			//"this"   here this is for refer/pointing  to current class object
		}
		
		//3.Action
		public String ValidateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public HomePage login(String user_name,String user_pass) {
			username.sendKeys(user_name);
			password.sendKeys(user_pass);
			login_button.click();
			
			return new HomePage();
		}
		
}
