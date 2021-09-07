package AnimalPack;

public abstract class Animal {
protected int legs;


public Animal(int legs) {
	this.legs = legs;
	System.out.println("I Have "+legs+" legs");
}

abstract void eat();

void walk() {
System.out.println("I walk with "+legs+" legs");	

}

}

