package com.itview.testacases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Facebook 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		Thread.sleep(2000);
		w.findElement(By.name("email")).sendKeys("pallavit68@gmail.com");
		w.findElement(By.id("pass")).sendKeys("Palluraz");
		w.findElement(By.name("login")).click();
		//w.findElement(By.linkText("Allow")).click();
		//w.get("chrome://settings/content/siteDetails?site=https%3A%2F%2Fwww.facebook.com");
		//w.findElement(By.id("permission")).sendKeys("Allow");
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"mount_0_0_xN\"]/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")).click();
		Thread.sleep(2000);
		w.close();
		System.out.println("Facebook login successful");
	}

}
