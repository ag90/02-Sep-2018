package com.seleniumdemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryfailedtestcases implements IRetryAnalyzer{
	
	int startcount=0;
	int retrycount=4;
	
	
	public boolean retry(ITestResult result){
		
		if(startcount<retrycount)
		{
			startcount++;
			
			return true;
		}
		
		return false;
		
	}

}
