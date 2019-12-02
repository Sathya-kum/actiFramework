package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.Driverscript;

public class EnterTimepage extends Driverscript {
	
	
	//*******************page/object initialization*************//
	
	public  EnterTimepage()
	  {
		  PageFactory.initElements(driver, this);
		  
	  }


	//****************object identification****************//
	
  @FindBy(id="logoutLink") WebElement logoutLnk;
  @FindBy(xpath ="//div[text()='Tasks']") WebElement Taskmenu;
  
  //*******************Actions methods*******************************//
  
  public void clicklogout()
  {
	  logoutLnk.click();
  }
  
  
  public boolean verifytasksmenuisdisplyed()
  
  {
	  return Taskmenu.isDisplayed();
  }
  
  public void clicktasksmenu()
  {
	  Taskmenu.click();
  }
  

}
