package chapter7;

public class PlayerTest {

	public static void main(String[] args) {
		Player p0 = new Player("Trae", "Young", 1.854);
		Player p1 = new Player("John", "Wall", 1.93);
		Player p2 = new Player();
		
		
		System.out.println(p0.toString());
		System.out.println("-------------");
		System.out.println(p1.toString());
		System.out.println("-------------");
		System.out.println(p2.toString());
		System.out.println("-------------");
		System.out.printf("%d players created\n", Player.getNumPlayers());
		

	}

}
