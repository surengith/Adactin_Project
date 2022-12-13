package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File f = new File("C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Project\\src\\main\\"
				+ "java\\com\\properties\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getUrl() throws IOException {

		String Url = p.getProperty("Url");

		return Url;

	}

	public String getUsername() throws IOException {

		String Username = p.getProperty("Username");

		return Username;

	}

	public String getPassword() throws IOException {

		String Password = p.getProperty("Password");

		return Password;

	}

	public String getLogin() throws IOException {

		String Login = p.getProperty("Login");

		return Login;

	}

	public int getLocation() throws IOException {

		int Location = 7;

		return Location;

	}

	public String getHotels() throws IOException {

		String Hotels = p.getProperty("Hotels");

		return Hotels;

	}

	public String getRoom_Type() throws IOException {

		String Room_Type = p.getProperty("Room_Type");

		return Room_Type;

	}

	public String getRoom_Nos() throws IOException {

		String Room_Nos = p.getProperty("Room_Nos");

		return Room_Nos;

	}

	public String getDateIn() throws IOException {

		String DateIn = p.getProperty("DateIn");

		return DateIn;

	}

	public String getDateOut() throws IOException {

		String DateOut = p.getProperty("DateOut");

		return DateOut;

	}

	public String getAdult_Room() throws IOException {

		String Adult_Room = p.getProperty("Adult_Room");

		return Adult_Room;

	}

	public String getChild_Room() throws IOException {

		String Child_Room = p.getProperty("Child_Room");

		return Child_Room;

	}

	public String getSubmit() throws IOException {

		String Submit = p.getProperty("Submit");

		return Submit;

	}

	public String getRadio() throws IOException {

		String Radio = p.getProperty("Radio");

		return Radio;

	}

	public String getContinue() throws IOException {

		String Continue = p.getProperty("Continue");

		return Continue;

	}

	public String getFirst_Name() throws IOException {

		String First_Name = p.getProperty("First_Name");

		return First_Name;

	}

	public String getLast_Name() throws IOException {

		String Last_Name = p.getProperty("Last_Name");

		return Last_Name;

	}

	public String getAddress() throws IOException {

		String Address = p.getProperty("Address");

		return Address;

	}

	public String getCC_Num() throws IOException {

		String CC_Num = p.getProperty("CC_Num");

		return CC_Num;

	}

	public String getCC_Type() throws IOException {

		String CC_Type = p.getProperty("CC_Type");

		return CC_Type;

	}

	public String getCC_Exp_Month() throws IOException {

		String CC_Exp_Month = p.getProperty("CC_Exp_Month");

		return CC_Exp_Month;

	}

	public int getCC_Exp_Year() throws IOException {

		int CC_Exp_Year = 12;

		return CC_Exp_Year;

	}

	public String getCC_CVV() throws IOException {

		String CC_CVV = p.getProperty("CC_CVV");

		return CC_CVV;

	}

	public String getBook_Now() throws IOException {

		String Book_Now = p.getProperty("Book_Now");

		return Book_Now;

	}

	public String getClick_Here() throws IOException {

		String Click_Here = p.getProperty("Click_Here");

		return Click_Here;

	}

	public String getCheck_Box() throws IOException {

		String Check_Box = p.getProperty("Check_Box");

		return Check_Box;

	}

	public String getSubmit1() throws IOException {

		String Submit = p.getProperty("Submit");

		return Submit;

	}

	public String getLogout() throws IOException {

		String Logout = p.getProperty("Logout");

		return Logout;

	}

}
