package com.selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.POM.Pages.InventoryPage;
import com.selenium.POM.Pages.MainPage;

public class AutomateSwag {
	static WebDriver driver;
	static InventoryPage inventoryPage;
	static MainPage mainPage;
	
	
	public static void main(String[] args) {
		init();
		login();
		logout();

	}
	
	static void init() {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver_85.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/index.html");
		
		mainPage=PageFactory.initElements(driver, MainPage.class);
		inventoryPage=PageFactory.initElements(driver, InventoryPage.class);		
	}

	static public void login(){
		mainPage.setUserName();
		mainPage.setPsw();
		mainPage.clickLogin();		
	}
	
	static public void logout(){
		inventoryPage.clickMenu();
		if(inventoryPage.isLogoutExist()){
			inventoryPage.clickLogout();
		}else{
			System.out.println("There is no Logout Element exist.");
		}
		
	}
}
