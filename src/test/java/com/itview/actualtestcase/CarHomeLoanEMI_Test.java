package com.itview.actualtestcase;

import org.testng.annotations.Test;

import com.itview.pageobject.CarHomeLoanEMI_PageObj;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CarHomeLoanEMI_Test 
{
	CarHomeLoanEMI_PageObj CarHomeLoan=new CarHomeLoanEMI_PageObj();
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  CarHomeLoan.OpenBrowser("chrome");
	  CarHomeLoan.call_CarHomeLoanEMI_PageObj();
  }
  @Test
  public void CarHomeLoanEMI_Test1() throws Exception 
  {
	  CarHomeLoan.openApplicationUrl("/emi-calculator.html");
	  CarHomeLoan.waitForSeconds(2);
	  CarHomeLoan.clickEvent(CarHomeLoan.no_Thanks_Messsage);
	  CarHomeLoan.waitForSeconds(2);
	  CarHomeLoan.pageScrollDown();
	  CarHomeLoan.inputValueEvent(CarHomeLoan.carhome_loan_TextBox, "400000");
	  CarHomeLoan.inputValueEvent(CarHomeLoan.loan_period_TextBox, "10");
	  CarHomeLoan.HandleDropdownList(CarHomeLoan.emi_start_from_DropDown, "At the time of loan disbursement");
	  CarHomeLoan.inputValueEvent(CarHomeLoan.interest_rate_TextBox, "7");
	  CarHomeLoan.inputValueEvent(CarHomeLoan.upfront_charges_TextBox, "1000");
	  CarHomeLoan.clickEvent(CarHomeLoan.Submit_Button);
	  CarHomeLoan.waitForSeconds(2);
	  System.out.println("EMI value is : " +CarHomeLoan.emi_Value.getText()  );
  }

  @AfterTest
  public void afterTest() 
  {
	  CarHomeLoan.closebrowser();
  }

}
