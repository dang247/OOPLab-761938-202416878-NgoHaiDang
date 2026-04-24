package hust.soict.hedspi.aims.test;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {

    public static void main(String[] args) {

        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                2, "Star Wars", "Sci-Fi", "George Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                3, "Aladin", "Animation", "Disney", 90, 18.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        cart.print();

        System.out.println("\n--- Search by ID ---");
        cart.searchByID(2);

        System.out.println("\n--- Search by Title ---");
        cart.searchByTitle("lion");
    }
}