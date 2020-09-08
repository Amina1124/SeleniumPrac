package com.selenium.prc.POM.pages;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	@FindBy(id="userNumber")
	WebElement Mobile;
	@FindBy(id="currentAddress")
	WebElement Addr;
	@FindBy(id="react-select-3-input")
	WebElement State;
	@FindBy(id="react-select-4-input")
	WebElement City;
	@FindBy(id="subjectsInput")
	WebElement Subject;
	@FindBy(id="uploadPicture")
	WebElement PicLoc;
	
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
	public void setMobile(String  mobile) {
		Mobile.sendKeys(mobile);
	}
	public void setAddr(String addr ){
		Addr.sendKeys(addr);
		}
	public void setState(String state){
		State.sendKeys((state) + Keys.ENTER);
		}
	public void setCity(String city){
		City.sendKeys((city) + Keys.ENTER);
		}
	
		public void setSubject(String subject ){
		Subject.sendKeys((subject)+ Keys.ENTER);
		}
	
	//public void setPicLoc(String picLoc ){
		//PicLoc.sendKeys(picLoc);}
	
}