package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Code_For_screenshot 
{ WebDriver w;
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
	  w.manage().window().maximize();
  }

  @Test
  public void Screenshot() 
  {
	  String ProjectPath=System.getProperty("user.dir"); // current project path return
	  System.out.println(ProjectPath);
	  String ScreenshotPath=
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
