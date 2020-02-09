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
public class FindDuplicateArray {
	public static void main(String[] args) {
		FindDuplicateElement(new int[] {10,20,30,10,30,60,70});
	}
	
	public static void FindDuplicateElement(int number[]) {
		
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int num: number)
		{
			if(map.containsKey(num))
			{
				map.put(num, map.get(num)+1);
			}else
			{
				map.put(num, 1);
			}
		}
		
		System.out.println("duplicate element in array");
		System.out.println(""+number);
		
		Set<Integer> dup=map.keySet();
		for(Integer fake : dup)
		{
			if(map.get(fake)>1)
			{
				System.out.println(fake+ ": "+map.get(fake));
			}
		}
		
		
	}

}
