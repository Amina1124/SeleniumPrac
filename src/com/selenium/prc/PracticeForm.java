package com.selenium.prc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.Utility.Util;

public class PracticeForm {
	static WebDriver driver;
	static String gender = "male";
	static String hobbies = "music, reading";

	public static void main(String[] args) throws Exception {
		init();

		fillOutForm();
	}

	static void init() {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}

	static void fillOutForm() throws Exception {

		String fpath = System.getProperty("user.dir");
		// UsrInfo user1 = Util.readInfoFromExcel(fpath +
		// "\\src\\com\\selenium\\data\\usrInfo.xlsx");
		List<UsrInfo> users = Util.readInfoFromExcel(fpath + "\\src\\com\\selenium\\data\\usrInfo.xlsx");

		for (int n = 0; n < users.size(); n++) {
			UsrInfo user1=users.get(n);
			
			WebElement usrname = driver.findElement(By.id("firstName"));
			usrname.sendKeys(user1.getFrstName());

			driver.findElement(By.id("lastName")).sendKeys(user1.getLstName());
			driver.findElement(By.id("userEmail")).sendKeys(user1.getEmail());

			// WebElement gender=driver.findElement(By.id("gender-radio-2"));
			// gender.click();
			// JavascriptExecutor executor=(JavascriptExecutor)driver;
			// executor.executeScript("arguments[0].click()", gender);
			//
			// System.out.println(driver.findElements(By.name("gender")).size());

			List<WebElement> genderElem = driver.findElements(By.name("gender"));// find
																					// elements
			// int elemSize=driver.findElements(By.name("gender")).size();
			int elemSize = genderElem.size(); // get elements size
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			for (int i = 0; i < elemSize; i++) {
				if (genderElem.get(i).getAttribute("value").equalsIgnoreCase(user1.getGender())) {
					executor.executeScript("arguments[0].click()", genderElem.get(i));
				}
			}
			// "05/01/1997"
			String[] dob = user1.getDOB().split("[/]"); // dob[0]=05 dob[1]=01
														// dob[2]=1997
			String monthName = "";

			switch (dob[0]) {
			case "01":
				monthName = "January";
				break;
			case "02":
				monthName = "February";
				break;
			case "03":
				monthName = "March";
				break;
			case "04":
				monthName = "April";
				break;
			case "05":
				monthName = "May";
				break;
			case "06":
				monthName = "June";
				break;
			case "07":
				monthName = "July";
				break;
			case "08":
				monthName = "August";
				break;
			case "09":
				monthName = "September";
				break;
			case "10":
				monthName = "October";
				break;
			case "11":
				monthName = "November";
				break;
			case "12":
				monthName = "December";
				break;
			}

			String day = "";
			switch (dob[1]) {
			case "01":
				day = "1";
				break;
			case "02":
				day = "2";
				break;
			case "03":
				day = "3";
				break;
			case "04":
				day = "4";
				break;
			case "05":
				day = "5";
				break;
			case "06":
				day = "6";
				break;
			case "07":
				day = "7";
				break;
			case "08":
				day = "8";
				break;
			case "09":
				day = "9";
				break;
			default:
				day = dob[1];
				break;
			}

			driver.findElement(By.id("userNumber")).sendKeys(user1.getMobile());

			WebElement bd = driver.findElement(By.id("dateOfBirthInput"));
			bd.click();
			// Jan, 15, 1995

			WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
			Select sel_month = new Select(month);
			// sel_month.selectByValue("0");
			sel_month.selectByVisibleText(monthName);

			WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
			Select sel_year = new Select(year);
			sel_year.selectByVisibleText(dob[2]);

			List<WebElement> days = driver
					.findElements(By.xpath("//div[contains" + "(@class,\"react-datepicker__day--\")]"));

			for (int i = 0; i < days.size(); i++) {
				if (!days.get(i).getText().equals(day))
					continue;
				if (days.get(i).getAttribute("class").contains("outside-month"))
					continue;
				days.get(i).click();
				break;
			}

			driver.findElement(By.id("subjectsInput")).sendKeys(user1.getSubject() + Keys.ENTER);

			// bd.sendKeys("06 Jun 1996");
			// driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div/div[2]/div/input")).sendKeys("Computer");
			// driver.findElement(By.xpath("//*[@value='1']")).click();
			// driver.findElement(By.xpath("//*[@value='2']")).click();
			// driver.findElement(By.xpath("//*[@value='3']")).click();

			List<WebElement> hobbiesList = driver.findElements(By.cssSelector("input[type='checkbox']"));
			// int n=hobbiesList.size();
			// if(hobbies.contains("reading"))
			hobbies = user1.getHobbies();
			hobbies = hobbies.replace("Reading", "2");
			hobbies = hobbies.replace("reading", "2");
			// if(hobbies.contains("sports"))
			hobbies = hobbies.replace("Sports", "1");
			hobbies = hobbies.replace("sports", "1");
			// if(hobbies.contains("music"))
			hobbies = hobbies.replace("Music", "3");
			hobbies = hobbies.replace("music", "3");

			// System.out.println(hobbies);

			for (int i = 0; i < hobbiesList.size(); i++) {
				// executor.executeScript("arguments[0].click()",
				// hobbiesList.get(i));
				if (hobbies.contains(hobbiesList.get(i).getAttribute("value")))
					executor.executeScript("arguments[0].click()", hobbiesList.get(i));
			}

			driver.findElement(By.id("uploadPicture")).sendKeys(user1.getPicLoc());

			String address = "415 W 17th ST Apt #3,\r\n Lawrence, KS\r\n 66044";
			driver.findElement(By.id("currentAddress")).sendKeys(user1.getAddr());

			driver.findElement(By.id("react-select-3-input")).sendKeys(user1.getState() + Keys.ENTER);
			driver.findElement(By.id("react-select-4-input")).sendKeys(user1.getCity() + Keys.ENTER);

			driver.findElement(By.id("submit")).submit();
			Thread.sleep(2000);
			driver.findElement(By.id("closeLargeModal")).click();
			Thread.sleep(2000);
		}
		// driver.quit();
	}

}
