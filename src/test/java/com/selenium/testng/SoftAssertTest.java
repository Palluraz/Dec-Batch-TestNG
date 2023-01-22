package com.selenium.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertTest 
{
	WebDriver w;
	SoftAssert sft;
  
  @BeforeTest
  public void beforeTest_MutualFund() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }

  @Test(priority=0, description="Test Case to verify login Page using 'Admin' user",groups = "LoginModule")
  public void loginAdminTest() 
  {
	  sft=new SoftAssert();
	  w.get("http://altoromutual.com:8080/login.jsp");
	  String loginPageTitle=w.getTitle();
	  String loginPageUrl=w.getCurrentUrl();
	  WebElement loginPageLabel=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1"));
	  String loginPageLabel_text=loginPageLabel.getText();
	  
	  sft.assertEquals(loginPageTitle, "Altoro Mutual");
	  sft.assertTrue(loginPageUrl.contains("/login.jsp"), "page doesn't contains '/login.jsp'");
	  sft.assertEquals(loginPageLabel_text, "Online Banking Login");
	  
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  
	  sft.assertAll();
  }
  
  @Test(priority=1, description="Test Case to verify logout Page using 'Admin' user",groups = "LoginModule")
  public void logoutAdminTest() throws Exception
  {
	  Thread.sleep(2000);
		//verify page title "Altoro Home Page"
		//verify page label contain "Admin"
	  
	  String logoutPageTitle=w.getTitle();
	  WebElement logoutPageLabel=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1"));
	  String logoutPageLabel_Text=logoutPageLabel.getText();
	  WebElement SignOff_Object=w.findElement(By.xpath("//*[text()='Sign Off']"));
	  
	  sft.assertEquals(logoutPageTitle, "Altoro Mutual");
	  sft.assertTrue(logoutPageLabel_Text.contains("Admin"), "Label doesn't contain 'Admin'");
	  sft.assertTrue(SignOff_Object.isDisplayed(), "SignOff Object not present on Home Page");
	  w.findElement(By.linkText("Sign Off")).click();

	  sft.assertAll();
  }
  
  @AfterTest
  public void afterTest_MutualFund() 
  {
	  w.close();
  }

}
