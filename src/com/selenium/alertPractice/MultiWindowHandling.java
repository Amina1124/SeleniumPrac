package com.selenium.alertPractice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
//		Object[] windows=handles.toArray();
		for(String handle: handles){
			System.out.println(handle);
		}
		
//		System.out.println((String)windows[1]);
		driver.switchTo().window(handles.get(1));
		System.out.println("Switched to window1 ");
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		System.out.println("windows got opened");
	}

}
