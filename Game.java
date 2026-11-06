package chapter7;
import java.util.*;
public class Game {
	private Team hostTeam, visitorTeam;
	private String venue;
	private int scoreHost, scoreVisitor;
	private Date gameDate;
	
	//constructor
	public Game(Team host, Team visitor, String venue, int scHost, int scVisitor, Date gDate) {
		this.hostTeam = host;
		this.visitorTeam = visitor;
		this.venue = venue;
		this.scoreHost = scHost;
		this.scoreVisitor = scVisitor;
		this.gameDate = gDate;
	}
	public void Display() {
		System.out.println("Game information");
		System.out.printf("Date: %tD\n", this.gameDate);
		System.out.printf("Venue: %s\n", this.venue);
		System.out.printf("Host: %s\n", this.hostTeam.getName());
		System.out.printf("Visitor: %s\n", this.visitorTeam.getName());
		System.out.printf("Score Host: %d\n", this.scoreHost);
		System.out.printf("Score Visitor: %d\n", this.scoreVisitor);
		System.out.println("---------| Host Team |-----------");
		this.hostTeam.display();
		System.out.println("---------| Visitor Team |-----------");
		this.visitorTeam.display();
	}
	
}
