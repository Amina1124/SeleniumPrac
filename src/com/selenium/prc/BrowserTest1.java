package com.selenium.prc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver_83.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		System.out.println("window title is--"+driver.getTitle());
		System.out.println("the URL is--"+driver.getCurrentUrl());
		
//		driver.close();

	}

}
