package com.revature.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static String[] strs = {"Wow","Hey","Dude","Yo","Ya","Yz"};
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.addAll(Arrays.asList(strs));
		for(String s:strings) {
			System.out.println(s);
		}
		
		System.out.println("Sorted by second character");
		Collections.sort(strings, (arg0,arg1) -> { return arg0.charAt(1) - arg1.charAt(1); });
		for(String s:strings) {
			System.out.println(s);
		}
		
	}
	
}
