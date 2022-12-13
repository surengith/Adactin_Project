package com.TestNG.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	@Test(dataProvider = "input")
	public void names(String name, String vehicle ) {
		
		System.out.println("Name is :"+ name);
		
		System.out.println("Vehicle is :"+ vehicle);
		
	}
	
	@DataProvider
	public Object[][] input() {
		
		return new Object[][] {
			
			{"Ramesh", "Car"}, {"Karthi", "Van"}, {"Suresh", "Bike"}
			
		};
		
	}

}
