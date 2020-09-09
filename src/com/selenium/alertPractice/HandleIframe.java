package com.selenium.alertPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {
	
	
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver. manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		List<WebElement> totaliframes =  driver.findElements(By.tagName("iframe"));
		System.out.println("totaliframes"+totaliframes.size());
		
		driver.switchTo().frame(0);
		WebElement frametext =driver.findElement(By.id("sampleHeading"));
		String text =frametext.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		String text1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text1);
		
		
	}

}
