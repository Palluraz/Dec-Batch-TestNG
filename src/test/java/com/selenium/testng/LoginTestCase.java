package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTestCase 
{
	WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();//for starting chrome driver exe
		
	  
  }
  @Test
  public void f() 
  {
	  w=new ChromeDriver();
	//InterfaceName instance=new implementClass();
			
			
			w.get("https://altoromutual.com/login.jsp");
			
			
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
