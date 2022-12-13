package com.TestNG.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void setProperty() {

		System.out.println("Set_Properties_Driver");
	}

	@BeforeTest
	public void browserLaunch() {

		System.out.println("Browser_Launch");

	}

	@BeforeClass

	public void urlLaunch() {

		System.out.println("Url_Launch");
	}

	@BeforeMethod

	public void signin() {

		System.out.println("Signin");
	}

	// ASCII
	@Test (priority =-1)
	public void flipkart() {

		System.out.println("Flip_Electronics");
	}

	@Test(priority = 0)
	public void amazon() {

		System.out.println("Amazon_A to Z");
	}

	@Test(invocationCount = 3)
	public void myntra() {

		System.out.println("Myntra_Dresses");
	}

	@Test(priority = 0)
	public void ajio() {

		System.out.println("Ajio_Materials");
	}

	@Test(priority = 0)
	public void trends() {

		System.out.println("Trends_Hardware");
	}

	@AfterMethod
	public void signout() {

		System.out.println("Signout");
	}

	@AfterClass
	public void screenshot() {

		System.out.println("Screenshot_Logout_Page");
	}

	@AfterTest
	public void closeBrowser() {

		System.out.println("Close_Browser");
	}

	@AfterSuite
	public void quitBrowser() {

		System.out.println("Quite_Browser");
	}

}
