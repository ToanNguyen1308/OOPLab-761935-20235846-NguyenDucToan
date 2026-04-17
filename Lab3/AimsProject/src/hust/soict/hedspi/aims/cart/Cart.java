package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final DigitalVideoDisc itemsOrdered[] = 
        new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;  // Field to keep track of how many discs are in the cart
    

    public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            return true;
        } else {
            System.out.println("The cart is almost full");
            return false;
        }
    }

    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int addedCount = 0;
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                addedCount++;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been added");
            } else {
                System.out.println("The cart is almost full. Cannot add more discs.");
                break;
            }
        }
        return addedCount;
    }

    

    public int addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        int addedCount = 0;
        
        // Thêm đĩa thứ nhất
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            addedCount++;
            System.out.println("The disc \"" + dvd1.getTitle() + "\" has been added");
        } else {
            System.out.println("The cart is almost full. Cannot add more discs.");
            return addedCount;
        }
        
        // Thêm đĩa thứ hai
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            addedCount++;
            System.out.println("The disc \"" + dvd2.getTitle() + "\" has been added");
        } else {
            System.out.println("The cart is almost full. Cannot add more discs.");
        }
        
        return addedCount;
    }
  
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {

                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed");
                return true;
            }
        }
        System.out.println("The disc was not found in the cart");
        return false;
    }
    
  
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i].toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No matching DVD found.");
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i].toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching DVD found.");
        }
    }


    // Print out all items in the cart
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

}
