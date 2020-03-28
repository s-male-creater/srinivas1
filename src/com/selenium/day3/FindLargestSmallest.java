/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class FindLargestSmallest {
public static void main(String[] args) {
	findLargestSmallest();
}
public static void findLargestSmallest() {
	
	int number[] = {-10,10,45,55,100};
	int largest=number[0];
	int smallest=number[0];
	
	for(int i=1; i<number.length; i++)
	{
		if(number[i]>largest)
		{
		   largest=number[i];
		}else if(number[i]<smallest)
		{
			smallest=number[i];
		}
	}
	
	System.out.println("largest number is :" +largest);
	System.out.println("smallest number is :"+smallest);
	
}
}
