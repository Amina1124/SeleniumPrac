package aygulomar.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginb;
	
	//actions
	public void setUserName() {
		userName.sendKeys("standard_user");
	}
	public void setPassWord() {
		password.sendKeys("secret_sauce");	
}
	public void clickLogn() {
		loginb.click();	
		
		
	}
}