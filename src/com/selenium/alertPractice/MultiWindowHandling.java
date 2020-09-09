package com.selenium.alertPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {


	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Selinium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa//com//browser-windows");
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> handles= driver.getWindowHandles();
		Object[] windows=handles.toArray();
		for(String handle:handles ) {
			System.out.println(handle);
	}
		System.out.println(driver.switchTo().window((String)windows[1]).getTitle()); 
		 System.out.println("windows got opened");
		 
		 
		
	}

}
