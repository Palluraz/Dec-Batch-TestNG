package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_WebObjectCode 
{
 WebDriver w;
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
  }
  
  @Test(priority=0, description="Handle textbox and textArea field")
  public void handleTextBox() 
  {
	  w.get("http://demo.automationtesting.in/Register.html");
	  
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Jones");
	  
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Smith");
	  
	  //TextArea
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("1001/ B-1 , Sample Address");
  }
  
  @Test(priority = 1, description = "Handle radiobutton and checkbox field")
  public void handleRadioButton_Checkbox() throws Exception
  {
	  w.findElement(By.cssSelector("input[value='FeMale']")).click();
	  w.findElement(By.id("checkbox1")).click();
	  Thread.sleep(1000);
	  w.findElement(By.id("checkbox3")).click();
  }
  
  @Test(priority = 2, description = "Handle drop-down list")
  public void handleDropDownList()
  {
	  WebElement SkillDropDown=w.findElement(By.id("Skills"));
	  Select sel=new Select(SkillDropDown);
	  //sel.selectByIndex(5);
	  //sel.selectByValue("Analytics");
	  sel.selectByVisibleText("C");
  }


}
