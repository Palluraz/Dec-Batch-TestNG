package com.selenium.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assignment1_edge 
{WebDriver w;

  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.edgedriver().setup();
	  w=new EdgeDriver();
  }

  @Test
  public void Flight() throws Exception 
  {
	  w.get("http://blazedemo.com/");
	  String PageTitle=w.getTitle();
	  WebElement DepartCity=w.findElement(By.name("fromPort"));
	  Select sel=new Select(DepartCity);
	  sel.selectByVisibleText("Boston");
	  WebElement DestCity=w.findElement(By.name("toPort"));
	  Select sel1=new Select(DestCity);
	  sel1.selectByVisibleText("London");
	  w.findElement(By.cssSelector("input[type='submit']")).click();
	  WebElement PageLabel=w.findElement(By.xpath("/html/body/div[2]/h3"));
	  String PageLabelText=PageLabel.getText();
	  w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
	  String PageTitle1=w.getTitle();
	  WebElement PageLabel1=w.findElement(By.xpath("/html/body/div[2]/h2"));
	  String PageLabel1Text=PageLabel1.getText();
	  w.findElement(By.id("inputName")).sendKeys("Jones Pence");
	  w.findElement(By.name("address")).sendKeys("Observatory Circle, U.S");
	  w.findElement(By.id("city")).sendKeys("Phoenix");
	  w.findElement(By.id("state")).sendKeys("Arizona (AZ)");
	  w.findElement(By.id("zipCode")).sendKeys("85001");
	  WebElement CardType=w.findElement(By.id("cardType"));
	  Select sel2=new Select(CardType);
	  sel2.selectByVisibleText("American Express");
	  w.findElement(By.id("creditCardNumber")).sendKeys("12345678");
	  w.findElement(By.id("creditCardMonth")).sendKeys("12");
	  w.findElement(By.id("creditCardYear")).sendKeys("2018");
	  w.findElement(By.id("nameOnCard")).sendKeys("Jones Pence");
	  w.findElement(By.name("rememberMe")).click();
	  w.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
	  String PageTitle2=w.getTitle();
	  
	  Assert.assertEquals(PageTitle, "BlazeDemo");
	  Assert.assertEquals(PageLabelText, "Flights from Boston to London:");
	  Assert.assertEquals(PageTitle1, "BlazeDemo Purchase");
	  Assert.assertEquals(PageLabel1Text, "Your flight from TLV to SFO has been reserved.");
	  Assert.assertEquals(PageTitle2, "BlazeDemo Confirmation");
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() 
  {
	  w.close();
  }

}
