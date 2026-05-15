package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        // Tạo một số đối tượng mẫu
        Media cd = new CompactDisc(1, "CD Rock", "Music", 15.5f, 60, "Director A", "Artist X");
        Media dvd = new DigitalVideoDisc(2, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
        Media book = new Book(3, "Java Programming", "Education", 25.0f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        for (Media m : mediae) {
            // Tính đa hình thể hiện ở đây: m.toString() sẽ gọi đúng version của lớp con
            System.out.println(m.toString());
        }
    }
}