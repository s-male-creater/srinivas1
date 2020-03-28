/**
 * 
 */
package com.selenium.day15;

import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class SoftAssert {
	
	@Test
	public void method1() {
		org.testng.asserts.SoftAssert soft=new org.testng.asserts.SoftAssert();
		System.out.println("method1");
		soft.assertTrue(true, " user is unable to get method one");
	}

}
