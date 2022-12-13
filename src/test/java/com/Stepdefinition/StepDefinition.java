package com.Stepdefinition;

import org.openqa.selenium.WebDriver;
import com.Manager.Page_Object_Manager;
import com.Maven_Project.BaseClass;
import com.Runner.Test_Runner;
import com.properties.File_Reader_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends BaseClass {
	
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceConR().getUrl();

		launchUrl(url);

	}

	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {

		passInput(pom.getInstanceLogin().getUsername(), username);

	}

//	@When("^user Enter The Username In The Username Field$")
//	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
//
//		// String username =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getUsername();
//
//		passInput(pom.getInstanceLogin().getUsername(), "surencrazy");
//	}

	@When("^user Enter The \"([^\"]*)\" In The Password Field$")

	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {

		passInput(pom.getInstanceLogin().getPassword(), password);

	}

//	@When("^user Enter The Password In The Password Field$")
//	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
//
//		// String password =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getPassword();
//
//		passInput(pom.getInstanceLogin().getPassword(), "Suren@123$");
//	}

	@Then("^user Click The Search \"([^\"]*)\" And It Will Navigates To Select Hotel Page$")
	public void user_Click_The_Search_And_It_Will_Navigates_To_Select_Hotel_Page(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}

//	@Then("^user Click The Login Button And It Will Navigates To Search Hotel Page$")
//	public void user_Click_The_Login_Button_And_It_Will_Navigates_To_Search_Hotel_Page() throws Throwable {
//
//		String login = File_Reader_Manager.getInstanceFRM().getInstanceConR().getLogin();
//
//		clickOnElement(pom.getInstanceLogin().getLogin());
//
//	}

	@When("^user Select The \"([^\"]*)\" In The Location Field$")
	public void user_Select_The_In_The_Location_Field(int Location) throws Throwable {
		selectByIndex(pom.getInstanceBooking().getLocation(), Location);
	}

//	@When("^user Select The Location In The Location Field$")
//	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {
//
//		// int location =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getLocation();
//
//		selectByIndex(pom.getInstanceBooking().getLocation(), 7);
//	}

	@When("^user Select The \"([^\"]*)\" In The Hotels Field$")
	public void user_Select_The_In_The_Hotels_Field(String HotelP_Field) throws Throwable {
		selectByVisibleText(pom.getInstanceBooking().getHotels(), HotelP_Field);
	}

//	@When("^user Select The Hotels In The Hotels Field$")
//	public void user_Select_The_Hotels_In_The_Hotels_Field() throws Throwable {
//
//		// String hotels =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getHotels();
//
//		selectByVisibleText(pom.getInstanceBooking().getHotels(), "Hotel Cornice");
//	}

	@When("^user Select The \"([^\"]*)\" In The Room Type Field$")
	public void user_Select_The_In_The_Room_Type_Field(String Room_Type) throws Throwable {
		selectByValue(pom.getInstanceBooking().getRoom_type(), Room_Type);
	}

//	@When("^user Select The Room Type In The Room Type Field$")
//	public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
//
//		// String room_Type =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getRoom_Type();
//
//		selectByValue(pom.getInstanceBooking().getRoom_type(), "Super Deluxe");
//	}

	@When("^user Select The \"([^\"]*)\" In The Room Nos Field$")
	public void user_Select_The_In_The_Room_Nos_Field(String Room_Nos) throws Throwable {
		selectByValue(pom.getInstanceBooking().getRoom_nos(), Room_Nos);
	}

//	@When("^user Select The Room Nos In The Room Nos Field$")
//	public void user_Select_The_Room_Nos_In_The_Room_Nos_Field() throws Throwable {
//
//		// String room_Nos =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getRoom_Nos();
//
//		selectByValue(pom.getInstanceBooking().getRoom_nos(), "6");
//	}

	@When("^user Select The \"([^\"]*)\" In The Date Pickin Field$")
	public void user_Select_The_In_The_Date_Pickin_Field(String Date_Pickin) throws Throwable {
		passInput(pom.getInstanceBooking().getDatein(), Date_Pickin);
	}

//	@When("^user Select The Date Pickin In The Date Pickin Field$")
//	public void user_Select_The_Date_Pickin_In_The_Date_Pickin_Field() throws Throwable {
//
//		// String dateIn =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getDateIn();
//
//		passInput(pom.getInstanceBooking().getDatein(), "25/08/2022");
//	}

	@When("^user Select The \"([^\"]*)\" In The Date Pickout Field$")
	public void user_Select_The_In_The_Date_Pickout_Field(String Date_Pickout) throws Throwable {
		passInput(pom.getInstanceBooking().getDateou(), Date_Pickout);
	}

//	@When("^user Select The Date Pickout In The Date Pickout Field$")
//	public void user_Select_The_Date_Pickout_In_The_Date_Pickout_Field() throws Throwable {
//
//		// String dateOut =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getDateOut();
//
//		passInput(pom.getInstanceBooking().getDateou(), "28/08/2022");
//	}

	@When("^user Select The \"([^\"]*)\" In The Adult Room Field$")
	public void user_Select_The_In_The_Adult_Room_Field(String Adult_Room) throws Throwable {
		selectByVisibleText(pom.getInstanceBooking().getAdultroom(), Adult_Room);
	}

//	@When("^user Select The Adult Room In The Adult Room Field$")
//	public void user_Select_The_Adult_Room_In_The_Adult_Room_Field() throws Throwable {
//
//		// String adult_Room =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getAdult_Room();
//
//		selectByVisibleText(pom.getInstanceBooking().getAdultroom(), "3 - Three");
//	}

	@When("^user Select The \"([^\"]*)\" In The Child Room Field$")
	public void user_Select_The_In_The_Child_Room_Field(String Child_Room) throws Throwable {
		selectByValue(pom.getInstanceBooking().getChildroom(), Child_Room);
	}

//	@When("^user Select The Child Room In The Child Room Field$")
//	public void user_Select_The_Child_Room_In_The_Child_Room_Field() throws Throwable {
//
//		// String child_Room =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getChild_Room();
//
//		selectByValue(pom.getInstanceBooking().getChildroom(), "2");
//	}

	@Then("^user Click The \"([^\"]*)\" And It Will Navigates To Search Hotel Page$")
	public void user_Click_The_And_It_Will_Navigates_To_Search_Hotel_Page(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceBooking().getSubmit());
	}

//	@Then("^user Click The Search Button And It Will Navigates To Select Hotel Page$")
//	public void user_Click_The_Search_Button_And_It_Will_Navigates_To_Select_Hotel_Page() throws Throwable {
//
//		String submit = File_Reader_Manager.getInstanceFRM().getInstanceConR().getSubmit();
//
//		clickOnElement(pom.getInstanceBooking().getSubmit());
//	}

	@When("^user Click The Radio \"([^\"]*)\" To Select The Hotel$")
	public void user_Click_The_Radio_To_Select_The_Hotel(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceBooking().getRadiobtn());
	}

//	@When("^user Click The Radio Button To Select The Hotel$")
//	public void user_Click_The_Radio_Button_To_Select_The_Hotel() throws Throwable {
//
//		String radio = File_Reader_Manager.getInstanceFRM().getInstanceConR().getRadio();
//
//		clickOnElement(pom.getInstanceBooking().getRadiobtn());
//	}

	@Then("^user Click The Continue \"([^\"]*)\" It Will Navigates To Booking Confirmation Page$")
	public void user_Click_The_Continue_It_Will_Navigates_To_Booking_Confirmation_Page(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceBooking().getContine());
	}

//	@Then("^user Click The Continue Button It Will Navigates To Booking Confirmation Page$")
//	public void user_Click_The_Continue_Button_It_Will_Navigates_To_Booking_Confirmation_Page() throws Throwable {
//
//		String continue1 = File_Reader_Manager.getInstanceFRM().getInstanceConR().getContinue();
//
//		clickOnElement(pom.getInstanceBooking().getContine());
//	}

	@When("^user Enter The \"([^\"]*)\" In The Firstname Field$")
	public void user_Enter_The_In_The_Firstname_Field(String arg1) throws Throwable {
		passInput(pom.getInstanceBooking_Confirmation().getFirst_name(), "Surendhar");
	}

//	@When("^user Enter The Firstname In The Firstname Field$")
//	public void user_Enter_The_Firstname_In_The_Firstname_Field() throws Throwable {
//
//		// String first_Name =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getFirst_Name();
//
//		passInput(pom.getInstanceBooking_Confirmation().getFirst_name(), "Surendhar");
//	}

	@When("^user Enter The \"([^\"]*)\" In The Lastname Field$")
	public void user_Enter_The_In_The_Lastname_Field(String arg1) throws Throwable {
		passInput(pom.getInstanceBooking_Confirmation().getLast_name(), "P");
	}

//	@When("^user Enter The Lastname In The Lastname Field$")
//	public void user_Enter_The_Lastname_In_The_Lastname_Field() throws Throwable {
//
//		// String last_Name =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getLast_Name();
//
//		passInput(pom.getInstanceBooking_Confirmation().getLast_name(), "P");
//	}

	@When("^user Enter The \"([^\"]*)\" In The Address Field$")
	public void user_Enter_The_In_The_Address_Field(String arg1) throws Throwable {
		passInput(pom.getInstanceBooking_Confirmation().getAddress(),"6601 S SAN PEDRO LOS ANGELES CA 90003-1937. USA");
	}
//	@When("^user Enter The Address In The Address Field$")
//	public void user_Enter_The_Address_In_The_Address_Field() throws Throwable {
//
//		// String address =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getAddress();
//
//		passInput(pom.getInstanceBooking_Confirmation().getAddress(),
//				"6601 S SAN PEDRO LOS ANGELES CA 90003-1937. USA");
//	}

	@When("^user Enter The \"([^\"]*)\" In The CC Number Field$")
	public void user_Enter_The_In_The_CC_Number_Field(String arg1) throws Throwable {
		passInput(pom.getInstanceBooking_Confirmation().getCc_num(), "1234-5425-2525-6666");
	}

//	@When("^user Enter The CC Number In The CC Number Field$")
//	public void user_Enter_The_CC_Number_In_The_CC_Number_Field() throws Throwable {
//
//		// String cc_Num =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Num();
//
//		passInput(pom.getInstanceBooking_Confirmation().getCc_num(), "1234-5425-2525-6666");
//	}

	@When("^user Select The \"([^\"]*)\" In The CC Type Field$")
	public void user_Select_The_In_The_CC_Type_Field(String arg1) throws Throwable {
		selectByValue(pom.getInstanceBooking_Confirmation().getCc_type(), "MAST");
	}
//	@When("^user Select The CC Type In The CC Type Field$")
//	public void user_Select_The_CC_Type_In_The_CC_Type_Field() throws Throwable {
//
//		// String cc_Type =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Type();
//
//		selectByValue(pom.getInstanceBooking_Confirmation().getCc_type(), "MAST");
//	}

	@When("^user Select The \"([^\"]*)\" In The Expire Date Field$")
	public void user_Select_The_In_The_Expire_Date_Field(String arg1) throws Throwable {
		selectByVisibleText(pom.getInstanceBooking_Confirmation().getCc_exp_month(), "September");
	}

//	@When("^user Select The Expire Date In The Expire Date Field$")
//	public void user_Select_The_Expire_Date_In_The_Expire_Date_Field() throws Throwable {
//
//		// String cc_Exp_Month =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Exp_Month();
//
//		selectByVisibleText(pom.getInstanceBooking_Confirmation().getCc_exp_month(), "September");
//
//	}

	@When("^user Select The \"([^\"]*)\" In The Expire Year Field$")
	public void user_Select_The_In_The_Expire_Year_Field(String arg1) throws Throwable {
		selectByIndex(pom.getInstanceBooking_Confirmation().getCc_exp_year(), 12);
	}

//	@When("^user Select The Expire Year In The Expire Year Field$")
//	public void user_Select_The_Expire_Year_In_The_Expire_Year_Field() throws Throwable {
//
//		// int cc_Exp_Year =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_Exp_Year();
//
//		selectByIndex(pom.getInstanceBooking_Confirmation().getCc_exp_year(), 12);
//	}

	@When("^user Enter The \"([^\"]*)\" In The CVV Number Field$")
	public void user_Enter_The_In_The_CVV_Number_Field(String arg1) throws Throwable {
		passInput(pom.getInstanceBooking_Confirmation().getCc_cvv(), "678");
	}

//	@When("^user Enter The CVV Number In The CVV Number Field$")
//	public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
//		// String cc_CVV =
//		// File_Reader_Manager.getInstanceFRM().getInstanceConR().getCC_CVV();
//
//		passInput(pom.getInstanceBooking_Confirmation().getCc_cvv(), "678");
//
//	}

	@Then("^user Click The \"([^\"]*)\" Button It Will Navigates To Logout Page$")
	public void user_Click_The_Button_It_Will_Navigates_To_Logout_Page(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceBooking_Confirmation().getBook_now());
	}

//	@Then("^user Click The Book Now Button It Will Navigates To Logout Page$")
//	public void user_Click_The_Book_Now_Button_It_Will_Navigates_To_Logout_Page() throws Throwable {
//		String book_Now = File_Reader_Manager.getInstanceFRM().getInstanceConR().getBook_Now();
//
//		clickOnElement(pom.getInstanceBooking_Confirmation().getBook_now());
//
//	}

	@When("^user Click \"([^\"]*)\" To Select The Checkbox$")
	public void user_Click_To_Select_The_Checkbox(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceLogout_Page().getCheckbox());
	}

//	@When("^user Click The Checkbox To Select The Checkbox$")
//	public void user_Click_The_Checkbox_To_Select_The_Checkbox() throws Throwable {
//		String check_Box = File_Reader_Manager.getInstanceFRM().getInstanceConR().getCheck_Box();
//
//		clickOnElement(pom.getInstanceLogout_Page().getCheckbox());
//	}

	@When("^user Click \"([^\"]*)\" To Select The Submit$")
	public void user_Click_To_Select_The_Submit(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceLogout_Page().getSubmit());
	}

//	@When("^user Click The Submit To Select The Submit$")
//	public void user_Click_The_Submit_To_Select_The_Submit() throws Throwable {
//		String submit1 = File_Reader_Manager.getInstanceFRM().getInstanceConR().getSubmit1();
//
//		clickOnElement(pom.getInstanceLogout_Page().getSubmit());
//
//	}

	@Then("^user Click \"([^\"]*)\" To Select The Logout$")
	public void user_Click_To_Select_The_Logout(String arg1) throws Throwable {
		clickOnElement(pom.getInstanceLogout_Page().getLogout());
	}
//	@Then("^user Click The Logout To Select The Logout$")
//	public void user_Click_The_Logout_To_Select_The_Logout() throws Throwable {
//		String logout = File_Reader_Manager.getInstanceFRM().getInstanceConR().getLogout();
//
//		clickOnElement(pom.getInstanceLogout_Page().getLogout());
//
//	}

}
