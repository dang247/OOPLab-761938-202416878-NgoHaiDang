package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;

public class Aims {

    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd = new DigitalVideoDisc(
                1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        Book book = new Book(
                2, "Java Programming", "Education", 10.5f, "Java is easy to learn");

        CD cd = new CD(
                3, "Top Hits", "Music", "Various Artist", "Director", 20f);

        Track t1 = new Track("Song 1", 3);
        Track t2 = new Track("Song 2", 4);

        cd.addTrack(t1);
        cd.addTrack(t2);

        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        cart.print();

        System.out.println("\n--- PLAY TEST ---");

        dvd.play();
        cd.play();
        t1.play();
    }
}