package MahireIpar.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartConfirm {
	@FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	WebElement checkout;

	public  void CartCheckout() {
		checkout.click();
	}
}
