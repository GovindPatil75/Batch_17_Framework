package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObject.DeleteCustomerPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{

	@Test
	public void verify_tc_001_loginFunctinality() {
		System.out.println("Test case 001");
		
		DeleteCustomerPom deletecustomer=PageFactory.initElements(driver, DeleteCustomerPom.class);
		
		Library.custom_sendKeys(deletecustomer.getTxt_customerId(), excel.getStringTestData_Excel("Sheet2", 0, 1));
		Library.custom_click(deletecustomer.getBtn_submit());
		
		
		
		
	}
	
	
}
