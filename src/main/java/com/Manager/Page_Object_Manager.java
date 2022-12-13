package com.Manager;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booking_Confirmation;
import com.pomclass.Booking_Page;
import com.pomclass.Login_Page;
import com.pomclass.Logout_Page;

public class Page_Object_Manager {

	public WebDriver driver;

	// private classname objectname;
	private Login_Page lp;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Login_Page getInstanceLogin() {

		if (lp == null) {

			lp = new Login_Page(driver);
		}

		return lp;

	}

	private Booking_Page bp;

	public Booking_Page getInstanceBooking() {

		if (bp == null) {

			bp = new Booking_Page(driver);
		}

		return bp;

	}

	private Booking_Confirmation bc;

	public Booking_Confirmation getInstanceBooking_Confirmation() {

		if (bc == null) {

			bc = new Booking_Confirmation(driver);
		}

		return bc;

	}

	private Logout_Page lo;

	public Logout_Page getInstanceLogout_Page() {

		if (lo == null) {

			lo = new Logout_Page(driver);

		}

		return lo;

	}

}
