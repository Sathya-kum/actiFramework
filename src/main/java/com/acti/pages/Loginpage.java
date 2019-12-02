package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.Driverscript;

public class Loginpage extends Driverscript {
	
	
	//****************object identification****************//
	
  @FindBy(id="username") WebElement usernameTb;
  @FindBy(name="pwd") WebElement PasswordTb;
  @FindBy(id = "loginButton") WebElement loginBtn;
  @FindBy(xpath = "//div[@class='atLogoImg']") WebElement actilogo;
  
  public  Loginpage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  //////////////***********************************Actions Methods**//////////////////////***********************
  
  public String VerifyTitle()
  {
	  return driver.getTitle();
  }
   
  
  public boolean VerifyLogoisDisplayed() 
  {
		return actilogo.isDisplayed();
	}
   public void VladiateLoginFunction( String username,String password)
   {
	   System.out.println(" val");
	   usernameTb.sendKeys(username);
	   PasswordTb.sendKeys(password);
	   loginBtn.click();
	   
   }
}


  
  
  
  
  
  
  
  




