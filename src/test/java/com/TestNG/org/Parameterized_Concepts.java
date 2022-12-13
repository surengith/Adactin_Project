package com.TestNG.org;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concepts {

	@Test
	@Parameters({"name","address"})
	public void names(String name, String address ) {
		
		System.out.println("Name is :"+ name);
		
		System.out.println("Address is :"+ address);
		
	}
	
}
