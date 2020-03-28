/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class Reverse {
	
	public static void main(String[] args) {
		
		
		reverseMethod();
		usingStringBuffer();
		
	}
	
	public static void reverseMethod() {
		
		String s="selenium";	
		int len=s.length();
		String rev="";
		for(int i=len-1; i>=0; i--)
		{
			rev=rev + s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void usingStringBuffer() {
		
		String s="selenium";
		StringBuffer buffer=new StringBuffer(s);
		System.out.println(buffer.reverse());
	}

}
