package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AddItemIntoCartPage extends TestBase{
	Actions actions = new Actions(driver);
	//Pagefactory
	//Login 
    @FindBy(id="login2")
    WebElement login;
    
    @FindBy(id="loginusername")
    WebElement username;
    
    @FindBy(id="loginpassword")
    WebElement pwd;
    
    @FindBy(xpath="//button[contains(text(),'Log in')]")
    WebElement loginBtn;
    
    
    //AddItem
    @FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
    WebElement itemIcon1;
    
    @FindBy(xpath="//a[contains(text(),'Nokia lumia 1520')]")
    WebElement itemIcon2;
    
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addBtn;
    
    @FindBy(xpath = "//a[contains(text(),'Home')]")
   	WebElement homeIcon;
    
    
    
    //View Cart
    @FindBy(xpath = "//a[contains(text(),'Cart')]")
	WebElement cartIcon;
    
    
    
    
    public void AddItemIntoCartPage() {
   	 PageFactory.initElements(driver, this);
    }
    
    //Login
    public void loginIcon() {
    	login.click();
    }
    public void loginuser(String userName,String userPwd) {
		
		username.sendKeys(userName);
		pwd.sendKeys(userPwd);
   }
    public void loginBtn() {
		loginBtn.click();
   }
    //AddItem
    public void viewItemDetailOne() {
		itemIcon1.click();
	}
    
    public void viewItemDEtailTwo() {
    	itemIcon2.click();
    }
    public void addToCart() {
	   addBtn.click();
	   driver.switchTo().alert().accept();
	  
	}
    
    public void homePage() {
 	   homeIcon.click();
 	  
 	}
    //ViewCartItem
    
    public void viewCart() {
    	cartIcon.click();
    	itemIcon1.isDisplayed();
    	itemIcon2.isDisplayed();
      }
    
    
    
    
    
}
