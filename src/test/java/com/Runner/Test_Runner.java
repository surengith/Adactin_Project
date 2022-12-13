package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Maven_Project.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\", glue = "com.Stepdefinition", plugin = {"html:Adactin Report.html"})
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.launchBrowser("Chrome");
	}

	@AfterClass
	public static void tearDown() {

		BaseClass.closeBrowser();
	}
}