package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utility.BaseClass;

public class Test2 extends BaseClass{
	
	
	
	@Test
	public void verify_tc_002_loginFunctinality() {
		System.out.println("Test case 002");
		
		String data=excel.getStringTestData_Excel("Sheet2", 0, 2);
	
	System.out.println(data);
	
	}

}
