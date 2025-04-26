package com.java.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.basePackage.Base;

import coreLogic.DifferentWaits;

public class InterviewPreparation extends Base {
	@Test
	public static void takeScreenshots() throws IOException {
		DifferentWaits.explicitWait("//img[@alt='company-branding']");
	WebElement image=driver.findElement(By.xpath("//img[@alt='company-branding']"));
	
//	TakesScreenshot ts = (TakesScreenshot)driver;
	File src=image.getScreenshotAs(OutputType.FILE);
	File dest=new File(projectPath+"\\Screenshots\\image1.png");
	FileHandler.copy(src, dest);
	
	
	
		
	}

}
