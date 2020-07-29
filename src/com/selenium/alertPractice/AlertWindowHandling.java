package com.selenium.alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWindowHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		popUps1();
		popUps2();

	}

	
	static void init() {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}
	
	static void popUps1(){
		driver.findElement(By.id("alertButton")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
	}
	static void popUps2(){
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,5);
		Alert myAlert=wait.until(ExpectedConditions.alertIsPresent());
		myAlert.accept();
		
	}
}
