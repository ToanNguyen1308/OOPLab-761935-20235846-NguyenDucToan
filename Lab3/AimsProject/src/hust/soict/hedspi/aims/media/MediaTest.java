package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class MediaTest {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();

        // Thêm các loại media khác nhau
        Media dvd = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f);
        Media book = new Book("The Hobbit", "Fantasy", 15.99f, "J.R.R. Tolkien");
        Media cd = new CompactDisc("Greatest Hits", "Music", "Various Artists", 19.99f);

        mediaList.add(dvd);
        mediaList.add(book);
        mediaList.add(cd);

        // Duyệt qua danh sách và gọi toString()
        for (Media m : mediaList) {
            System.out.println(m.toString()); // Gọi toString() một cách đa hình
        }
    }
}