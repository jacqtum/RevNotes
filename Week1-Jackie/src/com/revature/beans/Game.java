package com.revature.beans;


public class Game {
	// Static code block
	static {
		/*
		 * Static code blocks execute once, when the class is loaded.
		 */
		System.out.println("static code block runs once only first time object is created.");
	}
	
	// code block 
	{
		// inside here is a code block
		
		/*
		 * Instance code block that executes before the constructor when an object is created.
		 * Example use: database connection, try-catch for debugging.
		 */
		
		System.out.println("code block runs everytime object is called.");	
	}	
	
	private String name;
	private String genre;
	private double price;
	
	
	
	
	
	
	// overloading constructors
	
	// default constructor
	public Game() {
		this.setName("Tetris");
		this.setGenre("Fun");
		this.setPrice(1.58);
		System.out.println("I created a fun game!");
	}
	
	
	public Game(String name, String genre, double price) {
		super();
		this.name = name;
		this.genre = genre;
		this.price = price;
		
		// Calling a constructor in another constructor
		Person s = new Person("Jim");
		System.out.println("I created a game and a person named " + s.getName() + ".");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
