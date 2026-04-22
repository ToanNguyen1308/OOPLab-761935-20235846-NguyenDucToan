package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    
    private static int nbCompactDiscs = 0;

    // Constructor: only title
    public CompactDisc(String title) {
        super(++nbCompactDiscs, title, "", 0.0f, "", 0);
        this.artist = "";
    }

    // Constructor: title + category
    public CompactDisc(String title, String category) {
        super(++nbCompactDiscs, title, category, 0.0f, "", 0);
        this.artist = "";
    }

    // Constructor: title + category + cost
    public CompactDisc(String title, String category, float cost) {
        super(++nbCompactDiscs, title, category, cost, "", 0);
        this.artist = "";
    }

    // Constructor: title + category + artist + cost
    public CompactDisc(String title, String category, String artist, float cost) {
        super(++nbCompactDiscs, title, category, cost, "", 0);
        this.artist = artist;
    }

    // Full Constructor
    public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
        super(++nbCompactDiscs, title, category, cost, director, length);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track not found.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track t : tracks) {
            totalLength += t.getLength();
        }
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD Length: " + this.getLength());
        for (Track t : tracks) {
            t.play();
        }
    }

    @Override
    public String toString() {
        return this.getId() + ". CD - " + getTitle() + " - " + getArtist() + " - " + getLength() + ": " + getCost() + " $";
    }
}
