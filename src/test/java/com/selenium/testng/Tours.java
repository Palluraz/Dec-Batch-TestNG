package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Tours 
{WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test
  public void ToursInfo() 
  {
	  w.get("https://demo.guru99.com/test/newtours/register.php");
	  String PageTitle=w.getTitle();
	  WebElement SignONButton=w.findElement(By.linkText("SIGN-ON"));
	  WebElement RegisterButton=w.findElement(By.linkText("REGISTER"));
	  WebElement SupportButton=w.findElement(By.linkText("SUPPORT"));
	  WebElement ContactButton=w.findElement(By.linkText("CONTACT"));
	  
	  Assert.assertEquals(PageTitle, "Register: Mercury Tours");
	  Assert.assertTrue(SignONButton.isDisplayed(), "SignONbutton is not present");
	  Assert.assertTrue(RegisterButton.isDisplayed(), "RegisterButton is not present");
	  Assert.assertTrue(SupportButton.isDisplayed(), "SupportButton is not present");
	  Assert.assertTrue(ContactButton.isDisplayed(), "ContactButton is not present");
	  
	  w.findElement(By.name("firstName")).sendKeys("Steve");
	  w.findElement(By.name("lastName")).sendKeys("Jones");
	  w.findElement(By.name("phone")).sendKeys("9898989898");
	  w.findElement(By.id("userName")).sendKeys("seleniumtest@gmail.com");
	  w.findElement(By.name("address1")).sendKeys("101, sample test addess, CA-90");
	  w.findElement(By.name("city")).sendKeys("Boston");
	  w.findElement(By.name("state")).sendKeys("MA");
	  w.findElement(By.name("postalCode")).sendKeys("02130");
	  
	  WebElement CountryDropdown=w.findElement(By.name("country"));
	  Select sel=new Select(CountryDropdown);
	  sel.selectByVisibleText("UNITED STATES");
	  
	  w.findElement(By.id("email")).sendKeys("testinguser");
	  w.findElement(By.name("password")).sendKeys("testinguser");
	  w.findElement(By.name("confirmPassword")).sendKeys("testinguser");
	  w.findElement(By.name("submit")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
