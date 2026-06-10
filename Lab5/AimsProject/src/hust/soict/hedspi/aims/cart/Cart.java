package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.exception.LimitExceededException;
import hust.soict.hedspi.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public Cart() {}

    public void addMedia(Media media) throws LimitExceededException {
        if (media == null) {
            throw new IllegalArgumentException("Media khong duoc null");
        }
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            throw new LimitExceededException("ERROR: So luong media da dat toi da");
        }
        itemsOrdered.add(media);
        System.out.println(media.getTitle() + " da them vao gio hang!");
    }

    public void addMedia(Media... medias) throws LimitExceededException {
        for (Media media : medias) {
            addMedia(media);
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " da xoa khoi gio hang!");
        } else {
            System.out.println("Mat hang khong co trong gio.");
        }
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Ket qua tim kiem cho: \"" + title + "\"");

        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay dia nao co tieu de phu hop.\n");
        }
    }

    public void searchById(int id) {
        boolean found = false;
        System.out.println("Ket qua tim kiem theo ID: " + id);

        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay dia nao co ID: " + id + "\n");
        }
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }
}
