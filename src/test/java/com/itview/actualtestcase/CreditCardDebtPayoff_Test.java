package com.itview.actualtestcase;

import org.testng.annotations.Test;

import com.itview.pageobject.CreditCardDebtPayoff_PageObj;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CreditCardDebtPayoff_Test 
{
	CreditCardDebtPayoff_PageObj CreditCard=new CreditCardDebtPayoff_PageObj();
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  CreditCard.OpenBrowser("chrome");
	  CreditCard.call_CreditCardDebtPayoff_PageObj();
  }
  
  @Test
  public void CreditCardDebtPayoff_Test1() throws Exception 
  {
	  CreditCard.openApplicationUrl("/credit-card-debt-payoff-calculator.html");
	  CreditCard.waitForSeconds(2);
	  CreditCard.clickEvent(CreditCard.No_Thanks_Msg);
	  CreditCard.pageScrollDown();
	  CreditCard.inputValueEvent(CreditCard.debtpayoff_TextBox, "80000");
	  CreditCard.inputValueEvent(CreditCard.payment_plan_every_month_TextBox, "30000");
	  CreditCard.inputValueEvent(CreditCard.monthly_interest_TextBox, "4.2");
	  CreditCard.clickEvent(CreditCard.Submit_Btn);
	  CreditCard.waitForSeconds(2);
	  System.out.println("Payment value is : " + CreditCard.total_payment_Value.getText());
  }

  @AfterTest
  public void afterTest() 
  {
	  
  }

}
