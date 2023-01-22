package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Hospital 
{WebDriver w;
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  @Test
  public void HospitalPageLogin() 
  {
	  w.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  w.get("http://hospitalnew.bdtask.com/demo6/login");
	  WebElement Label=w.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/h3"));
	  String LabelText=Label.getText();
	  w.findElement(By.name("email")).sendKeys("admin@demo.com");
	  w.findElement(By.id("password")).sendKeys("12345");
	  WebElement RoleList=w.findElement(By.name("user_role"));
	  Select sel=new Select(RoleList);
	  sel.selectByVisibleText("Admin");
	  w.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[4]/button")).click();
	  w.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/a/i")).click();
	  w.findElement(By.xpath("/html/body/div[3]/header/nav/div/ul/li/ul/li[3]/a")).click();
	  
	  Assert.assertEquals(LabelText, "Demo Hospital Limited");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
