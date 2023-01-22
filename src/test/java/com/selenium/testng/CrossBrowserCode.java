package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class CrossBrowserCode 
{WebDriver w;

  @Test(priority=0,description="Validate on chrome")
  public void openGooglePageOnChrome() throws Exception 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
	  w.get("https://www.google.com/");
	  String PageTitle=w.getTitle();
	  Assert.assertEquals(PageTitle, "Google");
	  Thread.sleep(2000);
	  w.close();
  }
  @Test(priority=1,description="Validate on firefox")
  public void openGooglePageOnFirefox() throws Exception 
  {
	  WebDriverManager.firefoxdriver().setup();
	  w=new FirefoxDriver();
	  w.get("https://www.google.com/");
	  String PageTitle=w.getTitle();
	  Assert.assertEquals(PageTitle, "Google");
	  Thread.sleep(2000);
	  w.close();
  }
  
  
  

}
