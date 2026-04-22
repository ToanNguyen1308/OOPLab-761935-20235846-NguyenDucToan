package hust.soict.elitech.aims.cart;
import hust.soict.elitech.aims.disc.DigitalVideoDisc;
public class Cart2 {
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
    
    public int addDigitalVideoDisc(DigitalVideoDisc... discs) {
        int addedCount = 0;
        for (DigitalVideoDisc disc : discs) {
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
                // Shift elements to remove the disc
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                return true;
            }
        }
        return false;
    }
    
    
  
    public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    

    public void displayCart() {
        System.out.println("---------------------------------");
        System.out.println("DANH SÁCH CÁC MỤC TRONG GIỎ HÀNG:");
        System.out.println("---------------------------------");
        System.out.printf("%-3s %-20s %8s\n", "STT", "Tên phim", "Giá");
        
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%-3d %-20s %8.2f\n", (i+1), 
                    itemsOrdered[i].getTitle(), 
                    itemsOrdered[i].getCost());
        }
        
        System.out.println("---------------------------------");
        System.out.printf("%-24s %8.2f\n", "Tổng cộng", totalCost());
        System.out.println("---------------------------------");
    }
}
