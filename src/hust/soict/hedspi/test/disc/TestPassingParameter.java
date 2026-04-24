package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc(
                1, "Jungle", "Adventure", "Director A", 100, 19.9f);

        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc(
                2, "Cinderella", "Animation", "Disney", 90, 18.5f);

        swap(jungleDVD, cinderellaDVD);

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();

        dvd = new DigitalVideoDisc(
                99, oldTitle, "Temp", "Temp", 10, 1.0f);
    }
}