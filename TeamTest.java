package chapter7;

public class TeamTest {

	public static void main(String[] args) {
		Team hawks = new Team("Atlanta Hawks");
		Team wizards = new Team("Washington Wizards");
		
		hawks.add(new Player("Trae", "Young", 1.854));
		hawks.add(new Player("John", "Wall", 1.93));
		hawks.add(new Player("Cam", "Reddish", 2.03));
		hawks.add(new Player("Kevin", "Hunter", 2.01));
		hawks.add(new Player("Clint", "Capela", 2.08));
		hawks.display();
		
		wizards.add(new Player("Bradley", "Beal", 1.9));
		wizards.add(new Player("Issac", "Bonga", 2.03));
		wizards.add(new Player("Davus", "Bertans", 2.08));
		wizards.add(new Player("Troy", "Brown", 1.98));
		wizards.add(new Player("Rui", "Hachimura", 2.03));
		wizards.display();
	}

}
