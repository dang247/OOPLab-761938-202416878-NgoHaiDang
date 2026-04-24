package hust.soict.hedspi.aims.media;

public class Track {

    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void play() {
        if (length <= 0) {
            System.out.println("ERROR: Track cannot be played (invalid length)");
        } else {
            System.out.println("Playing track: " + title);
            System.out.println("Length: " + length);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Track)) return false;

        Track other = (Track) obj;
        return this.title.equals(other.title)
                && this.length == other.length;
    }
}