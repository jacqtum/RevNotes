package notes;

import java.util.Scanner;

public class Notes1 {
	public static void main(String[] args) {
		
		// Using for loop, do while, while, switch statement
		
		int x = 0;
		int y = 0;
		int age = 0;
		String food = "popcorn";
		
		
		
		while(y == 0) {
			do {
				
				if(age >= 0 && age < 13) {
					System.out.println("Ticket: child price.");
				}
				else if(age >= 13 && age < 18) {
					System.out.println("Ticket: young adult price.");
				}
				else {
					System.out.println("Ticket: adult price.");
				}
				x = 1;
			}while(x==0);
			
			switch(food) {
				case "popcorn":
					System.out.println("Order is " + food);
					break;
				case "nachos":
					System.out.println("Order is " + food);
					break;
				default:
					System.out.println("You did not order.");
					break;
			}
			System.out.println("Type N to exit.");
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			if(s.equals("N")) {
				for(int i = 0; i < 5; i++) {
					System.out.println("Countdown: " + i);
				}
					
				y = 1;
			}
			
			
		}
	}
	
}
