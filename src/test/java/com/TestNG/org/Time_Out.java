package com.TestNG.org;

import org.testng.annotations.Test;

public class Time_Out {

	@Test(timeOut = 5000)
	public void Advertisement() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Received");

		Thread.sleep(2000);
		System.out.println("Processed");
		
		Thread.sleep(2000);
		System.out.println("Completed");
	}
	
}
