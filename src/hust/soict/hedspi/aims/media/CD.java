package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CD extends Media implements Playable {

    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>();

    public CD(int id, String title, String category,
              String artist, String director, float cost) {
        super(id, title, category, cost);
        this.artist = artist;
        this.director = director;
    }

    public void addTrack(Track t) {
        if (!tracks.contains(t)) {
            tracks.add(t);
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track t : tracks) {
            sum += t.getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        if (getLength() <= 0) {
            System.out.println("CD cannot be played");
            return;
        }

        System.out.println("Playing CD: " + getTitle());
        System.out.println("CD Length: " + getLength());

        for (Track t : tracks) {
            t.play();
        }
    }

    public void displayInfo() {
        System.out.println("CD");
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Artist: " + artist);
        System.out.println("Director: " + director);
        System.out.println("Length: " + getLength());
        System.out.println("Cost: " + getCost());

        System.out.println("Tracks:");
        for (Track t : tracks) {
            System.out.println("- " + t.getTitle() + " (" + t.getLength() + ")");
        }
    }
}