
public class Goldfinch extends Animal implements Walkable, Flyable {
	
	//INSTANCE VARIABLES
	private double wingSpan;
	
	
	//CONSTRUCTORS
	public Goldfinch() {
		setSimID(0);
		setLocation(new Location(0,0));
		setFull(false);
		setRested(true);
		setWingSpan(9.0);
	}//end empty-argument constructor

	public Goldfinch(int simID, Location l, double ws) {
		setSimID(simID);
		setLocation(l);
		setWingSpan(ws);
		setFull(false);
		setRested(true);
	}//end preferred constructor
	
	
	/* METHODS
	 * Walk moves the object a certain distance(angle) on the x-y axis.
	 * Formulas for coordinate calculation:
	 *      x = distance * cos(angle)
	 *      y = distance * sin(angle)
	 */
	
	@Override
	public void fly(Location l) {
		int[] flying = l.getCoordinates();
		this.location.update(flying[0], flying[1]);
	}//end fly

	@Override
	public void walk(int direction) {
		//Goldfinch will always move 1 unit when walking
		double diff = 1 * Math.cos(direction);
		int newX = (int)Math.round(this.location.getxCoord() + diff);
		diff = 1 * Math.sin(direction);
		int newY = (int)Math.round(this.location.getyCoord() + diff);
		this.location.update(newX, newY);
	}//end walk
	
	
	//GETTER AND SETTER
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		try {
			if (wingSpan < 5.0 || wingSpan > 11.0) {
				throw new InvalidWingspanException("Wingspan must be between 5.0 and 11.0 cm.");
			}//end if
			else {
				this.wingSpan = wingSpan;
			}//end else
		}//end try
		catch (InvalidWingspanException e) {
			System.out.println(wingSpan + " is not a valid wingspan.");
		}//end catch
	}//end setWingSpan

	
	//toString
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=("+
				this.location.getxCoord()+", "+this.location.getyCoord()+"), full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
}//end class
