package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public WebDriver driver;

	public Booking_Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public void setFirst_name(WebElement first_name) {
		this.first_name = first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public void setLast_name(WebElement last_name) {
		this.last_name = last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public void setCc_num(WebElement cc_num) {
		this.cc_num = cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public void setCc_type(WebElement cc_type) {
		this.cc_type = cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public void setCc_exp_month(WebElement cc_exp_month) {
		this.cc_exp_month = cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public void setCc_exp_year(WebElement cc_exp_year) {
		this.cc_exp_year = cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public void setCc_cvv(WebElement cc_cvv) {
		this.cc_cvv = cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public void setBook_now(WebElement book_now) {
		this.book_now = book_now;
	}

	public WebElement getClickhere() {
		return Clickhere;
	}

	public void setClickhere(WebElement clickhere) {
		Clickhere = clickhere;
	}

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;
	
	@FindBy(id = "my_itinerary")
	private WebElement Clickhere;

}
