package com.itview.actualtestcase;

import org.testng.annotations.Test;

import com.itview.pageobject.EducationLoanEMI_PageObj;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EducationLoanEMI_Test
{	EducationLoanEMI_PageObj EducationLoanEMI=new EducationLoanEMI_PageObj();
 
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  EducationLoanEMI.OpenBrowser("chrome");
	  EducationLoanEMI.call_EducationLoanEMI_PageObj();
  }
  
  @Test
  public void EducationLoanEMI() throws Exception 
  {
	  EducationLoanEMI.openApplicationUrl("/education-loan-emi-calculator.html");
	  EducationLoanEMI.waitForSeconds(2);
	  EducationLoanEMI.clickEvent(EducationLoanEMI.no_Thanks_Messsage);
	  EducationLoanEMI.pageScrollDown();
	  EducationLoanEMI.inputValueEvent(EducationLoanEMI.educ_loan_TextBox, "10000");
	  EducationLoanEMI.inputValueEvent(EducationLoanEMI.interest_rate_TextBox, "23");
	  EducationLoanEMI.inputValueEvent(EducationLoanEMI.loan_period_TextBox, "10");
	  EducationLoanEMI.inputValueEvent(EducationLoanEMI.emi_start_from_TextBox, "13");
	  EducationLoanEMI.clickEvent(EducationLoanEMI.Submit_btn);
	  EducationLoanEMI.waitForSeconds(2);
	  System.out.println("EMI value is:"+ EducationLoanEMI.emi_Value.getText());
  }

  @AfterTest
  public void afterTest() 
  {
	  EducationLoanEMI.closebrowser();
  }

}
