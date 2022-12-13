package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\newchromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");

			driver = new FirefoxDriver();

			driver.manage().window().maximize();
		}

		return driver;
	}

	public static void launchUrl(String Url) {

		driver.get(Url);
	}

	public static void passInput(WebElement element, String input) {

		element.sendKeys(input);
	}

	public static void clickOnElement(WebElement element) {

		element.click();
	}

	public static void selectByValue(WebElement element, String Value) {

		Select s = new Select(element);
		s.selectByValue(Value);
	}

	public static void selectByIndex(WebElement element, int number) {

		Select s = new Select(element);
		s.selectByIndex(number);
	}

	public static void selectByVisibleText(WebElement element, String VisibleText) {

		Select s = new Select(element);
		s.selectByVisibleText(VisibleText);
	}

	public static void screenShot(String picture) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destinationAs = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\Driver\\" + picture);
		FileUtils.copyFile(screenshotAs, destinationAs);
	}

	public static void closeBrowser() {

		driver.close();
	}

	public static void terminateBrowser() {

		driver.quit();
	}
}