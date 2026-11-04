package chapter7;

public class Player {
	private String firstName, lastName;
	private double height; //in meters
	private int playerID;
	
	//class variable
	private static int numPlayers = 0;
	
	//constructor
	public Player(String firstName, String lastName, double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		//player ID
		this.playerID = 900 + Player.numPlayers;
		//increment counter after each player is added
		Player.numPlayers++;
	}
	//default constructor
	public Player() {
		this("N/A", "N/A", 0.0);
	}
	//getters (accessors) and setters (mutators)
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getName() {return this.firstName + ", " + this.lastName;}
	public double getHeightMts() {return height;}
	public void setHeight(double height) {this.height = height;}
	private String getHeightFeetandInches() {
		return convHeightToFtAndIn(this.height);
		
	}
	public static int getNumPlayers() {
		return numPlayers;
	}
	public static String convHeightToFtAndIn(double heightMts) {
		final double FEET_IN_METER = 3.28084;
		final double INCHES_IN_FOOT = 12.0;
		double feet = heightMts*FEET_IN_METER;
		int inches = (int)Math.round((feet - (int)feet)*INCHES_IN_FOOT);
		feet = (int)feet;
		return feet + " ft " + inches + " in.";
	}
	@Override
	public String toString() {
		return getName() + ", Height: "+ getHeightFeetandInches();}
		
	@Override
	public boolean equals(Object obj) {
		//only compare obj if it is an instance of Player
		if (obj instanceof Player) {
			Player otherPlayer = (Player)obj;
			return (this.playerID == otherPlayer.playerID);
		}
	return false;
	}
	
	

}
