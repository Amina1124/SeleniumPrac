package Amina.POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Amina.POM.Pages.InventoryPage;
import Amina.POM.Pages.MainPage;

public class AutomateSwag {
	static WebDriver driver;
	static InventoryPage inventoryPage;
	static MainPage mainPage;
	public static void main(String[] args) throws InterruptedException {
		init();
		Thread.sleep(3000);
		login();
		Thread.sleep(3000);
		logout();
		Thread.sleep(3000);
		close();
		
	}
	
	static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenum\\chromedriver_85.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/index.html");
		inventoryPage=PageFactory.initElements(driver, InventoryPage.class);
		mainPage=PageFactory.initElements(driver, MainPage.class);
		
	}
	
	static public void login() {
		mainPage.setUserName();
		mainPage.setPassword();
		mainPage.clickLogin();
	}

	static public void logout(){
		inventoryPage.clickItem1();
		inventoryPage.clickItem2();
		inventoryPage.clickMenu();
		inventoryPage.clickLogout();
	}
	static void close() {
		driver.close();
		driver.quit();
	}
}

	
	
	
	