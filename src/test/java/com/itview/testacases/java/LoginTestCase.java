package com.itview.testacases.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase 
{

	public static void main(String[] args) 
	{
		//InterfaceName instance=new implementClass();
		WebDriverManager.chromedriver().setup();//for starting chrome driver exe
		WebDriver w=new ChromeDriver();  //open blank browser  -->chrome
		
		//step1:open application with url
		w.get("https://altoromutual.com/login.jsp");
		
		//step2:enter username
		w.findElement(By.id("uid")).sendKeys("admin");
		
		//step3:enter password
		w.findElement(By.id("passw")).sendKeys("admin");
		
		//step4:click login
		w.findElement(By.name("btnSubmit")).click();
		
		//step5:click logout
		w.findElement(By.linkText("Sign Off")).click();
		
		//step 6:close
		w.close();
		System.out.println("Admin test case passed!!");
	}

}
