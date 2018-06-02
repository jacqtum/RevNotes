package com.revature.beans;

public class Person {
	private String name;
	private int age;
	private int weight;
	private static String homePlanet = "Earth";
	
	
	// default constructor
	public Person() {
		super();
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this(name,age,200);
	}
	
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String input) {
		name = input;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static String getHomePlanet() {
		return homePlanet;
	}
	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}
	
	public int eat() {
		int newWeight = this.getWeight() + 5; // 1000 + 5
		this.setWeight(newWeight); // 1005
		
		//System.out.println("newWeight: " + newWeight);
		
		for(int i = 0; i < 5; i++) {
			newWeight++;
		} // 1005 + 5 = 1010
		
		//System.out.println("newWeight: " + newWeight);
		
		this.setWeight(newWeight);
		return newWeight;
	}
	
}


