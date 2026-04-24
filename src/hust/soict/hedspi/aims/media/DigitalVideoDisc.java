package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media implements Playable {

    private String director;
    private int length;

    public DigitalVideoDisc(int id, String title, String category,
                            String director, int length, float cost) {
        super(id, title, category, cost);
        this.director = director;
        this.length = length;
    }

    @Override
    public void play() {
        if (length <= 0) {
            System.out.println("DVD cannot be played");
        } else {
            System.out.println("Playing DVD: " + getTitle());
            System.out.println("Length: " + length);
        }
    }

    public void displayInfo() {
        System.out.println("DVD");
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("Cost: " + getCost());
    }
}