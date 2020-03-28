/**
 * 
 */
package com.selenium.interfaces;

/**
 * @author srirama.murthy
 *
 */
public class ThreeFour implements Three,Four {

	@Override
	public void m1() {
System.out.println("method three");		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("method four");
		
	}
	
	public static void main(String[] args) {
		
		ThreeFour tf=new ThreeFour();
		tf.m1();
		tf.m2();
		System.out.println(Three.x);
	}

}
