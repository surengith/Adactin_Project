package com.TestNG.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {

	@Test
	public void name() {

		String exp = "abc";
		String act = "abc";
		Assert.assertEquals(exp, act);
		System.out.println("Pass");

	}

}
