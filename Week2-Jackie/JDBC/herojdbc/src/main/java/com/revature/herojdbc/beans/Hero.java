package com.revature.herojdbc.beans;

public class Hero {
	private int heroID;
	private String heroName;
	
	public Hero() {
		super();
	}
	
	public Hero(int heroID, String heroName) {
		super();
		this.heroID = heroID;
		this.heroName = heroName;
	}

	@Override
	public String toString() {
		return "Hero [heroID=" + heroID + ", heroName=" + heroName + "]";
	}

	public int getHeroID() {
		return heroID;
	}

	public void setHeroID(int heroID) {
		this.heroID = heroID;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	
	
}
