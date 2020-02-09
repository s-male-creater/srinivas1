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
public class DuplicateCharacter {
	public static void main(String[] args) {
		duplicateCharacter("java");
	}
	
	public static void duplicateCharacter(String inputString) {
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		// convert string chararray
		char [] ch = inputString.toCharArray();
		
		for(char c: ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else
			{
				map.put(c,1);
			}
		}
		
		
		Set<Character> set=map.keySet();
		 System.out.println("duplicate character in string "+inputString);
		
		 for(Character dup : set)
		 {
			 if(map.get(dup)>1)
			 {
				 System.out.println(dup+":"+map.get(dup));
			 }
		 }
	}

}
