package com.revature.utility;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ArraysFun {
	
	public static void main(String[] args) {
		
		//int[] arr = new int[3];
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10}; // Index count begins at 0.
		
		
		System.out.println(arr2.toString());
		
		arr2[7] = 5;
		
		// Changes element at index 7.
		System.out.println("Changed arr2[7] value to = 5. Result: " + arr2[7]); 
		
		// Length of array is 10. Length count starts at 1.
		System.out.println("Arr2.length: " + arr2.length); 
		
		printMe(arr2);
		printMeGooder(arr2);
		Arrays.asList(arr2);
		Arrays.sort(arr2);
		printMeAfterSort(arr2);
		
		printMeBest(arr2);
		Arrays2 a2 = new Arrays2();
		a2.printMeBest(arr2);
		
	}
	
	static void printMe(int[] a) {
		System.out.println("Printing for loop.");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nThat's the end of for loop");
	}
	
	static void printMeAfterSort(int[] a) {
		System.out.println("Printing sorted for loop.");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nThat's the end of sorted for loop");
	}
	
	
	static void printMeGooder(int[] a) {
		System.out.println("Printing for-each loop.");
		for(int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\nThat's the end of for-each loop");
	}
	
	static void printMeBest(int[] yar) throws ArrayIndexOutOfBoundsException{
		System.out.println(yar[3]);
	}
}
