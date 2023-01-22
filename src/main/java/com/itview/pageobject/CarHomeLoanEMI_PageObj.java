package com.itview.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarHomeLoanEMI_PageObj extends TestBase 
{
	@FindBy(id="carhome_loan")
	public WebElement carhome_loan_TextBox;
	
	@FindBy(id="loan_period")
	public WebElement loan_period_TextBox;
	
	@FindBy(css="select.custselect")
	public WebElement emi_start_from_DropDown;
	
	@FindBy(id="interest_rate")
	public WebElement interest_rate_TextBox;
	
	@FindBy(id="upfront_charges")
	public WebElement upfront_charges_TextBox;
	
	@FindBy(linkText="Submit")
	public WebElement Submit_Button;
	
	@FindBy(id="wzrk-cancel")
	public WebElement no_Thanks_Messsage;
	
	@FindBy(id="emi")
	public WebElement emi_Value;
	
	public void call_CarHomeLoanEMI_PageObj()
	{
		PageFactory.initElements(w, this);
	}
}
