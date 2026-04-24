package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
    public static final int MAX_ITEMS = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_ITEMS) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The disc has been added to the store.");
        } else {
            System.out.println("The store is full.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int indexFound = -1;

        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].getId() == disc.getId()) {
                indexFound = i;
                break;
            }
        }

        if (indexFound != -1) {
            for (int i = indexFound; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[qtyInStore - 1] = null;
            qtyInStore--;
            System.out.println("The disc has been removed from the store.");
        } else {
            System.out.println("The disc was not found.");
        }
    }
}