
public class BrownBear extends Animal implements Swimmable, Walkable {

	//INSTANCE VARIABLE
	private String subSpecies;
	
	
	//CONSTRUCTORS
	public BrownBear() {
		setSimID(0);
		setLocation(new Location(0,0));
		setFull(false);
		setRested(true);
		setSubSpecies("Alaskan");
	}//end empty-argument constructor
	
	public BrownBear(int simID, Location l, String subSpecies) {
		setSimID(simID);
		setLocation(l);
		setSubSpecies(subSpecies);
		setFull(false);
		setRested(true);
	}//end preferred constructor
	
	
	/* METHODS:
	 * Walk/swim moves the object a certain distance(angle) on the x-y axis.
	 * Formulas for coordinate calculation:
	 *      x = distance * cos(angle)
	 *      y = distance * sin(angle)
	 */
	
	@Override
	public void swim(int direction) {
		//BrownBear will always move 2 units when swimming
		double diff = 2 * Math.cos(direction);
		int newX = (int)Math.round(this.location.getxCoord() + diff);
		diff = 2 * Math.sin(direction);
		int newY = (int)Math.round(this.location.getyCoord() + diff);
		this.location.update(newX, newY);
	}//end swim
	
	@Override
	public void walk(int direction) {
		//BrownBear will always move 3 units when walking
		double diff = 3 * Math.cos(direction);
		int newX = (int)Math.round(this.location.getxCoord() + diff);
		diff = 3 * Math.sin(direction);
		int newY = (int)Math.round(this.location.getyCoord() + diff);
		this.location.update(newX, newY);
	}//end swim
	
	
	//GETTER AND SETTER
	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		//Options: Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian
		
		try {
			switch(subSpecies) {
			case "Alaskan":
				this.subSpecies = subSpecies;
				break;
			case "Asiatic":
				this.subSpecies = subSpecies;
				break;
			case "European":
				this.subSpecies = subSpecies;
				break;
			case "Grizzly":
				this.subSpecies = subSpecies;
				break;
			case "Kodiak":
				this.subSpecies = subSpecies;
				break;
			case "Siberian":
				this.subSpecies = subSpecies;
				break;
			default:
				throw new InvalidSubspeciesException(subSpecies + " is not a valid subSpecies.");
			}//end switch
		}//end try
		catch (InvalidSubspeciesException e) {
			System.out.println(subSpecies + " is not a valid subSpecies.");
		}//end catch
	}//end setSubSpecies

	
	//toString
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=("+
				this.location.getxCoord()+", "+this.location.getyCoord()+"), full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	

	
	
}//end class
