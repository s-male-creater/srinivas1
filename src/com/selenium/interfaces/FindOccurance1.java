/**
 * 
 */
package com.selenium.interfaces;

import java.util.HashMap;

/**
 * @author srirama.murthy
 *
 */
public class FindOccurance1 {
	public static void main(String[] args) {
		findOccurance("welcome to java");
	}
	public static void findOccurance(String inputString) {
		// creating object of hashmap
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		// convert string to character array
		
	char[] ch=	inputString.toCharArray();
	
	// checking the each char of given string
	
	for(char c : ch)
	{
		if(map.containsKey(c))
		{
			// perform increment if c is present
			map.put(c, map.get(c)+1);
		}else
		{
			map.put(c, 1);
		}
	}
	
	System.out.println("input String : "+ map);
		
	}

}
