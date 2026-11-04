public class VideoGame {
    private String name, publisher, genre;
    private int year;

    //constructor
    public VideoGame(String name, String publisher, String genre, int year){
        this.name = name;
        this.publisher=publisher;
        this.genre=genre;
        this.year = year;
    }

    //getters
    public String getName(){return this.name;}
    public String getPublisher(){return this.publisher;}
    public String getGenre(){return this.genre;}
    public int getYear(){return this.year;}

    //setters
    public void setName(String name){this.name = name;}
    public void setPublisher(String publisher){this.publisher = publisher;}
    public void setGenre(String genre){this.publisher = genre;}
    public void setYear(int year){this.year = year;}

    @Override 
    public String toString(){
        return year;
    }
    public void display(){
        System.out.printf("Name: %s\n" , getName());
        System.out.printf("Publisher: %s\n" , getPublisher());
        System.out.printf("Genre: %s\n" , getGenre());
        System.out.printf("Year: %d\n", getYear());
        System.out.println("-------------------");
    }
}
