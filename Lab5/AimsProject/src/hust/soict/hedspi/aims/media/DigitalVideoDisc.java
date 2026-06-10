package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, "", 0.0f, "", 0);
    }

    public DigitalVideoDisc(String title, String category) {
        super(++nbDigitalVideoDiscs, title, category, 0.0f, "", 0);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, "", 0);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, director, 0);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, director, length);
    }

    @Override
    public String toString() {
        return this.getId() + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - "
               + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
    }

    public boolean isMatch(String title) {
        String[] searchWords = title.toLowerCase().split(" ");
        String discTitle = this.getTitle().toLowerCase();

        for (String word : searchWords) {
            if (discTitle.contains(word)) {
                return true;
            }
        }
        return false;
    }

    public int compareTo(DigitalVideoDisc other) {
        int titleCompare = this.getTitle().compareToIgnoreCase(other.getTitle());
        if (titleCompare != 0) return titleCompare;

        int lengthCompare = Integer.compare(other.getLength(), this.getLength());
        if (lengthCompare != 0) return lengthCompare;

        return Float.compare(this.getCost(), other.getCost());
    }

    @Override
    public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        } else {
            System.err.println("ERROR: DVD length is non-positive!");
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }
    }
}
