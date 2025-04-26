
package com.basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public static String projectPath=System.getProperty("user.dir");

	public static WebDriver driver;

	@BeforeClass
//	@Parameters("browser")
	public void setUp() {
		switch ("chrome") {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("test failed");
			break;
		}

	//	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		
		try {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		} catch (NullPointerException e) {
			System.out.println("Driver is null cannot open the browser and launch the URL");
		}
//==========================================================
		
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		if (driver != null) {
			driver.quit();
		}

	}

}
