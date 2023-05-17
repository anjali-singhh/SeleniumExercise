package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AddItemIntoCartPage;
import pages.DeleteItemFromCartPage;
import pages.PlaceOrderPage;

public class PlaceOrderTest extends AddItemTest {
	
	AddItemTest addItem = new AddItemTest();
	DeleteItemFromCartPage deleteItemCart = new DeleteItemFromCartPage();
	PlaceOrderPage placeOrder = new PlaceOrderPage();
	
	@BeforeTest
    public void setup() {
	         initialize();
}
  @Test
  public void login() {
	  addItem.loginTest();
  }
  
//View item in Cart
	public void viewCartTest() {
		deleteItemCart.viewCartAfterDelete();
	}
	
//PlaceOrder
	public void placeOrder() {
		placeOrder.purchaseName("Anji","India","Delhi","578998766","May","2023");
		placeOrder.purchaseBtn();
	  
	}
	
	@AfterTest
    public void tearDown() {
   	  driver.close();
     }
	
}
