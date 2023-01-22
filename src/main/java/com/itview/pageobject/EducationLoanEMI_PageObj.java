package com.itview.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationLoanEMI_PageObj extends TestBase
{
	@FindBy(id="educ_loan")
	public WebElement educ_loan_TextBox;
	
	@FindBy(id="interest_rate")
	public WebElement interest_rate_TextBox;
	
	@FindBy(id="loan_period")
	public WebElement loan_period_TextBox;
	
	@FindBy(id="emi_start_from")
	public WebElement emi_start_from_TextBox;
	
	@FindBy(linkText="Submit")
	public WebElement Submit_btn;
	
	@FindBy(id="emi")
	public WebElement emi_Value;
	
	@FindBy(id="wzrk-cancel")
	public WebElement no_Thanks_Messsage;
	
	public void call_EducationLoanEMI_PageObj()
	{
		PageFactory.initElements(w, this);
	}
}
