package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssertTest 
{ WebDriver w;
  
  @BeforeTest
  public void beforeTest_MutualFund() 
  {
	  WebDriverManager.firefoxdriver().setup();
	  w=new FirefoxDriver();
  }
  
  @Test(priority=0,description="Test Case to verify login Page using 'Admin' user", groups = "LoginModule")
  public void loginAdminTest() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  String loginPageTitle=w.getTitle();
	  String loginPageUrl=w.getCurrentUrl();
	  WebElement loginPageLabel=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
	  String loginPageLabel_text=loginPageLabel.getText();
	  
	  Assert.assertEquals(loginPageTitle, "Altoro Mutual");
	  Assert.assertTrue(loginPageUrl.contains("/login.jsp"), "URL doesn't contains '/login.jsp'");
	  Assert.assertTrue(loginPageLabel_text.contains("Login"), "Label doesn't contains Login");
	  
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  
  }
  
  @Test(priority = 1, description = "Test Case to verify logout Page using 'Admin' user", groups = "LoginModule", dependsOnMethods = "loginAdminTest")
	public void logoutAdminTest() throws Exception
	{
	  Thread.sleep(2000);
	//verify page title "Altoro Home Page"
	//verify page label contain "Admin"
	  
	  String homePageTitle=w.getTitle();
	  WebElement homePageLabel=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1"));
	  String homePageLabel_Text=homePageLabel.getText();
	  WebElement SignOff_object=w.findElement(By.xpath("//*[text()='Sign Off']"));
	  
	  Assert.assertEquals(homePageTitle, "Altoro Mutual");
	  Assert.assertTrue(homePageLabel_Text.contains("Admin"), "Label doesn't contain 'Admin'");
	  Assert.assertTrue(SignOff_object.isDisplayed(), "SignOff Object not present on Home Page");
	  
	  w.findElement(By.linkText("Sign Off")).click();
	}
  
  

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
