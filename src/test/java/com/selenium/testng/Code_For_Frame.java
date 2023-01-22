package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Code_For_Frame 
{ WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test
  public void Frame() throws Exception 
  {
	  w.get("https://demo.automationtesting.in/Frames.html");
	  w.switchTo().frame("singleframe");
	  w.findElement(By.xpath("/html/body/section/div/div/div/input")).clear();
	  w.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
