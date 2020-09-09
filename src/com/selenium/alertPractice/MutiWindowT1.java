package com.selenium.alertPractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutiWindowT1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/practiceform/");
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
		System.out.println("Window 2nd get open");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();;
		
		ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
		System.out.println("window count="+ windows.size());
		int i= 1;
		for(String window:windows) {
			if(i==3) {
				i++;
				continue;
			}
			driver.switchTo().window(window);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			String title=driver.getTitle();
			
			}
		}
	

	}

}
