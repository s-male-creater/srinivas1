
/**
 * 
 */
package com.selenium.interfaces;

import java.util.Hashtable;

/**
 * @author srirama.murthy
 *
 */
public class Immutable {
	
	
	public static void main(String[] args) {
		Hashtable<String,Integer> ht=new Hashtable<String, Integer>();
		String s1="sree";
		ht.put("srinivas", 1);
		ht.put(s1, 2);
		ht.put("srinu", 3);
		ht.put("srini", 4);
		s1.toUpperCase();
		
		System.out.println(ht);
	  //  int value=  ht.get("SREE");
	     System.out.println("");
	     
	    String s2="sree";
	    String s3="sree";
	    
	     String s4=s1+"java";
	      System.out.println(s3);
	      if(s1==s4)
	      {
	    	  System.out.println(""+s1);
	      }
		
		
	}
	
	

}
