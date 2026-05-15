package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc(1, "Jungle", "Animation", 19.95f, 90, "Director A");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc(2, "Cinderella", "Animation", 15.0f, 85, "Director B");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("After swap:");
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("\nAfter changeTitle:");
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        
        dvd = new DigitalVideoDisc(0, oldTitle, null, 0, 0, null);
    }
}