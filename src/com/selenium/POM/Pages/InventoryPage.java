package com.selenium.POM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
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
}
