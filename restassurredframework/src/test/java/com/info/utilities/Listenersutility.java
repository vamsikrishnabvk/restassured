package com.info.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Listenersutility implements ITestListener {
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentHtmlReporter htmlreport;
	 public void onTestStart(ITestResult result) {
		 htmlreport=new ExtentHtmlReporter(System.getProperty("D:\\java\\restassurredframework\\reports"));
		 htmlreport.config().setDocumentTitle("restassuredautomationframework");
		 
	        System.out.println("New Test Started" + result.getName());
	    }
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Successfully Finished" + result.getName());
	    }
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed" + result.getName());
	    }
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped" + result.getName());
	    }
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        System.out.println("Test Failed but within success percentage" + result.getName());
	    }
	    public void onStart(ITestContext context) {
	        System.out.println("This is onStart method" + context.getOutputDirectory());
	    }
	    public void onFinish(ITestContext context) {
	        System.out.println("This is onFinish method" + context.getPassedTests());
	        System.out.println("This is onFinish method" + context.getFailedTests());
	    }
	    

}
