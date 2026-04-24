package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Media> items = new ArrayList<>();

    public void addMedia(Media media) {
        items.add(media);
    }

    public void print() {
        System.out.println("CART:");
        for (Media m : items) {
            System.out.println(m.getId() + " - " + m.getTitle() + " - " + m.getCost());
        }
    }

    public void searchByID(int id) {
        for (Media m : items) {
            if (m.getId() == id) {
                System.out.println("Found: " + m.getTitle());
                return;
            }
        }
        System.out.println("Not found");
    }

    public void searchByTitle(String title) {
        for (Media m : items) {
            if (m.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Found: " + m.getTitle());
            }
        }
    }
}