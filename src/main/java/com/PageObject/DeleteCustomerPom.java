package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeleteCustomerPom {
	
	// attribute -- // tagname[@attributename='value']
	
	@FindBy(how=How.XPATH,using="//input[@name='cusid']")
	private WebElement txt_customerId;
	
	@FindBy(how=How.XPATH,using="//input[@name='submit']")
	private WebElement btn_submit;
	

	public WebElement getTxt_customerId() {
		return txt_customerId;
	}

	

	public WebElement getBtn_submit() {
		return btn_submit;
	}

	
	

}
