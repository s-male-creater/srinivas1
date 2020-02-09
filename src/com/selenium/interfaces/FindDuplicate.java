/**
 * 
 */
package com.selenium.interfaces;

import java.util.HashMap;
import java.util.Set;

/**
 * @author srirama.murthy
 *
 */
public class FindDuplicate {
	
	
	public static void main(String[] args) {
		duplicateCharacters("myname is srinivasarao");
	}
	public static void duplicateCharacters(String inputString) {
	
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		// convert string to char array
		
	char [] character =inputString.toCharArray();
	
	for(char c:character)
	{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}else
		{
			map.put(c, 1);
		}
	}
		
	System.out.println("duplicate element is ");
	System.out.println("input string "+ inputString);
	
	Set<Character> duplicate=map.keySet();
	
	for(Character c: duplicate)
	{
		if(map.get(c)>1)
		{
			System.out.println(c+":"+map.get(c));
		}
	}

	}

}
