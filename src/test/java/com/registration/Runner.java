package com.registration;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Manager.Page_Object_Manager;
import com.Maven_Project.BaseClass;
import com.pomclass.Booking_Confirmation;
import com.pomclass.Booking_Page;
import com.pomclass.Login_Page;
import com.pomclass.Logout_Page;
import com.properties.File_Reader_Manager;

public class Runner extends BaseClass {

	public static WebDriver driver = launchBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException, InterruptedException {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceConR().getUrl();

		launchUrl(url);

		// launchUrl("https://adactinhotelapp.com/");

		// Login page:
		String username = File_Reader_Manager.getInstanceFRM().getInstanceConR().getUsername();

		passInput(pom.getInstanceLogin().getUsername(), username);
		// passInput(pom.getInstanceLogin().getUsername(), "surencrazy");

		String password = File_Reader_Manager.getInstanceFRM().getInstanceConR().getPassword();

		passInput(pom.getInstanceLogin().getPassword(), password);
		// passInput(pom.getInstanceLogin().getPassword(), "Suren@123$");

		String login = File_Reader_Manager.getInstanceFRM().getInstanceConR().getLogin();

		clickOnElement(pom.getInstanceLogin().getLogin());
		// clickOnElement(pom.getInstanceLogin().getLogin());

		screenShot("project.png");

		// Booking Page:

		Booking_Page bp = new Booking_Page(driver);

		int location = File_Reader_Manager.getInstanceFRM().getInstanceConR().getLocation();

		selectByIndex(pom.getInstanceBooking().getLocation(), location);
		// selectByIndex(pom.getInstanceBooking().getLocation(), 7);

		String hotels = File_Reader_Manager.getInstanceFRM().getInstanceConR().getHotels();

		selectByVisibleText(pom.getInstanceBooking().getHotels(), hotels);
		// selectByVisibleText(pom.getInstanceBooking().getHotels(), "Hotel Cornice");

		String room_Type = File_Reader_Manager.getInstanceFRM().getInstanceConR().getRoom_Type();

		selectByValue(pom.getInstanceBooking().getRoom_type(), room_Type);
		// selectByValue(pom.getInstanceBooking().getRoom_type(), "Super Deluxe");

		String room_Nos = File_Reader_Manager.getInstanceFRM().getInstanceConR().getRoom_Nos();

		selectByValue(pom.getInstanceBooking().getRoom_nos(), room_Nos);
		// selectByValue(pom.getInstanceBooking().getRoom_nos(), "6");

		String dateIn = File_Reader_Manager.getInstanceFRM().getInstanceConR().getDateIn();

		passInput(pom.getInstanceBooking().getDatein(), dateIn);
		// passInput(pom.getInstanceBooking().getDatein(), "25/08/2022");

		String dateOut = File_Reader_Manager.getInstanceFRM().getInstanceConR().getDateOut();

		passInput(pom.getInstanceBooking().getDateou(), dateOut);
		// passInput(pom.getInstanceBooking().getDateou(), "28/08/2022");

		String adult_Room = File_Reader_Manager.getInstanceFRM().getInstanceConR().getAdult_Room();

		selectByVisibleText(pom.getInstanceBooking().getAdultroom(), adult_Room);
		// selectByVisibleText(pom.getInstanceBooking().getAdultroom(), "3 - Three");

		String child_Room = File_Reader_Manager.getInstanceFRM().getInstanceConR().getChild_Room();

		selectByValue(pom.getInstanceBooking().getChildroom(), child_Room);
		// selectByValue(pom.getInstanceBooking().getChildroom(), "2");

		String submit = File_Reader_Manager.getInstanceFRM().getInstanceConR().getSubmit();

		clickOnElement(pom.getInstanceBooking().getSubmit());
		// clickOnElement(pom.getInstanceBooking().getSubmit());

		String radio = File_Reader_Manager.getInstanceFRM().getInstanceConR().getRadio();

		clickOnElement(pom.getInstanceBooking().getRadiobtn());
		// clickOnElement(pom.getInstanceBooking().getRadiobtn());

		String continue1 = File_Reader_Manager.getInstanceFRM().getInstanceConR().getContinue();

		clickOnElement(pom.getInstanceBooking().getContine());
		// clickOnElement(pom.getInstanceBooking().getContine());

		// screenShot("project0.png");

		// Booking Confirmation Page:

		Booking_Confirmation bc = new Booking_Confirmation(driver);

		String first_Name = File_Reader_Manager.getInstanceFRM().getInstanceConR().getFirst_Name();

		passInput(pom.getInstanceBooking_Confirmation().getFirst_name(), first_Name);
		// passInput(pom.getInstanceBooking_Confirmation().getFirst_name(),"Surendhar");
		// passInput(driver.findElement(By.id("first_name")), "Surendhar");

		String last_Name = File_Reader_Manager.getInstanceFRM().getInstanceConR().getLast_Name();
		
		passInput(pom.getInstanceBooking_Confirmation().getLast_name(), last_Name);
		//passInput(pom.getInstanceBooking_Confirmation().getLast_name(), "P");
		// passInput(driver.findElement(By.id("last_name")), "P");

		String address = File_Reader_Manager.getInstanceFRM().getInstanceConR().getAddress();
		
		passInput(pom.getInstanceBooking_Confirmation().getAddress(),address);
		//passInput(pom.getInstanceBooking_Confirmation().getAddress(),"6601 S SAN PEDRO LOS ANGELES CA 90003-1937. USA");
		// passInput(driver.findElement(By.id("address")), "6601 S SAN PEDRO LOS ANGELES
		// CA 90003-1937. USA");

		String cc_Num = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Num();
		
		passInput(pom.getInstanceBooking_Confirmation().getCc_num(), cc_Num);
		//passInput(pom.getInstanceBooking_Confirmation().getCc_num(), "1234-5425-2525-6666");
		// passInput(driver.findElement(By.id("cc_num")), "1234-5425-2525-6666");

		String cc_Type = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Type();
		
		selectByValue(pom.getInstanceBooking_Confirmation().getCc_type(), cc_Type);
		//selectByValue(pom.getInstanceBooking_Confirmation().getCc_type(), "MAST");
		// selectByValue(driver.findElement(By.id("cc_type")), "MAST");

		String cc_Exp_Month = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Exp_Month();
		
		selectByVisibleText(pom.getInstanceBooking_Confirmation().getCc_exp_month(), cc_Exp_Month);
		//selectByVisibleText(pom.getInstanceBooking_Confirmation().getCc_exp_month(), "September");
		// selectByVisibleText(driver.findElement(By.id("cc_exp_month")), "September");

		int cc_Exp_Year = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Exp_Year();
		
		selectByIndex(pom.getInstanceBooking_Confirmation().getCc_exp_year(), cc_Exp_Year);
		//selectByIndex(pom.getInstanceBooking_Confirmation().getCc_exp_year(), 12);
		// selectByIndex(driver.findElement(By.id("cc_exp_year")), 12);

		String cc_CVV = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_CVV();
		
		passInput(pom.getInstanceBooking_Confirmation().getCc_cvv(), cc_CVV);
		//passInput(pom.getInstanceBooking_Confirmation().getCc_cvv(), "678");
		// passInput(driver.findElement(By.id("cc_cvv")), "678");

		String book_Now = File_Reader_Manager.getInstanceFRM().getInstanceConR().getBook_Now();
		
		clickOnElement(pom.getInstanceBooking_Confirmation().getBook_now());
		//clickOnElement(pom.getInstanceBooking_Confirmation().getBook_now());
		// clickOnElement(driver.findElement(By.id("book_now")));

		screenShot("project1.png");

		Thread.sleep(5000);

		clickOnElement(pom.getInstanceBooking_Confirmation().getClickhere());

		// Logout Page:

		Logout_Page lo = new Logout_Page(driver);

		String check_Box = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCheck_Box();
		
		clickOnElement(pom.getInstanceLogout_Page().getCheckbox());
		// clickOnElement(driver.findElement(By.xpath("//input[@type='checkbox']")));

		String submit1 = File_Reader_Manager.getInstanceFRM().getInstanceConR().getSubmit1();
		
		clickOnElement(pom.getInstanceLogout_Page().getSubmit());
		// clickOnElement(driver.findElement(By.xpath("//input[@type='submit']")));

		
		String logout = File_Reader_Manager.getInstanceFRM().getInstanceConR().getLogout();
		
		clickOnElement(pom.getInstanceLogout_Page().getLogout());
		// clickOnElement(driver.findElement(By.id("logout")));

		screenShot("project2.png");

		Thread.sleep(3000);

		closeBrowser();

	}

}
