package MahiraDolan.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement psw;
	
	@FindBy(id="login-button")
	WebElement lginB;
	
	//Actions
	public void setUserName(){
		userName.sendKeys("standard_user");
	}
	
	public void setPsw(){
		psw.sendKeys("secret_sauce");
	}
	
	public void clickLogin(){
		lginB.click();
	}

}


