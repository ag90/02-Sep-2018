package com.seleniumdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Mytransformer implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation anno,Class cllass,Constructor couns,Method met)
	{
		
		anno.setRetryAnalyzer(retryfailedtestcases.class);
	}


}
