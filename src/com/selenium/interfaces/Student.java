/**
 * 
 */
package com.selenium.interfaces;

/**
 * @author srirama.murthy
 *
 */
public interface Student {
	
 public abstract void sname();
 public void sid();
 abstract void stName();
 void stID();
 }

class Stude implements Student
{

	@Override
	public void sname() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		
	}

	@Override
	public void sid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stID() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Stude st=new Stude();
		st.sname();
	}
}
