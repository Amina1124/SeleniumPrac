package com.selenium.prc.POM.mainScript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.Utility.Util;
import com.selenium.prc.UsrInfo;
import com.selenium.prc.POM.pages.MainForm;

public class FormAutomate {
	
static WebDriver driver;
static MainForm mainForm;

	public static void main(String[] args) {
		
	}
	
	static void init() {
		System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tollsqa.com/automation-practice-form/");
		mainForm=PageFactory.initElements(driver, MainForm.class);
	}

	static void fillOutForm() throws Exception {
		String fpath=System.getProperty("user.dir");
		List<UsrInfo> users=Util.readInfoFromExcel(fpath+"\\src\\com\\selenium\\data\\usrInfo.xlsx");
		
		UsrInfo user1=users.get(0);
		mainForm.setFirstName(user1.getFrstName());
		mainForm.setLastName(user1.getLstName());
		mainForm.setEmail(user1.getEmail());
		mainForm.setGender(user1.getGender());
		mainForm.setDOB(user1.getDOB());
	}
}
