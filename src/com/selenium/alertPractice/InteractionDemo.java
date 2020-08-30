package com.selenium.alertPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class InteractionDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
//		dragable();
		selectable();

	}
	
	public static void dragable() throws InterruptedException{
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(1000);
//		WebElement iframe1=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		WebElement b1=driver.findElement(By.id("draggable"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(b1, 50, 30).build().perform();
		
	}
	
	public static void selectable(){
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		List<WebElement> itemL=driver.findElements(By.xpath("//*[@id='selectable']/li"));
		//1,3,6,7
		
		Actions actions=new Actions(driver);
		actions=actions.keyDown(Keys.CONTROL);
		
		for(int i=0;i<7;i++){
			if(i==1 || i==3 || i==4)
				continue;
//			itemL.get(i).click();
			actions.click(itemL.get(i));
//			System.out.println(i);
		}
		
		//actions.keyDown(Keys.CONTROL).click(itemL.get(0)).click(itemL.get(1)).
		actions.keyUp(Keys.CONTROL).build().perform();
	}

}
