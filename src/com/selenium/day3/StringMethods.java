/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class StringMethods {
	
	public static String name="welcome to java world";
	public static void main(String[] args) {
		
		getCharacterValue();
		name();
	}
	
	public static void getCharacterValue() {
		
		System.out.println(name.charAt(0));
	}
	public static void name() {
		System.out.println(name.compareTo("welcome"));
	}

}
