/**
 * 
 */
package com.selenium.day3;

/**
 * @author srirama.murthy
 *
 */
public class ManupulationString {
	public static void main(String[] args) {
		StringManipulation();
	}
	
	public static void StringManipulation() {
		
		String str="the rules have started here";
		String str1="the rules hava started here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf('e', str.indexOf('e')+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0, 8));
		
		System.out.println(str.trim());
		String str2="Hello_World_Java";
	String array[]=	str2.split("_");
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	
		
	}

}
