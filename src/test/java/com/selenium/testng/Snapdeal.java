package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Snapdeal 
{WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test
  public void SD() throws Exception 
  {
	  w.get("https://www.google.com/");
	  Thread.sleep(2000);
	  w.findElement(By.name("q")).sendKeys("Snapdeal");
	  Thread.sleep(2000);
	  w.findElement(By.name("btnK")).click();
	  Thread.sleep(2000);
	  String PageTitle=w.getTitle();
	  WebElement RightPannelName=w.findElement(By.cssSelector("div.SPZz6b"));
	  String RightPannelName_Text=RightPannelName.getText();
	  w.findElement(By.linkText("Wikipedia")).click();
	  Thread.sleep(2000);
	  String WikiPageTitle=w.getTitle();
	  
	  Assert.assertEquals(PageTitle, "Snapdeal - Google Search");
	  Assert.assertTrue(RightPannelName_Text.contains("Snapdeal"), "Text doesn't contains 'Snapdeal'");
	  Assert.assertEquals(WikiPageTitle, "Snapdeal - Wikipedia");
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
