package AnimalPack;

public class Cat extends Animal implements Pet{
String name;

Cat(String name) {
	super(4);
	this.name=name;
	}
	
Cat(){
	this(null);
	}

	@Override
	public String getName() {
		return "My name is"+name;
	}

	@Override
	public void setName(String name) {
	this.name=name;	
	}

	@Override
	public void play() {
		System.out.println("Iam Cat \nI am playing...");
	}

	@Override
	void eat() {
		System.out.println("cat Drink Milk");
	}
}
