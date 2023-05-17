package testScripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddItemIntoCartPage;
import pages.DeleteItemFromCartPage;

public class DeleteItemTest extends TestBase{
	AddItemTest addItem = new AddItemTest();
	DeleteItemFromCartPage deleteItem = new DeleteItemFromCartPage();
	
    
    
    @BeforeTest
    public void setup() {
	         initialize();
}
    
	@Test
	      //login
	public void loginTest() {
  	  addItem.loginTest();
 	   
	}
	
 	//View item in Cart
	public void viewCartTest() {
 	  addItem.viewItemTest();
	}
	
	//Delete item in Cart
	public void deleteItemTest() {
	  deleteItem.deleteFromCart();
		
	}
	
	@AfterTest
    public void tearDown() {
   	  driver.close();
     }
	
}
