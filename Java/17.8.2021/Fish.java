package AnimalPack;

public class Fish extends Animal implements Pet{
String name;
	Fish(){
		super(0);
		this.name="Nemo Fish";
	}

	@Override
	void eat() {
		System.out.println("Fish eat Sea Foods");
	}
	void walk() {
	super.walk();
	System.out.println("So Fish donot walk");
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
	System.out.println("Fish Play in Water");	
	}
}
