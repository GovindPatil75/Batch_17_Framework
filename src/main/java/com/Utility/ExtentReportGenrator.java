package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

    public static ExtentReports extent;	
	public static ExtentReports getReports() {
		
		String ReportPath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_17_Framework\\ReportTest\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(ReportPath);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Batch 17 Framework Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name ", "ABC project");
		extent.setSystemInfo("Automation Tool", "Selenium WebDriver");
		extent.setSystemInfo("O.S.", "Windows 10");
		extent.setSystemInfo("Browser Name", "Chrome");
		return extent;
		
		
	}
}
