package com.revature.driver;

import com.revature.beans.*;

// Packages-Namespace that organizes
// a set of related classes and interfaces


// This is a single-line comment

/*
 * This is a multi-line comment
 */

/**
 *  This is a Javadoc
 * @author Jacqueline Tummala
 *
 */

public class FunStuff1 {
	
	/*
	 * Classes and Projects use Pascal Case and capitalizes each word
	 * methods and variables use Camel Case. firstCamelCase
	 * package names are lowercase, separated by periods. com.revature.driver
	 * constants uses all caps. ALLCAPSLOLZ
	 */
	
	// main method is the entry point
	public static void main(String[] args) {
		String message = "";
		System.out.println("Wooo!");
		
		Person p = new Person();
		p.setName("Jackie");
		p.setAge(100);
		p.setWeight(1000);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getWeight());
		
		// Alternative:
		message = p.getName() + " " + p.getAge() + " " + p.getWeight();
		System.out.println(message);
		
		// method overloading
		
		Game g = new Game();
		Game g2 = new Game("MGS", "Awesome", 2);
		
		System.out.println(p.getWeight()); // 1000
		System.out.println(p.eat()); // in eat() method, weight + 5 -> 1000 + 5 = 1005
		Man m = new Man();
		
		System.out.println(m.getWeight()); // 0
		System.out.println(m.eat()); // in eat() method, weight + 10 -> 0 + 10
		
		
	}

}



