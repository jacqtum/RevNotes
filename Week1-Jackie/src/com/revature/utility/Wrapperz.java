package com.revature.utility;

public class Wrapperz {
	static int myInt = 3;
	static Integer myInteger = 5;
	static Double myDouble = 4.32333;
	static Boolean myBool = true;
	

	public static int addEmUp(int a, int b) {
		System.out.println(myDouble.getClass());
		System.out.println(myBool.toString(true));
		return a+b;
	}
	
	public static void main(String[] args) {
		Wrapperz wrapz = new Wrapperz();
		System.out.println(wrapz.addEmUp(4, 6));
		/* do while example 
		 int x = 0;
		 do {
			System.out.println("Hi");
			x++;
		} while(x < 5);
		 */
		
	}
}
