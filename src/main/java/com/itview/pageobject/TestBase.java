package com.itview.pageobject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase 
{
	WebDriver w;
	String baseURL="https://www.moneycontrol.com/personal-finance/tools";
	public void OpenBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			w=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			w=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
			w=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser not present / Installed in System !!!");
		}
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void closebrowser()
	{
		w.close();
	}
	public void openApplicationUrl(String WebPage)
	{
		w.get(baseURL+WebPage);
	}
	public void inputValueEvent(WebElement we,String value)
	{
		we.clear();
		we.sendKeys(value);
	}
	public void clickEvent(WebElement we)
	{
		we.click();
	}
	public void HandleDropdownList(WebElement we,String value )
	{
		Select sel=new Select(we);
		sel.selectByVisibleText(value);
	}
	public void HandleAlertEvent()
	{
		try
		{
			w.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			System.out.println("No Alert!!");
		}
		
	}
	public String ReturnPageTitleValue()
	{
		return w.getTitle();
	}
	public void waitForSeconds(int sec) throws Exception
	{
		Thread.sleep(sec * 1000);
	}
	public void pageScrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0,300)");
	}
}
