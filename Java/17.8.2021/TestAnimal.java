package AnimalPack;
public class TestAnimal {
	public static void main(String[] args) {
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
		Animal a1 = new Fish();
		Animal a2 = new Spider();
		Pet p = new Cat();
		
		System.out.println("Class : "+f.getClass() );
		System.out.println("name : "+f.name);
		System.out.println("legs : "+f.legs);
		f.getName();
		f.setName("zumbaaaaaa");
		f.getName();
		f.play();
		f.walk();
		f.eat();
		
		System.out.println("Class : "+c.getClass() );
		System.out.println("name : "+c.name);
		System.out.println("legs : "+c.legs);	
		c.getName();
		c.setName("zumbaaaaaa");
		c.getName();
		c.play();
		c.walk();
		c.eat();
		
		System.out.println("Class : "+a1.getClass() );
	    	//System.out.println("name : "+a1.name );
		System.out.println("legs : "+a1.legs);
			//a1.getName();
			//a1.setName("zumbaaaaaa");
			//a1.getName();
			//a1.play();
		a1.walk();
		a1.eat();
		
		System.out.println("Class : "+a2.getClass() );
			//System.out.println("name : "+a2.name);
		System.out.println("legs : "+a2.legs);	
			//a2.getName();
			//a2.setName("zumbaaaaaa");
			//a2.getName();
			//a2.play();
		a2.walk();
		a2.eat();
	
		System.out.println("Class : "+p.getClass() );
			//System.out.println("name : "+p.name);
			//System.out.println("legs : "+p.legs);	
		p.getName();
		p.setName("zumbaaaaaa");
		p.getName();
			//System.out.println("name : "+p.name);
		p.play();
			//p.walk();
			//p.eat();

	}

}
