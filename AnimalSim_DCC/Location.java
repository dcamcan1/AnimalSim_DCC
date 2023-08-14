
public class Location {

	//INSTANCE VARIABLES
	private int xCoord, yCoord;
	
	
	//CONSTRUCTORS
	public Location() {
		setxCoord(0);
		setyCoord(0);
	}//end empty-argument constructor
	
	public Location(int x, int y) {
		setxCoord(x);
		setyCoord(y);
	}//end preferred constructor
	

	//GETTERS AND SETTERS
	public void update(int x, int y) {
		setxCoord(x);
		setyCoord(y);
	}//end update

	public int[] getCoordinates() {
		int[] coordArray = new int[2];
		coordArray[0] = xCoord;
		coordArray[1] = yCoord;
		return coordArray;
	}//end getCoordinates

	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	public void setxCoord(int xCoord) {
		try {
			if (xCoord < 0) {
				throw new InvalidCoordinateException("Invalid x coordinate. Cannot be less than 0.");
			}//end if
			else {
				this.xCoord = xCoord;
			}//end else
		}//end try
		catch (InvalidCoordinateException e) {
			System.out.println(xCoord + " is not a valid coordinate.");
		}//end catch
	}//end setxCoord

	public int getyCoord() {
		return yCoord;
	}//end getyCoord                                                               

	public void setyCoord(int yCoord) {
		try {
			if (yCoord < 0) {
				throw new InvalidCoordinateException("Invalid y coordinate. Cannot be less than 0.");
			}//end if
			else {
				this.yCoord = yCoord;
			}//end else
		}//end try
		catch (InvalidCoordinateException e) {
			System.out.println(yCoord + " is not a valid coordinate.");
		}//end catch
	}//end setyCoord

	
	//toString
	@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString
	
}//end class

