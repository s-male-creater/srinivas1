/**
 * 
 */
package com.selenium.day3;

import org.seleniumhq.jetty9.util.thread.ReservedThreadExecutor;

/**
 * @author srirama.murthy
 *
 */
public class ReverseInterger {

	public static void main(String[] args) {
	
		reverseInterger();
	
}
	
	public static void reverseInterger() {
		
		int num=6789; int reverse=0;
		
		while(num!=0)
		{
			int digit=num % 10;
			
			 reverse = reverse * 10 + digit;
			 num /=10;
		}
		
		System.out.println(""+reverse);
		
	}
}
