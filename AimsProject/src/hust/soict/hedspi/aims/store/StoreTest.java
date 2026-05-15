package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.*;

public class StoreTest {

    public static void main(String[] args) {

        Store store = new Store();

        Book book = new Book(1, "Java", "Education", 10.5f);
        book.addAuthor("Author A");

        DigitalVideoDisc dvd = new DigitalVideoDisc(
                2, "Matrix", "Action", 25f, 120, "Wachowski");

        CompactDisc cd = new CompactDisc(
                3, "Music", "Pop", 15f, 60, "Director X", "Artist Y");

        Track t1 = new Track("Song 1", 3);
        Track t2 = new Track("Song 2", 4);

        cd.addTrack(t1);
        cd.addTrack(t2);

        store.addMedia(book);
        store.addMedia(dvd);
        store.addMedia(cd);

        dvd.play();
        cd.play();
        t1.play();
    }
}