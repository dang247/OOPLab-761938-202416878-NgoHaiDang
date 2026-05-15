package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
            System.out.println("Added to cart.");
        } else {
            System.out.println("Item already in cart.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Removed from cart.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media m : itemsOrdered) total += m.getCost();
        return total;
    }

    //public void sortByTitle() {
    //    Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    //}

    //public void sortByCost() {
    //    Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    //}

    public void print() {
        System.out.println("***********************CART***********************");
        for (Media m : itemsOrdered) System.out.println(m.toString());
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }
}