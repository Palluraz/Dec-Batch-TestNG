package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Code_For_Windowsize 
{ WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }

  @Test
  public void WindowSize() throws Exception 
  {
	  w.get("https://www.google.co.in/");
	  Thread.sleep(3000);
	  w.manage().window().maximize();
	 // w.manage().window().fullscreen();
	  //set window size (parameter--> width,height)
	 // Dimension d=new Dimension(1600,1200);
	//  w.manage().window().setSize(d);
  }
  
  @AfterTest
  public void afterTest() 
  {
	  //w.quit();
  }

}
