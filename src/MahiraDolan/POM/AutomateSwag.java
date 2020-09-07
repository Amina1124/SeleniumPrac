package MahiraDolan.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateSwag {
	//declare object
	static WebDriver driver;//we can use directly without creating object
	static InventoryPage inventoryPage;
	static MainPage mainPage;
	static WebDriverWait wait;
	int waitTime=10;
	 //explicit wait
    public void waitUntilElementIsVisible(WebElement webElement)
    {
    	int waiTime=30;
        WebDriverWait webDriverWait=new WebDriverWait(driver,waitTime);
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }
	
	//constructor
	public AutomateSwag(){
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		init();
		login();
		logout();
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
		
//		//wait until element is present
//	    public void waitUntilElementIsPresent(WebElement webElement,int timeout)
//	    {
//	        WebDriverWait webDriverWait=new WebDriverWait(driver,timeout);
//	        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
//
//	    }	
		
	}
	public static void logout() throws InterruptedException {
		inventoryPage.clickItem1();
		inventoryPage.clickItem2();
		inventoryPage.clickMenu();
		 WebDriverWait Wait=new WebDriverWait(driver,10);
	     Wait.until(ExpectedConditions.visibilityOf(null));
		Thread.sleep(1000);//add explicit wait
		inventoryPage.clickLogout();
		
	}


}
