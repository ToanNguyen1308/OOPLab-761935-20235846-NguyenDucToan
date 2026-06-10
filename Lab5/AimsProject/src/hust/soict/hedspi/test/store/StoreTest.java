package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        Media dvd = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f);
        Media book = new Book("The Hobbit", "Fantasy", 15.99f, "J.R.R. Tolkien");
        Media cd = new CompactDisc("Greatest Hits", "Music", "Various Artists", 19.99f);

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);
        store.printStore();

        store.removeMedia(dvd);
        store.printStore();

        store.removeMedia(dvd);
    }
}