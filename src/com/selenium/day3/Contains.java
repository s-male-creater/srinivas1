/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class Contains {
	public static String name="welcome";
	public static String name1="core java example";
	
	public static void main(String[] args) {
		
		System.out.println(name1.contains("java"));//true
		System.out.println(name1.contains("co"));//true
		System.out.println(name1.contains("a"));//true
		System.out.println(name1.contains("CorE"));//false
		System.out.println(name1.contains(null));// null pointer exception
	}

}
