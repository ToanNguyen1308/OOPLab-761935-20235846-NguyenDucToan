package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    // Remove fixed size array and use ArrayList for flexibility
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public Cart() {}
    // Maximum number of items in cart (constant)
    public static final int MAX_NUMBERS_ORDERED = 20;

    // Method to add Media to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("Gio hang da day!");
        } else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " da them vao gio hang!");
        }
    }
    
    /*	public void addMedia(Media[] MediaList) {
    for (Media dvd : MediaList) {
        Media(media); // Gọi lại phương thức gốc để thêm từng DVD
    }
}*/ // nap vao theo mang

	public void addMedia(Media... medias) {
	    for (Media dvd : medias) {
	        addMedia(dvd); // Gọi lại phương thức gốc để thêm từng DVD
	    }
	} // nap vao theo tung phan tu

    // Method to remove Media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println(media.getTitle() + " da xoa khoi gio hang!");
        } else {
            System.out.println("Mat hang khong co trong gio.");
        }
    }
    
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    // Updated totalCost method to sum up cost of all Media items in the cart
    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Method to search by title
    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Ket qua tim kiem cho: \"" + title + "\"");

        for (Media media : itemsOrdered) {
            if (media.equals(title)) {
                System.out.println(media.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay dia nao co tieu de phu hop.\n");
        }
    }

    // Method to search by ID
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
    
    // Print out all items in the cart
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