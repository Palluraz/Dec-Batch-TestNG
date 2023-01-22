package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTestCase_multiple 
{
	WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  w=new ChromeDriver();
  }
  
  @Test(priority = 0,description = "Test Case to verify login using 'Admin' user",groups="LoginModule")
  public void loginAdminTest() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	     w.findElement(By.id("uid")).sendKeys("admin");
	     w.findElement(By.id("passw")).sendKeys("admin");
	     w.findElement(By.name("btnSubmit")).click();
	     w.findElement(By.linkText("Sign Off")).click();
  }
  @Test(priority = 1,description = "Test Case to verify login using 'TestUser' user",dependsOnMethods="loginAdminTest",groups="LoginModule",invocationCount = 3,enabled=false)
  public void loginTuserTest() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	     w.findElement(By.id("uid")).sendKeys("admin");
	     w.findElement(By.id("passw")).sendKeys("admin");
	     w.findElement(By.name("btnSubmit")).click();
	     w.findElement(By.linkText("Sign Off")).click();
	  
  }
  @Test(priority = 1,description = "Test Case to verify login using 'TestUser' user",dependsOnMethods="loginAdminTest",groups="LoginModule",invocationCount = 3,enabled=false)
  public void loginInvalidUser() 
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	     w.findElement(By.id("uid")).sendKeys("admin");
	     w.findElement(By.id("passw")).sendKeys("admin");
	     w.findElement(By.name("btnSubmit")).click();
	     w.findElement(By.linkText("Sign Off")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
