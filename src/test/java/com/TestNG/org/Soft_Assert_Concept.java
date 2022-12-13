package com.TestNG.org;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {

	@Test
	public void name() {
		
		String exp = "5656";
		String act = "56577";
		SoftAssert s = new SoftAssert();
		s.assertEquals(act, exp);
		System.out.println("Pass");
		
	}
	
}
