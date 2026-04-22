package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	store.addMedia(new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f));
    	store.addMedia(new DigitalVideoDisc("Avatar", "Sci-Fi", "James Cameron", 162, 24.99f));
    	store.addMedia(new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 22.99f));
    	store.addMedia(new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 18.49f));
    	store.addMedia(new DigitalVideoDisc("Gladiator", "Historical", "Ridley Scott", 155, 20.00f));
    	store.addMedia(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 25.00f));
    	store.addMedia(new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f));
    	store.addMedia(new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 21.49f));
    	store.addMedia(new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 19.00f));
    	store.addMedia(new DigitalVideoDisc("Iron Man", "Action", "Jon Favreau", 126, 17.99f));
    	store.addMedia(new DigitalVideoDisc("Black Panther", "Action", "Ryan Coogler", 134, 18.75f));
    	store.addMedia(new DigitalVideoDisc("Coco", "Animation", "Lee Unkrich", 105, 14.99f));
    	store.addMedia(new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 16.99f));
    	store.addMedia(new DigitalVideoDisc("Moana", "Animation", "Ron Clements", 107, 15.50f));
    	store.addMedia(new DigitalVideoDisc("Soul", "Animation", "Pete Docter", 100, 17.00f));
    	store.addMedia(new DigitalVideoDisc("Up", "Animation", "Pete Docter", 96, 14.00f));
    	store.addMedia(new DigitalVideoDisc("Shrek", "Animation", "Andrew Adamson", 90, 12.50f));
    	store.addMedia(new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 13.99f));
    	store.addMedia(new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 12.99f));
    	store.addMedia(new DigitalVideoDisc("Ratatouille", "Animation", "Brad Bird", 111, 13.99f));
    	
    	store.addMedia(new Book("The Hobbit", "Fantasy", 15.99f, "J.R.R. Tolkien"));
    	store.addMedia(new Book("1984", "Dystopian", 9.99f, "George Orwell"));
    	store.addMedia(new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 12.99f, "J.K. Rowling"));
    	store.addMedia(new Book("The Great Gatsby", "Classic", 10.99f, "F. Scott Fitzgerald"));
    	store.addMedia(new Book("To Kill a Mockingbird", "Classic", 14.99f, "Harper Lee"));
    	store.addMedia(new Book("The Catcher in the Rye", "Classic", 10.99f, "J.D. Salinger"));
    	store.addMedia(new Book("Pride and Prejudice", "Romance", 8.99f, "Jane Austen"));
    	store.addMedia(new Book("The Diary of a Young Girl", "Biography", 7.99f, "Anne Frank"));
    	store.addMedia(new Book("Moby Dick", "Classic", 11.99f, "Herman Melville"));
    	store.addMedia(new Book("Crime and Punishment", "Philosophical", 13.99f, "Fyodor Dostoevsky"));
    	store.addMedia(new Book("Brave New World", "Dystopian", 9.99f, "Aldous Huxley"));
    	store.addMedia(new Book("War and Peace", "Historical", 19.99f, "Leo Tolstoy"));
    	store.addMedia(new Book("The Odyssey", "Classic", 12.99f, "Homer"));
    	store.addMedia(new Book("The Picture of Dorian Gray", "Philosophical", 10.99f, "Oscar Wilde"));
    	store.addMedia(new Book("Frankenstein", "Gothic", 8.99f, "Mary Shelley"));


    	store.addMedia(new CompactDisc("Greatest Hits", "Pop", "Various Artists", 19.99f));
    	store.addMedia(new CompactDisc("Thriller", "Pop", "Michael Jackson", 21.00f));
    	store.addMedia(new CompactDisc("Back in Black", "Rock", "AC/DC", 18.99f));
    	store.addMedia(new CompactDisc("The Dark Side of the Moon", "Progressive Rock", "Pink Floyd", 20.49f));
    	store.addMedia(new CompactDisc("Abbey Road", "Rock", "The Beatles", 17.99f));
    	store.addMedia(new CompactDisc("21", "Pop", "Adele", 19.00f));
    	store.addMedia(new CompactDisc("Rumours", "Rock", "Fleetwood Mac", 16.99f));
    	store.addMedia(new CompactDisc("1989", "Pop", "Taylor Swift", 18.00f));
    	store.addMedia(new CompactDisc("Divide", "Pop", "Ed Sheeran", 17.50f));
    	store.addMedia(new CompactDisc("Born to Die", "Indie Pop", "Lana Del Rey", 15.49f));
    	store.addMedia(new CompactDisc("Fearless", "Country Pop", "Taylor Swift", 14.99f));
    	store.addMedia(new CompactDisc("Reputation", "Pop", "Taylor Swift", 16.50f));
    	store.addMedia(new CompactDisc("DAMN.", "Hip-Hop", "Kendrick Lamar", 19.50f));
    	store.addMedia(new CompactDisc("Views", "Hip-Hop", "Drake", 18.99f));
    	store.addMedia(new CompactDisc("Future Nostalgia", "Pop", "Dua Lipa", 17.99f));
    	store.addMedia(new CompactDisc("After Hours", "R&B", "The Weeknd", 18.49f));
    	store.addMedia(new CompactDisc("Random Access Memories", "Electronic", "Daft Punk", 20.00f));
    	store.addMedia(new CompactDisc("25", "Pop", "Adele", 19.00f));
    	store.addMedia(new CompactDisc("Evermore", "Folk Pop", "Taylor Swift", 18.25f));
    	store.addMedia(new CompactDisc("Fine Line", "Pop", "Harry Styles", 17.89f));
    	store.addMedia(new CompactDisc("Plastic Hearts", "Rock", "Miley Cyrus", 16.75f));
    	store.addMedia(new CompactDisc("Don't Smile at Me", "Alternative", "Billie Eilish", 15.00f));
    	store.addMedia(new CompactDisc("Happier Than Ever", "Alternative", "Billie Eilish", 19.99f));
    	store.addMedia(new CompactDisc("Night Visions", "Rock", "Imagine Dragons", 18.25f));
    	store.addMedia(new CompactDisc("Smoke + Mirrors", "Rock", "Imagine Dragons", 17.50f));
    	store.addMedia(new CompactDisc("Lover", "Pop", "Taylor Swift", 16.99f));
    	store.addMedia(new CompactDisc("Dangerous Woman", "Pop", "Ariana Grande", 18.00f));
    	store.addMedia(new CompactDisc("YHLQMDLG", "Reggaeton", "Bad Bunny", 19.99f));
    	store.addMedia(new CompactDisc("El Último Tour del Mundo", "Latin Trap", "Bad Bunny", 18.49f));
    	store.addMedia(new CompactDisc("Montero", "Hip-Hop", "Lil Nas X", 17.49f));

    	
    	
        while (true) {
            showMenu();
            int choice = getChoice(0, 3);
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Thoat khoi chuong trinh. Hen gap lai!");
                    return;
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    private static int getChoice(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.println("Invalid selection. Please re-enter.:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }
    }

    private static void viewStore() {
        while (true) {
            store.printStore();;
            storeMenu();
            int choice = getChoice(0, 4);
            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    viewCart();
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    private static void seeMediaDetails() {
        System.out.print("Enter title media: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            System.out.println(media.toString());
            mediaDetailsMenu();
            int choice = getChoice(0, 2);
            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    if (media instanceof Playable) {
                        ((Playable) media).play();
                    } else {
                        System.out.println("This media cannot be played!");
                    }
                    break;
                case 0:
                    return;
            }
        } else {
            System.out.println("No media found with this title.");
        }
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    private static void addMediaToCart() {
        System.out.print("Enter Media title: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            cart.addMedia(media);
        } else {
            System.out.println("No media found with this title.");
        }
    }

    private static void playMedia() {
        System.out.print("Enter Media title: ");
        String title = scanner.nextLine();
        Media media = store.searchByTitle(title);
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media cannot be played!");
            }
        } else {
            System.out.println("No media found with this title.");
        }
    }

    private static void updateStore() {
        System.out.println("1. Add media to store");
        System.out.println("2. Remove media from store");
        int choice = getChoice(1, 2);
        if (choice == 1) {
        	System.out.print("Enter Media's type (DVD - Book- CD): ");
            String type = scanner.nextLine();
        
            if (type.equals("DVD")) {
            	System.out.print("Enter DVD (Format: title - catagory - director - lenght - cost): ");
                String input = scanner.nextLine();
                String[] parts = input.split(" - ");
                if (parts.length != 5) {
                    System.out.println("Invalid input format. Please use: title - category - director - length - cost");
                } else {
                    try {
                        String title = parts[0].trim();
                        String category = parts[1].trim();
                        String director = parts[2].trim();
                        int length = Integer.parseInt(parts[3].trim());
                        float cost = Float.parseFloat(parts[4].trim());

                        store.addMedia( new DigitalVideoDisc(title, category, director, length, cost));
                    } catch (NumberFormatException e) {
                        System.out.println("Length and cost must be numeric.");
                    }
                }
            }else if (type.equals("Book")) {
            	System.out.print("Enter Book (Format: title - catagory - cost - Arthur): ");
                String input = scanner.nextLine();
                String[] parts = input.split(" - ");
                if (parts.length != 4) {
                    System.out.println("Invalid input format. Please use: title - catagory - cost - Arthur");
                } else {
                    try {
                        String title = parts[0].trim();
                        String category = parts[1].trim();
                        float cost = Float.parseFloat(parts[2].trim());
                        String arthur = parts[3].trim();
                        
                        store.addMedia(new Book(title, category, cost, arthur));
                    } catch (NumberFormatException e) {
                        System.out.println("Length and cost must be numeric.");
                    }
                }
            }else if (type.equals("CD")) {
            	System.out.print("Enter CD (Format: title - catagory - artist - cost): ");
                String input = scanner.nextLine();
                String[] parts = input.split(" - ");
                if (parts.length != 4) {
                    System.out.println("Invalid input format. Please use: title - catagory - artist - cost");
                } else {
                    try {
                        String title = parts[0].trim();
                        String category = parts[1].trim();
                        String artist = parts[2].trim();       
                        float cost = Float.parseFloat(parts[3].trim());

                        store.addMedia(new CompactDisc(title, category, artist, cost));
                    } catch (NumberFormatException e) {
                        System.out.println("Length and cost must be numeric.");
                    }
                }
            }else {
            	System.out.print("Invalid type.");
            }
            
        } else {
            System.out.print("Enter title media: ");
            String title = scanner.nextLine();
            Media media = store.searchByTitle(title);
            if (media != null) {
                store.removeMedia(media);
            }
        }
    }

    private static void viewCart() {
        while (true) {
            cart.print();
            cartMenu();
            int choice = getChoice(0, 5);
            switch (choice) {
                case 1:
                    filterCart();
                    break;
                case 2:
                    sortCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaInCart();
                    break;
                case 5:
                    placeOrder();
                    return;
                case 0:
                    return;
            }
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    private static void filterCart() {
        System.out.println("Filter by: 1. ID, 2. Title");
        int choice = getChoice(1, 2);
        if (choice == 1) {
            System.out.print("Enter id: ");
            int id = Integer.parseInt(scanner.nextLine());
            cart.searchById(id);
        } else {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            cart.searchByTitle(title);
        }
    }

    private static void sortCart() {
        System.out.println("Sort by: 1. Title, 2. Cost");
        int choice = getChoice(1, 2);
        if (choice == 1) {
            cart.sortByTitleCost();
        } else {
            cart.sortByCostTitle();
        }
    }

    private static void removeMediaFromCart() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        for (Media media : cart.getItemsOrdered()) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                cart.removeMedia(media);
                return;
            }
        }
        System.out.println("No media found with this title.");
    }

    private static void playMediaInCart() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        for (Media media : cart.getItemsOrdered()) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                if (media instanceof Playable) {
                    ((Playable) media).play();
                } else {
                    System.out.println("This media cannot be played!");
                }
                return;
            }
        }
        System.out.println("No media found with this title");
    }

    private static void placeOrder() {
        System.out.println("Order successfully!");
        cart = new Cart(); // Reset cart
    }
}