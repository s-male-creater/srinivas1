/**
 * 
 */
package com.selenium.day15;

import org.testng.annotations.Test;

/**
 * @author srirama.murthy
 *
 */
public class Login1 {
	@Test
	public void method1() {
		long id=Thread.currentThread().getId();
		System.out.println("method 1"+id);
	}
	@Test
	public void method2() {
		long id=Thread.currentThread().getId();
		System.out.println("method 2"+id);
	}
	@Test
	public void method3() {
		long id=Thread.currentThread().getId();
		System.out.println("method 3"+id);
	}
	@Test
	public void method4() {
		long id=Thread.currentThread().getId();
		System.out.println("method 4"+id);
	}
	@Test
	public void method5() {
		long id=Thread.currentThread().getId();
		System.out.println("method 5"+id);
	}

}
