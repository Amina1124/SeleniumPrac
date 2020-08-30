package com.selenium.alertPractice;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class uploadButton {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
//		oldWayMethod();
		robotClassMethod();
		

	}
	
	static void oldWayMethod(){
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\test\\output.txt");
		
	}
	
	static void robotClassMethod(){
		try {
			Robot robot=new Robot();
			WebElement bt1=driver.findElement(By.id("uploadFile"));
			bt1.sendKeys(Keys.RETURN);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_COLON);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_BACK_SLASH);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_P);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_X);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
