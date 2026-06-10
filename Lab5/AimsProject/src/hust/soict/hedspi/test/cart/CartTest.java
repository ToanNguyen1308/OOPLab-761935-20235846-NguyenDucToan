package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.exception.LimitExceededException;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        try {
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                    "Animation", "Roger Allers", 87, 19.95f);
            cart.addMedia(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                    "Science Fiction", "George Lucas", 87, 24.95f);
            cart.addMedia(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                    "Animation", 18.99f);
            cart.addMedia(dvd3);
        } catch (LimitExceededException e) {
            System.err.println(e.getMessage());
        }

        cart.searchByTitle("lion");
        cart.searchByTitle("space");

        cart.searchById(1);
        cart.searchById(99);

        cart.sortByTitleCost();
        System.out.println("\n--- Title ---");
        cart.print();

        cart.sortByCostTitle();
        System.out.println("\n---Cost---");
        cart.print();
    }
}
