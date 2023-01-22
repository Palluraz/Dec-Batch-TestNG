package com.itview.testacases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		w.get("https://www.amazon.in/");
		Thread.sleep(2000);
		w.findElement(By.id("glow-ingress-line1")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		w.findElement(By.id("GLUXZipUpdateInput")).sendKeys("411057");
		//Thread.sleep(2000);
		w.findElement(By.cssSelector("input.a-button-input")).click();
		Thread.sleep(2000);
		w.findElement(By.name("email")).sendKeys("pallavit68@gmail.com");
		Thread.sleep(2000);
		w.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys("Palluraz");
		w.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		w.findElement(By.name("field-keywords")).sendKeys("wow aloe vera gel");
		Thread.sleep(2000);
		w.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		w.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(2000);
		w.close();
		System.out.println("product successfully added to the cart");
	}

}
