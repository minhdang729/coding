public class VideoGameTester {
    public static void main(String[] args) {
        VideoGame g1 = new VideoGame("Pac-Man", "Mamco", "Maze", 1980);
        VideoGame g2 = new VideoGame("Donkey Kong", "Nintendo", "Platform", 1981);
        VideoGame g3 = new VideoGame("Daytona USA", "Sega", "Racing", 1993);
    
        g1.display();
        g2.display();
        g3.display();
    }
}
