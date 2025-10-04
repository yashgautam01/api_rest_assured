package com.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport {
	private static ExtentReports extent;
	public static ExtentReports getinstance() {
		if(extent == null) {
			String path = System.getProperty("user.dir")+"/Reports/report-extent.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setDocumentTitle("api automation report");
			reporter.config().setReportName("rest assured framework report");
			reporter.config().setTheme(Theme.STANDARD);
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("tester", "yash");
			extent.setSystemInfo("project", "api testing");
			
			
			
		}
		return extent;
	}
	
	
}
