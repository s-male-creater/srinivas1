/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class CharAt {
	static String name="welcome to java";
	public static void main(String[] args) {
		
getSingleCharacter();
	}

	
	public static void getSingleCharacter() {
		
		System.out.println(name.charAt(0));
		
	}
	
	public static void getAllCharacters() {
		for(int i=0; i<=name.length()-1;i++)
		{
			char ch=name.charAt(i);
			System.out.println(ch);
		}
	}
	
	public static void getOccuranceCharacter() {
		int count=0;
		for(int i=0; i<=name.length()-1; i++)
		{
			
			if(name.charAt(i)=='a')
			{
				count++;
			}
		}
		
		System.out.println("character a occur "+count+" times in a string");
	}
}
