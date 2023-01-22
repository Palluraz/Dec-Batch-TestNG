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

public class Insurance 
{ WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test
  public void Policy() 
  {
	  w.get("https://www.policyx.com/");
	  WebElement PageLabel=w.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div[1]/h1"));
	  String PageLabel_Text=PageLabel.getText();
	  String PageTitle=w.getTitle();
	  w.findElement(By.linkText("Claim")).click();
	  WebElement ClaimPageLabel=w.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/h1"));
	  String ClaimPageLabel_Text=ClaimPageLabel.getText();
	  String ClaimPageTitle=w.getTitle();
	  
	  Assert.assertEquals(PageLabel_Text, "India's Most Trusted Insurance Portal");
	  Assert.assertTrue(PageTitle.contains("Insurance"), "page doesn't contains 'Insurance' text");
	  Assert.assertEquals(ClaimPageLabel_Text, "CLAIM ASSISTANCE");
	  Assert.assertTrue(ClaimPageTitle.contains("Claim Process"), "page doesn't contain 'Claim Process'");
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
