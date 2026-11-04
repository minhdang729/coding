package chapter7;
import java.util.*;
public class Team {
	private String name;
	private ArrayList<Player> roster;
	
	//constructor
	public Team(String name) {
		this.name = name;
		this.roster = new ArrayList<Player>();
	}
	
	//getters
	public String getName() {return this.name;}
	public int getNumPlayers() {return roster.size();}
	
	public double getAvgHeightMts() {
		double sumHeights = 0.0;
		for (Player p : roster)
			sumHeights += p.getHeightMts();
		return sumHeights/(double)getNumPlayers();
	}
	
	//setter or mutators
	public void add(Player p) {this.roster.add(p);}
	public void display() {
		double avgHeightMts = getAvgHeightMts();
		//display team name
		System.out.println(this.name);
		for (Player p: this.roster)
			System.out.println(p.toString());
		//seperator
		System.out.printf("%d players\n", getNumPlayers());
		System.out.printf("Average height: %.2f\n", getAvgHeightMts());
		System.out.println(Player.convHeightToFtAndIn(avgHeightMts));
		System.out.println("---------------");
	}
	

}


