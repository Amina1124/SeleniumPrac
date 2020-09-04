package Amina.POM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	//Actions
	public void setUserName(){
		userName.sendKeys("standard_user");
	}
	
	public void setPassword(){
		password.sendKeys("secret_sauce");
	}
	
	public void clickLogin(){
		loginButton.click();
	}
	
}
