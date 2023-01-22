package com.itview.testacases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeHrm_CSS 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		w.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		w.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		w.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		Thread.sleep(3000); // Pause my execution -> 3000 ms = 3 sec
		w.findElement(By.cssSelector("input.button")).click();
		w.close();
		System.out.println("login successful to orange hrm");
	}

}
                                                                                