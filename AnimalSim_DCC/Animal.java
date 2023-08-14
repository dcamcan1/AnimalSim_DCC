import java.util.Random;

public abstract class Animal {

	//INSTANCE VARIABLES
	protected int simID;  //should be an integer greater than zero
	protected Location location;  //encapsulates the animal's coordinates in the simulation
	protected boolean full;  //indicates that an animal is full after it has eaten
	protected boolean rested;  //boolean that indicates that animal is rested after it sleeps
	
	
	//CONSTRUCTORS
	public Animal() {
		setSimID(0);
		setLocation(new Location(0,0));
		setFull(false);
		setRested(true);
	}//end empty-argument constructor
	
	public Animal(int simID, Location l) {
		setSimID(simID);
		setLocation(l);
		setFull(false);
		setRested(true);
	}//end preferred constructor
	
	
	//METHODS
	public boolean eat() {
		Random rand = new Random();
		int randomEat = rand.nextInt(2);
		if (randomEat > .5) {
			setFull(true);
			return true;
		}//end if
		else {
			setFull(false);
			return false;
		}//end else
	}//end eat
	
	public boolean sleep() {
		Random rand = new Random();
		int randomSleep = rand.nextInt(2);
		if (randomSleep > .5) {
			setRested(true);
			return true;
		}//end if
		else {
			setRested(false);
			return false;
		}//end else
	}//end sleep

	
	//GETTERS AND SETTERS
	public int getSimID() {
		return simID;
	}//end getSimID

	public void setSimID(int simID) {
		try {
			if (simID < 0) {
				throw new InvalidSimIDException("Invalid simID. Cannot be less than 0.");
			}//end if
			else {
				this.simID = simID;
			}//end else
		}//end try
		catch (InvalidSimIDException e) {
			System.out.println(simID + " is not a valid simID.");
		}//end catch
	}//end setSimID

	public Location getLocation() {
		return location;
	}//end getLocation

	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	public boolean isRested() {
		return rested;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested

	
	//toString
	@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=("+this.location.getxCoord()+", "+
				this.location.getyCoord()+"), full=" + full + ", rested=" + rested + "]";
	}//end toString
	
}//end class
