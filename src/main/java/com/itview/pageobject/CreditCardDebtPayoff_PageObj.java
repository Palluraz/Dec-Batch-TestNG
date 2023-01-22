package com.itview.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCardDebtPayoff_PageObj extends TestBase
{
	@FindBy(id="debtpayoff")
	public WebElement debtpayoff_TextBox;
	
	@FindBy(id="payment_plan_every_month")
	public WebElement payment_plan_every_month_TextBox;
	
	@FindBy(id="monthly_interest")
	public WebElement monthly_interest_TextBox;
	
	@FindBy(linkText="Submit")
	public WebElement Submit_Btn;
	
	@FindBy(id="total_payment")
	public WebElement total_payment_Value;
	
	@FindBy(id="wzrk-cancel")
	public WebElement No_Thanks_Msg;
	
	public void call_CreditCardDebtPayoff_PageObj()
	{
		PageFactory.initElements(w, this);
	}
}
