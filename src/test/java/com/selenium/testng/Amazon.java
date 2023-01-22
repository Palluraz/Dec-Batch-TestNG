package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Amazon 
{ WebDriver w;
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test
  public void Amz() 
  {
	  w.get("https://www.amazon.in/");
	  String PageTitle=w.getTitle();
	  
	  w.findElement(By.linkText("Fresh")).click();
	  w.findElement(By.linkText("Fruits & Vegetables")).click();
	  String FruitsPageTitle=w.getTitle();
	  
	  Assert.assertTrue(PageTitle.contains("Online Shopping site"), "Page doesn't contain 'Online Shopping site'");
	  Assert.assertTrue(FruitsPageTitle.contains("Fruits & Vegetables"), "Page doesn't contain 'Fruits & Vegetables'");
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
