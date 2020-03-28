/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class RemoveJunk {

	public static void main(String[] args) {
		removeJunk();
	}
	public static void removeJunk() {
		
		String str="$@####### Java &&& _????? Selenium";
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
