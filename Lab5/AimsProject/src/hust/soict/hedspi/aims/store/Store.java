package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Item already exists in store: " + media.getTitle());
        } else {
            itemsInStore.add(media);
            System.out.println("Added to store: " + media.getTitle());
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed from store: " + media.getTitle());
        } else {
            System.out.println("Item not found in store: " + media.getTitle());
        }
    }

    public void printStore() {
        System.out.println("------ STORE INVENTORY ------");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("-----------------------------");
    }
    
    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("No media found with the title: " + title);
        return null;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
}