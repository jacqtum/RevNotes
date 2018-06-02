package classtypes;

public class Shark extends Animal implements Hunt {

	@Override
	public void breathe() {
		System.out.println("I breathe underwater.");
		
	}
	
	public void findPrey() {
		System.out.println("I killed something.");
	}

}
