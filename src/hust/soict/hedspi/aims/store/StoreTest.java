package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.*;

public class StoreTest {

    public static void main(String[] args) {

        Book book = new Book(1, "Java", "Programming", 10.5f, "Java easy");
        book.addAuthor("Author A");

        DigitalVideoDisc dvd = new DigitalVideoDisc(
                2, "Matrix", "Action", "Wachowski", 120, 25f);

        CD cd = new CD(3, "Music", "Pop", "Artist", "Director", 15f);

        Track t1 = new Track("Song1", 3);
        Track t2 = new Track("Song2", 4);

        cd.addTrack(t1);
        cd.addTrack(t2);

        book.displayInfo();
        dvd.displayInfo();
        cd.displayInfo();

        System.out.println("\nPLAY TEST");
        dvd.play();
        cd.play();
        t1.play();
    }
}