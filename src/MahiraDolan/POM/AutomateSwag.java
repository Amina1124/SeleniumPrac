package MahiraDolan.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomateSwag {
	//declare object
	static WebDriver driver;//we can use directly without creating object
	static InventoryPage inventoryPage;
	static MainPage mainPage;
	
	//constructor
	public AutomateSwag(){
		
	}

	public static void main(String[] args) {
		
		init();
		login();
	}
	static void init() {
		System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://saucedemo.com/index.html");
		//define object
		mainPage=PageFactory.initElements(driver, MainPage.class);
		inventoryPage=PageFactory.initElements(driver, InventoryPage.class);
		//Here we use PageFactory to perform constructors function
		//iniyElements method play important role here
		
		
	}
	public static void login() {
		mainPage.setUserName();
		mainPage.setPsw();
		mainPage.clickLogin();
		
		
	}
	public static void logout() {
		
	}


}
