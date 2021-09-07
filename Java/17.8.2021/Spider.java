package AnimalPack;

public class Spider extends Animal {
	public Spider() {
		super(8);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void eat() {
		System.out.println("I am Spider \nI Eat Small Insects");
	}
	void walk() {
		System.out.println("Iam Spider");
		super.walk();
		}

}
