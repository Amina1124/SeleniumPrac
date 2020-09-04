package MahireIpar.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkOutInfo {
	@FindBy(id="first-name")
	WebElement firstName;
	@FindBy(id="last-name")
	WebElement lastName;
	@FindBy(id="postal-code")
	WebElement zipCode;
	@FindBy(xpath="//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	WebElement conti;
	@FindBy(id="checkout_summary_container")
	WebElement checkoverview;
	@FindBy(xpath="//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
	WebElement finishcheck;
	
	public void setUserInfor() {
		firstName.sendKeys("asdf");
		lastName.sendKeys("zxcv");
		zipCode.sendKeys("100011");
	}
	public void continueClick() {
		conti.click();
	}
	public InventoryPage checkOut() {
		checkoverview.getText();
		finishcheck.click();
		InventoryPage inventoryPage = new InventoryPage();
		return inventoryPage;
	}


}
