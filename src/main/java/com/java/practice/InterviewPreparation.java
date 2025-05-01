package com.java.practice;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.basePackage.Base;

public class InterviewPreparation extends Base {
	@Test
	public void test() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
				
		
		File dest = new File(projectPath+"\\Screenshots\\image.png");
		
		FileHandler.copy(src, dest);
		
		
	}
	
	}
