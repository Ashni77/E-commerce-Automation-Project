package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginMyStorePage extends BasePage {
	
	public LoginMyStorePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="email_create")
	WebElement email_register;
	
	@FindBy(id ="SubmitCreate")
	WebElement createAccount_Btn;
	
	@FindBy(id = "email")
	WebElement signin_email;

	@FindBy(id = "passwd")
	WebElement signin_pwd;
	
	@FindBy(id = "SubmitLogin")
	WebElement signIn_btn;
	
	public void enterEmail() {
		
		email_register.sendKeys("demo678@gmail.com");
	}
	
	public void enterSigninEmail() {
		signin_email.sendKeys("ashniu4@gmail.com");
	}

	public void enterSigninPwd() {
		signin_pwd.sendKeys("automation");
	}
	
	public void clickSignInBtn() {
		signIn_btn.click();
	}

	public void clickCreate_Btn() {
		createAccount_Btn.click();
	}

}
