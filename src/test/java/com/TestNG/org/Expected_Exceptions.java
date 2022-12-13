package com.TestNG.org;


import org.testng.annotations.Test;

public class Expected_Exceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {
		
		int a = 10;
		System.out.println(a/0);
		
	}
	
}
