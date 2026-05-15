package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media m) {
        itemsInStore.add(m);
    }

    public void removeMedia(Media m) {
        itemsInStore.remove(m);
    }

    public Media searchByTitle(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }

    public void printStore() {
        System.out.println("Items in store:");
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
    }
}