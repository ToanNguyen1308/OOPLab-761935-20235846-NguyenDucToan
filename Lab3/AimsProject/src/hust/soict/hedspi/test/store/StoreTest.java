package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;


public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f);
       
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);

        store.removeDVD(dvd1);
        store.removeDVD(dvd1); // test trường hợp không tồn tại
    }
}
