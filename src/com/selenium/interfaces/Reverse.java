/**
 * 
 */
package com.selenium.interfaces;

/**
 * @author srirama.murthy
 *
 */
public class Reverse {
	
	public static void main(String[] args) {
		
		String str="welcome";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.println(i);
			reverse = reverse + str.charAt(i);
			
		}
		
		System.out.println("reverse string is "+ reverse);
	}
	

}
