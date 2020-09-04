package MahireIpar.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import MahireIpar.POM.pages.InventoryPage;
import MahireIpar.POM.pages.MainPage;

public class AutomationSwag {
static WebDriver driver;
static MainPage mainPage;
static InventoryPage inventoryPage;
	public static void main(String[] args) {
		
			init();
			login();
			shoppingList();
			logout();

		}
		
		static void init() {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromedriver_84.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			mainPage=PageFactory.initElements(driver, MainPage.class);
			inventoryPage=PageFactory.initElements(driver, InventoryPage.class);
		}
		
		public static void login() {
			mainPage.setUserName();
			mainPage.setPassword();
			mainPage.clickLogin();
			
		}
		public static void logout() {
			inventoryPage.clickMenu();
			
			inventoryPage.clickLogout();
		}
		public static void shoppingList() {
			inventoryPage.clickItem1();
			inventoryPage.clickItem2();
		}

	}


	


