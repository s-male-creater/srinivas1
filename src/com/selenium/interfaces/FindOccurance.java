/**
 * 
 */
package com.selenium.interfaces;

import java.util.HashMap;

/**
 * @author srirama.murthy
 *
 */
public class FindOccurance {
	
	public static void main(String[] args) {
		
		characterCount("java string");
		
	}
public static void characterCount(String inputString) {
	
	HashMap<Character, Integer> countMap=new HashMap<Character, Integer>();
	
	// convert to string to character
	
	char ch[]= inputString.toCharArray();
	
	for(char str: ch)
	{
		if(countMap.containsKey(str))
		{
			countMap.put(str, countMap.get(str)+1);
		}else
		{
			countMap.put(str, 1);
		}
	}
	
	System.out.println("input String "+countMap);
	
}
}
