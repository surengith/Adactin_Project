package com.TestNG.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void acer() {

		System.out.println("Acer");
	}

	@Ignore
	@Test
	public void hp() {

		System.out.println("HP");
	}

	@Test(enabled = false)
	public void dell() {

		System.out.println("Dell");
	}

	@Test
	public void toshiba() {

		System.out.println("Toshiba");
	}

}
