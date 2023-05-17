package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeleteItemFromCartPage extends TestBase {

	
	//DeleteItem
    @FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
    WebElement itemIcon1;
    
    @FindBy(xpath="//td[contains(text(),'Samsung galaxy s6')]//following::a[1]")
    WebElement deleteItem1;
    
  //View Cart
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
	WebElement cartIcon;


public void DeleteItemFromCartPage() {
  	 PageFactory.initElements(driver, this);
   }
   

public void deleteFromCart() {
	 deleteItem1.click();
}
public void viewCartAfterDelete() {
	cartIcon.click();
	itemIcon1.isDisplayed();
}
}
