package com.selenium.prc.POM.pages;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainForm {
	
	WebDriver driver;
	
	
public MainForm(WebDriver driver) {
		
		this.driver = driver;
		
	}

@FindBy(id = "firstName")
WebElement fname;

@FindBy(id = "lastName")
WebElement Lname;

@FindBy(id = "userEmail")
WebElement email;

@FindBy(id = "gender-radio-1")
WebElement male;

@FindBy(id = "gender-radio-2")
WebElement female;

@FindBy(id = "gender-radio-3")
WebElement other;



public void setFirstName(String fn) {
	fname.sendKeys(fn);
}

public void setLastName(String ln) {
	Lname.sendKeys(ln);
}

public void setEmail(String userEmail) {
	email.sendKeys(userEmail);
}

public void setGender(String gender) {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	if (gender.equalsIgnoreCase("female")) {
		female.click();
		executor.executeScript("arguments[0].click()", female);
		
	}else if (gender.equalsIgnoreCase("male")) {
		male.click();
		executor.executeScript("arguments[0].click()", male);
	}else if(gender.equalsIgnoreCase("other")) {
		other.click();
		executor.executeScript("arguments[0].click()", other);
	}
	
}
public void setDOB(String dob) {
	
}




}
