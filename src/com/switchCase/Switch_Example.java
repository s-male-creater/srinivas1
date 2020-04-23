package com.switchCase;

public class Switch_Example {
	
	String name [] = {"male","srinivas","venkaiah"};
	    
	static String i;
	public static void main(String[] args) {
		String name [] = {"male","srinivas","venkaiah"};
		name[0]=i;
		name[1]=i;
		name[2]=i;
		try {
			
			switch (i.toString()) {
			case "male":
				System.out.println(""+name[0]);
				
				break;
			case "srinivas":
				System.out.println(""+name[1]);
			default:
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
