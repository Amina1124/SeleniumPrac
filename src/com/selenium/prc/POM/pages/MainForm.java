package com.selenium.prc.POM.pages;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainForm {
	WebDriver driver;
	
	public MainForm(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="firstName")
	WebElement fName;
	
	@FindBy(id="lastName")
	WebElement lName;
	
	@FindBy(id="userEmail")
	WebElement Email;
	
	@FindBy(id="gender-radio-1")
	WebElement male;
	
	@FindBy(id="gender-radio-2")
	WebElement female;
	
	@FindBy(id="gender-radio-3")
	WebElement other;
	
	
	//actions
	public void setFname(String fn){
		fName.sendKeys(fn);
	}
	
	public void setLname(String ln){
		lName.sendKeys(ln);
	}
	
	public void setEmail(String email){
		Email.sendKeys(email);
	}
	
	public void setGender(String gn){
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		if(gn.equalsIgnoreCase("female")){
//			female.click();
			executor.executeScript("arguments[0].click()", female);
		} else if(gn.equalsIgnoreCase("male")){
//			male.click();
			executor.executeScript("arguments[0].click()", male);
		} else if(gn.equalsIgnoreCase("other")){
//			other.click();
			executor.executeScript("arguments[0].click()", other);
		}
	}
	
	public void setDOB(String dob){
		
	}

}
