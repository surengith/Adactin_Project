package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	public WebDriver driver;

	public Booking_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public void setRoom_type(WebElement room_type) {
		this.room_type = room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public void setRoom_nos(WebElement room_nos) {
		this.room_nos = room_nos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public void setDatein(WebElement datein) {
		this.datein = datein;
	}

	public WebElement getDateou() {
		return dateou;
	}

	public void setDateou(WebElement dateou) {
		this.dateou = dateou;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public void setAdultroom(WebElement adultroom) {
		this.adultroom = adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public void setChildroom(WebElement childroom) {
		this.childroom = childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public void setRadiobtn(WebElement radiobtn) {
		this.radiobtn = radiobtn;
	}

	public WebElement getContine() {
		return contine;
	}

	public void setContine(WebElement contine) {
		this.contine = contine;
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room_type;

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datein;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateou;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement submit;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;

	@FindBy(id = "continue")
	private WebElement contine;

}
