import java.util.*;


public class Application {

	public static void main(String[] args) {
		
		/*********************************************

						Location Tests

		**********************************************/
		System.out.println("*********************************************");
		System.out.println("               Location Tests                ");
		System.out.println("*********************************************");
		//Constructors
		Location emptyArg = new Location();
		System.out.println("empty-argument constructor: "+emptyArg.toString());
		Location preferred = new Location(2, 7);
		System.out.println("preferred constructor: "+preferred.toString());
		//Getters & Setters
		emptyArg.update(4, 2);
		System.out.println("update(): "+emptyArg.toString());
		int[] coordTest = emptyArg.getCoordinates();
		System.out.println("getCoordinates(): ("+coordTest[0]+", "+coordTest[1]+")");
		System.out.println("getxCoord(): "+emptyArg.getxCoord());
		System.out.println("getyCoord(): "+emptyArg.getyCoord());
		emptyArg.setxCoord(5);
		emptyArg.setyCoord(5);
		//toString
		System.out.println("setxCoord(), setyCoord(), & toString(): "+emptyArg.toString());
		//Test to demonstrate
		System.out.print("InvalidCoordinateException: ");
		emptyArg.setxCoord(-6);
		//tryout.setyCoord(2);                             
		
		
		/*********************************************

						Animal Tests

		**********************************************/
		System.out.println("\n*********************************************");
		System.out.println("                Animal Tests                 ");
		System.out.println("*********************************************");
		//Aniaml is an abstract class
		//Uncomment below to demonstrate instantiation test
		//Animal a = new Animal();
		System.out.println("Instantiation test (commented out): Cannot instantiate the type Animal.");
		System.out.println("Animal methods testing included in Goldfinch Tests.");
		//Methods are demonstrated through subclasses (Goldfinch and BrownBear)                                                                                                                                     
		
		
		/*********************************************

						Goldfinch Tests

		**********************************************/
		System.out.println("\n*********************************************");
		System.out.println("               Goldfinch Tests               ");
		System.out.println("*********************************************");
		//Constructors
		Goldfinch goldenSnitch = new Goldfinch();
		System.out.println("empty-argument constructor: "+goldenSnitch.toString());
		Goldfinch goldie2 = new Goldfinch(457623, new Location(4,1), 9.2);
		System.out.println("preferred constructor: "+goldie2.toString());		
		//Methods
		goldenSnitch.fly(new Location(4,3));
		System.out.println("fly(): "+goldenSnitch.toString());
		goldenSnitch.walk(0);
		System.out.println("walk(): "+goldenSnitch.toString());
		System.out.println("eat(): "+goldie2.eat());
		System.out.println("sleep(): "+goldie2.sleep());
		//Getters & Setters
		goldenSnitch.setWingSpan(6);
		System.out.println("setWingSpan() & getWingSpan(): "+goldenSnitch.getWingSpan());
		goldenSnitch.setSimID(2435211);
		System.out.println("setSimID() & getSimID(): "+goldenSnitch.getSimID());
		goldenSnitch.setLocation(new Location(9,9));
		System.out.println("setLocation() & getLocation(): "+goldenSnitch.getLocation());
		goldenSnitch.setFull(true);
		System.out.println("setFull() & isFull(): "+goldenSnitch.isFull());
		goldenSnitch.setRested(false);
		System.out.println("setRested(), isRested(), & toString(): "+goldenSnitch.isRested());
		
		//Exceptions
		System.out.print("InvalidWingspanException: ");
		goldenSnitch.setWingSpan(23.5);
		System.out.print("InvalidSimIDException: ");
		goldenSnitch.setSimID(-54);
		
		/*********************************************

						BrownBear Tests

		**********************************************/
		System.out.println("\n*********************************************");
		System.out.println("               BrownBear Tests               ");
		System.out.println("*********************************************");
		//Constructors
		BrownBear yogi = new BrownBear();
		System.out.println("empty-argument constructor: "+yogi.toString());
		BrownBear winnie = new BrownBear(44375, new Location(7,9), "Kodiak");
		System.out.println("preferred constructor: "+winnie.toString());
		
		//Methods
		yogi.swim(98);
		System.out.println("swim(): "+yogi.toString());
		yogi.walk(3);
		System.out.println("walk(): "+yogi.toString());
		System.out.println("eat(): "+yogi.eat());
		System.out.println("sleep(): "+yogi.sleep());
		
		//Getters & Setters
		yogi.setSubSpecies("Grizzly");
		System.out.println("setSubspecies() & getSubSpecies(): "+yogi.getSubSpecies());
		yogi.setSimID(6874556);
		System.out.println("setSimID() & getSimID(): "+yogi.getSimID());
		yogi.setLocation(new Location(4,1));
		System.out.println("setLocation() & getLocation(): "+yogi.getLocation());
		yogi.setFull(true);
		System.out.println("setFull() & isFull(): "+yogi.isFull());
		yogi.setRested(false);
		System.out.println("setRested(), isRested(), & toString(): "+yogi.isRested());
		
		//Exceptions
		System.out.print("InvalidSubspeciesException: ");
		yogi.setSubSpecies("Orange");
		System.out.print("InvalidSimIDException: ");
		goldenSnitch.setSimID(-1);
		
		/*********************************************

						Generics Tests

		**********************************************/
		System.out.println("\n*********************************************");
		System.out.println("               Generics Tests                ");
		System.out.println("*********************************************");
		//Instantiating list to hold any Animal
		ArrayList<Animal> anyAnimal = new ArrayList<Animal>();
		
		//Filling list with animals
		Goldfinch goldie3 = new Goldfinch(19432, new Location(1,9), 6.3);
		Goldfinch goldie4 = new Goldfinch(56894, new Location(2,5), 9);
		BrownBear baloo = new BrownBear(33467, new Location(6,0), "Alaskan");
		BrownBear booBoo = new BrownBear(42566, new Location(4,1), "Kodiak");
		anyAnimal.add(goldie3);
		anyAnimal.add(goldie4);
		anyAnimal.add(baloo);
		anyAnimal.add(booBoo);
		
		for (Animal a : anyAnimal) {
			System.out.println(a.toString());
		}//end for
	}//end main

}//end class
