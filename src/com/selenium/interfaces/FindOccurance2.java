/**
 * 
 */
package com.selenium.interfaces;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author srirama.murthy
 *
 */
public class FindOccurance2 {
	
	public static void main(String[] args) {
		name(new int[] {10,20,30,10,40,50,60,20});
	}
	public static void name(int inputArray[]) {
		
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		for(int each: inputArray)
		{
			if(map.containsKey(each))
			{
				map.put(each, map.get(each)+1);
			}else
			{
				map.put(each, 1);
			}
		}
		
		System.out.println(""+Arrays.toString(inputArray));
		System.out.println(""+map);
	}

}
