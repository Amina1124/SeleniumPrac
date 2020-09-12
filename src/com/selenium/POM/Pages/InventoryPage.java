package com.selenium.POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")
	WebElement item1;
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button")
	WebElement item2;
	
	@FindBy(xpath="//button[text()=\"Open Menu\"]")
	WebElement menu;
	
	@FindBy(id="logout_sidebar_link")
	WebElement logout;
	
	//Actions
	public void clickItem1(){
		item1.click();
	}
	
	public void clickItem2(){
		item2.click();
	}
	
	public void clickMenu(){
		menu.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
	
	public boolean isLogoutExist(){		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement xx=wait.until(ExpectedConditions.visibilityOf(logout));
		if(xx !=null){
			return true;
		}
		else{
			return false;
		}
	}
}
