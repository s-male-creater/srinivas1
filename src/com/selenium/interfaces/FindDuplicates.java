/**
 * 
 */
package com.selenium.interfaces;

/**
 * @author srirama.murthy
 *
 */
public class FindDuplicates {
	
	
	public static void main(String[] args) {
		findDuplicate(new int[] {10,20,30,40,10,30});
	}
	public static void findDuplicate(int inputElement[]) {
		
		for(int i=0; i<inputElement.length; i++)
		{
			System.out.println(inputElement[i]);
			for(int j=i+1; j<inputElement.length;j++)
			{
				System.out.println(inputElement[j]);
				if(inputElement[i]==inputElement[j])
				{
					System.out.println("duplicate element is "+inputElement[i]);
				}
			}
		}
		
	}

}
