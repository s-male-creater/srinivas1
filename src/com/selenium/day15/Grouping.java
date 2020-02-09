/**
 * 
 */
package com.selenium.day15;

import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class Grouping {

	@Test(groups = {"functional"})
	public void login() {
		
		System.out.println("functional testing");
	}
	@Test(groups = {"functional","integration"})
	public void home() {
		System.out.println("home page");
	}
}
