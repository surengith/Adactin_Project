package com.TestNG.org;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "laptop")
	public void acer() {

		System.out.println("Acer");
	}

	@Test(groups = "laptop")
	public void hp() {

		System.out.println("HP");
	}

	@Test(groups = "laptop")
	public void dell() {

		System.out.println("Dell");
	}

	@Test(groups = "laptop")
	public void toshiba() {

		System.out.println("Toshiba");
	}

	@Test(groups = "mobile")
	public void redmi() {

		System.out.println("Redmi");
	}

	@Test(groups = "mobile")
	public void samsung() {

		System.out.println("Samsung");
	}

	@Test(groups = "mobile")
	public void nokia() {

		System.out.println("Nokia");
	}

	@Test(groups = "mobile")
	public void iphone() {

		System.out.println("iPhone");
	}

	@Test(groups = "TV")
	public void lg() {

		System.out.println("LG");

	}

	@Test(groups = "TV")
	public void redmitv() {

		System.out.println("Redmi TV");
	}

	@Test(groups = "TV")
	public void vu() {

		System.out.println("VU");

	}
}
