package aygulomar.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.POM.Pages.InventoryPage;
import com.selenium.POM.Pages.MainPage;

public class OutmateSwag {
    static WebDriver driver;
    static InventoryPage inventoryPage;
	static MainPage mainPage;
	public static void main(String[] args) {
		init();
		login();
		logout();
 }
	 
		public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/index.html");
		mainPage=PageFactory.initElements(driver, MainPage.class);
		inventoryPage=PageFactory.initElements(driver, InventoryPage.class);
		
} 
static void login() {
	
	mainPage.setUserName();
	mainPage.setPsw();
	mainPage.clickLogin();
	
    
	}
static public void logout() {  
     inventoryPage.clickItem1();
     inventoryPage.clickItem2();
	inventoryPage.clickMenu();
	inventoryPage.clickLogout();
}


}


