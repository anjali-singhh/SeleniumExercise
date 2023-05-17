package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddItemIntoCartPage;






public class AddItemTest extends TestBase{
       
       AddItemIntoCartPage addItem = new AddItemIntoCartPage();
       Actions actions = new Actions(driver);
       
       @BeforeTest
       public void setup() {
	         initialize();
   }
  
      @Test
      public void loginTest() {
    	  
    	  addItem.loginIcon(); 
    	  addItem.loginuser("anjali_singh","May@2023");
    	  addItem.loginBtn();
	        //login
  }  
    
      //Add Item into Cart
      public void addItemTest() {
    	   
    	   addItem.viewItemDetailOne();
    	   addItem.addToCart();
    	   addItem.homePage();
    	   addItem.viewItemDEtailTwo();
    	   addItem.addToCart();
    	   
     }
    //View Item into Cart
     public void viewItemTest() {
    	   
    	   addItem.viewCart();
    }
     
     @AfterTest
     public void tearDown() {
    	  driver.close();
      }

}
