package com.revature.beans;

public class Man extends Person{
	
	public int eat() {
		
		// this.getWeight() = 0
		//System.out.println("this.getWeight(): " + this.getWeight()); // 0
		
		this.setWeight(this.getWeight() + 10);
		
		//System.out.println("this.getWeight(): " + this.getWeight()); // 10
		
		return this.getWeight();
	}
}
