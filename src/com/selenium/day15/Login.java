/**
 * 
 */
package com.selenium.day15;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * @author srirama.murthy
 *
 */
public class Login {

	@Parameters({"USERNAME","PASSWORD"})
	@Test
	
	public void method1(String username,String password) {
		
		System.out.println("method 1"+username + " - " + password);
	}
	
	@Test
	
	public void method2() {
		
		System.out.println("method 2");
	}
	
	@Test
	public void method3() {
		
		System.out.println("method 3");
	}
	
	@Test
	public void method4() {
		
		System.out.println("method 4");
	}
	
	@Test
	public void method5() {
		
		System.out.println("method 5");
	}
}
