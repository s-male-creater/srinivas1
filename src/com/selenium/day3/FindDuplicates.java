/**
 * 
                                                */
package com.selenium.day3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author srirama.murthy
 *
 */
public class FindDuplicates {
	public static void main(String[] args) {
		findDuplicates();
		findDuplicate();
	}

	public static void findDuplicate() {
		
		String name[]= {"java","python","ruby","java"};
		
		Set<String> set=new HashSet<String>();
		for(String names:name)

		{
			if(set.add(names)==false)
			{
				System.out.println("duplicate element is :"+names);
			}
		}
	}
	public static void findDuplicates() {
		
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         		String name[]= {"java","python","ruby","java"};
		// compare each element
		
		for(int i=0; i<name.length; i++)
		{
			//System.out.println(name[i]);
			for(int j=i+1; j<name.length;j++)
			{
				if(name[i].equals(name[j]))
				{
					System.out.println("duplicate number is :" + name[i]);
				}
			}
			
		}
		
		
	}
}
