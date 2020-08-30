package com.selenium.alertPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowT1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		System.out.println("window count="+windows.size());
		int i=1;
		for(String window:windows){
			if (i==3){
				i++;
				continue;
			}
				
			driver.switchTo().window(window);
			Thread.sleep(1000);
			String title=driver.getTitle();
			
//			if(!title.isEmpty())
			System.out.println(i+"-: "+title);
			i++;
		}
		driver.switchTo().window(windows.get(0));
		
	}

}
